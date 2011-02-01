/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBParameterGroup(ModifyDBParameterGroupRequest) ModifyDBParameterGroup operation}.
 * <p>
 * This API modifies the parameters of a DBParameterGroup. To modify
 * more than one parameter submit a list of the following: ParameterName,
 * ParameterValue, and ApplyMethod. A maximum of 20 parameters can be
 * modified in a single request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBParameterGroup(ModifyDBParameterGroupRequest)
 */
public class ModifyDBParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the database parameter group. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     */
    private String dBParameterGroupName;

    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p>Valid Values (for
     * the application method): <code>immediate | pending-reboot</code>
     * <note>You can use the immediate value with dynamic parameters only.
     * You can use the pending-reboot value for both dynamic and static
     * parameters, and changes are applied when DB Instance reboots. </note>
     */
    private java.util.List<Parameter> parameters;

    /**
     * Default constructor for a new ModifyDBParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyDBParameterGroupRequest() {}
    
    /**
     * Constructs a new ModifyDBParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupName The name of the database parameter group.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * @param parameters An array of parameter names, values, and the apply
     * method for the parameter update. At least one parameter name, value,
     * and apply method must be supplied; subsequent arguments are optional.
     * A maximum of 20 parameters may be modified in a single request.
     * <p>Valid Values (for the application method): <code>immediate |
     * pending-reboot</code> <note>You can use the immediate value with
     * dynamic parameters only. You can use the pending-reboot value for both
     * dynamic and static parameters, and changes are applied when DB
     * Instance reboots. </note>
     */
    public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<Parameter> parameters) {
        this.dBParameterGroupName = dBParameterGroupName;
        this.parameters = parameters;
    }
    
    /**
     * The name of the database parameter group. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @return The name of the database parameter group. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the database parameter group. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @param dBParameterGroupName The name of the database parameter group. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the database parameter group. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the database parameter group. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p>Valid Values (for
     * the application method): <code>immediate | pending-reboot</code>
     * <note>You can use the immediate value with dynamic parameters only.
     * You can use the pending-reboot value for both dynamic and static
     * parameters, and changes are applied when DB Instance reboots. </note>
     *
     * @return An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p>Valid Values (for
     *         the application method): <code>immediate | pending-reboot</code>
     *         <note>You can use the immediate value with dynamic parameters only.
     *         You can use the pending-reboot value for both dynamic and static
     *         parameters, and changes are applied when DB Instance reboots. </note>
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
     * parameters may be modified in a single request. <p>Valid Values (for
     * the application method): <code>immediate | pending-reboot</code>
     * <note>You can use the immediate value with dynamic parameters only.
     * You can use the pending-reboot value for both dynamic and static
     * parameters, and changes are applied when DB Instance reboots. </note>
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p>Valid Values (for
     *         the application method): <code>immediate | pending-reboot</code>
     *         <note>You can use the immediate value with dynamic parameters only.
     *         You can use the pending-reboot value for both dynamic and static
     *         parameters, and changes are applied when DB Instance reboots. </note>
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
     * parameters may be modified in a single request. <p>Valid Values (for
     * the application method): <code>immediate | pending-reboot</code>
     * <note>You can use the immediate value with dynamic parameters only.
     * You can use the pending-reboot value for both dynamic and static
     * parameters, and changes are applied when DB Instance reboots. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p>Valid Values (for
     *         the application method): <code>immediate | pending-reboot</code>
     *         <note>You can use the immediate value with dynamic parameters only.
     *         You can use the pending-reboot value for both dynamic and static
     *         parameters, and changes are applied when DB Instance reboots. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBParameterGroupRequest withParameters(Parameter... parameters) {
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p>Valid Values (for
     * the application method): <code>immediate | pending-reboot</code>
     * <note>You can use the immediate value with dynamic parameters only.
     * You can use the pending-reboot value for both dynamic and static
     * parameters, and changes are applied when DB Instance reboots. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p>Valid Values (for
     *         the application method): <code>immediate | pending-reboot</code>
     *         <note>You can use the immediate value with dynamic parameters only.
     *         You can use the pending-reboot value for both dynamic and static
     *         parameters, and changes are applied when DB Instance reboots. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        sb.append("Parameters: " + parameters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    