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
 * A streaming distribution.
 */
public class StreamingDistribution implements Serializable, Cloneable {

    /**
     * The identifier for the streaming distribution. For example:
     * EGTXBD79H29TRA8.
     */
    private String id;
    /**
     * The current status of the streaming distribution. When the status is
     * Deployed, the distribution's information is fully propagated throughout
     * the Amazon CloudFront system.
     */
    private String status;
    /** The date and time the distribution was last modified. */
    private java.util.Date lastModifiedTime;
    /**
     * The domain name corresponding to the streaming distribution. For example:
     * s5c39gqb8ow64r.cloudfront.net.
     */
    private String domainName;
    /**
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The Signer child element lists the AWS account number of
     * the trusted signer (or an empty Self element if the signer is you). The
     * Signer element also includes the IDs of any active key pairs associated
     * with the trusted signer's AWS account. If no KeyPairId element appears for
     * a Signer, that signer can't create working signed URLs.
     */
    private ActiveTrustedSigners activeTrustedSigners;
    /** The current configuration information for the streaming distribution. */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * The identifier for the streaming distribution. For example:
     * EGTXBD79H29TRA8.
     * 
     * @param id
     *        The identifier for the streaming distribution. For example:
     *        EGTXBD79H29TRA8.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The identifier for the streaming distribution. For example:
     * EGTXBD79H29TRA8.
     * 
     * @return The identifier for the streaming distribution. For example:
     *         EGTXBD79H29TRA8.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The identifier for the streaming distribution. For example:
     * EGTXBD79H29TRA8.
     * 
     * @param id
     *        The identifier for the streaming distribution. For example:
     *        EGTXBD79H29TRA8.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The current status of the streaming distribution. When the status is
     * Deployed, the distribution's information is fully propagated throughout
     * the Amazon CloudFront system.
     * 
     * @param status
     *        The current status of the streaming distribution. When the status
     *        is Deployed, the distribution's information is fully propagated
     *        throughout the Amazon CloudFront system.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The current status of the streaming distribution. When the status is
     * Deployed, the distribution's information is fully propagated throughout
     * the Amazon CloudFront system.
     * 
     * @return The current status of the streaming distribution. When the status
     *         is Deployed, the distribution's information is fully propagated
     *         throughout the Amazon CloudFront system.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * The current status of the streaming distribution. When the status is
     * Deployed, the distribution's information is fully propagated throughout
     * the Amazon CloudFront system.
     * 
     * @param status
     *        The current status of the streaming distribution. When the status
     *        is Deployed, the distribution's information is fully propagated
     *        throughout the Amazon CloudFront system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The date and time the distribution was last modified.
     * 
     * @param lastModifiedTime
     *        The date and time the distribution was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * The date and time the distribution was last modified.
     * 
     * @return The date and time the distribution was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * The date and time the distribution was last modified.
     * 
     * @param lastModifiedTime
     *        The date and time the distribution was last modified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withLastModifiedTime(
            java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * The domain name corresponding to the streaming distribution. For example:
     * s5c39gqb8ow64r.cloudfront.net.
     * 
     * @param domainName
     *        The domain name corresponding to the streaming distribution. For
     *        example: s5c39gqb8ow64r.cloudfront.net.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The domain name corresponding to the streaming distribution. For example:
     * s5c39gqb8ow64r.cloudfront.net.
     * 
     * @return The domain name corresponding to the streaming distribution. For
     *         example: s5c39gqb8ow64r.cloudfront.net.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The domain name corresponding to the streaming distribution. For example:
     * s5c39gqb8ow64r.cloudfront.net.
     * 
     * @param domainName
     *        The domain name corresponding to the streaming distribution. For
     *        example: s5c39gqb8ow64r.cloudfront.net.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The Signer child element lists the AWS account number of
     * the trusted signer (or an empty Self element if the signer is you). The
     * Signer element also includes the IDs of any active key pairs associated
     * with the trusted signer's AWS account. If no KeyPairId element appears for
     * a Signer, that signer can't create working signed URLs.
     * 
     * @param activeTrustedSigners
     *        CloudFront automatically adds this element to the response only if
     *        you've set up the distribution to serve private content with
     *        signed URLs. The element lists the key pair IDs that CloudFront is
     *        aware of for each trusted signer. The Signer child element lists
     *        the AWS account number of the trusted signer (or an empty Self
     *        element if the signer is you). The Signer element also includes
     *        the IDs of any active key pairs associated with the trusted
     *        signer's AWS account. If no KeyPairId element appears for a
     *        Signer, that signer can't create working signed URLs.
     */

    public void setActiveTrustedSigners(
            ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The Signer child element lists the AWS account number of
     * the trusted signer (or an empty Self element if the signer is you). The
     * Signer element also includes the IDs of any active key pairs associated
     * with the trusted signer's AWS account. If no KeyPairId element appears for
     * a Signer, that signer can't create working signed URLs.
     * 
     * @return CloudFront automatically adds this element to the response only
     *         if you've set up the distribution to serve private content with
     *         signed URLs. The element lists the key pair IDs that CloudFront
     *         is aware of for each trusted signer. The Signer child element
     *         lists the AWS account number of the trusted signer (or an empty
     *         Self element if the signer is you). The Signer element also
     *         includes the IDs of any active key pairs associated with the
     *         trusted signer's AWS account. If no KeyPairId element appears for
     *         a Signer, that signer can't create working signed URLs.
     */

    public ActiveTrustedSigners getActiveTrustedSigners() {
        return this.activeTrustedSigners;
    }

    /**
     * CloudFront automatically adds this element to the response only if you've
     * set up the distribution to serve private content with signed URLs. The
     * element lists the key pair IDs that CloudFront is aware of for each
     * trusted signer. The Signer child element lists the AWS account number of
     * the trusted signer (or an empty Self element if the signer is you). The
     * Signer element also includes the IDs of any active key pairs associated
     * with the trusted signer's AWS account. If no KeyPairId element appears for
     * a Signer, that signer can't create working signed URLs.
     * 
     * @param activeTrustedSigners
     *        CloudFront automatically adds this element to the response only if
     *        you've set up the distribution to serve private content with
     *        signed URLs. The element lists the key pair IDs that CloudFront is
     *        aware of for each trusted signer. The Signer child element lists
     *        the AWS account number of the trusted signer (or an empty Self
     *        element if the signer is you). The Signer element also includes
     *        the IDs of any active key pairs associated with the trusted
     *        signer's AWS account. If no KeyPairId element appears for a
     *        Signer, that signer can't create working signed URLs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withActiveTrustedSigners(
            ActiveTrustedSigners activeTrustedSigners) {
        setActiveTrustedSigners(activeTrustedSigners);
        return this;
    }

    /**
     * The current configuration information for the streaming distribution.
     * 
     * @param streamingDistributionConfig
     *        The current configuration information for the streaming
     *        distribution.
     */

    public void setStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * The current configuration information for the streaming distribution.
     * 
     * @return The current configuration information for the streaming
     *         distribution.
     */

    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return this.streamingDistributionConfig;
    }

    /**
     * The current configuration information for the streaming distribution.
     * 
     * @param streamingDistributionConfig
     *        The current configuration information for the streaming
     *        distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistribution withStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        setStreamingDistributionConfig(streamingDistributionConfig);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: " + getActiveTrustedSigners()
                    + ",");
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: "
                    + getStreamingDistributionConfig());
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
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null
                ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(
                        this.getLastModifiedTime()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveTrustedSigners() == null
                ^ this.getActiveTrustedSigners() == null)
            return false;
        if (other.getActiveTrustedSigners() != null
                && other.getActiveTrustedSigners().equals(
                        this.getActiveTrustedSigners()) == false)
            return false;
        if (other.getStreamingDistributionConfig() == null
                ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null
                && other.getStreamingDistributionConfig().equals(
                        this.getStreamingDistributionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getActiveTrustedSigners() == null) ? 0
                        : getActiveTrustedSigners().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfig() == null) ? 0
                        : getStreamingDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistribution clone() {
        try {
            return (StreamingDistribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
