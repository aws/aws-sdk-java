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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest) DescribeCacheSubnetGroups operation}.
 * <p>
 * Returns a list of CacheSubnetGroup descriptions. If a CacheSubnetGroupName is specified, the list will contain only the description of the specified
 * Cache Subnet Group.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest)
 */
public class DescribeCacheSubnetGroupsRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The name of the Cache Subnet Group to return details for.
     */
    private String cacheSubnetGroupName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous DescribeCacheSubnetGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The name of the Cache Subnet Group to return details for.
     *
     * @return The name of the Cache Subnet Group to return details for.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the Cache Subnet Group to return details for.
     *
     * @param cacheSubnetGroupName The name of the Cache Subnet Group to return details for.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the Cache Subnet Group to return details for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the Cache Subnet Group to return details for.
     */
    public DescribeCacheSubnetGroupsRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    public DescribeCacheSubnetGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous DescribeCacheSubnetGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @return An optional marker provided in the previous DescribeCacheSubnetGroups
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeCacheSubnetGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @param marker An optional marker provided in the previous DescribeCacheSubnetGroups
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeCacheSubnetGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous DescribeCacheSubnetGroups
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public DescribeCacheSubnetGroupsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheSubnetGroupsRequest == false) return false;
        DescribeCacheSubnetGroupsRequest other = (DescribeCacheSubnetGroupsRequest)obj;
        
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    