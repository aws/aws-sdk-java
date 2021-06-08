/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A distribution configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information about the cache configuration for the distribution.
     * </p>
     */
    private AwsCloudFrontDistributionCacheBehaviors cacheBehaviors;
    /**
     * <p>
     * The default cache behavior for the configuration.
     * </p>
     */
    private AwsCloudFrontDistributionDefaultCacheBehavior defaultCacheBehavior;
    /**
     * <p>
     * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer
     * requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/product-description.html).
     * </p>
     */
    private String defaultRootObject;
    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * Indicates when that the distribution was last modified.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastModifiedTime;
    /**
     * <p>
     * A complex type that controls whether access logs are written for the distribution.
     * </p>
     */
    private AwsCloudFrontDistributionLogging logging;
    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     */
    private AwsCloudFrontDistributionOrigins origins;
    /**
     * <p>
     * Provides information about the origin groups in the distribution.
     * </p>
     */
    private AwsCloudFrontDistributionOriginGroups originGroups;
    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     * </p>
     */
    private String webAclId;

    /**
     * <p>
     * Provides information about the cache configuration for the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        Provides information about the cache configuration for the distribution.
     */

    public void setCacheBehaviors(AwsCloudFrontDistributionCacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * <p>
     * Provides information about the cache configuration for the distribution.
     * </p>
     * 
     * @return Provides information about the cache configuration for the distribution.
     */

    public AwsCloudFrontDistributionCacheBehaviors getCacheBehaviors() {
        return this.cacheBehaviors;
    }

    /**
     * <p>
     * Provides information about the cache configuration for the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        Provides information about the cache configuration for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withCacheBehaviors(AwsCloudFrontDistributionCacheBehaviors cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * <p>
     * The default cache behavior for the configuration.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        The default cache behavior for the configuration.
     */

    public void setDefaultCacheBehavior(AwsCloudFrontDistributionDefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * <p>
     * The default cache behavior for the configuration.
     * </p>
     * 
     * @return The default cache behavior for the configuration.
     */

    public AwsCloudFrontDistributionDefaultCacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * <p>
     * The default cache behavior for the configuration.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        The default cache behavior for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withDefaultCacheBehavior(AwsCloudFrontDistributionDefaultCacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * <p>
     * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer
     * requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/product-description.html).
     * </p>
     * 
     * @param defaultRootObject
     *        The object that CloudFront sends in response to requests from the origin (for example, index.html) when a
     *        viewer requests the root URL for the distribution (http://www.example.com) instead of an object in your
     *        distribution (http://www.example.com/product-description.html).
     */

    public void setDefaultRootObject(String defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    /**
     * <p>
     * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer
     * requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/product-description.html).
     * </p>
     * 
     * @return The object that CloudFront sends in response to requests from the origin (for example, index.html) when a
     *         viewer requests the root URL for the distribution (http://www.example.com) instead of an object in your
     *         distribution (http://www.example.com/product-description.html).
     */

    public String getDefaultRootObject() {
        return this.defaultRootObject;
    }

    /**
     * <p>
     * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer
     * requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/product-description.html).
     * </p>
     * 
     * @param defaultRootObject
     *        The object that CloudFront sends in response to requests from the origin (for example, index.html) when a
     *        viewer requests the root URL for the distribution (http://www.example.com) instead of an object in your
     *        distribution (http://www.example.com/product-description.html).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withDefaultRootObject(String defaultRootObject) {
        setDefaultRootObject(defaultRootObject);
        return this;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * 
     * @param domainName
     *        The domain name corresponding to the distribution.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * 
     * @return The domain name corresponding to the distribution.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * 
     * @param domainName
     *        The domain name corresponding to the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * 
     * @param eTag
     *        The entity tag is a hash of the object.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * 
     * @return The entity tag is a hash of the object.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * 
     * @param eTag
     *        The entity tag is a hash of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * Indicates when that the distribution was last modified.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastModifiedTime
     *        Indicates when that the distribution was last modified.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when that the distribution was last modified.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when that the distribution was last modified.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when that the distribution was last modified.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastModifiedTime
     *        Indicates when that the distribution was last modified.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withLastModifiedTime(String lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the distribution.
     * </p>
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for the distribution.
     */

    public void setLogging(AwsCloudFrontDistributionLogging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the distribution.
     * </p>
     * 
     * @return A complex type that controls whether access logs are written for the distribution.
     */

    public AwsCloudFrontDistributionLogging getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the distribution.
     * </p>
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withLogging(AwsCloudFrontDistributionLogging logging) {
        setLogging(logging);
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

    public void setOrigins(AwsCloudFrontDistributionOrigins origins) {
        this.origins = origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this distribution.
     * </p>
     * 
     * @return A complex type that contains information about origins for this distribution.
     */

    public AwsCloudFrontDistributionOrigins getOrigins() {
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

    public AwsCloudFrontDistributionDetails withOrigins(AwsCloudFrontDistributionOrigins origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * <p>
     * Provides information about the origin groups in the distribution.
     * </p>
     * 
     * @param originGroups
     *        Provides information about the origin groups in the distribution.
     */

    public void setOriginGroups(AwsCloudFrontDistributionOriginGroups originGroups) {
        this.originGroups = originGroups;
    }

    /**
     * <p>
     * Provides information about the origin groups in the distribution.
     * </p>
     * 
     * @return Provides information about the origin groups in the distribution.
     */

    public AwsCloudFrontDistributionOriginGroups getOriginGroups() {
        return this.originGroups;
    }

    /**
     * <p>
     * Provides information about the origin groups in the distribution.
     * </p>
     * 
     * @param originGroups
     *        Provides information about the origin groups in the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withOriginGroups(AwsCloudFrontDistributionOriginGroups originGroups) {
        setOriginGroups(originGroups);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * 
     * @param status
     *        Indicates the current status of the distribution.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * 
     * @return Indicates the current status of the distribution.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * 
     * @param status
     *        Indicates the current status of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     * </p>
     * 
     * @param webAclId
     *        A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     */

    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     * </p>
     * 
     * @return A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     */

    public String getWebAclId() {
        return this.webAclId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     * </p>
     * 
     * @param webAclId
     *        A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionDetails withWebAclId(String webAclId) {
        setWebAclId(webAclId);
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
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: ").append(getCacheBehaviors()).append(",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: ").append(getDefaultCacheBehavior()).append(",");
        if (getDefaultRootObject() != null)
            sb.append("DefaultRootObject: ").append(getDefaultRootObject()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getOrigins() != null)
            sb.append("Origins: ").append(getOrigins()).append(",");
        if (getOriginGroups() != null)
            sb.append("OriginGroups: ").append(getOriginGroups()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWebAclId() != null)
            sb.append("WebAclId: ").append(getWebAclId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionDetails == false)
            return false;
        AwsCloudFrontDistributionDetails other = (AwsCloudFrontDistributionDetails) obj;
        if (other.getCacheBehaviors() == null ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null && other.getDefaultCacheBehavior().equals(this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getDefaultRootObject() == null ^ this.getDefaultRootObject() == null)
            return false;
        if (other.getDefaultRootObject() != null && other.getDefaultRootObject().equals(this.getDefaultRootObject()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getOriginGroups() == null ^ this.getOriginGroups() == null)
            return false;
        if (other.getOriginGroups() != null && other.getOriginGroups().equals(this.getOriginGroups()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode());
        hashCode = prime * hashCode + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode());
        hashCode = prime * hashCode + ((getDefaultRootObject() == null) ? 0 : getDefaultRootObject().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode + ((getOriginGroups() == null) ? 0 : getOriginGroups().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionDetails clone() {
        try {
            return (AwsCloudFrontDistributionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
