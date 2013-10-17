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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheClusters(DescribeCacheClustersRequest) DescribeCacheClusters operation}.
 * <p>
 * The <i>DescribeCacheClusters</i> operation returns information about all provisioned cache clusters if no cache cluster identifier is specified, or
 * about a specific cache cluster if a cache cluster identifier is supplied.
 * </p>
 * <p>
 * By default, abbreviated information about the cache clusters(s) will be returned. You can use the optional <i>ShowDetails</i> flag to retrieve
 * detailed information about the cache nodes associated with the cache clusters. These details include the DNS address and port for the cache node
 * endpoint.
 * </p>
 * <p>
 * If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned.
 * </p>
 * <p>
 * If the cluster is in the DELETING state, only cluster level information will be displayed.
 * </p>
 * <p>
 * If cache nodes are currently being added to the cache cluster, node endpoint information and creation time for the additional nodes will not be
 * displayed until they are completely provisioned. When the cache cluster state is <i>available</i> , the cluster is ready for use.
 * </p>
 * <p>
 * If cache nodes are currently being removed from the cache cluster, no endpoint information for the removed nodes is displayed.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheClusters(DescribeCacheClustersRequest)
 */
public class DescribeCacheClustersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cache cluster is returned. This
     * parameter isn't case sensitive.
     */
    private String cacheClusterId;

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
     * An optional flag that can be included in the DescribeCacheCluster
     * request to retrieve information about the individual cache nodes.
     */
    private Boolean showCacheNodeInfo;

    /**
     * Default constructor for a new DescribeCacheClustersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeCacheClustersRequest() {}
    
    /**
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cache cluster is returned. This
     * parameter isn't case sensitive.
     *
     * @return The user-supplied cluster identifier. If this parameter is specified,
     *         only information about that specific cache cluster is returned. This
     *         parameter isn't case sensitive.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cache cluster is returned. This
     * parameter isn't case sensitive.
     *
     * @param cacheClusterId The user-supplied cluster identifier. If this parameter is specified,
     *         only information about that specific cache cluster is returned. This
     *         parameter isn't case sensitive.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The user-supplied cluster identifier. If this parameter is specified,
     * only information about that specific cache cluster is returned. This
     * parameter isn't case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The user-supplied cluster identifier. If this parameter is specified,
     *         only information about that specific cache cluster is returned. This
     *         parameter isn't case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheClustersRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
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
    public DescribeCacheClustersRequest withMaxRecords(Integer maxRecords) {
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
    public DescribeCacheClustersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * An optional flag that can be included in the DescribeCacheCluster
     * request to retrieve information about the individual cache nodes.
     *
     * @return An optional flag that can be included in the DescribeCacheCluster
     *         request to retrieve information about the individual cache nodes.
     */
    public Boolean isShowCacheNodeInfo() {
        return showCacheNodeInfo;
    }
    
    /**
     * An optional flag that can be included in the DescribeCacheCluster
     * request to retrieve information about the individual cache nodes.
     *
     * @param showCacheNodeInfo An optional flag that can be included in the DescribeCacheCluster
     *         request to retrieve information about the individual cache nodes.
     */
    public void setShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        this.showCacheNodeInfo = showCacheNodeInfo;
    }
    
    /**
     * An optional flag that can be included in the DescribeCacheCluster
     * request to retrieve information about the individual cache nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param showCacheNodeInfo An optional flag that can be included in the DescribeCacheCluster
     *         request to retrieve information about the individual cache nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheClustersRequest withShowCacheNodeInfo(Boolean showCacheNodeInfo) {
        this.showCacheNodeInfo = showCacheNodeInfo;
        return this;
    }

    /**
     * An optional flag that can be included in the DescribeCacheCluster
     * request to retrieve information about the individual cache nodes.
     *
     * @return An optional flag that can be included in the DescribeCacheCluster
     *         request to retrieve information about the individual cache nodes.
     */
    public Boolean getShowCacheNodeInfo() {
        return showCacheNodeInfo;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isShowCacheNodeInfo() != null) sb.append("ShowCacheNodeInfo: " + isShowCacheNodeInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isShowCacheNodeInfo() == null) ? 0 : isShowCacheNodeInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheClustersRequest == false) return false;
        DescribeCacheClustersRequest other = (DescribeCacheClustersRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isShowCacheNodeInfo() == null ^ this.isShowCacheNodeInfo() == null) return false;
        if (other.isShowCacheNodeInfo() != null && other.isShowCacheNodeInfo().equals(this.isShowCacheNodeInfo()) == false) return false; 
        return true;
    }
    
}
    