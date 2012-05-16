/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheParameterGroups(DescribeCacheParameterGroupsRequest) DescribeCacheParameterGroups operation}.
 * <p>
 * Returns a list of CacheParameterGroup descriptions. If a CacheParameterGroupName is specified, the list will contain only the descriptions of the
 * specified CacheParameterGroup.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheParameterGroups(DescribeCacheParameterGroupsRequest)
 */
public class DescribeCacheParameterGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of a specific cache parameter group to return details for.
     */
    private String cacheParameterGroupName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous
     * DescribeCacheParameterGroups request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeCacheParameterGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeCacheParameterGroupsRequest() {}
    
    /**
     * Constructs a new DescribeCacheParameterGroupsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName The name of a specific cache parameter
     * group to return details for.
     */
    public DescribeCacheParameterGroupsRequest(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    
    
    /**
     * The name of a specific cache parameter group to return details for.
     *
     * @return The name of a specific cache parameter group to return details for.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of a specific cache parameter group to return details for.
     *
     * @param cacheParameterGroupName The name of a specific cache parameter group to return details for.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of a specific cache parameter group to return details for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of a specific cache parameter group to return details for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous
     * DescribeCacheParameterGroups request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     *
     * @return An optional marker provided in the previous
     *         DescribeCacheParameterGroups request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous
     * DescribeCacheParameterGroups request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     *
     * @param marker An optional marker provided in the previous
     *         DescribeCacheParameterGroups request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous
     * DescribeCacheParameterGroups request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous
     *         DescribeCacheParameterGroups request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsRequest withMarker(String marker) {
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
        if (cacheParameterGroupName != null) sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        if (maxRecords != null) sb.append("MaxRecords: " + maxRecords + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeCacheParameterGroupsRequest == false) return false;
        DescribeCacheParameterGroupsRequest other = (DescribeCacheParameterGroupsRequest)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    