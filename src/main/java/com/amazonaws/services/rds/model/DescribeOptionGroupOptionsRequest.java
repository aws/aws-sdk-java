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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeOptionGroupOptions(DescribeOptionGroupOptionsRequest) DescribeOptionGroupOptions operation}.
 * <p>
 * Describes all available options.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeOptionGroupOptions(DescribeOptionGroupOptionsRequest)
 */
public class DescribeOptionGroupOptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A required parameter. Options available for the given Engine name will
     * be described.
     */
    private String engineName;

    /**
     * If specified, filters the results to include only options for the
     * specified major engine version.
     */
    private String majorEngineVersion;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A required parameter. Options available for the given Engine name will
     * be described.
     *
     * @return A required parameter. Options available for the given Engine name will
     *         be described.
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * A required parameter. Options available for the given Engine name will
     * be described.
     *
     * @param engineName A required parameter. Options available for the given Engine name will
     *         be described.
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
    
    /**
     * A required parameter. Options available for the given Engine name will
     * be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineName A required parameter. Options available for the given Engine name will
     *         be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOptionGroupOptionsRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * If specified, filters the results to include only options for the
     * specified major engine version.
     *
     * @return If specified, filters the results to include only options for the
     *         specified major engine version.
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }
    
    /**
     * If specified, filters the results to include only options for the
     * specified major engine version.
     *
     * @param majorEngineVersion If specified, filters the results to include only options for the
     *         specified major engine version.
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }
    
    /**
     * If specified, filters the results to include only options for the
     * specified major engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param majorEngineVersion If specified, filters the results to include only options for the
     *         specified major engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOptionGroupOptionsRequest withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOptionGroupOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOptionGroupOptionsRequest withMarker(String marker) {
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
        if (getEngineName() != null) sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null) sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode()); 
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOptionGroupOptionsRequest == false) return false;
        DescribeOptionGroupOptionsRequest other = (DescribeOptionGroupOptionsRequest)obj;
        
        if (other.getEngineName() == null ^ this.getEngineName() == null) return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false) return false; 
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null) return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    