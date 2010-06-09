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

/**
 * Get Metric Statistics Result
 */
public class GetMetricStatisticsResult {

    private String label;

    private java.util.List<Datapoint> datapoints;

    /**
     * Returns the value of the Label property for this object.
     *
     * @return The value of the Label property for this object.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * Sets the value of the Label property for this object.
     *
     * @param label The new value for the Label property for this object.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * Sets the value of the Label property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label The new value for the Label property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsResult withLabel(String label) {
        this.label = label;
        return this;
    }
    
    
    /**
     * Returns the value of the Datapoints property for this object.
     *
     * @return The value of the Datapoints property for this object.
     */
    public java.util.List<Datapoint> getDatapoints() {
        if (datapoints == null) {
            datapoints = new java.util.ArrayList<Datapoint>();
        }
        return datapoints;
    }
    
    /**
     * Sets the value of the Datapoints property for this object.
     *
     * @param datapoints The new value for the Datapoints property for this object.
     */
    public void setDatapoints(java.util.Collection<Datapoint> datapoints) {
        java.util.List<Datapoint> datapointsCopy = new java.util.ArrayList<Datapoint>();
        if (datapoints != null) {
            datapointsCopy.addAll(datapoints);
        }
        this.datapoints = datapointsCopy;
    }
    
    /**
     * Sets the value of the Datapoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datapoints The new value for the Datapoints property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsResult withDatapoints(Datapoint... datapoints) {
        for (Datapoint value : datapoints) {
            getDatapoints().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Datapoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datapoints The new value for the Datapoints property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetMetricStatisticsResult withDatapoints(java.util.Collection<Datapoint> datapoints) {
        java.util.List<Datapoint> datapointsCopy = new java.util.ArrayList<Datapoint>();
        if (datapoints != null) {
            datapointsCopy.addAll(datapoints);
        }
        this.datapoints = datapointsCopy;

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
        
        sb.append("Label: " + label + ", ");
        sb.append("Datapoints: " + datapoints + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    