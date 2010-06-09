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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * 
 * </p>
 */
public class EngineDefaults {

    /**
     * Specifies the name of the database engine which the engine default
     * parameters apply to.
     */
    private String engine;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * Contains a list of engine default parameters.
     */
    private java.util.List<Parameter> parameters;

    /**
     * Specifies the name of the database engine which the engine default
     * parameters apply to.
     *
     * @return Specifies the name of the database engine which the engine default
     *         parameters apply to.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Specifies the name of the database engine which the engine default
     * parameters apply to.
     *
     * @param engine Specifies the name of the database engine which the engine default
     *         parameters apply to.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Specifies the name of the database engine which the engine default
     * parameters apply to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Specifies the name of the database engine which the engine default
     *         parameters apply to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EngineDefaults withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EngineDefaults withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Contains a list of engine default parameters.
     *
     * @return Contains a list of engine default parameters.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * Contains a list of engine default parameters.
     *
     * @param parameters Contains a list of engine default parameters.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * Contains a list of engine default parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters Contains a list of engine default parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EngineDefaults withParameters(Parameter... parameters) {
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of engine default parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters Contains a list of engine default parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EngineDefaults withParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

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
        
        sb.append("Engine: " + engine + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    