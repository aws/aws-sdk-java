/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBEngineVersions(DescribeDBEngineVersionsRequest) DescribeDBEngineVersions operation}.
 * 
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBEngineVersions(DescribeDBEngineVersionsRequest)
 */
public class DescribeDBEngineVersionsRequest extends AmazonWebServiceRequest {

    private String engine;

    private String engineVersion;

    private String dBParameterGroupFamily;

    private Integer maxRecords;

    private String marker;

    private Boolean defaultOnly;

    /**
     * Default constructor for a new DescribeDBEngineVersionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeDBEngineVersionsRequest() {}
    
    /**
     * Returns the value of the Engine property for this object.
     *
     * @return The value of the Engine property for this object.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Sets the value of the Engine property for this object.
     *
     * @param engine The new value for the Engine property for this object.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Sets the value of the Engine property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The new value for the Engine property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * Returns the value of the EngineVersion property for this object.
     *
     * @return The value of the EngineVersion property for this object.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Sets the value of the EngineVersion property for this object.
     *
     * @param engineVersion The new value for the EngineVersion property for this object.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Sets the value of the EngineVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The new value for the EngineVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Returns the value of the DBParameterGroupFamily property for this
     * object.
     *
     * @return The value of the DBParameterGroupFamily property for this object.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * Sets the value of the DBParameterGroupFamily property for this object.
     *
     * @param dBParameterGroupFamily The new value for the DBParameterGroupFamily property for this object.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * Sets the value of the DBParameterGroupFamily property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The new value for the DBParameterGroupFamily property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * Returns the value of the MaxRecords property for this object.
     *
     * @return The value of the MaxRecords property for this object.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * Returns the value of the Marker property for this object.
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Returns the value of the DefaultOnly property for this object.
     *
     * @return The value of the DefaultOnly property for this object.
     */
    public Boolean isDefaultOnly() {
        return defaultOnly;
    }
    
    /**
     * Sets the value of the DefaultOnly property for this object.
     *
     * @param defaultOnly The new value for the DefaultOnly property for this object.
     */
    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }
    
    /**
     * Sets the value of the DefaultOnly property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOnly The new value for the DefaultOnly property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
        return this;
    }
    
    
    /**
     * Returns the value of the DefaultOnly property for this object.
     *
     * @return The value of the DefaultOnly property for this object.
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
        sb.append("Engine: " + engine + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("DefaultOnly: " + defaultOnly + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    