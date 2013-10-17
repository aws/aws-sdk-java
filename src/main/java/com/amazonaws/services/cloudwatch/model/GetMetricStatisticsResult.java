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
 * The output for the GetMetricStatistics action.
 * </p>
 */
public class GetMetricStatisticsResult implements Serializable {

    /**
     * A label describing the specified metric.
     */
    private String label;

    /**
     * The datapoints for the specified metric.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint> datapoints;

    /**
     * A label describing the specified metric.
     *
     * @return A label describing the specified metric.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * A label describing the specified metric.
     *
     * @param label A label describing the specified metric.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * A label describing the specified metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label A label describing the specified metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsResult withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The datapoints for the specified metric.
     *
     * @return The datapoints for the specified metric.
     */
    public java.util.List<Datapoint> getDatapoints() {
        if (datapoints == null) {
              datapoints = new com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint>();
              datapoints.setAutoConstruct(true);
        }
        return datapoints;
    }
    
    /**
     * The datapoints for the specified metric.
     *
     * @param datapoints The datapoints for the specified metric.
     */
    public void setDatapoints(java.util.Collection<Datapoint> datapoints) {
        if (datapoints == null) {
            this.datapoints = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint> datapointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint>(datapoints.size());
        datapointsCopy.addAll(datapoints);
        this.datapoints = datapointsCopy;
    }
    
    /**
     * The datapoints for the specified metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datapoints The datapoints for the specified metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsResult withDatapoints(Datapoint... datapoints) {
        if (getDatapoints() == null) setDatapoints(new java.util.ArrayList<Datapoint>(datapoints.length));
        for (Datapoint value : datapoints) {
            getDatapoints().add(value);
        }
        return this;
    }
    
    /**
     * The datapoints for the specified metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datapoints The datapoints for the specified metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetMetricStatisticsResult withDatapoints(java.util.Collection<Datapoint> datapoints) {
        if (datapoints == null) {
            this.datapoints = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint> datapointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Datapoint>(datapoints.size());
            datapointsCopy.addAll(datapoints);
            this.datapoints = datapointsCopy;
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
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getDatapoints() != null) sb.append("Datapoints: " + getDatapoints() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        hashCode = prime * hashCode + ((getDatapoints() == null) ? 0 : getDatapoints().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetMetricStatisticsResult == false) return false;
        GetMetricStatisticsResult other = (GetMetricStatisticsResult)obj;
        
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getDatapoints() == null ^ this.getDatapoints() == null) return false;
        if (other.getDatapoints() != null && other.getDatapoints().equals(this.getDatapoints()) == false) return false; 
        return true;
    }
    
}
    