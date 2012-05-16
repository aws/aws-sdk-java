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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest) DescribeOrderableDBInstanceOptions operation}.
 * <p>
 * Returns a list of orderable DB Instance options for the specified engine.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest)
 */
public class DescribeOrderableDBInstanceOptionsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the engine to retrieve DB Instance options for.
     */
    private String engine;

    /**
     * The engine version filter value. Specify this parameter to show only
     * the available offerings matching the specified engine version.
     */
    private String engineVersion;

    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     */
    private String dBInstanceClass;

    /**
     * The license model filter value. Specify this parameter to show only
     * the available offerings matching the specified license model.
     */
    private String licenseModel;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     */
    private String marker;

    /**
     * The name of the engine to retrieve DB Instance options for.
     *
     * @return The name of the engine to retrieve DB Instance options for.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the engine to retrieve DB Instance options for.
     *
     * @param engine The name of the engine to retrieve DB Instance options for.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the engine to retrieve DB Instance options for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the engine to retrieve DB Instance options for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * The engine version filter value. Specify this parameter to show only
     * the available offerings matching the specified engine version.
     *
     * @return The engine version filter value. Specify this parameter to show only
     *         the available offerings matching the specified engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The engine version filter value. Specify this parameter to show only
     * the available offerings matching the specified engine version.
     *
     * @param engineVersion The engine version filter value. Specify this parameter to show only
     *         the available offerings matching the specified engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The engine version filter value. Specify this parameter to show only
     * the available offerings matching the specified engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The engine version filter value. Specify this parameter to show only
     *         the available offerings matching the specified engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     *
     * @return The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     *
     * @param dBInstanceClass The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The license model filter value. Specify this parameter to show only
     * the available offerings matching the specified license model.
     *
     * @return The license model filter value. Specify this parameter to show only
     *         the available offerings matching the specified license model.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * The license model filter value. Specify this parameter to show only
     * the available offerings matching the specified license model.
     *
     * @param licenseModel The license model filter value. Specify this parameter to show only
     *         the available offerings matching the specified license model.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * The license model filter value. Specify this parameter to show only
     * the available offerings matching the specified license model.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel The license model filter value. Specify this parameter to show only
     *         the available offerings matching the specified license model.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
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
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     *
     * @return An optional marker provided in the previous
     *         DescribeOrderableDBInstanceOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code> .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     *
     * @param marker An optional marker provided in the previous
     *         DescribeOrderableDBInstanceOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code> .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous
     *         DescribeOrderableDBInstanceOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsRequest withMarker(String marker) {
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
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (licenseModel != null) sb.append("LicenseModel: " + licenseModel + ", ");
        if (maxRecords != null) sb.append("MaxRecords: " + maxRecords + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeOrderableDBInstanceOptionsRequest == false) return false;
        DescribeOrderableDBInstanceOptionsRequest other = (DescribeOrderableDBInstanceOptionsRequest)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    