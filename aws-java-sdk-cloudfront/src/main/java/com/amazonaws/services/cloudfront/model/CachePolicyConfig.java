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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A cache policy configuration.
 * </p>
 * <p>
 * This configuration determines the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query
 * strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
 * </p>
 * </li>
 * <li>
 * <p>
 * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
 * that CloudFront sends to the origin. CloudFront sends a request when it can’t find a valid object in its cache that
 * matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache
 * key, use <code>OriginRequestPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CachePolicyConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachePolicyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A unique name to identify the cache policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. CloudFront uses this value as the
     * object’s time to live (TTL) only when the origin does <i>not</i> send <code>Cache-Control</code> or
     * <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more than
     * 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     * </p>
     */
    private Long defaultTTL;
    /**
     * <p>
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another
     * request to the origin to see if the object has been updated. CloudFront uses this value only when the origin
     * sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     * <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same as the
     * value of <code>DefaultTTL</code>.
     * </p>
     */
    private Long maxTTL;
    /**
     * <p>
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Long minTTL;
    /**
     * <p>
     * The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the cache
     * key are automatically included in requests that CloudFront sends to the origin.
     * </p>
     */
    private ParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin;

    /**
     * <p>
     * A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the cache policy. The comment cannot be longer than 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A unique name to identify the cache policy.
     * </p>
     * 
     * @param name
     *        A unique name to identify the cache policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name to identify the cache policy.
     * </p>
     * 
     * @return A unique name to identify the cache policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name to identify the cache policy.
     * </p>
     * 
     * @param name
     *        A unique name to identify the cache policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. CloudFront uses this value as the
     * object’s time to live (TTL) only when the origin does <i>not</i> send <code>Cache-Control</code> or
     * <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more than
     * 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     * </p>
     * 
     * @param defaultTTL
     *        The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *        CloudFront sends another request to the origin to see if the object has been updated. CloudFront uses this
     *        value as the object’s time to live (TTL) only when the origin does <i>not</i> send
     *        <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more
     *        than 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     */

    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * <p>
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. CloudFront uses this value as the
     * object’s time to live (TTL) only when the origin does <i>not</i> send <code>Cache-Control</code> or
     * <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more than
     * 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     * </p>
     * 
     * @return The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *         CloudFront sends another request to the origin to see if the object has been updated. CloudFront uses
     *         this value as the object’s time to live (TTL) only when the origin does <i>not</i> send
     *         <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *         Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more
     *         than 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     */

    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * <p>
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. CloudFront uses this value as the
     * object’s time to live (TTL) only when the origin does <i>not</i> send <code>Cache-Control</code> or
     * <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more than
     * 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     * </p>
     * 
     * @param defaultTTL
     *        The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *        CloudFront sends another request to the origin to see if the object has been updated. CloudFront uses this
     *        value as the object’s time to live (TTL) only when the origin does <i>not</i> send
     *        <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default value for this field is 86400 seconds (one day). If the value of <code>MinTTL</code> is more
     *        than 86400 seconds, then the default value for this field is the same as the value of <code>MinTTL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another
     * request to the origin to see if the object has been updated. CloudFront uses this value only when the origin
     * sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     * <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same as the
     * value of <code>DefaultTTL</code>.
     * </p>
     * 
     * @param maxTTL
     *        The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends
     *        another request to the origin to see if the object has been updated. CloudFront uses this value only when
     *        the origin sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     *        <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same
     *        as the value of <code>DefaultTTL</code>.
     */

    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another
     * request to the origin to see if the object has been updated. CloudFront uses this value only when the origin
     * sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     * <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same as the
     * value of <code>DefaultTTL</code>.
     * </p>
     * 
     * @return The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends
     *         another request to the origin to see if the object has been updated. CloudFront uses this value only when
     *         the origin sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *         Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     *         <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same
     *         as the value of <code>DefaultTTL</code>.
     */

    public Long getMaxTTL() {
        return this.maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another
     * request to the origin to see if the object has been updated. CloudFront uses this value only when the origin
     * sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     * <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same as the
     * value of <code>DefaultTTL</code>.
     * </p>
     * 
     * @param maxTTL
     *        The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends
     *        another request to the origin to see if the object has been updated. CloudFront uses this value only when
     *        the origin sends <code>Cache-Control</code> or <code>Expires</code> headers with the object. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default value for this field is 31536000 seconds (one year). If the value of <code>MinTTL</code> or
     *        <code>DefaultTTL</code> is more than 31536000 seconds, then the default value for this field is the same
     *        as the value of <code>DefaultTTL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withMaxTTL(Long maxTTL) {
        setMaxTTL(maxTTL);
        return this;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minTTL
     *        The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *        CloudFront sends another request to the origin to see if the object has been updated. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *         CloudFront sends another request to the origin to see if the object has been updated. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *         Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Long getMinTTL() {
        return this.minTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront
     * sends another request to the origin to see if the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param minTTL
     *        The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before
     *        CloudFront sends another request to the origin to see if the object has been updated. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withMinTTL(Long minTTL) {
        setMinTTL(minTTL);
        return this;
    }

    /**
     * <p>
     * The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the cache
     * key are automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param parametersInCacheKeyAndForwardedToOrigin
     *        The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the
     *        cache key are automatically included in requests that CloudFront sends to the origin.
     */

    public void setParametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
        this.parametersInCacheKeyAndForwardedToOrigin = parametersInCacheKeyAndForwardedToOrigin;
    }

    /**
     * <p>
     * The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the cache
     * key are automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @return The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the
     *         cache key are automatically included in requests that CloudFront sends to the origin.
     */

    public ParametersInCacheKeyAndForwardedToOrigin getParametersInCacheKeyAndForwardedToOrigin() {
        return this.parametersInCacheKeyAndForwardedToOrigin;
    }

    /**
     * <p>
     * The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the cache
     * key are automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param parametersInCacheKeyAndForwardedToOrigin
     *        The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the
     *        cache key are automatically included in requests that CloudFront sends to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyConfig withParametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
        setParametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: ").append(getDefaultTTL()).append(",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: ").append(getMaxTTL()).append(",");
        if (getMinTTL() != null)
            sb.append("MinTTL: ").append(getMinTTL()).append(",");
        if (getParametersInCacheKeyAndForwardedToOrigin() != null)
            sb.append("ParametersInCacheKeyAndForwardedToOrigin: ").append(getParametersInCacheKeyAndForwardedToOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CachePolicyConfig == false)
            return false;
        CachePolicyConfig other = (CachePolicyConfig) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null && other.getMaxTTL().equals(this.getMaxTTL()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getParametersInCacheKeyAndForwardedToOrigin() == null ^ this.getParametersInCacheKeyAndForwardedToOrigin() == null)
            return false;
        if (other.getParametersInCacheKeyAndForwardedToOrigin() != null
                && other.getParametersInCacheKeyAndForwardedToOrigin().equals(this.getParametersInCacheKeyAndForwardedToOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime * hashCode + ((getParametersInCacheKeyAndForwardedToOrigin() == null) ? 0 : getParametersInCacheKeyAndForwardedToOrigin().hashCode());
        return hashCode;
    }

    @Override
    public CachePolicyConfig clone() {
        try {
            return (CachePolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
