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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBClusterParameterGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDBClusterParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to their
     * default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of parameter
     * names specified for the <code>Parameters</code> parameter.
     * </p>
     */
    private Boolean resetAllParameters;
    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this
     * parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to reset.
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     * 
     * @return The name of the DB cluster parameter group to reset.
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBClusterParameterGroupRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to their
     * default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of parameter
     * names specified for the <code>Parameters</code> parameter.
     * </p>
     * 
     * @param resetAllParameters
     *        A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to
     *        their default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of
     *        parameter names specified for the <code>Parameters</code> parameter.
     */

    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to their
     * default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of parameter
     * names specified for the <code>Parameters</code> parameter.
     * </p>
     * 
     * @return A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to
     *         their default values, and <code>false</code> otherwise. You can't use this parameter if there is a list
     *         of parameter names specified for the <code>Parameters</code> parameter.
     */

    public Boolean getResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to their
     * default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of parameter
     * names specified for the <code>Parameters</code> parameter.
     * </p>
     * 
     * @param resetAllParameters
     *        A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to
     *        their default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of
     *        parameter names specified for the <code>Parameters</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBClusterParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        setResetAllParameters(resetAllParameters);
        return this;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to their
     * default values, and <code>false</code> otherwise. You can't use this parameter if there is a list of parameter
     * names specified for the <code>Parameters</code> parameter.
     * </p>
     * 
     * @return A value that is set to <code>true</code> to reset all parameters in the DB cluster parameter group to
     *         their default values, and <code>false</code> otherwise. You can't use this parameter if there is a list
     *         of parameter names specified for the <code>Parameters</code> parameter.
     */

    public Boolean isResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this
     * parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use
     *         this parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this
     * parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param parameters
     *        A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use
     *        this parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
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
     * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this
     * parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use
     *        this parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBClusterParameterGroupRequest withParameters(Parameter... parameters) {
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
     * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this
     * parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param parameters
     *        A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use
     *        this parameter if the <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBClusterParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: ").append(getResetAllParameters()).append(",");
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

        if (obj instanceof ResetDBClusterParameterGroupRequest == false)
            return false;
        ResetDBClusterParameterGroupRequest other = (ResetDBClusterParameterGroupRequest) obj;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null && other.getResetAllParameters().equals(this.getResetAllParameters()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getResetAllParameters() == null) ? 0 : getResetAllParameters().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ResetDBClusterParameterGroupRequest clone() {
        return (ResetDBClusterParameterGroupRequest) super.clone();
    }

}
