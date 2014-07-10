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
 * Metric Transformation
 */
public class MetricTransformation implements Serializable {

    /**
     * The name of the CloudWatch metric to which the monitored log
     * information should be published. For example, you may publish to a
     * metric called ErrorCount.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     */
    private String metricName;

    /**
     * The destination namespace of the new CloudWatch metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     */
    private String metricNamespace;

    /**
     * What to publish to the metric. For example, if you're counting the
     * occurrences of a particular term like "Error", the value will be "1"
     * for each occurrence. If you're counting the bytes transferred the
     * published value will be the value in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String metricValue;

    /**
     * The name of the CloudWatch metric to which the monitored log
     * information should be published. For example, you may publish to a
     * metric called ErrorCount.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @return The name of the CloudWatch metric to which the monitored log
     *         information should be published. For example, you may publish to a
     *         metric called ErrorCount.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name of the CloudWatch metric to which the monitored log
     * information should be published. For example, you may publish to a
     * metric called ErrorCount.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricName The name of the CloudWatch metric to which the monitored log
     *         information should be published. For example, you may publish to a
     *         metric called ErrorCount.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name of the CloudWatch metric to which the monitored log
     * information should be published. For example, you may publish to a
     * metric called ErrorCount.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricName The name of the CloudWatch metric to which the monitored log
     *         information should be published. For example, you may publish to a
     *         metric called ErrorCount.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricTransformation withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * The destination namespace of the new CloudWatch metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @return The destination namespace of the new CloudWatch metric.
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }
    
    /**
     * The destination namespace of the new CloudWatch metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricNamespace The destination namespace of the new CloudWatch metric.
     */
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }
    
    /**
     * The destination namespace of the new CloudWatch metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricNamespace The destination namespace of the new CloudWatch metric.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricTransformation withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * What to publish to the metric. For example, if you're counting the
     * occurrences of a particular term like "Error", the value will be "1"
     * for each occurrence. If you're counting the bytes transferred the
     * published value will be the value in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return What to publish to the metric. For example, if you're counting the
     *         occurrences of a particular term like "Error", the value will be "1"
     *         for each occurrence. If you're counting the bytes transferred the
     *         published value will be the value in the log event.
     */
    public String getMetricValue() {
        return metricValue;
    }
    
    /**
     * What to publish to the metric. For example, if you're counting the
     * occurrences of a particular term like "Error", the value will be "1"
     * for each occurrence. If you're counting the bytes transferred the
     * published value will be the value in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param metricValue What to publish to the metric. For example, if you're counting the
     *         occurrences of a particular term like "Error", the value will be "1"
     *         for each occurrence. If you're counting the bytes transferred the
     *         published value will be the value in the log event.
     */
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }
    
    /**
     * What to publish to the metric. For example, if you're counting the
     * occurrences of a particular term like "Error", the value will be "1"
     * for each occurrence. If you're counting the bytes transferred the
     * published value will be the value in the log event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param metricValue What to publish to the metric. For example, if you're counting the
     *         occurrences of a particular term like "Error", the value will be "1"
     *         for each occurrence. If you're counting the bytes transferred the
     *         published value will be the value in the log event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricTransformation withMetricValue(String metricValue) {
        this.metricValue = metricValue;
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
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getMetricNamespace() != null) sb.append("MetricNamespace: " + getMetricNamespace() + ",");
        if (getMetricValue() != null) sb.append("MetricValue: " + getMetricValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MetricTransformation == false) return false;
        MetricTransformation other = (MetricTransformation)obj;
        
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null) return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false) return false; 
        if (other.getMetricValue() == null ^ this.getMetricValue() == null) return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false) return false; 
        return true;
    }
    
}
    