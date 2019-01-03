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
 * If you want viewers to use HTTPS, whether you're using an alternate domain name such as <code>example.com</code> or
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
 * You must specify only one of the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ViewerCertificate$ACMCertificateArn</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ViewerCertificate$IAMCertificateId</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Don't specify <code>false</code> for <code>CloudFrontDefaultCertificate</code>.
 * </p>
 * <p>
 * <b>If you want viewers to use HTTP instead of HTTPS to request your objects</b>: Specify the following value:
 * </p>
 * <p>
 * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
 * </p>
 * <p>
 * In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache behaviors.
 * </p>
 * <p>
 * <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to use
 * based on whether you're using an alternate domain name for your objects or the CloudFront domain name:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values, depending
 * on whether ACM provided your certificate or you purchased your certificate from third-party certificate authority:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>&lt;ACMCertificateArn&gt;<i>ARN for ACM SSL/TLS certificate</i>&lt;ACMCertificateArn&gt;</code> where
 * <code> <i>ARN for ACM SSL/TLS certificate</i> </code> is the ARN for the ACM SSL/TLS certificate that you want to use
 * for this distribution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>&lt;IAMCertificateId&gt;<i>IAM certificate ID</i>&lt;IAMCertificateId&gt;</code> where
 * <code> <i>IAM certificate ID</i> </code> is the ID that IAM returned when you added the certificate to the IAM
 * certificate store.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for
 * <code>SSLSupportMethod</code>.
 * </p>
 * <p>
 * If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use only
 * an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the domain name
 * that is associated with your CloudFront distribution (such as
 * <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then
 * CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the value
 * that you choose for <code>SSLSupportMethod</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name and
 * the domain name in your SSL/TLS certificate.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>sni-only</code>: CloudFront drops the connection with the browser without returning the object.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>If you're using the CloudFront domain name for your distribution, such as
 * <code>d111111abcdef8.cloudfront.net</code> </b>: Specify the following value:
 * </p>
 * <p>
 * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>&lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt;</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of the
 * following values for the applicable origins:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>&lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>&lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS">Using
 * Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ViewerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewerCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     * <a>ViewerCertificate</a>.
     * </p>
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * <p>
     * For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     * </p>
     */
    private String iAMCertificateId;
    /**
     * <p>
     * For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     * </p>
     */
    private String aCMCertificateArn;
    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private String minimumProtocolVersion;
    /**
     * <p>
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificate;
    /**
     * <p>
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificateSource;

    /**
     * <p>
     * For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     * <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     *        <a>ViewerCertificate</a>.
     */

    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     * <a>ViewerCertificate</a>.
     * </p>
     * 
     * @return For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     *         <a>ViewerCertificate</a>.
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     * <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     *        <a>ViewerCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * <p>
     * For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     * <a>ViewerCertificate</a>.
     * </p>
     * 
     * @return For information about how and when to use <code>CloudFrontDefaultCertificate</code>, see
     *         <a>ViewerCertificate</a>.
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param iAMCertificateId
     *        For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     */

    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * <p>
     * For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @return For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     */

    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * <p>
     * For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param iAMCertificateId
     *        For information about how and when to use <code>IAMCertificateId</code>, see <a>ViewerCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * <p>
     * For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     */

    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * <p>
     * For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @return For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     */

    public String getACMCertificateArn() {
        return this.aCMCertificateArn;
    }

    /**
     * <p>
     * For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        For information about how and when to use <code>ACMCertificateArn</code>, see <a>ViewerCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        setACMCertificateArn(aCMCertificateArn);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     *        <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS
     *        requests: using a method that works for all clients or one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you will incur additional monthly charges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If
     *        some of your users' browsers don't support SNI, we recommend that you do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the
     *        CloudFront domain name of your distribution in the URLs for your objects, for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you can control which browser your users use, upgrade the browser to one that supports SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use HTTP instead of HTTPS.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value for <code>SSLSupportMethod</code> if you specified
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     *         <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS
     *         requests: using a method that works for all clients or one that works for most clients:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *         requests from any viewer. However, you will incur additional monthly charges.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *         Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If
     *         some of your users' browsers don't support SNI, we recommend that you do one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the
     *         CloudFront domain name of your distribution in the URLs for your objects, for example,
     *         <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you can control which browser your users use, upgrade the browser to one that supports SNI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use HTTP instead of HTTPS.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Don't specify a value for <code>SSLSupportMethod</code> if you specified
     *         <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *         >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public String getSSLSupportMethod() {
        return this.sSLSupportMethod;
    }

    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     *        <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS
     *        requests: using a method that works for all clients or one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you will incur additional monthly charges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If
     *        some of your users' browsers don't support SNI, we recommend that you do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the
     *        CloudFront domain name of your distribution in the URLs for your objects, for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you can control which browser your users use, upgrade the browser to one that supports SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use HTTP instead of HTTPS.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value for <code>SSLSupportMethod</code> if you specified
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     *        <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS
     *        requests: using a method that works for all clients or one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you will incur additional monthly charges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If
     *        some of your users' browsers don't support SNI, we recommend that you do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the
     *        CloudFront domain name of your distribution in the URLs for your objects, for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you can control which browser your users use, upgrade the browser to one that supports SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use HTTP instead of HTTPS.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value for <code>SSLSupportMethod</code> if you specified
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        withSSLSupportMethod(sSLSupportMethod);
    }

    /**
     * <p>
     * If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     * <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS requests:
     * using a method that works for all clients or one that works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you will incur additional monthly charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication
     * (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users'
     * browsers don't support SNI, we recommend that you do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront
     * domain name of your distribution in the URLs for your objects, for example,
     * <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you can control which browser your users use, upgrade the browser to one that supports SNI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use HTTP instead of HTTPS.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Don't specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <a>ViewerCertificate$ACMCertificateArn</a> or for
     *        <a>ViewerCertificate$IAMCertificateId</a>, you must also specify how you want CloudFront to serve HTTPS
     *        requests: using a method that works for all clients or one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you will incur additional monthly charges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront can respond to HTTPS requests from viewers that support Server Name
     *        Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If
     *        some of your users' browsers don't support SNI, we recommend that you do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>vip</code> option (dedicated IP addresses) instead of <code>sni-only</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the
     *        CloudFront domain name of your distribution in the URLs for your objects, for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.png</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you can control which browser your users use, upgrade the browser to one that supports SNI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use HTTP instead of HTTPS.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Don't specify a value for <code>SSLSupportMethod</code> if you specified
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
     * > Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy
     *         determines two settings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cipher that CloudFront uses to encrypt the content that it returns to viewers
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         On the CloudFront console, this setting is called <b>Security policy</b>.
     *         </p>
     *         </note>
     *         <p>
     *         We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices
     *         that do not support TLSv1.1 or later.
     *         </p>
     *         <p>
     *         When both of the following are true, you must specify <code>TLSv1</code> or later for the security
     *         policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     *         <code>IAMCertificateId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *         sets the security policy to <code>TLSv1</code> regardless of the value that you specify for
     *         <code>MinimumProtocolVersion</code>.
     *         </p>
     *         <p>
     *         For information about the relationship between the security policy that you choose and the protocols and
     *         ciphers that CloudFront uses to communicate with viewers, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     * The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     * </p>
     * </li>
     * <li>
     * <p>
     * The cipher that CloudFront uses to encrypt the content that it returns to viewers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * On the CloudFront console, this setting is called <b>Security policy</b>.
     * </p>
     * </note>
     * <p>
     * We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices that do
     * not support TLSv1.1 or later.
     * </p>
     * <p>
     * When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically sets the
     * security policy to <code>TLSv1</code> regardless of the value that you specify for
     * <code>MinimumProtocolVersion</code>.
     * </p>
     * <p>
     * For information about the relationship between the security policy that you choose and the protocols and ciphers
     * that CloudFront uses to communicate with viewers, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     *        The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The cipher that CloudFront uses to encrypt the content that it returns to viewers
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        On the CloudFront console, this setting is called <b>Security policy</b>.
     *        </p>
     *        </note>
     *        <p>
     *        We recommend that you specify <code>TLSv1.1_2016</code> unless your users are using browsers or devices
     *        that do not support TLSv1.1 or later.
     *        </p>
     *        <p>
     *        When both of the following are true, you must specify <code>TLSv1</code> or later for the security policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're using a custom certificate: you specified a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You're using SNI: you specified <code>sni-only</code> for <code>SSLSupportMethod</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>true</code> for <code>CloudFrontDefaultCertificate</code>, CloudFront automatically
     *        sets the security policy to <code>TLSv1</code> regardless of the value that you specify for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        <p>
     *        For information about the relationship between the security policy that you choose and the protocols and
     *        ciphers that CloudFront uses to communicate with viewers, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers"
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     *        </p>
     *        </li>
     */
    @Deprecated
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field has been deprecated. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$ACMCertificateArn</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$IAMCertificateId</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     *         </p>
     *         </li>
     */
    @Deprecated
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field has been deprecated. Use one of the following fields instead:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$ACMCertificateArn</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$IAMCertificateId</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
     * This field has been deprecated. Use one of the following fields instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ViewerCertificate$ACMCertificateArn</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$IAMCertificateId</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateSource
     *        This field has been deprecated. Use one of the following fields instead:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$ACMCertificateArn</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$IAMCertificateId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ViewerCertificate$CloudFrontDefaultCertificate</a>
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
