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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyCacheParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCacheParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must supply at least one parameter name and
     * value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterNameValue> parameterNameValues;

    /**
     * Default constructor for ModifyCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ModifyCacheParameterGroupRequest() {
    }

    /**
     * Constructs a new ModifyCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to modify.
     * @param parameterNameValues
     *        An array of parameter names and values for the parameter update. You must supply at least one parameter
     *        name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     */
    public ModifyCacheParameterGroupRequest(String cacheParameterGroupName, java.util.List<ParameterNameValue> parameterNameValues) {
        setCacheParameterGroupName(cacheParameterGroupName);
        setParameterNameValues(parameterNameValues);
    }

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to modify.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     * 
     * @return The name of the cache parameter group to modify.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must supply at least one parameter name and
     * value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * 
     * @return An array of parameter names and values for the parameter update. You must supply at least one parameter
     *         name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per
     *         request.
     */

    public java.util.List<ParameterNameValue> getParameterNameValues() {
        if (parameterNameValues == null) {
            parameterNameValues = new com.amazonaws.internal.SdkInternalList<ParameterNameValue>();
        }
        return parameterNameValues;
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must supply at least one parameter name and
     * value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names and values for the parameter update. You must supply at least one parameter
     *        name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     */

    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }

        this.parameterNameValues = new com.amazonaws.internal.SdkInternalList<ParameterNameValue>(parameterNameValues);
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must supply at least one parameter name and
     * value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterNameValues(java.util.Collection)} or {@link #withParameterNameValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names and values for the parameter update. You must supply at least one parameter
     *        name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCacheParameterGroupRequest withParameterNameValues(ParameterNameValue... parameterNameValues) {
        if (this.parameterNameValues == null) {
            setParameterNameValues(new com.amazonaws.internal.SdkInternalList<ParameterNameValue>(parameterNameValues.length));
        }
        for (ParameterNameValue ele : parameterNameValues) {
            this.parameterNameValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must supply at least one parameter name and
     * value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names and values for the parameter update. You must supply at least one parameter
     *        name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCacheParameterGroupRequest withParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        setParameterNameValues(parameterNameValues);
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getParameterNameValues() != null)
            sb.append("ParameterNameValues: ").append(getParameterNameValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCacheParameterGroupRequest == false)
            return false;
        ModifyCacheParameterGroupRequest other = (ModifyCacheParameterGroupRequest) obj;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getParameterNameValues() == null ^ this.getParameterNameValues() == null)
            return false;
        if (other.getParameterNameValues() != null && other.getParameterNameValues().equals(this.getParameterNameValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterNameValues() == null) ? 0 : getParameterNameValues().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCacheParameterGroupRequest clone() {
        return (ModifyCacheParameterGroupRequest) super.clone();
    }

}
