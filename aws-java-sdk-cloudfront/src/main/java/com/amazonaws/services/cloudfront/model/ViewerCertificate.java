/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that contains information about viewer certificates for this
 * distribution.
 */
public class ViewerCertificate implements Serializable, Cloneable {

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * the CloudFront domain name of your distribution in your object URLs (for
     * example, https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     * Omit this value if you are setting an ACMCertificateArn or
     * IAMCertificateId.
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the IAM certificate identifier of
     * the custom viewer certificate for this distribution. Specify either this
     * value, ACMCertificateArn, or CloudFrontDefaultCertificate.
     */
    private String iAMCertificateId;
    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the ACM certificate ARN of the
     * custom viewer certificate for this distribution. Specify either this
     * value, IAMCertificateId, or CloudFrontDefaultCertificate.
     */
    private String aCMCertificateArn;
    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     */
    private String sSLSupportMethod;
    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     */
    private String minimumProtocolVersion;
    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     */
    @Deprecated
    private String certificate;
    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     */
    @Deprecated
    private String certificateSource;

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * the CloudFront domain name of your distribution in your object URLs (for
     * example, https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     * Omit this value if you are setting an ACMCertificateArn or
     * IAMCertificateId.
     * 
     * @param cloudFrontDefaultCertificate
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using the CloudFront domain name of your distribution in
     *        your object URLs (for example,
     *        https://d111111abcdef8.cloudfront.net/logo.jpg), set to true. Omit
     *        this value if you are setting an ACMCertificateArn or
     *        IAMCertificateId.
     */

    public void setCloudFrontDefaultCertificate(
            Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * the CloudFront domain name of your distribution in your object URLs (for
     * example, https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     * Omit this value if you are setting an ACMCertificateArn or
     * IAMCertificateId.
     * 
     * @return If you want viewers to use HTTPS to request your objects and
     *         you're using the CloudFront domain name of your distribution in
     *         your object URLs (for example,
     *         https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     *         Omit this value if you are setting an ACMCertificateArn or
     *         IAMCertificateId.
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * the CloudFront domain name of your distribution in your object URLs (for
     * example, https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     * Omit this value if you are setting an ACMCertificateArn or
     * IAMCertificateId.
     * 
     * @param cloudFrontDefaultCertificate
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using the CloudFront domain name of your distribution in
     *        your object URLs (for example,
     *        https://d111111abcdef8.cloudfront.net/logo.jpg), set to true. Omit
     *        this value if you are setting an ACMCertificateArn or
     *        IAMCertificateId.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ViewerCertificate withCloudFrontDefaultCertificate(
            Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * the CloudFront domain name of your distribution in your object URLs (for
     * example, https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     * Omit this value if you are setting an ACMCertificateArn or
     * IAMCertificateId.
     * 
     * @return If you want viewers to use HTTPS to request your objects and
     *         you're using the CloudFront domain name of your distribution in
     *         your object URLs (for example,
     *         https://d111111abcdef8.cloudfront.net/logo.jpg), set to true.
     *         Omit this value if you are setting an ACMCertificateArn or
     *         IAMCertificateId.
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the IAM certificate identifier of
     * the custom viewer certificate for this distribution. Specify either this
     * value, ACMCertificateArn, or CloudFrontDefaultCertificate.
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using an alternate domain name in your object URLs (for
     *        example, https://example.com/logo.jpg), specify the IAM
     *        certificate identifier of the custom viewer certificate for this
     *        distribution. Specify either this value, ACMCertificateArn, or
     *        CloudFrontDefaultCertificate.
     */

    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the IAM certificate identifier of
     * the custom viewer certificate for this distribution. Specify either this
     * value, ACMCertificateArn, or CloudFrontDefaultCertificate.
     * 
     * @return If you want viewers to use HTTPS to request your objects and
     *         you're using an alternate domain name in your object URLs (for
     *         example, https://example.com/logo.jpg), specify the IAM
     *         certificate identifier of the custom viewer certificate for this
     *         distribution. Specify either this value, ACMCertificateArn, or
     *         CloudFrontDefaultCertificate.
     */

    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the IAM certificate identifier of
     * the custom viewer certificate for this distribution. Specify either this
     * value, ACMCertificateArn, or CloudFrontDefaultCertificate.
     * 
     * @param iAMCertificateId
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using an alternate domain name in your object URLs (for
     *        example, https://example.com/logo.jpg), specify the IAM
     *        certificate identifier of the custom viewer certificate for this
     *        distribution. Specify either this value, ACMCertificateArn, or
     *        CloudFrontDefaultCertificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the ACM certificate ARN of the
     * custom viewer certificate for this distribution. Specify either this
     * value, IAMCertificateId, or CloudFrontDefaultCertificate.
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using an alternate domain name in your object URLs (for
     *        example, https://example.com/logo.jpg), specify the ACM
     *        certificate ARN of the custom viewer certificate for this
     *        distribution. Specify either this value, IAMCertificateId, or
     *        CloudFrontDefaultCertificate.
     */

    public void setACMCertificateArn(String aCMCertificateArn) {
        this.aCMCertificateArn = aCMCertificateArn;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the ACM certificate ARN of the
     * custom viewer certificate for this distribution. Specify either this
     * value, IAMCertificateId, or CloudFrontDefaultCertificate.
     * 
     * @return If you want viewers to use HTTPS to request your objects and
     *         you're using an alternate domain name in your object URLs (for
     *         example, https://example.com/logo.jpg), specify the ACM
     *         certificate ARN of the custom viewer certificate for this
     *         distribution. Specify either this value, IAMCertificateId, or
     *         CloudFrontDefaultCertificate.
     */

    public String getACMCertificateArn() {
        return this.aCMCertificateArn;
    }

    /**
     * If you want viewers to use HTTPS to request your objects and you're using
     * an alternate domain name in your object URLs (for example,
     * https://example.com/logo.jpg), specify the ACM certificate ARN of the
     * custom viewer certificate for this distribution. Specify either this
     * value, IAMCertificateId, or CloudFrontDefaultCertificate.
     * 
     * @param aCMCertificateArn
     *        If you want viewers to use HTTPS to request your objects and
     *        you're using an alternate domain name in your object URLs (for
     *        example, https://example.com/logo.jpg), specify the ACM
     *        certificate ARN of the custom viewer certificate for this
     *        distribution. Specify either this value, IAMCertificateId, or
     *        CloudFrontDefaultCertificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ViewerCertificate withACMCertificateArn(String aCMCertificateArn) {
        setACMCertificateArn(aCMCertificateArn);
        return this;
    }

    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     * 
     * @param sSLSupportMethod
     *        If you specify a value for IAMCertificateId, you must also specify
     *        how you want CloudFront to serve HTTPS requests. Valid values are
     *        vip and sni-only. If you specify vip, CloudFront uses dedicated IP
     *        addresses for your content and can respond to HTTPS requests from
     *        any viewer. However, you must request permission to use this
     *        feature, and you incur additional monthly charges. If you specify
     *        sni-only, CloudFront can only respond to HTTPS requests from
     *        viewers that support Server Name Indication (SNI). All modern
     *        browsers support SNI, but some browsers still in use don't support
     *        SNI. Do not specify a value for SSLSupportMethod if you specified
     *        true for CloudFrontDefaultCertificate.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     * 
     * @return If you specify a value for IAMCertificateId, you must also
     *         specify how you want CloudFront to serve HTTPS requests. Valid
     *         values are vip and sni-only. If you specify vip, CloudFront uses
     *         dedicated IP addresses for your content and can respond to HTTPS
     *         requests from any viewer. However, you must request permission to
     *         use this feature, and you incur additional monthly charges. If
     *         you specify sni-only, CloudFront can only respond to HTTPS
     *         requests from viewers that support Server Name Indication (SNI).
     *         All modern browsers support SNI, but some browsers still in use
     *         don't support SNI. Do not specify a value for SSLSupportMethod if
     *         you specified true for CloudFrontDefaultCertificate.
     * @see SSLSupportMethod
     */

    public String getSSLSupportMethod() {
        return this.sSLSupportMethod;
    }

    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     * 
     * @param sSLSupportMethod
     *        If you specify a value for IAMCertificateId, you must also specify
     *        how you want CloudFront to serve HTTPS requests. Valid values are
     *        vip and sni-only. If you specify vip, CloudFront uses dedicated IP
     *        addresses for your content and can respond to HTTPS requests from
     *        any viewer. However, you must request permission to use this
     *        feature, and you incur additional monthly charges. If you specify
     *        sni-only, CloudFront can only respond to HTTPS requests from
     *        viewers that support Server Name Indication (SNI). All modern
     *        browsers support SNI, but some browsers still in use don't support
     *        SNI. Do not specify a value for SSLSupportMethod if you specified
     *        true for CloudFrontDefaultCertificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     * 
     * @param sSLSupportMethod
     *        If you specify a value for IAMCertificateId, you must also specify
     *        how you want CloudFront to serve HTTPS requests. Valid values are
     *        vip and sni-only. If you specify vip, CloudFront uses dedicated IP
     *        addresses for your content and can respond to HTTPS requests from
     *        any viewer. However, you must request permission to use this
     *        feature, and you incur additional monthly charges. If you specify
     *        sni-only, CloudFront can only respond to HTTPS requests from
     *        viewers that support Server Name Indication (SNI). All modern
     *        browsers support SNI, but some browsers still in use don't support
     *        SNI. Do not specify a value for SSLSupportMethod if you specified
     *        true for CloudFrontDefaultCertificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */

    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
    }

    /**
     * If you specify a value for IAMCertificateId, you must also specify how
     * you want CloudFront to serve HTTPS requests. Valid values are vip and
     * sni-only. If you specify vip, CloudFront uses dedicated IP addresses for
     * your content and can respond to HTTPS requests from any viewer. However,
     * you must request permission to use this feature, and you incur additional
     * monthly charges. If you specify sni-only, CloudFront can only respond to
     * HTTPS requests from viewers that support Server Name Indication (SNI). All
     * modern browsers support SNI, but some browsers still in use don't support
     * SNI. Do not specify a value for SSLSupportMethod if you specified true for
     * CloudFrontDefaultCertificate.
     * 
     * @param sSLSupportMethod
     *        If you specify a value for IAMCertificateId, you must also specify
     *        how you want CloudFront to serve HTTPS requests. Valid values are
     *        vip and sni-only. If you specify vip, CloudFront uses dedicated IP
     *        addresses for your content and can respond to HTTPS requests from
     *        any viewer. However, you must request permission to use this
     *        feature, and you incur additional monthly charges. If you specify
     *        sni-only, CloudFront can only respond to HTTPS requests from
     *        viewers that support Server Name Indication (SNI). All modern
     *        browsers support SNI, but some browsers still in use don't support
     *        SNI. Do not specify a value for SSLSupportMethod if you specified
     *        true for CloudFrontDefaultCertificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */

    public ViewerCertificate withSSLSupportMethod(
            SSLSupportMethod sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL protocol that you want
     *        CloudFront to use, SSLv3 or TLSv1, for HTTPS connections.
     *        CloudFront will serve your objects only to browsers or devices
     *        that support at least the SSL version that you specify. The TLSv1
     *        protocol is more secure, so we recommend that you specify SSLv3
     *        only if your users are using browsers or devices that don't
     *        support TLSv1. If you're using a custom certificate (if you
     *        specify a value for IAMCertificateId) and if you're using
     *        dedicated IP (if you specify vip for SSLSupportMethod), you can
     *        choose SSLv3 or TLSv1 as the MinimumProtocolVersion. If you're
     *        using a custom certificate (if you specify a value for
     *        IAMCertificateId) and if you're using SNI (if you specify sni-only
     *        for SSLSupportMethod), you must specify TLSv1 for
     *        MinimumProtocolVersion.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     * 
     * @return Specify the minimum version of the SSL protocol that you want
     *         CloudFront to use, SSLv3 or TLSv1, for HTTPS connections.
     *         CloudFront will serve your objects only to browsers or devices
     *         that support at least the SSL version that you specify. The TLSv1
     *         protocol is more secure, so we recommend that you specify SSLv3
     *         only if your users are using browsers or devices that don't
     *         support TLSv1. If you're using a custom certificate (if you
     *         specify a value for IAMCertificateId) and if you're using
     *         dedicated IP (if you specify vip for SSLSupportMethod), you can
     *         choose SSLv3 or TLSv1 as the MinimumProtocolVersion. If you're
     *         using a custom certificate (if you specify a value for
     *         IAMCertificateId) and if you're using SNI (if you specify
     *         sni-only for SSLSupportMethod), you must specify TLSv1 for
     *         MinimumProtocolVersion.
     * @see MinimumProtocolVersion
     */

    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL protocol that you want
     *        CloudFront to use, SSLv3 or TLSv1, for HTTPS connections.
     *        CloudFront will serve your objects only to browsers or devices
     *        that support at least the SSL version that you specify. The TLSv1
     *        protocol is more secure, so we recommend that you specify SSLv3
     *        only if your users are using browsers or devices that don't
     *        support TLSv1. If you're using a custom certificate (if you
     *        specify a value for IAMCertificateId) and if you're using
     *        dedicated IP (if you specify vip for SSLSupportMethod), you can
     *        choose SSLv3 or TLSv1 as the MinimumProtocolVersion. If you're
     *        using a custom certificate (if you specify a value for
     *        IAMCertificateId) and if you're using SNI (if you specify sni-only
     *        for SSLSupportMethod), you must specify TLSv1 for
     *        MinimumProtocolVersion.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(
            String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL protocol that you want
     *        CloudFront to use, SSLv3 or TLSv1, for HTTPS connections.
     *        CloudFront will serve your objects only to browsers or devices
     *        that support at least the SSL version that you specify. The TLSv1
     *        protocol is more secure, so we recommend that you specify SSLv3
     *        only if your users are using browsers or devices that don't
     *        support TLSv1. If you're using a custom certificate (if you
     *        specify a value for IAMCertificateId) and if you're using
     *        dedicated IP (if you specify vip for SSLSupportMethod), you can
     *        choose SSLv3 or TLSv1 as the MinimumProtocolVersion. If you're
     *        using a custom certificate (if you specify a value for
     *        IAMCertificateId) and if you're using SNI (if you specify sni-only
     *        for SSLSupportMethod), you must specify TLSv1 for
     *        MinimumProtocolVersion.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */

    public void setMinimumProtocolVersion(
            MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
    }

    /**
     * Specify the minimum version of the SSL protocol that you want CloudFront
     * to use, SSLv3 or TLSv1, for HTTPS connections. CloudFront will serve your
     * objects only to browsers or devices that support at least the SSL version
     * that you specify. The TLSv1 protocol is more secure, so we recommend that
     * you specify SSLv3 only if your users are using browsers or devices that
     * don't support TLSv1. If you're using a custom certificate (if you specify
     * a value for IAMCertificateId) and if you're using dedicated IP (if you
     * specify vip for SSLSupportMethod), you can choose SSLv3 or TLSv1 as the
     * MinimumProtocolVersion. If you're using a custom certificate (if you
     * specify a value for IAMCertificateId) and if you're using SNI (if you
     * specify sni-only for SSLSupportMethod), you must specify TLSv1 for
     * MinimumProtocolVersion.
     * 
     * @param minimumProtocolVersion
     *        Specify the minimum version of the SSL protocol that you want
     *        CloudFront to use, SSLv3 or TLSv1, for HTTPS connections.
     *        CloudFront will serve your objects only to browsers or devices
     *        that support at least the SSL version that you specify. The TLSv1
     *        protocol is more secure, so we recommend that you specify SSLv3
     *        only if your users are using browsers or devices that don't
     *        support TLSv1. If you're using a custom certificate (if you
     *        specify a value for IAMCertificateId) and if you're using
     *        dedicated IP (if you specify vip for SSLSupportMethod), you can
     *        choose SSLv3 or TLSv1 as the MinimumProtocolVersion. If you're
     *        using a custom certificate (if you specify a value for
     *        IAMCertificateId) and if you're using SNI (if you specify sni-only
     *        for SSLSupportMethod), you must specify TLSv1 for
     *        MinimumProtocolVersion.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */

    public ViewerCertificate withMinimumProtocolVersion(
            MinimumProtocolVersion minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificate
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     */
    @Deprecated
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @return Note: this field is deprecated. Please use one of
     *         [ACMCertificateArn, IAMCertificateId,
     *         CloudFrontDefaultCertificate].
     */
    @Deprecated
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificate
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    @Deprecated
    public ViewerCertificate withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificateSource
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @return Note: this field is deprecated. Please use one of
     *         [ACMCertificateArn, IAMCertificateId,
     *         CloudFrontDefaultCertificate].
     * @see CertificateSource
     */
    @Deprecated
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificateSource
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(String certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificateSource
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    @Deprecated
    public void setCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
    }

    /**
     * Note: this field is deprecated. Please use one of [ACMCertificateArn,
     * IAMCertificateId, CloudFrontDefaultCertificate].
     * 
     * @param certificateSource
     *        Note: this field is deprecated. Please use one of
     *        [ACMCertificateArn, IAMCertificateId,
     *        CloudFrontDefaultCertificate].
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    @Deprecated
    public ViewerCertificate withCertificateSource(
            CertificateSource certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("CloudFrontDefaultCertificate: "
                    + getCloudFrontDefaultCertificate() + ",");
        if (getIAMCertificateId() != null)
            sb.append("IAMCertificateId: " + getIAMCertificateId() + ",");
        if (getACMCertificateArn() != null)
            sb.append("ACMCertificateArn: " + getACMCertificateArn() + ",");
        if (getSSLSupportMethod() != null)
            sb.append("SSLSupportMethod: " + getSSLSupportMethod() + ",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: " + getMinimumProtocolVersion()
                    + ",");
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
        if (other.getCloudFrontDefaultCertificate() == null
                ^ this.getCloudFrontDefaultCertificate() == null)
            return false;
        if (other.getCloudFrontDefaultCertificate() != null
                && other.getCloudFrontDefaultCertificate().equals(
                        this.getCloudFrontDefaultCertificate()) == false)
            return false;
        if (other.getIAMCertificateId() == null
                ^ this.getIAMCertificateId() == null)
            return false;
        if (other.getIAMCertificateId() != null
                && other.getIAMCertificateId().equals(
                        this.getIAMCertificateId()) == false)
            return false;
        if (other.getACMCertificateArn() == null
                ^ this.getACMCertificateArn() == null)
            return false;
        if (other.getACMCertificateArn() != null
                && other.getACMCertificateArn().equals(
                        this.getACMCertificateArn()) == false)
            return false;
        if (other.getSSLSupportMethod() == null
                ^ this.getSSLSupportMethod() == null)
            return false;
        if (other.getSSLSupportMethod() != null
                && other.getSSLSupportMethod().equals(
                        this.getSSLSupportMethod()) == false)
            return false;
        if (other.getMinimumProtocolVersion() == null
                ^ this.getMinimumProtocolVersion() == null)
            return false;
        if (other.getMinimumProtocolVersion() != null
                && other.getMinimumProtocolVersion().equals(
                        this.getMinimumProtocolVersion()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateSource() == null
                ^ this.getCertificateSource() == null)
            return false;
        if (other.getCertificateSource() != null
                && other.getCertificateSource().equals(
                        this.getCertificateSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontDefaultCertificate() == null) ? 0
                        : getCloudFrontDefaultCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMCertificateId() == null) ? 0 : getIAMCertificateId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getACMCertificateArn() == null) ? 0
                        : getACMCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSLSupportMethod() == null) ? 0 : getSSLSupportMethod()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumProtocolVersion() == null) ? 0
                        : getMinimumProtocolVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateSource() == null) ? 0
                        : getCertificateSource().hashCode());
        return hashCode;
    }

    @Override
    public ViewerCertificate clone() {
        try {
            return (ViewerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
