/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DescribeCacheClusters</code> operation.
 * </p>
 */
public class DescribeCacheClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cache
     * cluster is returned. This parameter isn't case sensitive.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the
     * individual cache nodes.
     * </p>
     */
    private Boolean showCacheNodeInfo;

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cache
     * cluster is returned. This parameter isn't case sensitive.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied cluster identifier. If this parameter is specified, only information about that specific
     *        cache cluster is returned. This parameter isn't case sensitive.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cache
     * cluster is returned. This parameter isn't case sensitive.
     * </p>
     * 
     * @return The user-supplied cluster identifier. If this parameter is specified, only information about that
     *         specific cache cluster is returned. This parameter isn't case sensitive.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cache
     * cluster is returned. This parameter isn't case sensitive.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied cluster identifier. If this parameter is specified, only information about that specific
     *        cache cluster is returned. This parameter isn't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *         retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the
     * individual cache nodes.
     * </p>
     * 
     * @param showCacheNodeInfo
     *        An optional flag that can be included in the DescribeCacheCluster request to retrieve information about
     *        the individual cache nodes.
     */

    public void setShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        this.showCacheNodeInfo = showCacheNodeInfo;
    }

    /**
     * <p>
     * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the
     * individual cache nodes.
     * </p>
     * 
     * @return An optional flag that can be included in the DescribeCacheCluster request to retrieve information about
     *         the individual cache nodes.
     */

    public Boolean getShowCacheNodeInfo() {
        return this.showCacheNodeInfo;
    }

    /**
     * <p>
     * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the
     * individual cache nodes.
     * </p>
     * 
     * @param showCacheNodeInfo
     *        An optional flag that can be included in the DescribeCacheCluster request to retrieve information about
     *        the individual cache nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersRequest withShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        setShowCacheNodeInfo(showCacheNodeInfo);
        return this;
    }

    /**
     * <p>
     * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the
     * individual cache nodes.
     * </p>
     * 
     * @return An optional flag that can be included in the DescribeCacheCluster request to retrieve information about
     *         the individual cache nodes.
     */

    public Boolean isShowCacheNodeInfo() {
        return this.showCacheNodeInfo;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getShowCacheNodeInfo() != null)
            sb.append("ShowCacheNodeInfo: " + getShowCacheNodeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheClustersRequest == false)
            return false;
        DescribeCacheClustersRequest other = (DescribeCacheClustersRequest) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getShowCacheNodeInfo() == null ^ this.getShowCacheNodeInfo() == null)
            return false;
        if (other.getShowCacheNodeInfo() != null && other.getShowCacheNodeInfo().equals(this.getShowCacheNodeInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getShowCacheNodeInfo() == null) ? 0 : getShowCacheNodeInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheClustersRequest clone() {
        return (DescribeCacheClustersRequest) super.clone();
    }
}
