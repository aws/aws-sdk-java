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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that specifies the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether you want viewers to use HTTP or HTTPS to request your objects.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you want viewers to use HTTPS, whether you're using an alternate domain name, such as <code>example.com</code>, or
 * the CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you
 * purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the IAM
 * certificate store.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Specify only one of the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
 * >ACMCertificateArn</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
 * >IAMCertificateId</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
 * >CloudFrontDefaultCertificate</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS">
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
     * If you're using the CloudFront domain name for your distribution, such as
     * <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * </p>
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If you purchased your certificate from a third-party
     * certificate authority and uploaded it to the IAM certificate store, specify the certificate ID that you want to
     * use for this distribution.
     * </p>
     * <p>
     * If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     */
    private String iAMCertificateId;
    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If ACM provided your certificate, specify the Amazon
     * Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront only supports
     * ACM certificates in the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     */
    private String aCMCertificateArn;
    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String sSLSupportMethod;
    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private String minimumProtocolVersion;
    /**
     * <p>
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificate;
    /**
     * <p>
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificateSource;

    /**
     * <p>
     * If you're using the CloudFront domain name for your distribution, such as
     * <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        If you're using the CloudFront domain name for your distribution, such as
     *        <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     */

    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you're using the CloudFront domain name for your distribution, such as
     * <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * </p>
     * 
     * @return If you're using the CloudFront domain name for your distribution, such as
     *         <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you're using the CloudFront domain name for your distribution, such as
     * <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        If you're using the CloudFront domain name for your distribution, such as
     *        <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * <p>
     * If you're using the CloudFront domain name for your distribution, such as
     * <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     * </p>
     * 
     * @return If you're using the CloudFront domain name for your distribution, such as
     *         <code>d111111abcdef8.cloudfront.net</code>, specify this value as <code>true</code>.
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If you purchased your certificate from a third-party
     * certificate authority and uploaded it to the IAM certificate store, specify the certificate ID that you want to
     * use for this distribution.
     * </p>
     * <p>
     * If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *        must choose the type of certificate that you want to use. If you purchased your certificate from a
     *        third-party certificate authority and uploaded it to the IAM certificate store, specify the certificate ID
     *        that you want to use for this distribution.</p>
     *        <p>
     *        If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     *        <code>vip</code>).
     */

    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If you purchased your certificate from a third-party
     * certificate authority and uploaded it to the IAM certificate store, specify the certificate ID that you want to
     * use for this distribution.
     * </p>
     * <p>
     * If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *         must choose the type of certificate that you want to use. If you purchased your certificate from a
     *         third-party certificate authority and uploaded it to the IAM certificate store, specify the certificate
     *         ID that you want to use for this distribution.</p>
     *         <p>
     *         If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     *         <code>vip</code>).
     */

    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If you purchased your certificate from a third-party
     * certificate authority and uploaded it to the IAM certificate store, specify the certificate ID that you want to
     * use for this distribution.
     * </p>
     * <p>
     * If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *        must choose the type of certificate that you want to use. If you purchased your certificate from a
     *        third-party certificate authority and uploaded it to the IAM certificate store, specify the certificate ID
     *        that you want to use for this distribution.</p>
     *        <p>
     *        If you specify a certificate ID, you must also specify an SSL support method (<code>sni-only</code> or
     *        <code>vip</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If ACM provided your certificate, specify the Amazon
     * Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront only supports
     * ACM certificates in the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *        must choose the type of certificate that you want to use. If ACM provided your certificate, specify the
     *        Amazon Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront
     *        only supports ACM certificates in the US East (N. Virginia) Region (us-east-1).</p>
     *        <p>
     *        If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code>
     *        or <code>vip</code>).
     */

    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If ACM provided your certificate, specify the Amazon
     * Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront only supports
     * ACM certificates in the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *         must choose the type of certificate that you want to use. If ACM provided your certificate, specify the
     *         Amazon Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront
     *         only supports ACM certificates in the US East (N. Virginia) Region (us-east-1).</p>
     *         <p>
     *         If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code>
     *         or <code>vip</code>).
     */

    public String getACMCertificateArn() {
        return this.aCMCertificateArn;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must
     * choose the type of certificate that you want to use. If ACM provided your certificate, specify the Amazon
     * Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront only supports
     * ACM certificates in the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code> or
     * <code>vip</code>).
     * </p>
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you
     *        must choose the type of certificate that you want to use. If ACM provided your certificate, specify the
     *        Amazon Resource Name (ARN) for the ACM certificate that you want to use for this distribution. CloudFront
     *        only supports ACM certificates in the US East (N. Virginia) Region (us-east-1).</p>
     *        <p>
     *        If you specify an ACM certificate ARN, you must also specify an SSL support method (<code>sni-only</code>
     *        or <code>vip</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        setACMCertificateArn(aCMCertificateArn);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a> or for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a
     *        method that works for browsers and clients released after 2010, or one that works for all clients.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of
     *        the browsers that support SNI, see the <a
     *        href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name Indication</a>. To
     *        learn about options to explore if you have viewers with browsers that don't include SNI support, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, there are additional monthly charges. For details, including specific
     *        pricing information, see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options
     *        for Amazon CloudFront</a> on the AWS marketing site.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>
     *        .
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return If you specify a value for <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *         >ACMCertificateArn</a> or for <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *         >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a
     *         method that works for browsers and clients released after 2010, or one that works for all clients.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *         Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of
     *         the browsers that support SNI, see the <a
     *         href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name Indication</a>. To
     *         learn about options to explore if you have viewers with browsers that don't include SNI support, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *         >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *         requests from any viewer. However, there are additional monthly charges. For details, including specific
     *         pricing information, see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL
     *         options for Amazon CloudFront</a> on the AWS marketing site.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *         >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public String getSSLSupportMethod() {
        return this.sSLSupportMethod;
    }

    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a> or for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a
     *        method that works for browsers and clients released after 2010, or one that works for all clients.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of
     *        the browsers that support SNI, see the <a
     *        href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name Indication</a>. To
     *        learn about options to explore if you have viewers with browsers that don't include SNI support, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, there are additional monthly charges. For details, including specific
     *        pricing information, see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options
     *        for Amazon CloudFront</a> on the AWS marketing site.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>
     *        .
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a> or for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a
     *        method that works for browsers and clients released after 2010, or one that works for all clients.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of
     *        the browsers that support SNI, see the <a
     *        href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name Indication</a>. To
     *        learn about options to explore if you have viewers with browsers that don't include SNI support, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, there are additional monthly charges. For details, including specific
     *        pricing information, see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options
     *        for Amazon CloudFront</a> on the AWS marketing site.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>
     *        .
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        withSSLSupportMethod(sSLSupportMethod);
    }

    /**
     * <p>
     * If you specify a value for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a> or for <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a method that
     * works for browsers and clients released after 2010, or one that works for all clients.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that
     * support SNI, see the <a href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name
     * Indication</a>. To learn about options to explore if you have viewers with browsers that don't include SNI
     * support, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, there are additional monthly charges. For details, including specific pricing information,
     * see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options for Amazon CloudFront</a>
     * on the AWS marketing site.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     * >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a> or for <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests: using a
     *        method that works for browsers and clients released after 2010, or one that works for all clients.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of
     *        the browsers that support SNI, see the <a
     *        href="http://en.wikipedia.org/wiki/Server_Name_Indication">Wikipedia entry Server Name Indication</a>. To
     *        learn about options to explore if you have viewers with browsers that don't include SNI support, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, there are additional monthly charges. For details, including specific
     *        pricing information, see <a href="http://aws.amazon.com/cloudfront/custom-ssl-domains/">Custom SSL options
     *        for Amazon CloudFront</a> on the AWS marketing site.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value here if you specified <code>CloudFrontDefaultCertificate</code> as <code>true</code>
     *        .
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cnames-https-dedicated-ip-or-sni.html"
     *        >Choosing How CloudFront Serves HTTPS Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
        return this;
    }

    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *        determines two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or
     *        for <code>IAMCertificateId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify here.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the
     *        <i>Amazon CloudFront Developer Guide</i>.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *         determines two settings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         On the CloudFront console, this setting is called <b>Security Policy</b>.
     *         </p>
     *         </note>
     *         <p>
     *         We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices
     *         that do not support TLSv1.1 or later.
     *         </p>
     *         <p>
     *         When both of the following are true, you must specify <code>TLSv1</code> or later for the security
     *         policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or
     *         for <code>IAMCertificateId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *         sets the security policy to <code>TLSv1</code> regardless of the value that you specify here.
     *         </p>
     *         <p>
     *         For information about the relationship between the security policy that you choose and the protocols and
     *         ciphers that CloudFront uses to communicate with viewers, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *         > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the
     *         <i>Amazon CloudFront Developer Guide</i>.
     * @see MinimumProtocolVersion
     */

    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *        determines two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or
     *        for <code>IAMCertificateId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify here.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the
     *        <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *        determines two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or
     *        for <code>IAMCertificateId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify here.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the
     *        <i>Amazon CloudFront Developer Guide</i>.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        withMinimumProtocolVersion(minimumProtocolVersion);
    }

    /**
     * <p>
     * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines
     * two settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security Policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify here.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *        determines two settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security Policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your viewers are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate; that is, you specified a value for <code>ACMCertificateArn</code> or
     *        for <code>IAMCertificateId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI; that is, you specified <code>sni-only</code> for <code>SSLSupportMethod</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify here.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     *        > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the
     *        <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
     *        </p>
     *        </li>
     */
    @Deprecated
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field is no longer used. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *         >ACMCertificateArn</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *         >IAMCertificateId</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *         >CloudFrontDefaultCertificate</a>
     *         </p>
     *         </li>
     */
    @Deprecated
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
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
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
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
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field is no longer used. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *         >ACMCertificateArn</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *         >IAMCertificateId</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *         >CloudFrontDefaultCertificate</a>
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
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
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
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
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
     * This field is no longer used. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     * >ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     * >IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     * >CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field is no longer used. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn"
     *        >ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId"
     *        >IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate"
     *        >CloudFrontDefaultCertificate</a>
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
