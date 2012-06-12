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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeOptionGroups(DescribeOptionGroupsRequest) DescribeOptionGroups operation}.
 * <p>
 * Describes the available option groups.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeOptionGroups(DescribeOptionGroupsRequest)
 */
public class DescribeOptionGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the option group to describe. Cannot be supplied together
     * with EngineName or MajorEngineVersion.
     */
    private String optionGroupName;

    private String marker;

    private Integer maxRecords;

    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine.
     */
    private String engineName;

    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine version. If specified, then EngineName
     * must also be specified.
     */
    private String majorEngineVersion;

    /**
     * The name of the option group to describe. Cannot be supplied together
     * with EngineName or MajorEngineVersion.
     *
     * @return The name of the option group to describe. Cannot be supplied together
     *         with EngineName or MajorEngineVersion.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group to describe. Cannot be supplied together
     * with EngineName or MajorEngineVersion.
     *
     * @param optionGroupName The name of the option group to describe. Cannot be supplied together
     *         with EngineName or MajorEngineVersion.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group to describe. Cannot be supplied together
     * with EngineName or MajorEngineVersion.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group to describe. Cannot be supplied together
     *         with EngineName or MajorEngineVersion.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupsRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
    public DescribeOptionGroupsRequest withMarker(String marker) {
        this.marker = marker;
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
    public DescribeOptionGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine.
     *
     * @return Filters the list of option groups to only include groups associated
     *         with a specific database engine.
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine.
     *
     * @param engineName Filters the list of option groups to only include groups associated
     *         with a specific database engine.
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineName Filters the list of option groups to only include groups associated
     *         with a specific database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupsRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine version. If specified, then EngineName
     * must also be specified.
     *
     * @return Filters the list of option groups to only include groups associated
     *         with a specific database engine version. If specified, then EngineName
     *         must also be specified.
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine version. If specified, then EngineName
     * must also be specified.
     *
     * @param majorEngineVersion Filters the list of option groups to only include groups associated
     *         with a specific database engine version. If specified, then EngineName
     *         must also be specified.
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }
    
    /**
     * Filters the list of option groups to only include groups associated
     * with a specific database engine version. If specified, then EngineName
     * must also be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param majorEngineVersion Filters the list of option groups to only include groups associated
     *         with a specific database engine version. If specified, then EngineName
     *         must also be specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupsRequest withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
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
        if (optionGroupName != null) sb.append("OptionGroupName: " + optionGroupName + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (maxRecords != null) sb.append("MaxRecords: " + maxRecords + ", ");
        if (engineName != null) sb.append("EngineName: " + engineName + ", ");
        if (majorEngineVersion != null) sb.append("MajorEngineVersion: " + majorEngineVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode()); 
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeOptionGroupsRequest == false) return false;
        DescribeOptionGroupsRequest other = (DescribeOptionGroupsRequest)obj;
        
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getEngineName() == null ^ this.getEngineName() == null) return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false) return false; 
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null) return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false) return false; 
        return true;
    }
    
}
    