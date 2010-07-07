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
 * Metric
 */
public class Metric {

    private String measureName;

    private java.util.List<Dimension> dimensions;

    private String namespace;

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
    public Metric withMeasureName(String measureName) {
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
    public Metric withDimensions(Dimension... dimensions) {
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
    public Metric withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

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
    public Metric withNamespace(String namespace) {
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
        sb.append("MeasureName: " + measureName + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    