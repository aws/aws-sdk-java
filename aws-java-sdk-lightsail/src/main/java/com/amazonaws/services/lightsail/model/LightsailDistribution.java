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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon Lightsail content delivery network (CDN) distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LightsailDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LightsailDistribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the distribution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * distribution. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An object that describes the location of the distribution, such as the AWS Region and Availability Zone.
     * </p>
     * <note>
     * <p>
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </note>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Distribution</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The alternate domain names of the distribution.
     * </p>
     */
    private java.util.List<String> alternativeDomainNames;
    /**
     * <p>
     * The status of the distribution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether the distribution is enabled.
     * </p>
     */
    private Boolean isEnabled;
    /**
     * <p>
     * The domain name of the distribution.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The ID of the bundle currently applied to the distribution.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The name of the SSL/TLS certificate attached to the distribution, if any.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * An object that describes the origin resource of the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     */
    private Origin origin;
    /**
     * <p>
     * The public DNS of the origin.
     * </p>
     */
    private String originPublicDNS;
    /**
     * <p>
     * An object that describes the default cache behavior of the distribution.
     * </p>
     */
    private CacheBehavior defaultCacheBehavior;
    /**
     * <p>
     * An object that describes the cache behavior settings of the distribution.
     * </p>
     */
    private CacheSettings cacheBehaviorSettings;
    /**
     * <p>
     * An array of objects that describe the per-path cache behavior of the distribution.
     * </p>
     */
    private java.util.List<CacheBehaviorPerPath> cacheBehaviors;
    /**
     * <p>
     * Indicates whether the bundle that is currently applied to your distribution, specified using the
     * <code>distributionName</code> parameter, can be changed to another bundle.
     * </p>
     * <p>
     * Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * </p>
     */
    private Boolean ableToUpdateBundle;
    /**
     * <p>
     * The IP address type of the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the distribution.
     * </p>
     * 
     * @param name
     *        The name of the distribution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the distribution.
     * </p>
     * 
     * @return The name of the distribution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the distribution.
     * </p>
     * 
     * @param name
     *        The name of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the distribution.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the distribution.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * distribution. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        distribution. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * distribution. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         distribution. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * distribution. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        distribution. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the distribution was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @return The timestamp when the distribution was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the distribution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An object that describes the location of the distribution, such as the AWS Region and Availability Zone.
     * </p>
     * <note>
     * <p>
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </note>
     * 
     * @param location
     *        An object that describes the location of the distribution, such as the AWS Region and Availability
     *        Zone.</p> <note>
     *        <p>
     *        Lightsail distributions are global resources that can reference an origin in any AWS Region, and
     *        distribute its content globally. However, all distributions are located in the <code>us-east-1</code>
     *        Region.
     *        </p>
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * An object that describes the location of the distribution, such as the AWS Region and Availability Zone.
     * </p>
     * <note>
     * <p>
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </note>
     * 
     * @return An object that describes the location of the distribution, such as the AWS Region and Availability
     *         Zone.</p> <note>
     *         <p>
     *         Lightsail distributions are global resources that can reference an origin in any AWS Region, and
     *         distribute its content globally. However, all distributions are located in the <code>us-east-1</code>
     *         Region.
     *         </p>
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * An object that describes the location of the distribution, such as the AWS Region and Availability Zone.
     * </p>
     * <note>
     * <p>
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </note>
     * 
     * @param location
     *        An object that describes the location of the distribution, such as the AWS Region and Availability
     *        Zone.</p> <note>
     *        <p>
     *        Lightsail distributions are global resources that can reference an origin in any AWS Region, and
     *        distribute its content globally. However, all distributions are located in the <code>us-east-1</code>
     *        Region.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Distribution</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Distribution</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Distribution</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>Distribution</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Distribution</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Distribution</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LightsailDistribution withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Distribution</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Distribution</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LightsailDistribution withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The alternate domain names of the distribution.
     * </p>
     * 
     * @return The alternate domain names of the distribution.
     */

    public java.util.List<String> getAlternativeDomainNames() {
        return alternativeDomainNames;
    }

    /**
     * <p>
     * The alternate domain names of the distribution.
     * </p>
     * 
     * @param alternativeDomainNames
     *        The alternate domain names of the distribution.
     */

    public void setAlternativeDomainNames(java.util.Collection<String> alternativeDomainNames) {
        if (alternativeDomainNames == null) {
            this.alternativeDomainNames = null;
            return;
        }

        this.alternativeDomainNames = new java.util.ArrayList<String>(alternativeDomainNames);
    }

    /**
     * <p>
     * The alternate domain names of the distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlternativeDomainNames(java.util.Collection)} or
     * {@link #withAlternativeDomainNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param alternativeDomainNames
     *        The alternate domain names of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withAlternativeDomainNames(String... alternativeDomainNames) {
        if (this.alternativeDomainNames == null) {
            setAlternativeDomainNames(new java.util.ArrayList<String>(alternativeDomainNames.length));
        }
        for (String ele : alternativeDomainNames) {
            this.alternativeDomainNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The alternate domain names of the distribution.
     * </p>
     * 
     * @param alternativeDomainNames
     *        The alternate domain names of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withAlternativeDomainNames(java.util.Collection<String> alternativeDomainNames) {
        setAlternativeDomainNames(alternativeDomainNames);
        return this;
    }

    /**
     * <p>
     * The status of the distribution.
     * </p>
     * 
     * @param status
     *        The status of the distribution.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the distribution.
     * </p>
     * 
     * @return The status of the distribution.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the distribution.
     * </p>
     * 
     * @param status
     *        The status of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the distribution is enabled.
     * </p>
     * 
     * @param isEnabled
     *        Indicates whether the distribution is enabled.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * Indicates whether the distribution is enabled.
     * </p>
     * 
     * @return Indicates whether the distribution is enabled.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * Indicates whether the distribution is enabled.
     * </p>
     * 
     * @param isEnabled
     *        Indicates whether the distribution is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the distribution is enabled.
     * </p>
     * 
     * @return Indicates whether the distribution is enabled.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * The domain name of the distribution.
     * </p>
     * 
     * @param domainName
     *        The domain name of the distribution.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the distribution.
     * </p>
     * 
     * @return The domain name of the distribution.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the distribution.
     * </p>
     * 
     * @param domainName
     *        The domain name of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the distribution.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle currently applied to the distribution.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the distribution.
     * </p>
     * 
     * @return The ID of the bundle currently applied to the distribution.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the distribution.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle currently applied to the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate attached to the distribution, if any.
     * </p>
     * 
     * @param certificateName
     *        The name of the SSL/TLS certificate attached to the distribution, if any.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate attached to the distribution, if any.
     * </p>
     * 
     * @return The name of the SSL/TLS certificate attached to the distribution, if any.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate attached to the distribution, if any.
     * </p>
     * 
     * @param certificateName
     *        The name of the SSL/TLS certificate attached to the distribution, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * An object that describes the origin resource of the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @param origin
     *        An object that describes the origin resource of the distribution, such as a Lightsail instance or load
     *        balancer.</p>
     *        <p>
     *        The distribution pulls, caches, and serves content from the origin.
     */

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * An object that describes the origin resource of the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @return An object that describes the origin resource of the distribution, such as a Lightsail instance or load
     *         balancer.</p>
     *         <p>
     *         The distribution pulls, caches, and serves content from the origin.
     */

    public Origin getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * An object that describes the origin resource of the distribution, such as a Lightsail instance or load balancer.
     * </p>
     * <p>
     * The distribution pulls, caches, and serves content from the origin.
     * </p>
     * 
     * @param origin
     *        An object that describes the origin resource of the distribution, such as a Lightsail instance or load
     *        balancer.</p>
     *        <p>
     *        The distribution pulls, caches, and serves content from the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withOrigin(Origin origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The public DNS of the origin.
     * </p>
     * 
     * @param originPublicDNS
     *        The public DNS of the origin.
     */

    public void setOriginPublicDNS(String originPublicDNS) {
        this.originPublicDNS = originPublicDNS;
    }

    /**
     * <p>
     * The public DNS of the origin.
     * </p>
     * 
     * @return The public DNS of the origin.
     */

    public String getOriginPublicDNS() {
        return this.originPublicDNS;
    }

    /**
     * <p>
     * The public DNS of the origin.
     * </p>
     * 
     * @param originPublicDNS
     *        The public DNS of the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withOriginPublicDNS(String originPublicDNS) {
        setOriginPublicDNS(originPublicDNS);
        return this;
    }

    /**
     * <p>
     * An object that describes the default cache behavior of the distribution.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        An object that describes the default cache behavior of the distribution.
     */

    public void setDefaultCacheBehavior(CacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * <p>
     * An object that describes the default cache behavior of the distribution.
     * </p>
     * 
     * @return An object that describes the default cache behavior of the distribution.
     */

    public CacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * <p>
     * An object that describes the default cache behavior of the distribution.
     * </p>
     * 
     * @param defaultCacheBehavior
     *        An object that describes the default cache behavior of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withDefaultCacheBehavior(CacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings of the distribution.
     * </p>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings of the distribution.
     */

    public void setCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
        this.cacheBehaviorSettings = cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings of the distribution.
     * </p>
     * 
     * @return An object that describes the cache behavior settings of the distribution.
     */

    public CacheSettings getCacheBehaviorSettings() {
        return this.cacheBehaviorSettings;
    }

    /**
     * <p>
     * An object that describes the cache behavior settings of the distribution.
     * </p>
     * 
     * @param cacheBehaviorSettings
     *        An object that describes the cache behavior settings of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withCacheBehaviorSettings(CacheSettings cacheBehaviorSettings) {
        setCacheBehaviorSettings(cacheBehaviorSettings);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior of the distribution.
     * </p>
     * 
     * @return An array of objects that describe the per-path cache behavior of the distribution.
     */

    public java.util.List<CacheBehaviorPerPath> getCacheBehaviors() {
        return cacheBehaviors;
    }

    /**
     * <p>
     * An array of objects that describe the per-path cache behavior of the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior of the distribution.
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
     * An array of objects that describe the per-path cache behavior of the distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheBehaviors(java.util.Collection)} or {@link #withCacheBehaviors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withCacheBehaviors(CacheBehaviorPerPath... cacheBehaviors) {
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
     * An array of objects that describe the per-path cache behavior of the distribution.
     * </p>
     * 
     * @param cacheBehaviors
     *        An array of objects that describe the per-path cache behavior of the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withCacheBehaviors(java.util.Collection<CacheBehaviorPerPath> cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to your distribution, specified using the
     * <code>distributionName</code> parameter, can be changed to another bundle.
     * </p>
     * <p>
     * Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * </p>
     * 
     * @param ableToUpdateBundle
     *        Indicates whether the bundle that is currently applied to your distribution, specified using the
     *        <code>distributionName</code> parameter, can be changed to another bundle.</p>
     *        <p>
     *        Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     */

    public void setAbleToUpdateBundle(Boolean ableToUpdateBundle) {
        this.ableToUpdateBundle = ableToUpdateBundle;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to your distribution, specified using the
     * <code>distributionName</code> parameter, can be changed to another bundle.
     * </p>
     * <p>
     * Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * </p>
     * 
     * @return Indicates whether the bundle that is currently applied to your distribution, specified using the
     *         <code>distributionName</code> parameter, can be changed to another bundle.</p>
     *         <p>
     *         Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     */

    public Boolean getAbleToUpdateBundle() {
        return this.ableToUpdateBundle;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to your distribution, specified using the
     * <code>distributionName</code> parameter, can be changed to another bundle.
     * </p>
     * <p>
     * Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * </p>
     * 
     * @param ableToUpdateBundle
     *        Indicates whether the bundle that is currently applied to your distribution, specified using the
     *        <code>distributionName</code> parameter, can be changed to another bundle.</p>
     *        <p>
     *        Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withAbleToUpdateBundle(Boolean ableToUpdateBundle) {
        setAbleToUpdateBundle(ableToUpdateBundle);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to your distribution, specified using the
     * <code>distributionName</code> parameter, can be changed to another bundle.
     * </p>
     * <p>
     * Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     * </p>
     * 
     * @return Indicates whether the bundle that is currently applied to your distribution, specified using the
     *         <code>distributionName</code> parameter, can be changed to another bundle.</p>
     *         <p>
     *         Use the <code>UpdateDistributionBundle</code> action to change your distribution's bundle.
     */

    public Boolean isAbleToUpdateBundle() {
        return this.ableToUpdateBundle;
    }

    /**
     * <p>
     * The IP address type of the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type of the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type of the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @return The IP address type of the distribution.</p>
     *         <p>
     *         The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type of the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type of the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public LightsailDistribution withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type of the distribution.
     * </p>
     * <p>
     * The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type of the distribution.</p>
     *        <p>
     *        The possible values are <code>ipv4</code> for IPv4 only, and <code>dualstack</code> for IPv4 and IPv6.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public LightsailDistribution withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *         Developer Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
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
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withTags(Tag... tags) {
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
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LightsailDistribution withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAlternativeDomainNames() != null)
            sb.append("AlternativeDomainNames: ").append(getAlternativeDomainNames()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getOriginPublicDNS() != null)
            sb.append("OriginPublicDNS: ").append(getOriginPublicDNS()).append(",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: ").append(getDefaultCacheBehavior()).append(",");
        if (getCacheBehaviorSettings() != null)
            sb.append("CacheBehaviorSettings: ").append(getCacheBehaviorSettings()).append(",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: ").append(getCacheBehaviors()).append(",");
        if (getAbleToUpdateBundle() != null)
            sb.append("AbleToUpdateBundle: ").append(getAbleToUpdateBundle()).append(",");
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

        if (obj instanceof LightsailDistribution == false)
            return false;
        LightsailDistribution other = (LightsailDistribution) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAlternativeDomainNames() == null ^ this.getAlternativeDomainNames() == null)
            return false;
        if (other.getAlternativeDomainNames() != null && other.getAlternativeDomainNames().equals(this.getAlternativeDomainNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getOriginPublicDNS() == null ^ this.getOriginPublicDNS() == null)
            return false;
        if (other.getOriginPublicDNS() != null && other.getOriginPublicDNS().equals(this.getOriginPublicDNS()) == false)
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
        if (other.getAbleToUpdateBundle() == null ^ this.getAbleToUpdateBundle() == null)
            return false;
        if (other.getAbleToUpdateBundle() != null && other.getAbleToUpdateBundle().equals(this.getAbleToUpdateBundle()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAlternativeDomainNames() == null) ? 0 : getAlternativeDomainNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getOriginPublicDNS() == null) ? 0 : getOriginPublicDNS().hashCode());
        hashCode = prime * hashCode + ((getDefaultCacheBehavior() == null) ? 0 : getDefaultCacheBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheBehaviorSettings() == null) ? 0 : getCacheBehaviorSettings().hashCode());
        hashCode = prime * hashCode + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors().hashCode());
        hashCode = prime * hashCode + ((getAbleToUpdateBundle() == null) ? 0 : getAbleToUpdateBundle().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LightsailDistribution clone() {
        try {
            return (LightsailDistribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LightsailDistributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
