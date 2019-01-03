/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides all of the details about a particular cache engine version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheEngineVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheEngineVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the cache parameter group family associated with this cache engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     */
    private String cacheParameterGroupFamily;
    /**
     * <p>
     * The description of the cache engine.
     * </p>
     */
    private String cacheEngineDescription;
    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     */
    private String cacheEngineVersionDescription;

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     * 
     * @return The name of the cache engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheEngineVersion withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     * 
     * @return The version number of the cache engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheEngineVersion withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group family associated with this cache engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        The name of the cache parameter group family associated with this cache engine.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *        <code>redis3.2</code> | <code>redis4.0</code>
     */

    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family associated with this cache engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @return The name of the cache parameter group family associated with this cache engine.</p>
     *         <p>
     *         Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *         <code>redis3.2</code> | <code>redis4.0</code>
     */

    public String getCacheParameterGroupFamily() {
        return this.cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family associated with this cache engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        The name of the cache parameter group family associated with this cache engine.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *        <code>redis3.2</code> | <code>redis4.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheEngineVersion withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     * 
     * @param cacheEngineDescription
     *        The description of the cache engine.
     */

    public void setCacheEngineDescription(String cacheEngineDescription) {
        this.cacheEngineDescription = cacheEngineDescription;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     * 
     * @return The description of the cache engine.
     */

    public String getCacheEngineDescription() {
        return this.cacheEngineDescription;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     * 
     * @param cacheEngineDescription
     *        The description of the cache engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheEngineVersion withCacheEngineDescription(String cacheEngineDescription) {
        setCacheEngineDescription(cacheEngineDescription);
        return this;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     * 
     * @param cacheEngineVersionDescription
     *        The description of the cache engine version.
     */

    public void setCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        this.cacheEngineVersionDescription = cacheEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     * 
     * @return The description of the cache engine version.
     */

    public String getCacheEngineVersionDescription() {
        return this.cacheEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     * 
     * @param cacheEngineVersionDescription
     *        The description of the cache engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheEngineVersion withCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        setCacheEngineVersionDescription(cacheEngineVersionDescription);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: ").append(getCacheParameterGroupFamily()).append(",");
        if (getCacheEngineDescription() != null)
            sb.append("CacheEngineDescription: ").append(getCacheEngineDescription()).append(",");
        if (getCacheEngineVersionDescription() != null)
            sb.append("CacheEngineVersionDescription: ").append(getCacheEngineVersionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheEngineVersion == false)
            return false;
        CacheEngineVersion other = (CacheEngineVersion) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false)
            return false;
        if (other.getCacheEngineDescription() == null ^ this.getCacheEngineDescription() == null)
            return false;
        if (other.getCacheEngineDescription() != null && other.getCacheEngineDescription().equals(this.getCacheEngineDescription()) == false)
            return false;
        if (other.getCacheEngineVersionDescription() == null ^ this.getCacheEngineVersionDescription() == null)
            return false;
        if (other.getCacheEngineVersionDescription() != null
                && other.getCacheEngineVersionDescription().equals(this.getCacheEngineVersionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getCacheEngineDescription() == null) ? 0 : getCacheEngineDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheEngineVersionDescription() == null) ? 0 : getCacheEngineVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public CacheEngineVersion clone() {
        try {
            return (CacheEngineVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
