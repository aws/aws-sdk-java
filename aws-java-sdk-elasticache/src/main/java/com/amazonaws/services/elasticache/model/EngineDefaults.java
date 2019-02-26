/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeEngineDefaultParameters</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/EngineDefaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineDefaults implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the cache parameter group family to which the engine default parameters apply.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     */
    private String cacheParameterGroupFamily;
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Contains a list of engine default parameters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     * information about one parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters;

    /**
     * <p>
     * Specifies the name of the cache parameter group family to which the engine default parameters apply.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        Specifies the name of the cache parameter group family to which the engine default parameters apply.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *        <code>redis3.2</code> | <code>redis4.0</code>
     */

    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    /**
     * <p>
     * Specifies the name of the cache parameter group family to which the engine default parameters apply.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @return Specifies the name of the cache parameter group family to which the engine default parameters apply.</p>
     *         <p>
     *         Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *         <code>redis3.2</code> | <code>redis4.0</code>
     */

    public String getCacheParameterGroupFamily() {
        return this.cacheParameterGroupFamily;
    }

    /**
     * <p>
     * Specifies the name of the cache parameter group family to which the engine default parameters apply.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     * <code>redis3.2</code> | <code>redis4.0</code>
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        Specifies the name of the cache parameter group family to which the engine default parameters apply.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>redis2.6</code> | <code>redis2.8</code> |
     *        <code>redis3.2</code> | <code>redis4.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Contains a list of engine default parameters.
     * </p>
     * 
     * @return Contains a list of engine default parameters.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * Contains a list of engine default parameters.
     * </p>
     * 
     * @param parameters
     *        Contains a list of engine default parameters.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * Contains a list of engine default parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Contains a list of engine default parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of engine default parameters.
     * </p>
     * 
     * @param parameters
     *        Contains a list of engine default parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     * information about one parameter.
     * </p>
     * 
     * @return A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     *         information about one parameter.
     */

    public java.util.List<CacheNodeTypeSpecificParameter> getCacheNodeTypeSpecificParameters() {
        if (cacheNodeTypeSpecificParameters == null) {
            cacheNodeTypeSpecificParameters = new com.amazonaws.internal.SdkInternalList<CacheNodeTypeSpecificParameter>();
        }
        return cacheNodeTypeSpecificParameters;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     * information about one parameter.
     * </p>
     * 
     * @param cacheNodeTypeSpecificParameters
     *        A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     *        information about one parameter.
     */

    public void setCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        if (cacheNodeTypeSpecificParameters == null) {
            this.cacheNodeTypeSpecificParameters = null;
            return;
        }

        this.cacheNodeTypeSpecificParameters = new com.amazonaws.internal.SdkInternalList<CacheNodeTypeSpecificParameter>(cacheNodeTypeSpecificParameters);
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     * information about one parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeTypeSpecificParameters(java.util.Collection)} or
     * {@link #withCacheNodeTypeSpecificParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeTypeSpecificParameters
     *        A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     *        information about one parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withCacheNodeTypeSpecificParameters(CacheNodeTypeSpecificParameter... cacheNodeTypeSpecificParameters) {
        if (this.cacheNodeTypeSpecificParameters == null) {
            setCacheNodeTypeSpecificParameters(new com.amazonaws.internal.SdkInternalList<CacheNodeTypeSpecificParameter>(
                    cacheNodeTypeSpecificParameters.length));
        }
        for (CacheNodeTypeSpecificParameter ele : cacheNodeTypeSpecificParameters) {
            this.cacheNodeTypeSpecificParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     * information about one parameter.
     * </p>
     * 
     * @param cacheNodeTypeSpecificParameters
     *        A list of parameters specific to a particular cache node type. Each element in the list contains detailed
     *        information about one parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        setCacheNodeTypeSpecificParameters(cacheNodeTypeSpecificParameters);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: ").append(getCacheParameterGroupFamily()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCacheNodeTypeSpecificParameters() != null)
            sb.append("CacheNodeTypeSpecificParameters: ").append(getCacheNodeTypeSpecificParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineDefaults == false)
            return false;
        EngineDefaults other = (EngineDefaults) obj;
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCacheNodeTypeSpecificParameters() == null ^ this.getCacheNodeTypeSpecificParameters() == null)
            return false;
        if (other.getCacheNodeTypeSpecificParameters() != null
                && other.getCacheNodeTypeSpecificParameters().equals(this.getCacheNodeTypeSpecificParameters()) == false)
            return false;
        return true;
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
    public EngineDefaults clone() {
        try {
            return (EngineDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
