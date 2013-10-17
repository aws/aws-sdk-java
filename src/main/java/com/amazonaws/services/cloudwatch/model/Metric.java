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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>Metric</code> data type contains information about a specific metric. If you call ListMetrics, Amazon CloudWatch returns information
 * contained by this data type.
 * </p>
 */
public class Metric implements Serializable {

    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensions;

    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace of the metric.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace of the metric.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Metric withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the metric.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Metric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of dimensions associated with the metric.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
              dimensions = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>();
              dimensions.setAutoConstruct(true);
        }
        return dimensions;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
        dimensionsCopy.addAll(dimensions);
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Metric withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Metric withDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
            dimensionsCopy.addAll(dimensions);
            this.dimensions = dimensionsCopy;
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
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null) sb.append("Dimensions: " + getDimensions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Metric == false) return false;
        Metric other = (Metric)obj;
        
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getDimensions() == null ^ this.getDimensions() == null) return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false) return false; 
        return true;
    }
    
}
    