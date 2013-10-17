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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents the output of a <i>DescribeEngineDefaultParameters</i> operation.
 * </p>
 */
public class EngineDefaults implements Serializable {

    /**
     * Specifies the name of the cache parameter group family to which the
     * engine default parameters apply.
     */
    private String cacheParameterGroupFamily;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * Contains a list of engine default parameters.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters;

    /**
     * Specifies the name of the cache parameter group family to which the
     * engine default parameters apply.
     *
     * @return Specifies the name of the cache parameter group family to which the
     *         engine default parameters apply.
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * Specifies the name of the cache parameter group family to which the
     * engine default parameters apply.
     *
     * @param cacheParameterGroupFamily Specifies the name of the cache parameter group family to which the
     *         engine default parameters apply.
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * Specifies the name of the cache parameter group family to which the
     * engine default parameters apply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily Specifies the name of the cache parameter group family to which the
     *         engine default parameters apply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EngineDefaults withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
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
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * Contains a list of engine default parameters.
     *
     * @param parameters Contains a list of engine default parameters.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
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
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
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
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }

    /**
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     *
     * @return A list of parameters specific to a particular cache node type. Each
     *         element in the list contains detailed information about one parameter.
     */
    public java.util.List<CacheNodeTypeSpecificParameter> getCacheNodeTypeSpecificParameters() {
        if (cacheNodeTypeSpecificParameters == null) {
              cacheNodeTypeSpecificParameters = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter>();
              cacheNodeTypeSpecificParameters.setAutoConstruct(true);
        }
        return cacheNodeTypeSpecificParameters;
    }
    
    /**
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     *
     * @param cacheNodeTypeSpecificParameters A list of parameters specific to a particular cache node type. Each
     *         element in the list contains detailed information about one parameter.
     */
    public void setCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        if (cacheNodeTypeSpecificParameters == null) {
            this.cacheNodeTypeSpecificParameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter>(cacheNodeTypeSpecificParameters.size());
        cacheNodeTypeSpecificParametersCopy.addAll(cacheNodeTypeSpecificParameters);
        this.cacheNodeTypeSpecificParameters = cacheNodeTypeSpecificParametersCopy;
    }
    
    /**
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificParameters A list of parameters specific to a particular cache node type. Each
     *         element in the list contains detailed information about one parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EngineDefaults withCacheNodeTypeSpecificParameters(CacheNodeTypeSpecificParameter... cacheNodeTypeSpecificParameters) {
        if (getCacheNodeTypeSpecificParameters() == null) setCacheNodeTypeSpecificParameters(new java.util.ArrayList<CacheNodeTypeSpecificParameter>(cacheNodeTypeSpecificParameters.length));
        for (CacheNodeTypeSpecificParameter value : cacheNodeTypeSpecificParameters) {
            getCacheNodeTypeSpecificParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificParameters A list of parameters specific to a particular cache node type. Each
     *         element in the list contains detailed information about one parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EngineDefaults withCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        if (cacheNodeTypeSpecificParameters == null) {
            this.cacheNodeTypeSpecificParameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificParameter>(cacheNodeTypeSpecificParameters.size());
            cacheNodeTypeSpecificParametersCopy.addAll(cacheNodeTypeSpecificParameters);
            this.cacheNodeTypeSpecificParameters = cacheNodeTypeSpecificParametersCopy;
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
        if (getCacheParameterGroupFamily() != null) sb.append("CacheParameterGroupFamily: " + getCacheParameterGroupFamily() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getCacheNodeTypeSpecificParameters() != null) sb.append("CacheNodeTypeSpecificParameters: " + getCacheNodeTypeSpecificParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeTypeSpecificParameters() == null) ? 0 : getCacheNodeTypeSpecificParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EngineDefaults == false) return false;
        EngineDefaults other = (EngineDefaults)obj;
        
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null) return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getCacheNodeTypeSpecificParameters() == null ^ this.getCacheNodeTypeSpecificParameters() == null) return false;
        if (other.getCacheNodeTypeSpecificParameters() != null && other.getCacheNodeTypeSpecificParameters().equals(this.getCacheNodeTypeSpecificParameters()) == false) return false; 
        return true;
    }
    
}
    