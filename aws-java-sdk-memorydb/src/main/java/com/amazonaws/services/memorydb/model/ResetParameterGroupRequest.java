/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ResetParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter group to reset.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters
     * listed by ParameterNames are reset to their default values.
     * </p>
     */
    private Boolean allParameters;
    /**
     * <p>
     * An array of parameter names to reset to their default values. If AllParameters is true, do not use
     * ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * </p>
     */
    private java.util.List<String> parameterNames;

    /**
     * <p>
     * The name of the parameter group to reset.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to reset.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to reset.
     * </p>
     * 
     * @return The name of the parameter group to reset.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to reset.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters
     * listed by ParameterNames are reset to their default values.
     * </p>
     * 
     * @param allParameters
     *        If true, all parameters in the parameter group are reset to their default values. If false, only the
     *        parameters listed by ParameterNames are reset to their default values.
     */

    public void setAllParameters(Boolean allParameters) {
        this.allParameters = allParameters;
    }

    /**
     * <p>
     * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters
     * listed by ParameterNames are reset to their default values.
     * </p>
     * 
     * @return If true, all parameters in the parameter group are reset to their default values. If false, only the
     *         parameters listed by ParameterNames are reset to their default values.
     */

    public Boolean getAllParameters() {
        return this.allParameters;
    }

    /**
     * <p>
     * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters
     * listed by ParameterNames are reset to their default values.
     * </p>
     * 
     * @param allParameters
     *        If true, all parameters in the parameter group are reset to their default values. If false, only the
     *        parameters listed by ParameterNames are reset to their default values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetParameterGroupRequest withAllParameters(Boolean allParameters) {
        setAllParameters(allParameters);
        return this;
    }

    /**
     * <p>
     * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters
     * listed by ParameterNames are reset to their default values.
     * </p>
     * 
     * @return If true, all parameters in the parameter group are reset to their default values. If false, only the
     *         parameters listed by ParameterNames are reset to their default values.
     */

    public Boolean isAllParameters() {
        return this.allParameters;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If AllParameters is true, do not use
     * ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * </p>
     * 
     * @return An array of parameter names to reset to their default values. If AllParameters is true, do not use
     *         ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     */

    public java.util.List<String> getParameterNames() {
        return parameterNames;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If AllParameters is true, do not use
     * ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * </p>
     * 
     * @param parameterNames
     *        An array of parameter names to reset to their default values. If AllParameters is true, do not use
     *        ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     */

    public void setParameterNames(java.util.Collection<String> parameterNames) {
        if (parameterNames == null) {
            this.parameterNames = null;
            return;
        }

        this.parameterNames = new java.util.ArrayList<String>(parameterNames);
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If AllParameters is true, do not use
     * ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterNames(java.util.Collection)} or {@link #withParameterNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param parameterNames
     *        An array of parameter names to reset to their default values. If AllParameters is true, do not use
     *        ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetParameterGroupRequest withParameterNames(String... parameterNames) {
        if (this.parameterNames == null) {
            setParameterNames(new java.util.ArrayList<String>(parameterNames.length));
        }
        for (String ele : parameterNames) {
            this.parameterNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If AllParameters is true, do not use
     * ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * </p>
     * 
     * @param parameterNames
     *        An array of parameter names to reset to their default values. If AllParameters is true, do not use
     *        ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetParameterGroupRequest withParameterNames(java.util.Collection<String> parameterNames) {
        setParameterNames(parameterNames);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getAllParameters() != null)
            sb.append("AllParameters: ").append(getAllParameters()).append(",");
        if (getParameterNames() != null)
            sb.append("ParameterNames: ").append(getParameterNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetParameterGroupRequest == false)
            return false;
        ResetParameterGroupRequest other = (ResetParameterGroupRequest) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getAllParameters() == null ^ this.getAllParameters() == null)
            return false;
        if (other.getAllParameters() != null && other.getAllParameters().equals(this.getAllParameters()) == false)
            return false;
        if (other.getParameterNames() == null ^ this.getParameterNames() == null)
            return false;
        if (other.getParameterNames() != null && other.getParameterNames().equals(this.getParameterNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getAllParameters() == null) ? 0 : getAllParameters().hashCode());
        hashCode = prime * hashCode + ((getParameterNames() == null) ? 0 : getParameterNames().hashCode());
        return hashCode;
    }

    @Override
    public ResetParameterGroupRequest clone() {
        return (ResetParameterGroupRequest) super.clone();
    }

}
