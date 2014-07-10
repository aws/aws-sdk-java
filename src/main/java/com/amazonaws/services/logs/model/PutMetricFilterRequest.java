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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#putMetricFilter(PutMetricFilterRequest) PutMetricFilter operation}.
 * <p>
 * Creates or updates a metric filter and associates it with the
 * specified log group. Metric filters allow you to configure rules to
 * extract metric data from log events ingested through
 * <code>PutLogEvents</code> requests.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#putMetricFilter(PutMetricFilterRequest)
 */
public class PutMetricFilterRequest extends AmazonWebServiceRequest implements Serializable {

    private String logGroupName;

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
     * Default constructor for a new PutMetricFilterRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutMetricFilterRequest() {}
    
    /**
     * Constructs a new PutMetricFilterRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     * @param filterName The name of the metric filter.
     * @param filterPattern A symbolic description of how Amazon CloudWatch
     * Logs should interpret the data in each log entry. For example, a log
     * entry may contain timestamps, IP addresses, strings, and so on. You
     * use the pattern to specify what to look for in the log stream.
     * @param metricTransformations
     */
    public PutMetricFilterRequest(String logGroupName, String filterName, String filterPattern, java.util.List<MetricTransformation> metricTransformations) {
        setLogGroupName(logGroupName);
        setFilterName(filterName);
        setFilterPattern(filterPattern);
        setMetricTransformations(metricTransformations);
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMetricFilterRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

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
    public PutMetricFilterRequest withFilterName(String filterName) {
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
    public PutMetricFilterRequest withFilterPattern(String filterPattern) {
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
    public PutMetricFilterRequest withMetricTransformations(MetricTransformation... metricTransformations) {
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
    public PutMetricFilterRequest withMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getMetricTransformations() != null) sb.append("MetricTransformations: " + getMetricTransformations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode()); 
        hashCode = prime * hashCode + ((getMetricTransformations() == null) ? 0 : getMetricTransformations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutMetricFilterRequest == false) return false;
        PutMetricFilterRequest other = (PutMetricFilterRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getMetricTransformations() == null ^ this.getMetricTransformations() == null) return false;
        if (other.getMetricTransformations() != null && other.getMetricTransformations().equals(this.getMetricTransformations()) == false) return false; 
        return true;
    }
    
}
    