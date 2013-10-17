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


/**
 * <p>
 * Describes the status of a parameter group.
 * </p>
 */
public class ClusterParameterGroupStatus implements Serializable {

    /**
     * The name of the cluster parameter group.
     */
    private String parameterGroupName;

    /**
     * The status of parameter updates.
     */
    private String parameterApplyStatus;

    /**
     * The name of the cluster parameter group.
     *
     * @return The name of the cluster parameter group.
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group.
     *
     * @param parameterGroupName The name of the cluster parameter group.
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of the cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterParameterGroupStatus withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The status of parameter updates.
     *
     * @return The status of parameter updates.
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     *
     * @param parameterApplyStatus The status of parameter updates.
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterApplyStatus The status of parameter updates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
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
        if (getParameterApplyStatus() != null) sb.append("ParameterApplyStatus: " + getParameterApplyStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterParameterGroupStatus == false) return false;
        ClusterParameterGroupStatus other = (ClusterParameterGroupStatus)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null) return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false) return false; 
        return true;
    }
    
}
    