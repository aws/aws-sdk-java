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
 * A summary of the information about a CloudFront distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DistributionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where <code>123456789012</code> is
     * your AWS account ID.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The current status of the distribution. When the status is <code>Deployed</code>, the distribution's information
     * is propagated to all CloudFront edge locations.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The domain name that corresponds to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * </p>
     */
    private Aliases aliases;
    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     */
    private Origins origins;
    /**
     * <p>
     * A complex type that contains information about origin groups for this distribution.
     * </p>
     */
    private OriginGroups originGroups;
    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     * element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     */
    private DefaultCacheBehavior defaultCacheBehavior;
    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code> elements.
     * </p>
     */
    private CacheBehaviors cacheBehaviors;
    /**
     * <p>
     * A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     * </p>
     */
    private CustomErrorResponses customErrorResponses;
    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     */
    private String priceClass;
    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     */
    private Boolean enabled;
    /** <p/> */
    private ViewerCertificate viewerCertificate;
    /** <p/> */
    private Restrictions restrictions;
    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     */
    private String httpVersion;
    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * </p>
     */
    private Boolean isIPV6Enabled;

    /**
     * <p>
     * The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @return The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where <code>123456789012</code> is
     * your AWS account ID.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) for the distribution. For example:
     *        <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where
     *        <code>123456789012</code> is your AWS account ID.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where <code>123456789012</code> is
     * your AWS account ID.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the distribution. For example:
     *         <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where
     *         <code>123456789012</code> is your AWS account ID.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where <code>123456789012</code> is
     * your AWS account ID.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) for the distribution. For example:
     *        <code>arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5</code>, where
     *        <code>123456789012</code> is your AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is <code>Deployed</code>, the distribution's information
     * is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     *        information is propagated to all CloudFront edge locations.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is <code>Deployed</code>, the distribution's information
     * is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @return The current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     *         information is propagated to all CloudFront edge locations.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the distribution. When the status is <code>Deployed</code>, the distribution's information
     * is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     *        information is propagated to all CloudFront edge locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the distribution was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     * 
     * @return The date and time the distribution was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the distribution was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name that corresponds to the distribution, for example,
     *        <code>d111111abcdef8.cloudfront.net</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @return The domain name that corresponds to the distribution, for example,
     *         <code>d111111abcdef8.cloudfront.net</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name that corresponds to the distribution, for example,
     *        <code>d111111abcdef8.cloudfront.net</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this
     *        distribution.
     */

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * </p>
     * 
     * @return A complex type that contains information about CNAMEs (alternate domain names), if any, for this
     *         distribution.
     */

    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     * 
     * @param origins
     *        A complex type that contains information about origins for this distribution.
     */

    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     * 
     * @return A complex type that contains information about origins for this distribution.
     */

    public Origins getOrigins() {
        return this.origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     * 
     * @param origins
     *        A complex type that contains information about origins for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withOrigins(Origins origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this distribution.
     * </p>
     * 
     * @param originGroups
     *        A complex type that contains information about origin groups for this distribution.
     */

    public void setOriginGroups(OriginGroups originGroups) {
        this.originGroups = originGroups;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this distribution.
     * </p>
     * 
     * @return A complex type that contains information about origin groups for this distribution.
     */

    public OriginGroups getOriginGroups() {
        return this.originGroups;
    }

    /**
     * <p>
     * A complex type that contains information about origin groups for this distribution.
     * </p>
     * 
     * @param originGroups
     *        A complex type that contains information about origin groups for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withOriginGroups(OriginGroups originGroups) {
        setOriginGroups(originGroups);
        return this;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     * element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     *        element or if files don't match any of the values of <code>PathPattern</code> in
     *        <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
     */

    public void setDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     * element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     * 
     * @return A complex type that describes the default cache behavior if you don't specify a
     *         <code>CacheBehavior</code> element or if files don't match any of the values of <code>PathPattern</code>
     *         in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
     */

    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * <p>
     * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     * element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code>
     * elements. You must create exactly one default cache behavior.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code>
     *        element or if files don't match any of the values of <code>PathPattern</code> in
     *        <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code> elements.
     * </p>
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more <code>CacheBehavior</code> elements.
     */

    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code> elements.
     * </p>
     * 
     * @return A complex type that contains zero or more <code>CacheBehavior</code> elements.
     */

    public CacheBehaviors getCacheBehaviors() {
        return this.cacheBehaviors;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CacheBehavior</code> elements.
     * </p>
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more <code>CacheBehavior</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     * </p>
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     */

    public void setCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     * </p>
     * 
     * @return A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     */

    public CustomErrorResponses getCustomErrorResponses() {
        return this.customErrorResponses;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     * </p>
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more <code>CustomErrorResponses</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withCustomErrorResponses(CustomErrorResponses customErrorResponses) {
        setCustomErrorResponses(customErrorResponses);
        return this;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     * 
     * @param comment
     *        The comment originally specified when this distribution was created.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     * 
     * @return The comment originally specified when this distribution was created.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     * 
     * @param comment
     *        The comment originally specified when this distribution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @return A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public DistributionSummary withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public void setPriceClass(PriceClass priceClass) {
        withPriceClass(priceClass);
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public DistributionSummary withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept user requests for content.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @return Whether the distribution is enabled to accept user requests for content.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept user requests for content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @return Whether the distribution is enabled to accept user requests for content.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p/>
     * 
     * @param viewerCertificate
     */

    public void setViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ViewerCertificate getViewerCertificate() {
        return this.viewerCertificate;
    }

    /**
     * <p/>
     * 
     * @param viewerCertificate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withViewerCertificate(ViewerCertificate viewerCertificate) {
        setViewerCertificate(viewerCertificate);
        return this;
    }

    /**
     * <p/>
     * 
     * @param restrictions
     */

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Restrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p/>
     * 
     * @param restrictions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withRestrictions(Restrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     * 
     * @param webACLId
     *        The Web ACL Id (if any) associated with the distribution.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     * 
     * @return The Web ACL Id (if any) associated with the distribution.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The Web ACL Id (if any) associated with the distribution.
     * </p>
     * 
     * @param webACLId
     *        The Web ACL Id (if any) associated with the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     * 
     * @param httpVersion
     *        Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default
     *        value for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     *        automatically use an earlier version.
     * @see HttpVersion
     */

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     * 
     * @return Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default
     *         value for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code>
     *         will automatically use an earlier version.
     * @see HttpVersion
     */

    public String getHttpVersion() {
        return this.httpVersion;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     * 
     * @param httpVersion
     *        Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default
     *        value for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     *        automatically use an earlier version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpVersion
     */

    public DistributionSummary withHttpVersion(String httpVersion) {
        setHttpVersion(httpVersion);
        return this;
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     * 
     * @param httpVersion
     *        Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default
     *        value for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     *        automatically use an earlier version.
     * @see HttpVersion
     */

    public void setHttpVersion(HttpVersion httpVersion) {
        withHttpVersion(httpVersion);
    }

    /**
     * <p>
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value
     * for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     * automatically use an earlier version.
     * </p>
     * 
     * @param httpVersion
     *        Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default
     *        value for new web distributions is <code>http2</code>. Viewers that don't support <code>HTTP/2</code> will
     *        automatically use an earlier version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpVersion
     */

    public DistributionSummary withHttpVersion(HttpVersion httpVersion) {
        this.httpVersion = httpVersion.toString();
        return this;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * </p>
     * 
     * @param isIPV6Enabled
     *        Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     */

    public void setIsIPV6Enabled(Boolean isIPV6Enabled) {
        this.isIPV6Enabled = isIPV6Enabled;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * </p>
     * 
     * @return Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     */

    public Boolean getIsIPV6Enabled() {
        return this.isIPV6Enabled;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * </p>
     * 
     * @param isIPV6Enabled
     *        Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionSummary withIsIPV6Enabled(Boolean isIPV6Enabled) {
        setIsIPV6Enabled(isIPV6Enabled);
        return this;
    }

    /**
     * <p>
     * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     * </p>
     * 
     * @return Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
     */

    public Boolean isIPV6Enabled() {
        return this.isIPV6Enabled;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getOrigins() != null)
            sb.append("Origins: ").append(getOrigins()).append(",");
        if (getOriginGroups() != null)
            sb.append("OriginGroups: ").append(getOriginGroups()).append(",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: ").append(getDefaultCacheBehavior()).append(",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: ").append(getCacheBehaviors()).append(",");
        if (getCustomErrorResponses() != null)
            sb.append("CustomErrorResponses: ").append(getCustomErrorResponses()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getPriceClass() != null)
            sb.append("PriceClass: ").append(getPriceClass()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getViewerCertificate() != null)
            sb.append("ViewerCertificate: ").append(getViewerCertificate()).append(",");
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions()).append(",");
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId()).append(",");
        if (getHttpVersion() != null)
            sb.append("HttpVersion: ").append(getHttpVersion()).append(",");
        if (getIsIPV6Enabled() != null)
            sb.append("IsIPV6Enabled: ").append(getIsIPV6Enabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionSummary == false)
            return false;
        DistributionSummary other = (DistributionSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getOriginGroups() == null ^ this.getOriginGroups() == null)
            return false;
        if (other.getOriginGroups() != null && other.getOriginGroups().equals(this.getOriginGroups()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null && other.getDefaultCacheBehavior().equals(this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getCacheBehaviors() == null ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getCustomErrorResponses() == null ^ this.getCustomErrorResponses() == null)
            return false;
        if (other.getCustomErrorResponses() != null && other.getCustomErrorResponses().equals(this.getCustomErrorResponses()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getViewerCertificate() == null ^ this.getViewerCertificate() == null)
            return false;
        if (other.getViewerCertificate() != null && other.getViewerCertificate().equals(this.getViewerCertificate()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getHttpVersion() == null ^ this.getHttpVersion() == null)
            return false;
        if (other.getHttpVersion() != null && other.getHttpVersion().equals(this.getHttpVersion()) == false)
            return false;
        if (other.getIsIPV6Enabled() == null ^ this.getIsIPV6Enabled() == null)
            return false;
        if (other.getIsIPV6Enabled() != null && other.getIsIPV6Enabled().equals(this.getIsIPV6Enabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode + ((getOriginGroups() == null) ? 0 : getOriginGroups().hashCode());
        hashCode = prime * hashCode + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode());
        hashCode = prime * hashCode + ((getCustomErrorResponses() == null) ? 0 : getCustomErrorResponses().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getViewerCertificate() == null) ? 0 : getViewerCertificate().hashCode());
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getHttpVersion() == null) ? 0 : getHttpVersion().hashCode());
        hashCode = prime * hashCode + ((getIsIPV6Enabled() == null) ? 0 : getIsIPV6Enabled().hashCode());
        return hashCode;
    }

    @Override
    public DistributionSummary clone() {
        try {
            return (DistributionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
