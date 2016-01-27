/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest) ResetDBClusterParameterGroup operation}.
 * <p>
 * Modifies the parameters of a DB cluster parameter group to the
 * default value. To reset specific parameters submit a list of the
 * following: <code>ParameterName</code> and <code>ApplyMethod</code> .
 * To reset the entire DB cluster parameter group, specify the
 * <code>DBClusterParameterGroupName</code> and
 * <code>ResetAllParameters</code> parameters.
 * </p>
 * <p>
 * When resetting the entire group, dynamic parameters are updated
 * immediately and static parameters are set to
 * <code>pending-reboot</code> to take effect on the next DB instance
 * restart or RebootDBInstance request. You must call RebootDBInstance
 * for every DB instance in your DB cluster that you want the updated
 * static parameter to apply to.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest)
 */
public class ResetDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the DB cluster parameter group to reset.
     */
    private String dBClusterParameterGroupName;

    /**
     * A value that is set to <code>true</code> to reset all parameters in
     * the DB cluster parameter group to their default values, and
     * <code>false</code> otherwise. You cannot use this parameter if there
     * is a list of parameter names specified for the <code>Parameters</code>
     * parameter.
     */
    private Boolean resetAllParameters;

    /**
     * A list of parameter names in the DB cluster parameter group to reset
     * to the default values. You cannot use this parameter if the
     * <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * The name of the DB cluster parameter group to reset.
     *
     * @return The name of the DB cluster parameter group to reset.
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to reset.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to reset.
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to reset.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResetDBClusterParameterGroupRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * A value that is set to <code>true</code> to reset all parameters in
     * the DB cluster parameter group to their default values, and
     * <code>false</code> otherwise. You cannot use this parameter if there
     * is a list of parameter names specified for the <code>Parameters</code>
     * parameter.
     *
     * @return A value that is set to <code>true</code> to reset all parameters in
     *         the DB cluster parameter group to their default values, and
     *         <code>false</code> otherwise. You cannot use this parameter if there
     *         is a list of parameter names specified for the <code>Parameters</code>
     *         parameter.
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * A value that is set to <code>true</code> to reset all parameters in
     * the DB cluster parameter group to their default values, and
     * <code>false</code> otherwise. You cannot use this parameter if there
     * is a list of parameter names specified for the <code>Parameters</code>
     * parameter.
     *
     * @param resetAllParameters A value that is set to <code>true</code> to reset all parameters in
     *         the DB cluster parameter group to their default values, and
     *         <code>false</code> otherwise. You cannot use this parameter if there
     *         is a list of parameter names specified for the <code>Parameters</code>
     *         parameter.
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * A value that is set to <code>true</code> to reset all parameters in
     * the DB cluster parameter group to their default values, and
     * <code>false</code> otherwise. You cannot use this parameter if there
     * is a list of parameter names specified for the <code>Parameters</code>
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters A value that is set to <code>true</code> to reset all parameters in
     *         the DB cluster parameter group to their default values, and
     *         <code>false</code> otherwise. You cannot use this parameter if there
     *         is a list of parameter names specified for the <code>Parameters</code>
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResetDBClusterParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * A value that is set to <code>true</code> to reset all parameters in
     * the DB cluster parameter group to their default values, and
     * <code>false</code> otherwise. You cannot use this parameter if there
     * is a list of parameter names specified for the <code>Parameters</code>
     * parameter.
     *
     * @return A value that is set to <code>true</code> to reset all parameters in
     *         the DB cluster parameter group to their default values, and
     *         <code>false</code> otherwise. You cannot use this parameter if there
     *         is a list of parameter names specified for the <code>Parameters</code>
     *         parameter.
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * A list of parameter names in the DB cluster parameter group to reset
     * to the default values. You cannot use this parameter if the
     * <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     *
     * @return A list of parameter names in the DB cluster parameter group to reset
     *         to the default values. You cannot use this parameter if the
     *         <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of parameter names in the DB cluster parameter group to reset
     * to the default values. You cannot use this parameter if the
     * <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     *
     * @param parameters A list of parameter names in the DB cluster parameter group to reset
     *         to the default values. You cannot use this parameter if the
     *         <code>ResetAllParameters</code> parameter is set to <code>true</code>.
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
     * A list of parameter names in the DB cluster parameter group to reset
     * to the default values. You cannot use this parameter if the
     * <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or {@link
     * #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameter names in the DB cluster parameter group to reset
     *         to the default values. You cannot use this parameter if the
     *         <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResetDBClusterParameterGroupRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of parameter names in the DB cluster parameter group to reset
     * to the default values. You cannot use this parameter if the
     * <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameter names in the DB cluster parameter group to reset
     *         to the default values. You cannot use this parameter if the
     *         <code>ResetAllParameters</code> parameter is set to <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResetDBClusterParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        if (getDBClusterParameterGroupName() != null) sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (isResetAllParameters() != null) sb.append("ResetAllParameters: " + isResetAllParameters() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isResetAllParameters() == null) ? 0 : isResetAllParameters().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetDBClusterParameterGroupRequest == false) return false;
        ResetDBClusterParameterGroupRequest other = (ResetDBClusterParameterGroupRequest)obj;
        
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        if (other.isResetAllParameters() == null ^ this.isResetAllParameters() == null) return false;
        if (other.isResetAllParameters() != null && other.isResetAllParameters().equals(this.isResetAllParameters()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
    @Override
    public ResetDBClusterParameterGroupRequest clone() {
        
            return (ResetDBClusterParameterGroupRequest) super.clone();
    }

}
    