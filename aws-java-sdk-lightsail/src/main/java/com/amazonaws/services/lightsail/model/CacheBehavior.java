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
 * Describes the default cache behavior of an Amazon Lightsail content delivery network (CDN) distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CacheBehavior" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheBehavior implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cache behavior of the distribution.
     * </p>
     * <p>
     * The following cache behaviors can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution caches and
     * serves your entire website as static content. This behavior is ideal for websites with static content that
     * doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to
     * personalize content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic content.
     * When specified, your distribution caches and serve only the content that is specified in the distribution's
     * <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web applications that use
     * cookies, headers, and query strings to personalize content for individual users.
     * </p>
     * </li>
     * </ul>
     */
    private String behavior;

    /**
     * <p>
     * The cache behavior of the distribution.
     * </p>
     * <p>
     * The following cache behaviors can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution caches and
     * serves your entire website as static content. This behavior is ideal for websites with static content that
     * doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to
     * personalize content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic content.
     * When specified, your distribution caches and serve only the content that is specified in the distribution's
     * <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web applications that use
     * cookies, headers, and query strings to personalize content for individual users.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior of the distribution.</p>
     *        <p>
     *        The following cache behaviors can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution
     *        caches and serves your entire website as static content. This behavior is ideal for websites with static
     *        content that doesn't change depending on who views it, or for websites that don't use cookies, headers, or
     *        query strings to personalize content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic
     *        content. When specified, your distribution caches and serve only the content that is specified in the
     *        distribution's <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web
     *        applications that use cookies, headers, and query strings to personalize content for individual users.
     *        </p>
     *        </li>
     * @see BehaviorEnum
     */

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The cache behavior of the distribution.
     * </p>
     * <p>
     * The following cache behaviors can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution caches and
     * serves your entire website as static content. This behavior is ideal for websites with static content that
     * doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to
     * personalize content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic content.
     * When specified, your distribution caches and serve only the content that is specified in the distribution's
     * <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web applications that use
     * cookies, headers, and query strings to personalize content for individual users.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cache behavior of the distribution.</p>
     *         <p>
     *         The following cache behaviors can be specified:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution
     *         caches and serves your entire website as static content. This behavior is ideal for websites with static
     *         content that doesn't change depending on who views it, or for websites that don't use cookies, headers,
     *         or query strings to personalize content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic
     *         content. When specified, your distribution caches and serve only the content that is specified in the
     *         distribution's <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web
     *         applications that use cookies, headers, and query strings to personalize content for individual users.
     *         </p>
     *         </li>
     * @see BehaviorEnum
     */

    public String getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * The cache behavior of the distribution.
     * </p>
     * <p>
     * The following cache behaviors can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution caches and
     * serves your entire website as static content. This behavior is ideal for websites with static content that
     * doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to
     * personalize content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic content.
     * When specified, your distribution caches and serve only the content that is specified in the distribution's
     * <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web applications that use
     * cookies, headers, and query strings to personalize content for individual users.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior of the distribution.</p>
     *        <p>
     *        The following cache behaviors can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution
     *        caches and serves your entire website as static content. This behavior is ideal for websites with static
     *        content that doesn't change depending on who views it, or for websites that don't use cookies, headers, or
     *        query strings to personalize content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic
     *        content. When specified, your distribution caches and serve only the content that is specified in the
     *        distribution's <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web
     *        applications that use cookies, headers, and query strings to personalize content for individual users.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorEnum
     */

    public CacheBehavior withBehavior(String behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * The cache behavior of the distribution.
     * </p>
     * <p>
     * The following cache behaviors can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution caches and
     * serves your entire website as static content. This behavior is ideal for websites with static content that
     * doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to
     * personalize content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic content.
     * When specified, your distribution caches and serve only the content that is specified in the distribution's
     * <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web applications that use
     * cookies, headers, and query strings to personalize content for individual users.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior of the distribution.</p>
     *        <p>
     *        The following cache behaviors can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This option is best for static sites. When specified, your distribution
     *        caches and serves your entire website as static content. This behavior is ideal for websites with static
     *        content that doesn't change depending on who views it, or for websites that don't use cookies, headers, or
     *        query strings to personalize content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This option is best for sites that serve a mix of static and dynamic
     *        content. When specified, your distribution caches and serve only the content that is specified in the
     *        distribution's <code>CacheBehaviorPerPath</code> parameter. This behavior is ideal for websites or web
     *        applications that use cookies, headers, and query strings to personalize content for individual users.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorEnum
     */

    public CacheBehavior withBehavior(BehaviorEnum behavior) {
        this.behavior = behavior.toString();
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
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior());
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
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehavior clone() {
        try {
            return (CacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CacheBehaviorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
