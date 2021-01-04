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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution to update.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     */
    private String distributionName;
    /**
     * <p>
     * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     */
    private InputOrigin origin;
    /**
     * <p>
     * An object that describes the default cache behavior for the distribution.
     * </p>
     */
    private CacheBehavior defaultCacheBehavior;
    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * <note>
     * <p>
     * The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will replace your
     * distribution's existing settings.
     * </p>
     * </note>
     */
    private CacheSettings cacheBehaviorSettings;
    /**
     * <p>
     * An array of objects that describe the per-path cache behavior for the distribution.
     * </p>
     */
    private java.util.List<CacheBehaviorPerPath> cacheBehaviors;
    /**
     * <p>
     * Indicates whether to enable the distribution.
     * </p>
     */
    private Boolean isEnabled;

    /**
     * <p>
     * The name of the distribution to update.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution to update.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution to update.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @return The name of the distribution to update.</p>
     *         <p>
     *         Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution to update.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution to update.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
        return this;
    }

    /**
     * <p>
     * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @param origin
     *        An object that describes the origin resource for the distribution, such as a Lightsail instance or load
     *        balancer.</p>
     *        <p>
     *        The distribution pulls, caches, and serves content from the origin.
     */

    public void setOrigin(InputOrigin origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @return An object that describes the origin resource for the distribution, such as a Lightsail instance or load
     *         balancer.</p>
     *         <p>
     *         The distribution pulls, caches, and serves content from the origin.
     */

    public InputOrigin getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @param origin
     *        An object that describes the origin resource for the distribution, such as a Lightsail instance or load
     *        balancer.</p>
     *        <p>
     *        The distribution pulls, caches, and serves content from the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withOrigin(InputOrigin origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * An object that describes the default cache behavior for the distribution.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        An object that describes the default cache behavior for the distribution.
     */

    public void setDefaultCacheBehavior(CacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * <p>
     * An object that describes the default cache behavior for the distribution.
     * </p>
     * 
     * @return An object that describes the default cache behavior for the distribution.
     */

    public CacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * <p>
     * An object that describes the default cache behavior for the distribution.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        An object that describes the default cache behavior for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withDefaultCacheBehavior(CacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * <note>
     * <p>
     * The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will replace your
     * distribution's existing settings.
     * </p>
     * </note>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings for the distribution.</p> <note>
     *        <p>
     *        The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will
     *        replace your distribution's existing settings.
     *        </p>
     */

    public void setCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
        this.cacheBehaviorSettings = cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * <note>
     * <p>
     * The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will replace your
     * distribution's existing settings.
     * </p>
     * </note>
     * 
     * @return An object that describes the cache behavior settings for the distribution.</p> <note>
     *         <p>
     *         The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will
     *         replace your distribution's existing settings.
     *         </p>
     */

    public CacheSettings getCacheBehaviorSettings() {
        return this.cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * <note>
     * <p>
     * The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will replace your
     * distribution's existing settings.
     * </p>
     * </note>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings for the distribution.</p> <note>
     *        <p>
     *        The <code>cacheBehaviorSettings</code> specified in your <code>UpdateDistributionRequest</code> will
     *        replace your distribution's existing settings.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
        setCacheBehaviorSettings(cacheBehaviorSettings);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior for the distribution.
     * </p>
     * 
     * @return An array of objects that describe the per-path cache behavior for the distribution.
     */

    public java.util.List<CacheBehaviorPerPath> getCacheBehaviors() {
        return cacheBehaviors;
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior for the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior for the distribution.
     */

    public void setCacheBehaviors(java.util.Collection<CacheBehaviorPerPath> cacheBehaviors) {
        if (cacheBehaviors == null) {
            this.cacheBehaviors = null;
            return;
        }

        this.cacheBehaviors = new java.util.ArrayList<CacheBehaviorPerPath>(cacheBehaviors);
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior for the distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheBehaviors(java.util.Collection)} or {@link #withCacheBehaviors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withCacheBehaviors(CacheBehaviorPerPath... cacheBehaviors) {
        if (this.cacheBehaviors == null) {
            setCacheBehaviors(new java.util.ArrayList<CacheBehaviorPerPath>(cacheBehaviors.length));
        }
        for (CacheBehaviorPerPath ele : cacheBehaviors) {
            this.cacheBehaviors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior for the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withCacheBehaviors(java.util.Collection<CacheBehaviorPerPath> cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable the distribution.
     * </p>
     * 
     * @param isEnabled
     *        Indicates whether to enable the distribution.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * Indicates whether to enable the distribution.
     * </p>
     * 
     * @return Indicates whether to enable the distribution.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * Indicates whether to enable the distribution.
     * </p>
     * 
     * @param isEnabled
     *        Indicates whether to enable the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable the distribution.
     * </p>
     * 
     * @return Indicates whether to enable the distribution.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
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
        if (getDistributionName() != null)
            sb.append("DistributionName: ").append(getDistributionName()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: ").append(getDefaultCacheBehavior()).append(",");
        if (getCacheBehaviorSettings() != null)
            sb.append("CacheBehaviorSettings: ").append(getCacheBehaviorSettings()).append(",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: ").append(getCacheBehaviors()).append(",");
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDistributionRequest == false)
            return false;
        UpdateDistributionRequest other = (UpdateDistributionRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null && other.getDefaultCacheBehavior().equals(this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getCacheBehaviorSettings() == null ^ this.getCacheBehaviorSettings() == null)
            return false;
        if (other.getCacheBehaviorSettings() != null && other.getCacheBehaviorSettings().equals(this.getCacheBehaviorSettings()) == false)
            return false;
        if (other.getCacheBehaviors() == null ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheBehaviorSettings() == null) ? 0 : getCacheBehaviorSettings().hashCode());
        hashCode = prime * hashCode + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode());
        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionRequest clone() {
        return (UpdateDistributionRequest) super.clone();
    }

}
