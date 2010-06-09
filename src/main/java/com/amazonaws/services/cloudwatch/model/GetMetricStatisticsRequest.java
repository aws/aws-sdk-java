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
package com.amazonaws.services.cloudwatch.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#getMetricStatistics(GetMetricStatisticsRequest) GetMetricStatistics operation}.
 * 
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#getMetricStatistics(GetMetricStatisticsRequest)
 */
public class GetMetricStatisticsRequest extends AmazonWebServiceRequest {

    private java.util.List<String> statistics;

    private Integer period;

    private String measureName;

    private java.util.List<Dimension> dimensions;

    private java.util.Date startTime;

    private java.util.Date endTime;

    private String unit;

    private String customUnit;

    private String namespace;

    /**
     * Returns the value of the Statistics property for this object.
     *
     * @return The value of the Statistics property for this object.
     */
    public java.util.List<String> getStatistics() {
        if (statistics == null) {
            statistics = new java.util.ArrayList<String>();
        }
        return statistics;
    }
    
    /**
     * Sets the value of the Statistics property for this object.
     *
     * @param statistics The new value for the Statistics property for this object.
     */
    public void setStatistics(java.util.Collection<String> statistics) {
        java.util.List<String> statisticsCopy = new java.util.ArrayList<String>();
        if (statistics != null) {
            statisticsCopy.addAll(statistics);
        }
        this.statistics = statisticsCopy;
    }
    
    /**
     * Sets the value of the Statistics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statistics The new value for the Statistics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withStatistics(String... statistics) {
        for (String value : statistics) {
            getStatistics().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Statistics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statistics The new value for the Statistics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withStatistics(java.util.Collection<String> statistics) {
        java.util.List<String> statisticsCopy = new java.util.ArrayList<String>();
        if (statistics != null) {
            statisticsCopy.addAll(statistics);
        }
        this.statistics = statisticsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Period property for this object.
     *
     * @return The value of the Period property for this object.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     *
     * @param period The new value for the Period property for this object.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param period The new value for the Period property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }
    
    
    /**
     * Returns the value of the MeasureName property for this object.
     *
     * @return The value of the MeasureName property for this object.
     */
    public String getMeasureName() {
        return measureName;
    }
    
    /**
     * Sets the value of the MeasureName property for this object.
     *
     * @param measureName The new value for the MeasureName property for this object.
     */
    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }
    
    /**
     * Sets the value of the MeasureName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param measureName The new value for the MeasureName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withMeasureName(String measureName) {
        this.measureName = measureName;
        return this;
    }
    
    
    /**
     * Returns the value of the Dimensions property for this object.
     *
     * @return The value of the Dimensions property for this object.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<Dimension>();
        }
        return dimensions;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     *
     * @param dimensions The new value for the Dimensions property for this object.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withDimensions(Dimension... dimensions) {
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the StartTime property for this object.
     *
     * @return The value of the StartTime property for this object.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     *
     * @param startTime The new value for the StartTime property for this object.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The new value for the StartTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }
    
    
    /**
     * Returns the value of the EndTime property for this object.
     *
     * @return The value of the EndTime property for this object.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * Sets the value of the EndTime property for this object.
     *
     * @param endTime The new value for the EndTime property for this object.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * Sets the value of the EndTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The new value for the EndTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }
    
    
    /**
     * Returns the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @return The value of the Unit property for this object.
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit The new value for the Unit property for this object.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit The new value for the Unit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * Returns the value of the CustomUnit property for this object.
     *
     * @return The value of the CustomUnit property for this object.
     */
    public String getCustomUnit() {
        return customUnit;
    }
    
    /**
     * Sets the value of the CustomUnit property for this object.
     *
     * @param customUnit The new value for the CustomUnit property for this object.
     */
    public void setCustomUnit(String customUnit) {
        this.customUnit = customUnit;
    }
    
    /**
     * Sets the value of the CustomUnit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customUnit The new value for the CustomUnit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withCustomUnit(String customUnit) {
        this.customUnit = customUnit;
        return this;
    }
    
    
    /**
     * Returns the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The value of the Namespace property for this object.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsRequest withNamespace(String namespace) {
        this.namespace = namespace;
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
        
        sb.append("Statistics: " + statistics + ", ");
        sb.append("Period: " + period + ", ");
        sb.append("MeasureName: " + measureName + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("EndTime: " + endTime + ", ");
        sb.append("Unit: " + unit + ", ");
        sb.append("CustomUnit: " + customUnit + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    