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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBEngineVersions(DescribeDBEngineVersionsRequest) DescribeDBEngineVersions operation}.
 * <p>
 * Returns a list of the available DB engines.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBEngineVersions(DescribeDBEngineVersionsRequest)
 */
public class DescribeDBEngineVersionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The database engine to return.
     */
    private String engine;

    /**
     * The database engine version to return. <p>Example: <code>5.1.49</code>
     */
    private String engineVersion;

    /**
     * The name of a specific DB parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String dBParameterGroupFamily;

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Indicates that only the default version of the specified engine or
     * engine and major version combination is returned.
     */
    private Boolean defaultOnly;

    /**
     * If this parameter is specified, and if the requested engine supports
     * the CharacterSetName parameter for CreateDBInstance, the response
     * includes a list of supported character sets for each engine version.
     */
    private Boolean listSupportedCharacterSets;

    /**
     * Default constructor for a new DescribeDBEngineVersionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeDBEngineVersionsRequest() {}
    
    /**
     * The database engine to return.
     *
     * @return The database engine to return.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The database engine to return.
     *
     * @param engine The database engine to return.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The database engine to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The database engine to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The database engine version to return. <p>Example: <code>5.1.49</code>
     *
     * @return The database engine version to return. <p>Example: <code>5.1.49</code>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The database engine version to return. <p>Example: <code>5.1.49</code>
     *
     * @param engineVersion The database engine version to return. <p>Example: <code>5.1.49</code>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The database engine version to return. <p>Example: <code>5.1.49</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The database engine version to return. <p>Example: <code>5.1.49</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The name of a specific DB parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The name of a specific DB parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The name of a specific DB parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param dBParameterGroupFamily The name of a specific DB parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The name of a specific DB parameter group family to return details
     * for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The name of a specific DB parameter group family to return details
     *         for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @return The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withMaxRecords(Integer maxRecords) {
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
    public DescribeDBEngineVersionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Indicates that only the default version of the specified engine or
     * engine and major version combination is returned.
     *
     * @return Indicates that only the default version of the specified engine or
     *         engine and major version combination is returned.
     */
    public Boolean isDefaultOnly() {
        return defaultOnly;
    }
    
    /**
     * Indicates that only the default version of the specified engine or
     * engine and major version combination is returned.
     *
     * @param defaultOnly Indicates that only the default version of the specified engine or
     *         engine and major version combination is returned.
     */
    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }
    
    /**
     * Indicates that only the default version of the specified engine or
     * engine and major version combination is returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOnly Indicates that only the default version of the specified engine or
     *         engine and major version combination is returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
        return this;
    }

    /**
     * Indicates that only the default version of the specified engine or
     * engine and major version combination is returned.
     *
     * @return Indicates that only the default version of the specified engine or
     *         engine and major version combination is returned.
     */
    public Boolean getDefaultOnly() {
        return defaultOnly;
    }

    /**
     * If this parameter is specified, and if the requested engine supports
     * the CharacterSetName parameter for CreateDBInstance, the response
     * includes a list of supported character sets for each engine version.
     *
     * @return If this parameter is specified, and if the requested engine supports
     *         the CharacterSetName parameter for CreateDBInstance, the response
     *         includes a list of supported character sets for each engine version.
     */
    public Boolean isListSupportedCharacterSets() {
        return listSupportedCharacterSets;
    }
    
    /**
     * If this parameter is specified, and if the requested engine supports
     * the CharacterSetName parameter for CreateDBInstance, the response
     * includes a list of supported character sets for each engine version.
     *
     * @param listSupportedCharacterSets If this parameter is specified, and if the requested engine supports
     *         the CharacterSetName parameter for CreateDBInstance, the response
     *         includes a list of supported character sets for each engine version.
     */
    public void setListSupportedCharacterSets(Boolean listSupportedCharacterSets) {
        this.listSupportedCharacterSets = listSupportedCharacterSets;
    }
    
    /**
     * If this parameter is specified, and if the requested engine supports
     * the CharacterSetName parameter for CreateDBInstance, the response
     * includes a list of supported character sets for each engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listSupportedCharacterSets If this parameter is specified, and if the requested engine supports
     *         the CharacterSetName parameter for CreateDBInstance, the response
     *         includes a list of supported character sets for each engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBEngineVersionsRequest withListSupportedCharacterSets(Boolean listSupportedCharacterSets) {
        this.listSupportedCharacterSets = listSupportedCharacterSets;
        return this;
    }

    /**
     * If this parameter is specified, and if the requested engine supports
     * the CharacterSetName parameter for CreateDBInstance, the response
     * includes a list of supported character sets for each engine version.
     *
     * @return If this parameter is specified, and if the requested engine supports
     *         the CharacterSetName parameter for CreateDBInstance, the response
     *         includes a list of supported character sets for each engine version.
     */
    public Boolean getListSupportedCharacterSets() {
        return listSupportedCharacterSets;
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
        if (getDBParameterGroupFamily() != null) sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isDefaultOnly() != null) sb.append("DefaultOnly: " + isDefaultOnly() + ",");
        if (isListSupportedCharacterSets() != null) sb.append("ListSupportedCharacterSets: " + isListSupportedCharacterSets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultOnly() == null) ? 0 : isDefaultOnly().hashCode()); 
        hashCode = prime * hashCode + ((isListSupportedCharacterSets() == null) ? 0 : isListSupportedCharacterSets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBEngineVersionsRequest == false) return false;
        DescribeDBEngineVersionsRequest other = (DescribeDBEngineVersionsRequest)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null) return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isDefaultOnly() == null ^ this.isDefaultOnly() == null) return false;
        if (other.isDefaultOnly() != null && other.isDefaultOnly().equals(this.isDefaultOnly()) == false) return false; 
        if (other.isListSupportedCharacterSets() == null ^ this.isListSupportedCharacterSets() == null) return false;
        if (other.isListSupportedCharacterSets() != null && other.isListSupportedCharacterSets().equals(this.isListSupportedCharacterSets()) == false) return false; 
        return true;
    }
    
}
    