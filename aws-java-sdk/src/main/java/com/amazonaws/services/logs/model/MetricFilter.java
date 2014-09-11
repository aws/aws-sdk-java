/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Metric filters can be used to express how Amazon CloudWatch Logs
 * would extract metric observations from ingested log events and
 * transform them to metric data in a CloudWatch metric.
 * </p>
 */
public class MetricFilter implements Serializable {

    /**
     * The name of the metric filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log entry. For example, a log entry may contain
     * timestamps, IP addresses, strings, and so on. You use the pattern to
     * specify what to look for in the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String filterPattern;

    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation> metricTransformations;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * The name of the metric filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The name of the metric filter.
     */
    public String getFilterName() {
        return filterName;
    }
    
    /**
     * The name of the metric filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName The name of the metric filter.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    /**
     * The name of the metric filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName The name of the metric filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilter withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log entry. For example, a log entry may contain
     * timestamps, IP addresses, strings, and so on. You use the pattern to
     * specify what to look for in the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log entry. For example, a log entry may contain
     *         timestamps, IP addresses, strings, and so on. You use the pattern to
     *         specify what to look for in the log stream.
     */
    public String getFilterPattern() {
        return filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log entry. For example, a log entry may contain
     * timestamps, IP addresses, strings, and so on. You use the pattern to
     * specify what to look for in the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log entry. For example, a log entry may contain
     *         timestamps, IP addresses, strings, and so on. You use the pattern to
     *         specify what to look for in the log stream.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log entry. For example, a log entry may contain
     * timestamps, IP addresses, strings, and so on. You use the pattern to
     * specify what to look for in the log stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log entry. For example, a log entry may contain
     *         timestamps, IP addresses, strings, and so on. You use the pattern to
     *         specify what to look for in the log stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilter withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * Returns the value of the MetricTransformations property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @return The value of the MetricTransformations property for this object.
     */
    public java.util.List<MetricTransformation> getMetricTransformations() {
        if (metricTransformations == null) {
              metricTransformations = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation>();
              metricTransformations.setAutoConstruct(true);
        }
        return metricTransformations;
    }
    
    /**
     * Sets the value of the MetricTransformations property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param metricTransformations The new value for the MetricTransformations property for this object.
     */
    public void setMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        if (metricTransformations == null) {
            this.metricTransformations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation> metricTransformationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation>(metricTransformations.size());
        metricTransformationsCopy.addAll(metricTransformations);
        this.metricTransformations = metricTransformationsCopy;
    }
    
    /**
     * Sets the value of the MetricTransformations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param metricTransformations The new value for the MetricTransformations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilter withMetricTransformations(MetricTransformation... metricTransformations) {
        if (getMetricTransformations() == null) setMetricTransformations(new java.util.ArrayList<MetricTransformation>(metricTransformations.length));
        for (MetricTransformation value : metricTransformations) {
            getMetricTransformations().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the MetricTransformations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param metricTransformations The new value for the MetricTransformations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilter withMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        if (metricTransformations == null) {
            this.metricTransformations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation> metricTransformationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricTransformation>(metricTransformations.size());
            metricTransformationsCopy.addAll(metricTransformations);
            this.metricTransformations = metricTransformationsCopy;
        }

        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getCreationTime() {
        return creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilter withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
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
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getMetricTransformations() != null) sb.append("MetricTransformations: " + getMetricTransformations() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode()); 
        hashCode = prime * hashCode + ((getMetricTransformations() == null) ? 0 : getMetricTransformations().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MetricFilter == false) return false;
        MetricFilter other = (MetricFilter)obj;
        
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getMetricTransformations() == null ^ this.getMetricTransformations() == null) return false;
        if (other.getMetricTransformations() != null && other.getMetricTransformations().equals(this.getMetricTransformations()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        return true;
    }
    
}
    