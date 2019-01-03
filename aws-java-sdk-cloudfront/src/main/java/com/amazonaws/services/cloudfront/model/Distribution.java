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
 * The distribution's information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Distribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Distribution implements Serializable, Cloneable {

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
     * This response element indicates the current status of the distribution. When the status is <code>Deployed</code>,
     * the distribution's information is fully propagated to all CloudFront edge locations.
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
     * The number of invalidation batches currently in progress.
     * </p>
     */
    private Integer inProgressInvalidationBatches;
    /**
     * <p>
     * The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     * private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted
     * signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer (or an empty
     * <code>Self</code> element if the signer is you). The <code>Signer</code> element also includes the IDs of any
     * active key pairs associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears
     * for a <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     */
    private ActiveTrustedSigners activeTrustedSigners;
    /**
     * <p>
     * The current configuration information for the distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     * </p>
     */
    private DistributionConfig distributionConfig;

    /**
     * Default constructor for Distribution object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Distribution() {
    }

    /**
     * Constructs a new Distribution object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The identifier for the distribution. For example: <code>EDFDVBD632BHDS5</code>.
     * @param status
     *        This response element indicates the current status of the distribution. When the status is
     *        <code>Deployed</code>, the distribution's information is fully propagated to all CloudFront edge
     *        locations.
     * @param domainName
     *        The domain name corresponding to the distribution, for example, <code>d111111abcdef8.cloudfront.net</code>
     *        .
     */
    public Distribution(String id, String status, String domainName) {
        setId(id);
        setStatus(status);
        setDomainName(domainName);
    }

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

    public Distribution withId(String id) {
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

    public Distribution withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution. When the status is <code>Deployed</code>,
     * the distribution's information is fully propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        This response element indicates the current status of the distribution. When the status is
     *        <code>Deployed</code>, the distribution's information is fully propagated to all CloudFront edge
     *        locations.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution. When the status is <code>Deployed</code>,
     * the distribution's information is fully propagated to all CloudFront edge locations.
     * </p>
     * 
     * @return This response element indicates the current status of the distribution. When the status is
     *         <code>Deployed</code>, the distribution's information is fully propagated to all CloudFront edge
     *         locations.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * This response element indicates the current status of the distribution. When the status is <code>Deployed</code>,
     * the distribution's information is fully propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        This response element indicates the current status of the distribution. When the status is
     *        <code>Deployed</code>, the distribution's information is fully propagated to all CloudFront edge
     *        locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withStatus(String status) {
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

    public Distribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @param inProgressInvalidationBatches
     *        The number of invalidation batches currently in progress.
     */

    public void setInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @return The number of invalidation batches currently in progress.
     */

    public Integer getInProgressInvalidationBatches() {
        return this.inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @param inProgressInvalidationBatches
     *        The number of invalidation batches currently in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        setInProgressInvalidationBatches(inProgressInvalidationBatches);
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

    public Distribution withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     * private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted
     * signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer (or an empty
     * <code>Self</code> element if the signer is you). The <code>Signer</code> element also includes the IDs of any
     * active key pairs associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears
     * for a <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     * 
     * @param activeTrustedSigners
     *        CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     *        private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each
     *        trusted signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer
     *        (or an empty <code>Self</code> element if the signer is you). The <code>Signer</code> element also
     *        includes the IDs of any active key pairs associated with the trusted signer's AWS account. If no
     *        <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create working signed
     *        URLs.
     */

    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     * private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted
     * signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer (or an empty
     * <code>Self</code> element if the signer is you). The <code>Signer</code> element also includes the IDs of any
     * active key pairs associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears
     * for a <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     * 
     * @return CloudFront automatically adds this element to the response only if you've set up the distribution to
     *         serve private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of
     *         for each trusted signer. The <code>Signer</code> child element lists the AWS account number of the
     *         trusted signer (or an empty <code>Self</code> element if the signer is you). The <code>Signer</code>
     *         element also includes the IDs of any active key pairs associated with the trusted signer's AWS account.
     *         If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create working
     *         signed URLs.
     */

    public ActiveTrustedSigners getActiveTrustedSigners() {
        return this.activeTrustedSigners;
    }

    /**
     * <p>
     * CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     * private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted
     * signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer (or an empty
     * <code>Self</code> element if the signer is you). The <code>Signer</code> element also includes the IDs of any
     * active key pairs associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears
     * for a <code>Signer</code>, that signer can't create working signed URLs.
     * </p>
     * 
     * @param activeTrustedSigners
     *        CloudFront automatically adds this element to the response only if you've set up the distribution to serve
     *        private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each
     *        trusted signer. The <code>Signer</code> child element lists the AWS account number of the trusted signer
     *        (or an empty <code>Self</code> element if the signer is you). The <code>Signer</code> element also
     *        includes the IDs of any active key pairs associated with the trusted signer's AWS account. If no
     *        <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create working signed
     *        URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        setActiveTrustedSigners(activeTrustedSigners);
        return this;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     * </p>
     * 
     * @param distributionConfig
     *        The current configuration information for the distribution. Send a <code>GET</code> request to the
     *        <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     * </p>
     * 
     * @return The current configuration information for the distribution. Send a <code>GET</code> request to the
     *         <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * <p>
     * The current configuration information for the distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     * </p>
     * 
     * @param distributionConfig
     *        The current configuration information for the distribution. Send a <code>GET</code> request to the
     *        <code>/<i>CloudFront API version</i>/distribution ID/config</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withDistributionConfig(DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
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
        if (getInProgressInvalidationBatches() != null)
            sb.append("InProgressInvalidationBatches: ").append(getInProgressInvalidationBatches()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: ").append(getActiveTrustedSigners()).append(",");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: ").append(getDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;
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
        if (other.getInProgressInvalidationBatches() == null ^ this.getInProgressInvalidationBatches() == null)
            return false;
        if (other.getInProgressInvalidationBatches() != null
                && other.getInProgressInvalidationBatches().equals(this.getInProgressInvalidationBatches()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveTrustedSigners() == null ^ this.getActiveTrustedSigners() == null)
            return false;
        if (other.getActiveTrustedSigners() != null && other.getActiveTrustedSigners().equals(this.getActiveTrustedSigners()) == false)
            return false;
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
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
        hashCode = prime * hashCode + ((getInProgressInvalidationBatches() == null) ? 0 : getInProgressInvalidationBatches().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public Distribution clone() {
        try {
            return (Distribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
