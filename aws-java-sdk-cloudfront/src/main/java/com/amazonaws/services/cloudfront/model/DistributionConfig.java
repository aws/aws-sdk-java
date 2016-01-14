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
 * 
 */
public class DistributionConfig implements Serializable, Cloneable {

    private String callerReference;

    private Aliases aliases;

    private String defaultRootObject;

    private Origins origins;

    private DefaultCacheBehavior defaultCacheBehavior;

    private CacheBehaviors cacheBehaviors;

    private CustomErrorResponses customErrorResponses;

    private String comment;

    private LoggingConfig logging;

    private String priceClass;

    private Boolean enabled;

    private ViewerCertificate viewerCertificate;

    private Restrictions restrictions;

    private String webACLId;

    /**
     * Default constructor for DistributionConfig object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public DistributionConfig() {
    }

    /**
     * Constructs a new DistributionConfig object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param callerReference
     * @param enabled
     */
    public DistributionConfig(String callerReference, Boolean enabled) {
        setCallerReference(callerReference);
        setEnabled(enabled);
    }

    /**
     * @param callerReference
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * @return
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * @param callerReference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * @param aliases
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * @return
     */
    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * @param aliases
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * @param defaultRootObject
     */
    public void setDefaultRootObject(String defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    /**
     * @return
     */
    public String getDefaultRootObject() {
        return this.defaultRootObject;
    }

    /**
     * @param defaultRootObject
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withDefaultRootObject(String defaultRootObject) {
        setDefaultRootObject(defaultRootObject);
        return this;
    }

    /**
     * @param origins
     */
    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    /**
     * @return
     */
    public Origins getOrigins() {
        return this.origins;
    }

    /**
     * @param origins
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withOrigins(Origins origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * @param defaultCacheBehavior
     */
    public void setDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * @return
     */
    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * @param defaultCacheBehavior
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * @param cacheBehaviors
     */
    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * @return
     */
    public CacheBehaviors getCacheBehaviors() {
        return this.cacheBehaviors;
    }

    /**
     * @param cacheBehaviors
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * @param customErrorResponses
     */
    public void setCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * @return
     */
    public CustomErrorResponses getCustomErrorResponses() {
        return this.customErrorResponses;
    }

    /**
     * @param customErrorResponses
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        setCustomErrorResponses(customErrorResponses);
        return this;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @param comment
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * @param logging
     */
    public void setLogging(LoggingConfig logging) {
        this.logging = logging;
    }

    /**
     * @return
     */
    public LoggingConfig getLogging() {
        return this.logging;
    }

    /**
     * @param logging
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withLogging(LoggingConfig logging) {
        setLogging(logging);
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
    public DistributionConfig withPriceClass(String priceClass) {
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
    public DistributionConfig withPriceClass(PriceClass priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @param enabled
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return
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
    public DistributionConfig withViewerCertificate(
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
    public DistributionConfig withRestrictions(Restrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * @param webACLId
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * @return
     */
    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * @param webACLId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DistributionConfig withWebACLId(String webACLId) {
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getDefaultRootObject() != null)
            sb.append("DefaultRootObject: " + getDefaultRootObject() + ",");
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
        if (getLogging() != null)
            sb.append("Logging: " + getLogging() + ",");
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

        if (obj instanceof DistributionConfig == false)
            return false;
        DistributionConfig other = (DistributionConfig) obj;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null
                && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getDefaultRootObject() == null
                ^ this.getDefaultRootObject() == null)
            return false;
        if (other.getDefaultRootObject() != null
                && other.getDefaultRootObject().equals(
                        this.getDefaultRootObject()) == false)
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
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null
                && other.getLogging().equals(this.getLogging()) == false)
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

        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultRootObject() == null) ? 0
                        : getDefaultRootObject().hashCode());
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
                + ((getLogging() == null) ? 0 : getLogging().hashCode());
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
    public DistributionConfig clone() {
        try {
            return (DistributionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}