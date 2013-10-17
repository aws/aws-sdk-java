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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheEngineVersions(DescribeCacheEngineVersionsRequest) DescribeCacheEngineVersions operation}.
 * <p>
 * The <i>DescribeCacheEngineVersions</i> operation returns a list of the available cache engines and their versions.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheEngineVersions(DescribeCacheEngineVersionsRequest)
 */
public class DescribeCacheEngineVersionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     */
    private String engine;

    /**
     * The cache engine version to return. <p>Example: <code>1.4.14</code>
     */
    private String engineVersion;

    /**
     * The name of a specific cache parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String cacheParameterGroupFamily;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * If <i>true</i>, specifies that only the default version of the
     * specified engine or engine and major version combination is to be
     * returned.
     */
    private Boolean defaultOnly;

    /**
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     *
     * @return The cache engine to return. Valid values: <code>memcached</code> |
     *         <code>redis</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     *
     * @param engine The cache engine to return. Valid values: <code>memcached</code> |
     *         <code>redis</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The cache engine to return. Valid values: <code>memcached</code> |
     *         <code>redis</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The cache engine version to return. <p>Example: <code>1.4.14</code>
     *
     * @return The cache engine version to return. <p>Example: <code>1.4.14</code>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The cache engine version to return. <p>Example: <code>1.4.14</code>
     *
     * @param engineVersion The cache engine version to return. <p>Example: <code>1.4.14</code>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The cache engine version to return. <p>Example: <code>1.4.14</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The cache engine version to return. <p>Example: <code>1.4.14</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The name of a specific cache parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The name of a specific cache parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * The name of a specific cache parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param cacheParameterGroupFamily The name of a specific cache parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * The name of a specific cache parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily The name of a specific cache parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @return An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * If <i>true</i>, specifies that only the default version of the
     * specified engine or engine and major version combination is to be
     * returned.
     *
     * @return If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     */
    public Boolean isDefaultOnly() {
        return defaultOnly;
    }
    
    /**
     * If <i>true</i>, specifies that only the default version of the
     * specified engine or engine and major version combination is to be
     * returned.
     *
     * @param defaultOnly If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     */
    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }
    
    /**
     * If <i>true</i>, specifies that only the default version of the
     * specified engine or engine and major version combination is to be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOnly If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
        return this;
    }

    /**
     * If <i>true</i>, specifies that only the default version of the
     * specified engine or engine and major version combination is to be
     * returned.
     *
     * @return If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     */
    public Boolean getDefaultOnly() {
        return defaultOnly;
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
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isDefaultOnly() != null) sb.append("DefaultOnly: " + isDefaultOnly() );
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
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultOnly() == null) ? 0 : isDefaultOnly().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheEngineVersionsRequest == false) return false;
        DescribeCacheEngineVersionsRequest other = (DescribeCacheEngineVersionsRequest)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null) return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isDefaultOnly() == null ^ this.isDefaultOnly() == null) return false;
        if (other.isDefaultOnly() != null && other.isDefaultOnly().equals(this.isDefaultOnly()) == false) return false; 
        return true;
    }
    
}
    