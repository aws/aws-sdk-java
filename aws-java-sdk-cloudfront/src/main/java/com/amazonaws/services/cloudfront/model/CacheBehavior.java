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
public class CacheBehavior implements Serializable, Cloneable {

    private String pathPattern;

    private String targetOriginId;

    private ForwardedValues forwardedValues;

    private TrustedSigners trustedSigners;

    private String viewerProtocolPolicy;

    private Long minTTL;

    private AllowedMethods allowedMethods;

    private Boolean smoothStreaming;

    private Long defaultTTL;

    private Long maxTTL;

    private Boolean compress;

    /**
     * @param pathPattern
     */
    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    /**
     * @return
     */
    public String getPathPattern() {
        return this.pathPattern;
    }

    /**
     * @param pathPattern
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withPathPattern(String pathPattern) {
        setPathPattern(pathPattern);
        return this;
    }

    /**
     * @param targetOriginId
     */
    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    /**
     * @return
     */
    public String getTargetOriginId() {
        return this.targetOriginId;
    }

    /**
     * @param targetOriginId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withTargetOriginId(String targetOriginId) {
        setTargetOriginId(targetOriginId);
        return this;
    }

    /**
     * @param forwardedValues
     */
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    /**
     * @return
     */
    public ForwardedValues getForwardedValues() {
        return this.forwardedValues;
    }

    /**
     * @param forwardedValues
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        setForwardedValues(forwardedValues);
        return this;
    }

    /**
     * @param trustedSigners
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * @return
     */
    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * @param trustedSigners
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
        return this;
    }

    /**
     * @param viewerProtocolPolicy
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * @return
     * @see ViewerProtocolPolicy
     */
    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    /**
     * @param viewerProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */
    public CacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
        return this;
    }

    /**
     * @param viewerProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(
            ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
    }

    /**
     * @param viewerProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */
    public CacheBehavior withViewerProtocolPolicy(
            ViewerProtocolPolicy viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
        return this;
    }

    /**
     * @param minTTL
     */
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * @return
     */
    public Long getMinTTL() {
        return this.minTTL;
    }

    /**
     * @param minTTL
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withMinTTL(Long minTTL) {
        setMinTTL(minTTL);
        return this;
    }

    /**
     * @param allowedMethods
     */
    public void setAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    /**
     * @return
     */
    public AllowedMethods getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * @param allowedMethods
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
        setAllowedMethods(allowedMethods);
        return this;
    }

    /**
     * @param smoothStreaming
     */
    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    /**
     * @return
     */
    public Boolean getSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * @param smoothStreaming
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        setSmoothStreaming(smoothStreaming);
        return this;
    }

    /**
     * @return
     */
    public Boolean isSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * @param defaultTTL
     */
    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * @return
     */
    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * @param defaultTTL
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * @param maxTTL
     */
    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * @return
     */
    public Long getMaxTTL() {
        return this.maxTTL;
    }

    /**
     * @param maxTTL
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withMaxTTL(Long maxTTL) {
        setMaxTTL(maxTTL);
        return this;
    }

    /**
     * @param compress
     */
    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    /**
     * @return
     */
    public Boolean getCompress() {
        return this.compress;
    }

    /**
     * @param compress
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CacheBehavior withCompress(Boolean compress) {
        setCompress(compress);
        return this;
    }

    /**
     * @return
     */
    public Boolean isCompress() {
        return this.compress;
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
        if (getPathPattern() != null)
            sb.append("PathPattern: " + getPathPattern() + ",");
        if (getTargetOriginId() != null)
            sb.append("TargetOriginId: " + getTargetOriginId() + ",");
        if (getForwardedValues() != null)
            sb.append("ForwardedValues: " + getForwardedValues() + ",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: " + getViewerProtocolPolicy()
                    + ",");
        if (getMinTTL() != null)
            sb.append("MinTTL: " + getMinTTL() + ",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: " + getAllowedMethods() + ",");
        if (getSmoothStreaming() != null)
            sb.append("SmoothStreaming: " + getSmoothStreaming() + ",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: " + getDefaultTTL() + ",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: " + getMaxTTL() + ",");
        if (getCompress() != null)
            sb.append("Compress: " + getCompress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheBehavior == false)
            return false;
        CacheBehavior other = (CacheBehavior) obj;
        if (other.getPathPattern() == null ^ this.getPathPattern() == null)
            return false;
        if (other.getPathPattern() != null
                && other.getPathPattern().equals(this.getPathPattern()) == false)
            return false;
        if (other.getTargetOriginId() == null
                ^ this.getTargetOriginId() == null)
            return false;
        if (other.getTargetOriginId() != null
                && other.getTargetOriginId().equals(this.getTargetOriginId()) == false)
            return false;
        if (other.getForwardedValues() == null
                ^ this.getForwardedValues() == null)
            return false;
        if (other.getForwardedValues() != null
                && other.getForwardedValues().equals(this.getForwardedValues()) == false)
            return false;
        if (other.getTrustedSigners() == null
                ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null
                && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getViewerProtocolPolicy() == null
                ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null
                && other.getViewerProtocolPolicy().equals(
                        this.getViewerProtocolPolicy()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null
                && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getAllowedMethods() == null
                ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null
                && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getSmoothStreaming() == null
                ^ this.getSmoothStreaming() == null)
            return false;
        if (other.getSmoothStreaming() != null
                && other.getSmoothStreaming().equals(this.getSmoothStreaming()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null
                && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null
                && other.getMaxTTL().equals(this.getMaxTTL()) == false)
            return false;
        if (other.getCompress() == null ^ this.getCompress() == null)
            return false;
        if (other.getCompress() != null
                && other.getCompress().equals(this.getCompress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPathPattern() == null) ? 0 : getPathPattern().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOriginId() == null) ? 0 : getTargetOriginId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getForwardedValues() == null) ? 0 : getForwardedValues()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustedSigners() == null) ? 0 : getTrustedSigners()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getViewerProtocolPolicy() == null) ? 0
                        : getViewerProtocolPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowedMethods() == null) ? 0 : getAllowedMethods()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSmoothStreaming() == null) ? 0 : getSmoothStreaming()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode
                + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        hashCode = prime * hashCode
                + ((getCompress() == null) ? 0 : getCompress().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehavior clone() {
        try {
            return (CacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}