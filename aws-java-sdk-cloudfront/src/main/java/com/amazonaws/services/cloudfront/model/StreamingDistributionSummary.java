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
 * A summary of the information for an Amazon CloudFront streaming distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/StreamingDistributionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDistributionSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     * <code>123456789012</code> is your AWS account ID.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Indicates the current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     * information is fully propagated throughout the Amazon CloudFront system.
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
     * The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     */
    private S3Origin s3Origin;
    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     */
    private Aliases aliases;
    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content. If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>.If you don't want to require signed URLs
     * in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code>
     * and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>. To add, change, or remove one or more
     * trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change
     * <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     */
    private TrustedSigners trustedSigners;
    /**
     * <p>
     * The comment originally specified when this distribution was created.
     * </p>
     */
    private String comment;
    /** <p/> */
    private String priceClass;
    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for content.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @return The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the distribution, for example, <code>EDFDVBD632BHDS5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     * <code>123456789012</code> is your AWS account ID.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) for the streaming distribution. For example:
     *        <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     *        <code>123456789012</code> is your AWS account ID.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     * <code>123456789012</code> is your AWS account ID.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the streaming distribution. For example:
     *         <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     *         <code>123456789012</code> is your AWS account ID.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the streaming distribution. For example:
     * <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     * <code>123456789012</code> is your AWS account ID.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) for the streaming distribution. For example:
     *        <code>arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5</code>, where
     *        <code>123456789012</code> is your AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     * information is fully propagated throughout the Amazon CloudFront system.
     * </p>
     * 
     * @param status
     *        Indicates the current status of the distribution. When the status is <code>Deployed</code>, the
     *        distribution's information is fully propagated throughout the Amazon CloudFront system.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     * information is fully propagated throughout the Amazon CloudFront system.
     * </p>
     * 
     * @return Indicates the current status of the distribution. When the status is <code>Deployed</code>, the
     *         distribution's information is fully propagated throughout the Amazon CloudFront system.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution. When the status is <code>Deployed</code>, the distribution's
     * information is fully propagated throughout the Amazon CloudFront system.
     * </p>
     * 
     * @param status
     *        Indicates the current status of the distribution. When the status is <code>Deployed</code>, the
     *        distribution's information is fully propagated throughout the Amazon CloudFront system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withStatus(String status) {
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

    public StreamingDistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>
     *        .
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @return The domain name corresponding to the distribution, for example,
     *         <code>d111111abcdef8.cloudfront.net</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @param s3Origin
     *        A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *        your media files for distribution.
     */

    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @return A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *         your media files for distribution.
     */

    public S3Origin getS3Origin() {
        return this.s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @param s3Origin
     *        A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *        your media files for distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withS3Origin(S3Origin s3Origin) {
        setS3Origin(s3Origin);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     *        distribution.
     */

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @return A complex type that contains information about CNAMEs (alternate domain names), if any, for this
     *         streaming distribution.
     */

    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content. If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>.If you don't want to require signed URLs
     * in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code>
     * and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>. To add, change, or remove one or more
     * trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change
     * <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *        private content. If you want to require signed URLs in requests for objects in the target origin that
     *        match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for
     *        <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>
     *        .If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *        specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *        <code>Items</code>. To add, change, or remove one or more trusted signers, change <code>Enabled</code> to
     *        <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and
     *        specify all of the trusted signers that you want to include in the updated distribution.
     */

    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content. If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>.If you don't want to require signed URLs
     * in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code>
     * and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>. To add, change, or remove one or more
     * trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change
     * <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     * 
     * @return A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *         private content. If you want to require signed URLs in requests for objects in the target origin that
     *         match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for
     *         <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>
     *         .If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *         specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *         <code>Items</code>. To add, change, or remove one or more trusted signers, change <code>Enabled</code> to
     *         <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and
     *         specify all of the trusted signers that you want to include in the updated distribution.
     */

    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content. If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>.If you don't want to require signed URLs
     * in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code>
     * and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>. To add, change, or remove one or more
     * trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change
     * <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the
     * updated distribution.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *        private content. If you want to require signed URLs in requests for objects in the target origin that
     *        match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for
     *        <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>
     *        .If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *        specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *        <code>Items</code>. To add, change, or remove one or more trusted signers, change <code>Enabled</code> to
     *        <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and
     *        specify all of the trusted signers that you want to include in the updated distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
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

    public StreamingDistributionSummary withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p/>
     * 
     * @param priceClass
     * @see PriceClass
     */

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * <p/>
     * 
     * @return
     * @see PriceClass
     */

    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * <p/>
     * 
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public StreamingDistributionSummary withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * <p/>
     * 
     * @param priceClass
     * @see PriceClass
     */

    public void setPriceClass(PriceClass priceClass) {
        withPriceClass(priceClass);
    }

    /**
     * <p/>
     * 
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public StreamingDistributionSummary withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests for content.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for content.
     * </p>
     * 
     * @return Whether the distribution is enabled to accept end user requests for content.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests for content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the distribution is enabled to accept end user requests for content.
     * </p>
     * 
     * @return Whether the distribution is enabled to accept end user requests for content.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getS3Origin() != null)
            sb.append("S3Origin: ").append(getS3Origin()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: ").append(getTrustedSigners()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getPriceClass() != null)
            sb.append("PriceClass: ").append(getPriceClass()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistributionSummary == false)
            return false;
        StreamingDistributionSummary other = (StreamingDistributionSummary) obj;
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
        if (other.getS3Origin() == null ^ this.getS3Origin() == null)
            return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
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
        hashCode = prime * hashCode + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistributionSummary clone() {
        try {
            return (StreamingDistributionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
