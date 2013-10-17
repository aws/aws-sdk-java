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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#resetClusterParameterGroup(ResetClusterParameterGroupRequest) ResetClusterParameterGroup operation}.
 * <p>
 * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to
 * "engine-default". To reset the entire parameter group specify the <i>ResetAllParameters</i> parameter. For parameter changes to take effect you must
 * reboot any associated clusters.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#resetClusterParameterGroup(ResetClusterParameterGroupRequest)
 */
public class ResetClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cluster parameter group to be reset.
     */
    private String parameterGroupName;

    /**
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values. <p>Default: <code>true</code>
     */
    private Boolean resetAllParameters;

    /**
     * An array of names of parameters to be reset. If
     * <i>ResetAllParameters</i> option is not used, then at least one
     * parameter name must be supplied. <p>Constraints: A maximum of 20
     * parameters can be reset in a single request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * The name of the cluster parameter group to be reset.
     *
     * @return The name of the cluster parameter group to be reset.
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group to be reset.
     *
     * @param parameterGroupName The name of the cluster parameter group to be reset.
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group to be reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of the cluster parameter group to be reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, all parameters in the specified parameter group
     *         will be reset to their default values. <p>Default: <code>true</code>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values. <p>Default: <code>true</code>
     *
     * @param resetAllParameters If <code>true</code>, all parameters in the specified parameter group
     *         will be reset to their default values. <p>Default: <code>true</code>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values. <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters If <code>true</code>, all parameters in the specified parameter group
     *         will be reset to their default values. <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetClusterParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, all parameters in the specified parameter group
     *         will be reset to their default values. <p>Default: <code>true</code>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * An array of names of parameters to be reset. If
     * <i>ResetAllParameters</i> option is not used, then at least one
     * parameter name must be supplied. <p>Constraints: A maximum of 20
     * parameters can be reset in a single request.
     *
     * @return An array of names of parameters to be reset. If
     *         <i>ResetAllParameters</i> option is not used, then at least one
     *         parameter name must be supplied. <p>Constraints: A maximum of 20
     *         parameters can be reset in a single request.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * An array of names of parameters to be reset. If
     * <i>ResetAllParameters</i> option is not used, then at least one
     * parameter name must be supplied. <p>Constraints: A maximum of 20
     * parameters can be reset in a single request.
     *
     * @param parameters An array of names of parameters to be reset. If
     *         <i>ResetAllParameters</i> option is not used, then at least one
     *         parameter name must be supplied. <p>Constraints: A maximum of 20
     *         parameters can be reset in a single request.
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
     * An array of names of parameters to be reset. If
     * <i>ResetAllParameters</i> option is not used, then at least one
     * parameter name must be supplied. <p>Constraints: A maximum of 20
     * parameters can be reset in a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of names of parameters to be reset. If
     *         <i>ResetAllParameters</i> option is not used, then at least one
     *         parameter name must be supplied. <p>Constraints: A maximum of 20
     *         parameters can be reset in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetClusterParameterGroupRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * An array of names of parameters to be reset. If
     * <i>ResetAllParameters</i> option is not used, then at least one
     * parameter name must be supplied. <p>Constraints: A maximum of 20
     * parameters can be reset in a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of names of parameters to be reset. If
     *         <i>ResetAllParameters</i> option is not used, then at least one
     *         parameter name must be supplied. <p>Constraints: A maximum of 20
     *         parameters can be reset in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetClusterParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        if (getParameterGroupName() != null) sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (isResetAllParameters() != null) sb.append("ResetAllParameters: " + isResetAllParameters() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isResetAllParameters() == null) ? 0 : isResetAllParameters().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetClusterParameterGroupRequest == false) return false;
        ResetClusterParameterGroupRequest other = (ResetClusterParameterGroupRequest)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.isResetAllParameters() == null ^ this.isResetAllParameters() == null) return false;
        if (other.isResetAllParameters() != null && other.isResetAllParameters().equals(this.isResetAllParameters()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
}
    