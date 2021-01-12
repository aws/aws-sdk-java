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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the distribution.
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
     * The bundle ID to use for the distribution.
     * </p>
     * <p>
     * A distribution bundle describes the specifications of your distribution, such as the monthly cost and monthly
     * network transfer quota.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The IP address type for the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * <p>
     * The default value is <code>dualstack</code>.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * The tag keys and optional values to add to the distribution during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the distribution.
     * </p>
     * 
     * @param distributionName
     *        The name for the distribution.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name for the distribution.
     * </p>
     * 
     * @return The name for the distribution.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name for the distribution.
     * </p>
     * 
     * @param distributionName
     *        The name for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionRequest withDistributionName(String distributionName) {
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

    public CreateDistributionRequest withOrigin(InputOrigin origin) {
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

    public CreateDistributionRequest withDefaultCacheBehavior(CacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings for the distribution.
     */

    public void setCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
        this.cacheBehaviorSettings = cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * 
     * @return An object that describes the cache behavior settings for the distribution.
     */

    public CacheSettings getCacheBehaviorSettings() {
        return this.cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings for the distribution.
     * </p>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionRequest withCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
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

    public CreateDistributionRequest withCacheBehaviors(CacheBehaviorPerPath... cacheBehaviors) {
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

    public CreateDistributionRequest withCacheBehaviors(java.util.Collection<CacheBehaviorPerPath> cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * <p>
     * The bundle ID to use for the distribution.
     * </p>
     * <p>
     * A distribution bundle describes the specifications of your distribution, such as the monthly cost and monthly
     * network transfer quota.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The bundle ID to use for the distribution.</p>
     *        <p>
     *        A distribution bundle describes the specifications of your distribution, such as the monthly cost and
     *        monthly network transfer quota.
     *        </p>
     *        <p>
     *        Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *        specify.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle ID to use for the distribution.
     * </p>
     * <p>
     * A distribution bundle describes the specifications of your distribution, such as the monthly cost and monthly
     * network transfer quota.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @return The bundle ID to use for the distribution.</p>
     *         <p>
     *         A distribution bundle describes the specifications of your distribution, such as the monthly cost and
     *         monthly network transfer quota.
     *         </p>
     *         <p>
     *         Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *         specify.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle ID to use for the distribution.
     * </p>
     * <p>
     * A distribution bundle describes the specifications of your distribution, such as the monthly cost and monthly
     * network transfer quota.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The bundle ID to use for the distribution.</p>
     *        <p>
     *        A distribution bundle describes the specifications of your distribution, such as the monthly cost and
     *        monthly network transfer quota.
     *        </p>
     *        <p>
     *        Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The IP address type for the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * <p>
     * The default value is <code>dualstack</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type for the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     *        </p>
     *        <p>
     *        The default value is <code>dualstack</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type for the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * <p>
     * The default value is <code>dualstack</code>.
     * </p>
     * 
     * @return The IP address type for the distribution.</p>
     *         <p>
     *         The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     *         </p>
     *         <p>
     *         The default value is <code>dualstack</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type for the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * <p>
     * The default value is <code>dualstack</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type for the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     *        </p>
     *        <p>
     *        The default value is <code>dualstack</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateDistributionRequest withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type for the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * <p>
     * The default value is <code>dualstack</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type for the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     *        </p>
     *        <p>
     *        The default value is <code>dualstack</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateDistributionRequest withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the distribution during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @return The tag keys and optional values to add to the distribution during create.</p>
     *         <p>
     *         Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the distribution during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the distribution during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the distribution during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the distribution during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the distribution during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the distribution during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistributionRequest == false)
            return false;
        CreateDistributionRequest other = (CreateDistributionRequest) obj;
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
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDistributionRequest clone() {
        return (CreateDistributionRequest) super.clone();
    }

}
