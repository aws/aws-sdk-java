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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest) ModifyDBClusterParameterGroup operation}.
 * <p>
 * Modifies the parameters of a DB cluster parameter group. To modify
 * more than one parameter, submit a list of the following:
 * <code>ParameterName</code> ,
 * <code>ParameterValue</code> ,
 * and <code>ApplyMethod</code> . A maximum of 20 parameters
 * can be modified in a single request.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 * <p>
 * <b>NOTE:</b> Changes to dynamic parameters are applied immediately.
 * Changes to static parameters require a reboot without failover to the
 * DB cluster associated with the parameter group before the change can
 * take effect.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> After you create a DB cluster parameter group, you
 * should wait at least 5 minutes before creating your first DB cluster
 * that uses that DB cluster parameter group as the default parameter
 * group. This allows Amazon RDS to fully complete the create action
 * before the parameter group is used as the default for a new DB
 * cluster. This is especially important for parameters that are critical
 * when creating the default database for a DB cluster, such as the
 * character set for the default database defined by the
 * character_set_database parameter. You can use the Parameter Groups
 * option of the Amazon RDS console or the DescribeDBClusterParameters
 * command to verify that your DB cluster parameter group has been
 * created or modified.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest)
 */
public class ModifyDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the DB cluster parameter group to modify.
     */
    private String dBClusterParameterGroupName;

    /**
     * A list of parameters in the DB cluster parameter group to modify.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * The name of the DB cluster parameter group to modify.
     *
     * @return The name of the DB cluster parameter group to modify.
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to modify.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to modify.
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterParameterGroupRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * A list of parameters in the DB cluster parameter group to modify.
     *
     * @return A list of parameters in the DB cluster parameter group to modify.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of parameters in the DB cluster parameter group to modify.
     *
     * @param parameters A list of parameters in the DB cluster parameter group to modify.
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
     * A list of parameters in the DB cluster parameter group to modify.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or {@link
     * #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameters in the DB cluster parameter group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterParameterGroupRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of parameters in the DB cluster parameter group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameters in the DB cluster parameter group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyDBClusterParameterGroupRequest == false) return false;
        ModifyDBClusterParameterGroupRequest other = (ModifyDBClusterParameterGroupRequest)obj;
        
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyDBClusterParameterGroupRequest clone() {
        
            return (ModifyDBClusterParameterGroupRequest) super.clone();
    }

}
    