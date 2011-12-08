/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest) DescribeCacheSecurityGroups operation}.
 * <p>
 * Returns a list of CacheSecurityGroup descriptions. If a
 * CacheSecurityGroupName is specified, the list will contain only the
 * description of the specified CacheSecurityGroup.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest)
 */
public class DescribeCacheSecurityGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Cache Security Group to return details for.
     */
    private String cacheSecurityGroupName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous DescribeCacheClusters
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeCacheSecurityGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeCacheSecurityGroupsRequest() {}
    
    /**
     * Constructs a new DescribeCacheSecurityGroupsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheSecurityGroupName The name of the Cache Security Group to
     * return details for.
     */
    public DescribeCacheSecurityGroupsRequest(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    
    
    /**
     * The name of the Cache Security Group to return details for.
     *
     * @return The name of the Cache Security Group to return details for.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The name of the Cache Security Group to return details for.
     *
     * @param cacheSecurityGroupName The name of the Cache Security Group to return details for.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The name of the Cache Security Group to return details for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The name of the Cache Security Group to return details for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheSecurityGroupsRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved. <p> Default: 100 <p> Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheSecurityGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous DescribeCacheClusters
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @return An optional marker provided in the previous DescribeCacheClusters
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeCacheClusters
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @param marker An optional marker provided in the previous DescribeCacheClusters
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeCacheClusters
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous DescribeCacheClusters
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheSecurityGroupsRequest withMarker(String marker) {
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
        sb.append("CacheSecurityGroupName: " + cacheSecurityGroupName + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    