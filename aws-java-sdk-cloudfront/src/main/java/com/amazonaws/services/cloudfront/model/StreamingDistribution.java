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
 * A streaming distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/StreamingDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDistribution implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
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
     * The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     * information is propagated to all CloudFront edge locations.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for example,
     * <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex
     * type for this distribution. These are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if
     * the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the
     * IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no
     * <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private ActiveTrustedSigners activeTrustedSigners;
    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * <p>
     * The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     * </p>
     * 
     * @return The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the RTMP distribution. For example: <code>EGTXBD79EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withId(String id) {
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

    public StreamingDistribution withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     * information is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     *        information is propagated to all CloudFront edge locations.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     * information is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @return The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     *         information is propagated to all CloudFront edge locations.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     * information is propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The current status of the RTMP distribution. When the status is <code>Deployed</code>, the distribution's
     *        information is propagated to all CloudFront edge locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the distribution was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * 
     * @return The date and time that the distribution was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the distribution was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for example,
     * <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name that corresponds to the streaming distribution, for example,
     *        <code>s5c39gqb8ow64r.cloudfront.net</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for example,
     * <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     * 
     * @return The domain name that corresponds to the streaming distribution, for example,
     *         <code>s5c39gqb8ow64r.cloudfront.net</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name that corresponds to the streaming distribution, for example,
     * <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name that corresponds to the streaming distribution, for example,
     *        <code>s5c39gqb8ow64r.cloudfront.net</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex
     * type for this distribution. These are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if
     * the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the
     * IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no
     * <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param activeTrustedSigners
     *        A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code>
     *        complex type for this distribution. These are the accounts that you want to allow to create signed URLs
     *        for private content.</p>
     *        <p>
     *        The <code>Signer</code> complex type lists the AWS account number of the trusted signer or
     *        <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code>
     *        element also includes the IDs of any active CloudFront key pairs that are associated with the trusted
     *        signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer
     *        can't create signed URLs.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex
     * type for this distribution. These are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if
     * the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the
     * IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no
     * <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code>
     *         complex type for this distribution. These are the accounts that you want to allow to create signed URLs
     *         for private content.</p>
     *         <p>
     *         The <code>Signer</code> complex type lists the AWS account number of the trusted signer or
     *         <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code>
     *         element also includes the IDs of any active CloudFront key pairs that are associated with the trusted
     *         signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer
     *         can't create signed URLs.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *         Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public ActiveTrustedSigners getActiveTrustedSigners() {
        return this.activeTrustedSigners;
    }

    /**
     * <p>
     * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex
     * type for this distribution. These are the accounts that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if
     * the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the
     * IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no
     * <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param activeTrustedSigners
     *        A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code>
     *        complex type for this distribution. These are the accounts that you want to allow to create signed URLs
     *        for private content.</p>
     *        <p>
     *        The <code>Signer</code> complex type lists the AWS account number of the trusted signer or
     *        <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code>
     *        element also includes the IDs of any active CloudFront key pairs that are associated with the trusted
     *        signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer
     *        can't create signed URLs.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        setActiveTrustedSigners(activeTrustedSigners);
        return this;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     * 
     * @param streamingDistributionConfig
     *        The current configuration information for the RTMP distribution.
     */

    public void setStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     * 
     * @return The current configuration information for the RTMP distribution.
     */

    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return this.streamingDistributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the RTMP distribution.
     * </p>
     * 
     * @param streamingDistributionConfig
     *        The current configuration information for the RTMP distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistribution withStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        setStreamingDistributionConfig(streamingDistributionConfig);
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
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: ").append(getActiveTrustedSigners()).append(",");
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: ").append(getStreamingDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistribution == false)
            return false;
        StreamingDistribution other = (StreamingDistribution) obj;
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
        if (other.getActiveTrustedSigners() == null ^ this.getActiveTrustedSigners() == null)
            return false;
        if (other.getActiveTrustedSigners() != null && other.getActiveTrustedSigners().equals(this.getActiveTrustedSigners()) == false)
            return false;
        if (other.getStreamingDistributionConfig() == null ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null && other.getStreamingDistributionConfig().equals(this.getStreamingDistributionConfig()) == false)
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
        hashCode = prime * hashCode + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getStreamingDistributionConfig() == null) ? 0 : getStreamingDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistribution clone() {
        try {
            return (StreamingDistribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
