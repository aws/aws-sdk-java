/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The caching configuration for a resolver that has caching enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CachingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The TTL in seconds for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     */
    private Long ttl;
    /**
     * <p>
     * The caching keys for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * </p>
     */
    private java.util.List<String> cachingKeys;

    /**
     * <p>
     * The TTL in seconds for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @param ttl
     *        The TTL in seconds for a resolver that has caching enabled.</p>
     *        <p>
     *        Valid values are between 1 and 3600 seconds.
     */

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The TTL in seconds for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @return The TTL in seconds for a resolver that has caching enabled.</p>
     *         <p>
     *         Valid values are between 1 and 3600 seconds.
     */

    public Long getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The TTL in seconds for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @param ttl
     *        The TTL in seconds for a resolver that has caching enabled.</p>
     *        <p>
     *        Valid values are between 1 and 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachingConfig withTtl(Long ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * The caching keys for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * </p>
     * 
     * @return The caching keys for a resolver that has caching enabled.</p>
     *         <p>
     *         Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code>
     *         maps.
     */

    public java.util.List<String> getCachingKeys() {
        return cachingKeys;
    }

    /**
     * <p>
     * The caching keys for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * </p>
     * 
     * @param cachingKeys
     *        The caching keys for a resolver that has caching enabled.</p>
     *        <p>
     *        Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     */

    public void setCachingKeys(java.util.Collection<String> cachingKeys) {
        if (cachingKeys == null) {
            this.cachingKeys = null;
            return;
        }

        this.cachingKeys = new java.util.ArrayList<String>(cachingKeys);
    }

    /**
     * <p>
     * The caching keys for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCachingKeys(java.util.Collection)} or {@link #withCachingKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cachingKeys
     *        The caching keys for a resolver that has caching enabled.</p>
     *        <p>
     *        Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachingConfig withCachingKeys(String... cachingKeys) {
        if (this.cachingKeys == null) {
            setCachingKeys(new java.util.ArrayList<String>(cachingKeys.length));
        }
        for (String ele : cachingKeys) {
            this.cachingKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The caching keys for a resolver that has caching enabled.
     * </p>
     * <p>
     * Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * </p>
     * 
     * @param cachingKeys
     *        The caching keys for a resolver that has caching enabled.</p>
     *        <p>
     *        Valid values are entries from the <code>$context.identity</code> and <code>$context.arguments</code> maps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachingConfig withCachingKeys(java.util.Collection<String> cachingKeys) {
        setCachingKeys(cachingKeys);
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
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getCachingKeys() != null)
            sb.append("CachingKeys: ").append(getCachingKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CachingConfig == false)
            return false;
        CachingConfig other = (CachingConfig) obj;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getCachingKeys() == null ^ this.getCachingKeys() == null)
            return false;
        if (other.getCachingKeys() != null && other.getCachingKeys().equals(this.getCachingKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getCachingKeys() == null) ? 0 : getCachingKeys().hashCode());
        return hashCode;
    }

    @Override
    public CachingConfig clone() {
        try {
            return (CachingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.CachingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
