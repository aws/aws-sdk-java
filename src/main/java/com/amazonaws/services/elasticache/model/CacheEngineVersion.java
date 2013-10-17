/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Provides all of the details about a particular cache engine version.
 * </p>
 */
public class CacheEngineVersion implements Serializable {

    /**
     * The name of the cache engine.
     */
    private String engine;

    /**
     * The version number of the cache engine.
     */
    private String engineVersion;

    /**
     * The name of the cache parameter group family associated with this
     * cache engine.
     */
    private String cacheParameterGroupFamily;

    /**
     * The description of the cache engine.
     */
    private String cacheEngineDescription;

    /**
     * The description of the cache engine version.
     */
    private String cacheEngineVersionDescription;

    /**
     * The name of the cache engine.
     *
     * @return The name of the cache engine.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine.
     *
     * @param engine The name of the cache engine.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheEngineVersion withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version number of the cache engine.
     *
     * @return The version number of the cache engine.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the cache engine.
     *
     * @param engineVersion The version number of the cache engine.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the cache engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the cache engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheEngineVersion withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The name of the cache parameter group family associated with this
     * cache engine.
     *
     * @return The name of the cache parameter group family associated with this
     *         cache engine.
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * The name of the cache parameter group family associated with this
     * cache engine.
     *
     * @param cacheParameterGroupFamily The name of the cache parameter group family associated with this
     *         cache engine.
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * The name of the cache parameter group family associated with this
     * cache engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily The name of the cache parameter group family associated with this
     *         cache engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheEngineVersion withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * The description of the cache engine.
     *
     * @return The description of the cache engine.
     */
    public String getCacheEngineDescription() {
        return cacheEngineDescription;
    }
    
    /**
     * The description of the cache engine.
     *
     * @param cacheEngineDescription The description of the cache engine.
     */
    public void setCacheEngineDescription(String cacheEngineDescription) {
        this.cacheEngineDescription = cacheEngineDescription;
    }
    
    /**
     * The description of the cache engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheEngineDescription The description of the cache engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheEngineVersion withCacheEngineDescription(String cacheEngineDescription) {
        this.cacheEngineDescription = cacheEngineDescription;
        return this;
    }

    /**
     * The description of the cache engine version.
     *
     * @return The description of the cache engine version.
     */
    public String getCacheEngineVersionDescription() {
        return cacheEngineVersionDescription;
    }
    
    /**
     * The description of the cache engine version.
     *
     * @param cacheEngineVersionDescription The description of the cache engine version.
     */
    public void setCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        this.cacheEngineVersionDescription = cacheEngineVersionDescription;
    }
    
    /**
     * The description of the cache engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheEngineVersionDescription The description of the cache engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheEngineVersion withCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        this.cacheEngineVersionDescription = cacheEngineVersionDescription;
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
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupFamily() != null) sb.append("CacheParameterGroupFamily: " + getCacheParameterGroupFamily() + ",");
        if (getCacheEngineDescription() != null) sb.append("CacheEngineDescription: " + getCacheEngineDescription() + ",");
        if (getCacheEngineVersionDescription() != null) sb.append("CacheEngineVersionDescription: " + getCacheEngineVersionDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheEngineVersion == false) return false;
        CacheEngineVersion other = (CacheEngineVersion)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null) return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false) return false; 
        if (other.getCacheEngineDescription() == null ^ this.getCacheEngineDescription() == null) return false;
        if (other.getCacheEngineDescription() != null && other.getCacheEngineDescription().equals(this.getCacheEngineDescription()) == false) return false; 
        if (other.getCacheEngineVersionDescription() == null ^ this.getCacheEngineVersionDescription() == null) return false;
        if (other.getCacheEngineVersionDescription() != null && other.getCacheEngineVersionDescription().equals(this.getCacheEngineVersionDescription()) == false) return false; 
        return true;
    }
    
}
    