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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that specifies the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Which SSL/TLS certificate to use when viewers request objects using HTTPS
 * </p>
 * </li>
 * <li>
 * <p>
 * Whether you want CloudFront to use dedicated IP addresses or SNI when you're using alternate domain names in your
 * object names
 * </p>
 * </li>
 * <li>
 * <p>
 * The minimum protocol version that you want CloudFront to use when communicating with viewers
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
 * Connection to Access Your Objects</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
 * </p>
 */
public class ViewerCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of your
     * distribution in your object URLs (for example, <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set
     * to <code>true</code>. Omit this value if you are setting an <code>ACMCertificateArn</code> or
     * <code>IAMCertificateId</code>.
     * </p>
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate identifier of the
     * custom viewer certificate for this distribution. Specify either this value, <code>ACMCertificateArn</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     */
    private String iAMCertificateId;
    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of the custom
     * viewer certificate for this distribution. Specify either this value, <code>IAMCertificateId</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     */
    private String aCMCertificateArn;
    /**
     * <p>
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
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
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String minimumProtocolVersion;
    /**
     * <p>
     * Include one of these values to specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether you want viewers to use HTTP or HTTPS to request your objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     * CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you
     * purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the
     * IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     * </p>
     * <p>
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     * </p>
     * <p>
     * In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     * behaviors.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to
     * use based on whether you're using an alternate domain name for your objects or the CloudFront domain name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     * depending on whether ACM provided your certificate or you purchased your certificate from third-party certificate
     * authority:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN for ACM
     * SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID is the
     * ID that IAM returned when you added the certificate to the IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for
     * <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use
     * only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the
     * domain name that is associated with your CloudFront distribution (
     * <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then
     * CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the
     * value that you choose for <code>SSLSupportMethod</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name
     * and the domain name in your SSL/TLS certificate.
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
     * <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     * </p>
     * <p>
     * If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of
     * the following values for the applicable origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    @Deprecated
    private String certificate;
    /**
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private String certificateSource;

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of your
     * distribution in your object URLs (for example, <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set
     * to <code>true</code>. Omit this value if you are setting an <code>ACMCertificateArn</code> or
     * <code>IAMCertificateId</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of
     *        your distribution in your object URLs (for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set to <code>true</code>. Omit this value if
     *        you are setting an <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>.
     */

    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of your
     * distribution in your object URLs (for example, <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set
     * to <code>true</code>. Omit this value if you are setting an <code>ACMCertificateArn</code> or
     * <code>IAMCertificateId</code>.
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of
     *         your distribution in your object URLs (for example,
     *         <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set to <code>true</code>. Omit this value
     *         if you are setting an <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>.
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of your
     * distribution in your object URLs (for example, <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set
     * to <code>true</code>. Omit this value if you are setting an <code>ACMCertificateArn</code> or
     * <code>IAMCertificateId</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of
     *        your distribution in your object URLs (for example,
     *        <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set to <code>true</code>. Omit this value if
     *        you are setting an <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of your
     * distribution in your object URLs (for example, <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set
     * to <code>true</code>. Omit this value if you are setting an <code>ACMCertificateArn</code> or
     * <code>IAMCertificateId</code>.
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using the CloudFront domain name of
     *         your distribution in your object URLs (for example,
     *         <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>), set to <code>true</code>. Omit this value
     *         if you are setting an <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>.
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate identifier of the
     * custom viewer certificate for this distribution. Specify either this value, <code>ACMCertificateArn</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your
     *        object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate
     *        identifier of the custom viewer certificate for this distribution. Specify either this value,
     *        <code>ACMCertificateArn</code>, or <code>CloudFrontDefaultCertificate</code>.
     */

    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate identifier of the
     * custom viewer certificate for this distribution. Specify either this value, <code>ACMCertificateArn</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in
     *         your object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate
     *         identifier of the custom viewer certificate for this distribution. Specify either this value,
     *         <code>ACMCertificateArn</code>, or <code>CloudFrontDefaultCertificate</code>.
     */

    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate identifier of the
     * custom viewer certificate for this distribution. Specify either this value, <code>ACMCertificateArn</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your
     *        object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the IAM certificate
     *        identifier of the custom viewer certificate for this distribution. Specify either this value,
     *        <code>ACMCertificateArn</code>, or <code>CloudFrontDefaultCertificate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of the custom
     * viewer certificate for this distribution. Specify either this value, <code>IAMCertificateId</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your
     *        object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of
     *        the custom viewer certificate for this distribution. Specify either this value,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate</code>.
     */

    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of the custom
     * viewer certificate for this distribution. Specify either this value, <code>IAMCertificateId</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @return If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in
     *         your object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate
     *         ARN of the custom viewer certificate for this distribution. Specify either this value,
     *         <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate</code>.
     */

    public String getACMCertificateArn() {
        return this.aCMCertificateArn;
    }

    /**
     * <p>
     * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your object
     * URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of the custom
     * viewer certificate for this distribution. Specify either this value, <code>IAMCertificateId</code>, or
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and you're using an alternate domain name in your
     *        object URLs (for example, <code>https://example.com/logo.jpg)</code>, specify the ACM certificate ARN of
     *        the custom viewer certificate for this distribution. Specify either this value,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        setACMCertificateArn(aCMCertificateArn);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must
     *        also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or
     *        one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you must request permission to use this feature, and you incur
     *        additional monthly charges.
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
     *        Do not specify a value for <code>SSLSupportMethod</code> if you specified
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
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must
     *         also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients
     *         or one that works for most clients:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *         requests from any viewer. However, you must request permission to use this feature, and you incur
     *         additional monthly charges.
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
     *         Do not specify a value for <code>SSLSupportMethod</code> if you specified
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
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must
     *        also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or
     *        one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you must request permission to use this feature, and you incur
     *        additional monthly charges.
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
     *        Do not specify a value for <code>SSLSupportMethod</code> if you specified
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
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must
     *        also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or
     *        one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you must request permission to use this feature, and you incur
     *        additional monthly charges.
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
     *        Do not specify a value for <code>SSLSupportMethod</code> if you specified
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
    }

    /**
     * <p>
     * If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must also
     * specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that
     * works for most clients:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from
     * any viewer. However, you must request permission to use this feature, and you incur additional monthly charges.
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
     * Do not specify a value for <code>SSLSupportMethod</code> if you specified
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS.html"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param sSLSupportMethod
     *        If you specify a value for <code>ACMCertificateArn</code> or for <code>IAMCertificateId</code>, you must
     *        also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or
     *        one that works for most clients:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS
     *        requests from any viewer. However, you must request permission to use this feature, and you incur
     *        additional monthly charges.
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
     *        Do not specify a value for <code>SSLSupportMethod</code> if you specified
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
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * <p>
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections
     *        between viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects
     *        only to viewers that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code>
     *        protocol is more secure, so we recommend that you specify <code>SSLv3</code> only if your users are using
     *        browsers or devices that don't support <code>TLSv1</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum
     *        SSL protocol version is <code>TLSv1</code> and can't be changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     *        <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        </li>
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * <p>
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections
     *         between viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects
     *         only to viewers that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code>
     *         protocol is more secure, so we recommend that you specify <code>SSLv3</code> only if your users are using
     *         browsers or devices that don't support <code>TLSv1</code>. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum
     *         SSL protocol version is <code>TLSv1</code> and can't be changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     *         <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     *         <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for
     *         <code>MinimumProtocolVersion</code>.
     *         </p>
     *         </li>
     * @see MinimumProtocolVersion
     */

    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * <p>
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections
     *        between viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects
     *        only to viewers that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code>
     *        protocol is more secure, so we recommend that you specify <code>SSLv3</code> only if your users are using
     *        browsers or devices that don't support <code>TLSv1</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum
     *        SSL protocol version is <code>TLSv1</code> and can't be changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     *        <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * <p>
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections
     *        between viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects
     *        only to viewers that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code>
     *        protocol is more secure, so we recommend that you specify <code>SSLv3</code> only if your users are using
     *        browsers or devices that don't support <code>TLSv1</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum
     *        SSL protocol version is <code>TLSv1</code> and can't be changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     *        <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        </li>
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
    }

    /**
     * <p>
     * Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections between
     * viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects only to viewers
     * that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code> protocol is more secure,
     * so we recommend that you specify <code>SSLv3</code> only if your users are using browsers or devices that don't
     * support <code>TLSv1</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum SSL
     * protocol version is <code>TLSv1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     * <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     * <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for <code>MinimumProtocolVersion</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL/TLS protocol that you want CloudFront to use for HTTPS connections
     *        between viewers and CloudFront: <code>SSLv3</code> or <code>TLSv1</code>. CloudFront serves your objects
     *        only to viewers that support SSL/TLS version that you specify and later versions. The <code>TLSv1</code>
     *        protocol is more secure, so we recommend that you specify <code>SSLv3</code> only if your users are using
     *        browsers or devices that don't support <code>TLSv1</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;, the minimum
     *        SSL protocol version is <code>TLSv1</code> and can't be changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a custom certificate (if you specify a value for <code>ACMCertificateArn</code> or for
     *        <code>IAMCertificateId</code>) and if you're using SNI (if you specify <code>sni-only</code> for
     *        <code>SSLSupportMethod</code>), you must specify <code>TLSv1</code> for
     *        <code>MinimumProtocolVersion</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(MinimumProtocolVersion minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * <p>
     * Include one of these values to specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether you want viewers to use HTTP or HTTPS to request your objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     * CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you
     * purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the
     * IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     * </p>
     * <p>
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     * </p>
     * <p>
     * In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     * behaviors.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to
     * use based on whether you're using an alternate domain name for your objects or the CloudFront domain name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     * depending on whether ACM provided your certificate or you purchased your certificate from third-party certificate
     * authority:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN for ACM
     * SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID is the
     * ID that IAM returned when you added the certificate to the IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for
     * <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use
     * only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the
     * domain name that is associated with your CloudFront distribution (
     * <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then
     * CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the
     * value that you choose for <code>SSLSupportMethod</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name
     * and the domain name in your SSL/TLS certificate.
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
     * <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     * </p>
     * <p>
     * If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of
     * the following values for the applicable origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        Include one of these values to specify the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Whether you want viewers to use HTTP or HTTPS to request your objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     *        CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate,
     *        or you purchased a certificate from a third-party certificate authority and imported it into ACM or
     *        uploaded it to the IAM certificate store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     *        <code>CloudFrontDefaultCertificate</code>.
     *        </p>
     *        <p>
     *        <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     *        </p>
     *        <p>
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     *        </p>
     *        <p>
     *        In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     *        behaviors.
     *        </p>
     *        <p>
     *        <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you
     *        want to use based on whether you're using an alternate domain name for your objects or the CloudFront
     *        domain name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     *        depending on whether ACM provided your certificate or you purchased your certificate from third-party
     *        certificate authority:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN
     *        for ACM SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this
     *        distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID
     *        is the ID that IAM returned when you added the certificate to the IAM certificate store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a
     *        value for <code>SSLSupportMethod</code>.
     *        </p>
     *        <p>
     *        If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that
     *        you use only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If
     *        you use the domain name that is associated with your CloudFront distribution (
     *        <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>,
     *        then CloudFront behaves normally. However, if the browser does not support SNI, the user's experience
     *        depends on the value that you choose for <code>SSLSupportMethod</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain
     *        name and the domain name in your SSL/TLS certificate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront drops the connection with the browser without returning the object.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>If you're using the CloudFront domain name for your distribution, such as
     *        <code>d111111abcdef8.cloudfront.net</code> </b>: Specify the following value:
     *        </p>
     *        <p>
     *        <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     *        </p>
     *        <p>
     *        If you want viewers to use HTTPS, you must also specify one of the following values in your cache
     *        behaviors:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying
     *        one of the following values for the applicable origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     */
    @Deprecated
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Include one of these values to specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether you want viewers to use HTTP or HTTPS to request your objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     * CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you
     * purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the
     * IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     * </p>
     * <p>
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     * </p>
     * <p>
     * In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     * behaviors.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to
     * use based on whether you're using an alternate domain name for your objects or the CloudFront domain name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     * depending on whether ACM provided your certificate or you purchased your certificate from third-party certificate
     * authority:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN for ACM
     * SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID is the
     * ID that IAM returned when you added the certificate to the IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for
     * <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use
     * only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the
     * domain name that is associated with your CloudFront distribution (
     * <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then
     * CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the
     * value that you choose for <code>SSLSupportMethod</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name
     * and the domain name in your SSL/TLS certificate.
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
     * <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     * </p>
     * <p>
     * If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of
     * the following values for the applicable origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Include one of these values to specify the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Whether you want viewers to use HTTP or HTTPS to request your objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or
     *         the CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate,
     *         or you purchased a certificate from a third-party certificate authority and imported it into ACM or
     *         uploaded it to the IAM certificate store.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     *         <code>CloudFrontDefaultCertificate</code>.
     *         </p>
     *         <p>
     *         <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     *         </p>
     *         <p>
     *         <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     *         </p>
     *         <p>
     *         In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     *         behaviors.
     *         </p>
     *         <p>
     *         <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you
     *         want to use based on whether you're using an alternate domain name for your objects or the CloudFront
     *         domain name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following
     *         values, depending on whether ACM provided your certificate or you purchased your certificate from
     *         third-party certificate authority:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN
     *         for ACM SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this
     *         distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID
     *         is the ID that IAM returned when you added the certificate to the IAM certificate store.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a
     *         value for <code>SSLSupportMethod</code>.
     *         </p>
     *         <p>
     *         If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that
     *         you use only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If
     *         you use the domain name that is associated with your CloudFront distribution (
     *         <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>,
     *         then CloudFront behaves normally. However, if the browser does not support SNI, the user's experience
     *         depends on the value that you choose for <code>SSLSupportMethod</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain
     *         name and the domain name in your SSL/TLS certificate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sni-only</code>: CloudFront drops the connection with the browser without returning the object.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>If you're using the CloudFront domain name for your distribution, such as
     *         <code>d111111abcdef8.cloudfront.net</code> </b>: Specify the following value:
     *         </p>
     *         <p>
     *         <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     *         </p>
     *         <p>
     *         If you want viewers to use HTTPS, you must also specify one of the following values in your cache
     *         behaviors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying
     *         one of the following values for the applicable origins:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     *         >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         </li>
     */
    @Deprecated
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Include one of these values to specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether you want viewers to use HTTP or HTTPS to request your objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     * CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you
     * purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the
     * IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     * <code>CloudFrontDefaultCertificate</code>.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     * </p>
     * <p>
     * <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     * </p>
     * <p>
     * In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     * behaviors.
     * </p>
     * <p>
     * <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to
     * use based on whether you're using an alternate domain name for your objects or the CloudFront domain name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     * depending on whether ACM provided your certificate or you purchased your certificate from third-party certificate
     * authority:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN for ACM
     * SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID is the
     * ID that IAM returned when you added the certificate to the IAM certificate store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for
     * <code>SSLSupportMethod</code>.
     * </p>
     * <p>
     * If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use
     * only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the
     * domain name that is associated with your CloudFront distribution (
     * <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then
     * CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the
     * value that you choose for <code>SSLSupportMethod</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name
     * and the domain name in your SSL/TLS certificate.
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
     * <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     * </p>
     * <p>
     * If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of
     * the following values for the applicable origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     * >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        Include one of these values to specify the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Whether you want viewers to use HTTP or HTTPS to request your objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want viewers to use HTTPS, whether you're using an alternate domain name such as example.com or the
     *        CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate,
     *        or you purchased a certificate from a third-party certificate authority and imported it into ACM or
     *        uploaded it to the IAM certificate store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify one (and only one) of the three values. Do not specify <code>false</code> for
     *        <code>CloudFrontDefaultCertificate</code>.
     *        </p>
     *        <p>
     *        <b>If you want viewers to use HTTP to request your objects</b>: Specify the following value:
     *        </p>
     *        <p>
     *        <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code>
     *        </p>
     *        <p>
     *        In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache
     *        behaviors.
     *        </p>
     *        <p>
     *        <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you
     *        want to use based on whether you're using an alternate domain name for your objects or the CloudFront
     *        domain name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values,
     *        depending on whether ACM provided your certificate or you purchased your certificate from third-party
     *        certificate authority:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>&lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt;</code> where ARN
     *        for ACM SSL/TLS certificate is the ARN for the ACM SSL/TLS certificate that you want to use for this
     *        distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>&lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt;</code> where IAM certificate ID
     *        is the ID that IAM returned when you added the certificate to the IAM certificate store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a
     *        value for <code>SSLSupportMethod</code>.
     *        </p>
     *        <p>
     *        If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that
     *        you use only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If
     *        you use the domain name that is associated with your CloudFront distribution (
     *        <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>,
     *        then CloudFront behaves normally. However, if the browser does not support SNI, the user's experience
     *        depends on the value that you choose for <code>SSLSupportMethod</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain
     *        name and the domain name in your SSL/TLS certificate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sni-only</code>: CloudFront drops the connection with the browser without returning the object.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>If you're using the CloudFront domain name for your distribution, such as
     *        <code>d111111abcdef8.cloudfront.net</code> </b>: Specify the following value:
     *        </p>
     *        <p>
     *        <code> &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code>
     *        </p>
     *        <p>
     *        If you want viewers to use HTTPS, you must also specify one of the following values in your cache
     *        behaviors:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> &lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying
     *        one of the following values for the applicable origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> &lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> &lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS"
     *        >Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     * 
     * @param certificateSource
     *        <p>
     *        This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     *        </p>
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     * 
     * @return <p>
     *         This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     *         <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     *         </p>
     * @see CertificateSource
     */
    @Deprecated
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     * 
     * @param certificateSource
     *        <p>
     *        This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(String certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     * 
     * @param certificateSource
     *        <p>
     *        This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     *        </p>
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
    }

    /**
     * <note>
     * <p>
     * This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     * <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     * </p>
     * </note>
     * 
     * @param certificateSource
     *        <p>
     *        This field is deprecated. You can use one of the following: <code>[ACMCertificateArn</code>,
     *        <code>IAMCertificateId</code>, or <code>CloudFrontDefaultCertificate]</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(CertificateSource certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("CloudFrontDefaultCertificate: " + getCloudFrontDefaultCertificate() + ",");
        if (getIAMCertificateId() != null)
            sb.append("IAMCertificateId: " + getIAMCertificateId() + ",");
        if (getACMCertificateArn() != null)
            sb.append("ACMCertificateArn: " + getACMCertificateArn() + ",");
        if (getSSLSupportMethod() != null)
            sb.append("SSLSupportMethod: " + getSSLSupportMethod() + ",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: " + getMinimumProtocolVersion() + ",");
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getCertificateSource() != null)
            sb.append("CertificateSource: " + getCertificateSource());
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
