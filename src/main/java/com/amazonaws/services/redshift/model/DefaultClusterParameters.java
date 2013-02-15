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
package com.amazonaws.services.redshift.model;

/**
 * <p>
 * Describes the default cluster parameters for a parameter group family.
 * </p>
 */
public class DefaultClusterParameters {

    /**
     * The name of the cluster parameter group family to which the engine
     * default parameters apply.
     */
    private String parameterGroupFamily;

    /**
     * An identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * The list of cluster default parameters.
     */
    private java.util.List<Parameter> parameters;

    /**
     * The name of the cluster parameter group family to which the engine
     * default parameters apply.
     *
     * @return The name of the cluster parameter group family to which the engine
     *         default parameters apply.
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family to which the engine
     * default parameters apply.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family to which the engine
     *         default parameters apply.
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family to which the engine
     * default parameters apply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family to which the engine
     *         default parameters apply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DefaultClusterParameters withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }
    
    
    /**
     * An identifier to allow retrieval of paginated results.
     *
     * @return An identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An identifier to allow retrieval of paginated results.
     *
     * @param marker An identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DefaultClusterParameters withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * The list of cluster default parameters.
     *
     * @return The list of cluster default parameters.
     */
    public java.util.List<Parameter> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * The list of cluster default parameters.
     *
     * @param parameters The list of cluster default parameters.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * The list of cluster default parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters The list of cluster default parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DefaultClusterParameters withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * The list of cluster default parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters The list of cluster default parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DefaultClusterParameters withParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
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
        if (getParameterGroupFamily() != null) sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ", ");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ", ");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefaultClusterParameters == false) return false;
        DefaultClusterParameters other = (DefaultClusterParameters)obj;
        
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null) return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
}
    