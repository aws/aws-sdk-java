/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A summary of the information for an Amazon CloudFront distribution.
 * </p>
 */
public class DistributionSummary {

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    private String id;

    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     */
    private String status;

    /**
     * The date and time the distribution was last modified.
     */
    private java.util.Date lastModifiedTime;

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     */
    private String domainName;

    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this distribution.
     */
    private Aliases aliases;

    /**
     * A complex type that contains information about origins for this
     * distribution.
     */
    private Origins origins;

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the
     * values of PathPattern in CacheBehavior elements.You must create
     * exactly one default cache behavior.
     */
    private DefaultCacheBehavior defaultCacheBehavior;

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     */
    private CacheBehaviors cacheBehaviors;

    /**
     * The comment originally specified when this distribution was created.
     */
    private String comment;

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     */
    private Boolean enabled;

    /**
     * Default constructor for a new DistributionSummary object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DistributionSummary() {}
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     *
     * @return This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     *
     * @param status This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * The date and time the distribution was last modified.
     *
     * @return The date and time the distribution was last modified.
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @return The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this distribution.
     *
     * @return A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     */
    public Aliases getAliases() {
        return aliases;
    }
    
    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this distribution.
     *
     * @param aliases A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }
    
    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withAliases(Aliases aliases) {
        this.aliases = aliases;
        return this;
    }
    
    
    /**
     * A complex type that contains information about origins for this
     * distribution.
     *
     * @return A complex type that contains information about origins for this
     *         distribution.
     */
    public Origins getOrigins() {
        return origins;
    }
    
    /**
     * A complex type that contains information about origins for this
     * distribution.
     *
     * @param origins A complex type that contains information about origins for this
     *         distribution.
     */
    public void setOrigins(Origins origins) {
        this.origins = origins;
    }
    
    /**
     * A complex type that contains information about origins for this
     * distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param origins A complex type that contains information about origins for this
     *         distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withOrigins(Origins origins) {
        this.origins = origins;
        return this;
    }
    
    
    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the
     * values of PathPattern in CacheBehavior elements.You must create
     * exactly one default cache behavior.
     *
     * @return A complex type that describes the default cache behavior if you do not
     *         specify a CacheBehavior element or if files don't match any of the
     *         values of PathPattern in CacheBehavior elements.You must create
     *         exactly one default cache behavior.
     */
    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return defaultCacheBehavior;
    }
    
    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the
     * values of PathPattern in CacheBehavior elements.You must create
     * exactly one default cache behavior.
     *
     * @param defaultCacheBehavior A complex type that describes the default cache behavior if you do not
     *         specify a CacheBehavior element or if files don't match any of the
     *         values of PathPattern in CacheBehavior elements.You must create
     *         exactly one default cache behavior.
     */
    public void setDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }
    
    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the
     * values of PathPattern in CacheBehavior elements.You must create
     * exactly one default cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultCacheBehavior A complex type that describes the default cache behavior if you do not
     *         specify a CacheBehavior element or if files don't match any of the
     *         values of PathPattern in CacheBehavior elements.You must create
     *         exactly one default cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withDefaultCacheBehavior(DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
        return this;
    }
    
    
    /**
     * A complex type that contains zero or more CacheBehavior elements.
     *
     * @return A complex type that contains zero or more CacheBehavior elements.
     */
    public CacheBehaviors getCacheBehaviors() {
        return cacheBehaviors;
    }
    
    /**
     * A complex type that contains zero or more CacheBehavior elements.
     *
     * @param cacheBehaviors A complex type that contains zero or more CacheBehavior elements.
     */
    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }
    
    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheBehaviors A complex type that contains zero or more CacheBehavior elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
        return this;
    }
    
    
    /**
     * The comment originally specified when this distribution was created.
     *
     * @return The comment originally specified when this distribution was created.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * The comment originally specified when this distribution was created.
     *
     * @param comment The comment originally specified when this distribution was created.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * The comment originally specified when this distribution was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment The comment originally specified when this distribution was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withComment(String comment) {
        this.comment = comment;
        return this;
    }
    
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @return Whether the distribution is enabled to accept end user requests for
     *         content.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @param enabled Whether the distribution is enabled to accept end user requests for
     *         content.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Whether the distribution is enabled to accept end user requests for
     *         content.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionSummary withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @return Whether the distribution is enabled to accept end user requests for
     *         content.
     */
    public Boolean getEnabled() {
        return enabled;
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
        if (id != null) sb.append("Id: " + id + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        if (lastModifiedTime != null) sb.append("LastModifiedTime: " + lastModifiedTime + ", ");
        if (domainName != null) sb.append("DomainName: " + domainName + ", ");
        if (aliases != null) sb.append("Aliases: " + aliases + ", ");
        if (origins != null) sb.append("Origins: " + origins + ", ");
        if (defaultCacheBehavior != null) sb.append("DefaultCacheBehavior: " + defaultCacheBehavior + ", ");
        if (cacheBehaviors != null) sb.append("CacheBehaviors: " + cacheBehaviors + ", ");
        if (comment != null) sb.append("Comment: " + comment + ", ");
        if (enabled != null) sb.append("Enabled: " + enabled + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode()); 
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode()); 
        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DistributionSummary == false) return false;
        DistributionSummary other = (DistributionSummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null) return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false) return false; 
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getAliases() == null ^ this.getAliases() == null) return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false) return false; 
        if (other.getOrigins() == null ^ this.getOrigins() == null) return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false) return false; 
        if (other.getDefaultCacheBehavior() == null ^ this.getDefaultCacheBehavior() == null) return false;
        if (other.getDefaultCacheBehavior() != null && other.getDefaultCacheBehavior().equals(this.getDefaultCacheBehavior()) == false) return false; 
        if (other.getCacheBehaviors() == null ^ this.getCacheBehaviors() == null) return false;
        if (other.getCacheBehaviors() != null && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    