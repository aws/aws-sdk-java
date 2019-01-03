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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     * name-value pairs of the parameter are optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     * wlm_json_configuration parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to be modified.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     * 
     * @return The name of the parameter group to be modified.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     * name-value pairs of the parameter are optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     * wlm_json_configuration parameter.
     * </p>
     * 
     * @return An array of parameters to be modified. A maximum of 20 parameters can be modified in a single
     *         request.</p>
     *         <p>
     *         For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     *         name-value pairs of the parameter are optional.
     *         </p>
     *         <p>
     *         For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     *         wlm_json_configuration parameter.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     * name-value pairs of the parameter are optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     * wlm_json_configuration parameter.
     * </p>
     * 
     * @param parameters
     *        An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     *        name-value pairs of the parameter are optional.
     *        </p>
     *        <p>
     *        For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     *        wlm_json_configuration parameter.
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
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     * name-value pairs of the parameter are optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     * wlm_json_configuration parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     *        name-value pairs of the parameter are optional.
     *        </p>
     *        <p>
     *        For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     *        wlm_json_configuration parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterParameterGroupRequest withParameters(Parameter... parameters) {
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
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     * name-value pairs of the parameter are optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     * wlm_json_configuration parameter.
     * </p>
     * 
     * @param parameters
     *        An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        For each parameter to be modified, you must supply at least the parameter name and parameter value; other
     *        name-value pairs of the parameter are optional.
     *        </p>
     *        <p>
     *        For the workload management (WLM) configuration, you must supply all the name-value pairs in the
     *        wlm_json_configuration parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterParameterGroupRequest == false)
            return false;
        ModifyClusterParameterGroupRequest other = (ModifyClusterParameterGroupRequest) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterParameterGroupRequest clone() {
        return (ModifyClusterParameterGroupRequest) super.clone();
    }

}
