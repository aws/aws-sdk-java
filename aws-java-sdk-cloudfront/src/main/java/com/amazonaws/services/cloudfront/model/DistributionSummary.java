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
 * A summary of the information for an Amazon CloudFront distribution.
 */
public class DistributionSummary implements Serializable, Cloneable {

    /** The identifier for the distribution. For example: EDFDVBD632BHDS5. */
    private String id;
    /**
     * This response element indicates the current status of the distribution.
     * When the status is Deployed, the distribution's information is fully
     * propagated throughout the Amazon CloudFront system.
     */
    private String status;
    /** The date and time the distribution was last modified. */
    private java.util.Date lastModifiedTime;
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     */
    private String domainName;
    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     */
    private Aliases aliases;
    /**
     * A complex type that contains information about origins for this
     * distribution.
     */
    private Origins origins;
    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     */
    private DefaultCacheBehavior defaultCacheBehavior;
    /** A complex type that contains zero or more CacheBehavior elements. */
    private CacheBehaviors cacheBehaviors;
    /** A complex type that contains zero or more CustomErrorResponses elements. */
    private CustomErrorResponses customErrorResponses;
    /** The comment originally specified when this distribution was created. */
    private String comment;

    private String priceClass;
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     */
    private Boolean enabled;

    private ViewerCertificate viewerCertificate;

    private Restrictions restrictions;
    /** The Web ACL Id (if any) associated with the distribution. */
    private String webACLId;

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * 
     * @param id
     *        The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * 
     * @return The identifier for the distribution. For example:
     *         EDFDVBD632BHDS5.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * 
     * @param id
     *        The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * This response element indicates the current status of the distribution.
     * When the status is Deployed, the distribution's information is fully
     * propagated throughout the Amazon CloudFront system.
     * 
     * @param status
     *        This response element indicates the current status of the
     *        distribution. When the status is Deployed, the distribution's
     *        information is fully propagated throughout the Amazon CloudFront
     *        system.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This response element indicates the current status of the distribution.
     * When the status is Deployed, the distribution's information is fully
     * propagated throughout the Amazon CloudFront system.
     * 
     * @return This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * This response element indicates the current status of the distribution.
     * When the status is Deployed, the distribution's information is fully
     * propagated throughout the Amazon CloudFront system.
     * 
     * @param status
     *        This response element indicates the current status of the
     *        distribution. When the status is Deployed, the distribution's
     *        information is fully propagated throughout the Amazon CloudFront
     *        system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withStatus(String status) {
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

    public DistributionSummary withLastModifiedTime(
            java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * 
     * @param domainName
     *        The domain name corresponding to the distribution. For example:
     *        d604721fxaaqy9.cloudfront.net.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * 
     * @return The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * 
     * @param domainName
     *        The domain name corresponding to the distribution. For example:
     *        d604721fxaaqy9.cloudfront.net.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate
     *        domain names), if any, for this distribution.
     */

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @return A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     */

    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate
     *        domain names), if any, for this distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @param origins
     *        A complex type that contains information about origins for this
     *        distribution.
     */

    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @return A complex type that contains information about origins for this
     *         distribution.
     */

    public Origins getOrigins() {
        return this.origins;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @param origins
     *        A complex type that contains information about origins for this
     *        distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withOrigins(Origins origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you do
     *        not specify a CacheBehavior element or if files don't match any of
     *        the values of PathPattern in CacheBehavior elements.You must
     *        create exactly one default cache behavior.
     */

    public void setDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @return A complex type that describes the default cache behavior if you
     *         do not specify a CacheBehavior element or if files don't match
     *         any of the values of PathPattern in CacheBehavior elements.You
     *         must create exactly one default cache behavior.
     */

    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you do
     *        not specify a CacheBehavior element or if files don't match any of
     *        the values of PathPattern in CacheBehavior elements.You must
     *        create exactly one default cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more CacheBehavior elements.
     */

    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @return A complex type that contains zero or more CacheBehavior elements.
     */

    public CacheBehaviors getCacheBehaviors() {
        return this.cacheBehaviors;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more CacheBehavior elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponses elements.
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more CustomErrorResponses
     *        elements.
     */

    public void setCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponses elements.
     * 
     * @return A complex type that contains zero or more CustomErrorResponses
     *         elements.
     */

    public CustomErrorResponses getCustomErrorResponses() {
        return this.customErrorResponses;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponses elements.
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more CustomErrorResponses
     *        elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        setCustomErrorResponses(customErrorResponses);
        return this;
    }

    /**
     * The comment originally specified when this distribution was created.
     * 
     * @param comment
     *        The comment originally specified when this distribution was
     *        created.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * The comment originally specified when this distribution was created.
     * 
     * @return The comment originally specified when this distribution was
     *         created.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * The comment originally specified when this distribution was created.
     * 
     * @param comment
     *        The comment originally specified when this distribution was
     *        created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * @param priceClass
     * @see PriceClass
     */

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * @return
     * @see PriceClass
     */

    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public DistributionSummary withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public DistributionSummary withPriceClass(PriceClass priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests
     *        for content.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @return Whether the distribution is enabled to accept end user requests
     *         for content.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests
     *        for content.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @return Whether the distribution is enabled to accept end user requests
     *         for content.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param viewerCertificate
     */

    public void setViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    /**
     * @return
     */

    public ViewerCertificate getViewerCertificate() {
        return this.viewerCertificate;
    }

    /**
     * @param viewerCertificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withViewerCertificate(
            ViewerCertificate viewerCertificate) {
        setViewerCertificate(viewerCertificate);
        return this;
    }

    /**
     * @param restrictions
     */

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * @return
     */

    public Restrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * @param restrictions
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withRestrictions(Restrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * The Web ACL Id (if any) associated with the distribution.
     * 
     * @param webACLId
     *        The Web ACL Id (if any) associated with the distribution.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * The Web ACL Id (if any) associated with the distribution.
     * 
     * @return The Web ACL Id (if any) associated with the distribution.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * The Web ACL Id (if any) associated with the distribution.
     * 
     * @param webACLId
     *        The Web ACL Id (if any) associated with the distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionSummary withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getOrigins() != null)
            sb.append("Origins: " + getOrigins() + ",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: " + getDefaultCacheBehavior()
                    + ",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: " + getCacheBehaviors() + ",");
        if (getCustomErrorResponses() != null)
            sb.append("CustomErrorResponses: " + getCustomErrorResponses()
                    + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getPriceClass() != null)
            sb.append("PriceClass: " + getPriceClass() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getViewerCertificate() != null)
            sb.append("ViewerCertificate: " + getViewerCertificate() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
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
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null
                && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null
                && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null
                ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null
                && other.getDefaultCacheBehavior().equals(
                        this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getCacheBehaviors() == null
                ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null
                && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getCustomErrorResponses() == null
                ^ this.getCustomErrorResponses() == null)
            return false;
        if (other.getCustomErrorResponses() != null
                && other.getCustomErrorResponses().equals(
                        this.getCustomErrorResponses()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null
                && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getViewerCertificate() == null
                ^ this.getViewerCertificate() == null)
            return false;
        if (other.getViewerCertificate() != null
                && other.getViewerCertificate().equals(
                        this.getViewerCertificate()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null
                && other.getWebACLId().equals(this.getWebACLId()) == false)
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
        hashCode = prime * hashCode
                + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode
                + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCacheBehavior() == null) ? 0
                        : getDefaultCacheBehavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomErrorResponses() == null) ? 0
                        : getCustomErrorResponses().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getViewerCertificate() == null) ? 0
                        : getViewerCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public DistributionSummary clone() {
        try {
            return (DistributionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
