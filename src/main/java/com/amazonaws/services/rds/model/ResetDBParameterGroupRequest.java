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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#resetDBParameterGroup(ResetDBParameterGroupRequest) ResetDBParameterGroup operation}.
 * <p>
 * This API modifies the parameters of a DBParameterGroup to the
 * engine/system default value. To reset specific parameters submit a
 * list of the following: ParameterName and ApplyMethod. To reset the
 * entire DBParameterGroup specify the DBParameterGroup name and
 * ResetAllParameters parameters. When resetting the entire group,
 * dynamic parameters are updated immediately and static parameters are
 * set to pending-reboot to take effect on the next MySQL reboot or
 * RebootDBInstance request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#resetDBParameterGroup(ResetDBParameterGroupRequest)
 */
public class ResetDBParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Parameter Group.
     */
    private String dBParameterGroupName;

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the DB Parameter Group to default values.
     */
    private Boolean resetAllParameters;

    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     */
    private java.util.List<Parameter> parameters;

    /**
     * The name of the DB Parameter Group.
     *
     * @return The name of the DB Parameter Group.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the DB Parameter Group to default values.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the DB Parameter Group to default values.
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the DB Parameter Group to default values.
     *
     * @param resetAllParameters Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the DB Parameter Group to default values.
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the DB Parameter Group to default values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the DB Parameter Group to default values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetDBParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the DB Parameter Group to default values.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the DB Parameter Group to default values.
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     *
     * @return An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetDBParameterGroupRequest withParameters(Parameter... parameters) {
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("ResetAllParameters: " + resetAllParameters + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    