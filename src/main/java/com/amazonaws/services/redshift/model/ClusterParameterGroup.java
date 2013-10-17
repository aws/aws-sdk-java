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
 * Describes a parameter group.
 * </p>
 */
public class ClusterParameterGroup implements Serializable {

    /**
     * The name of the cluster parameter group.
     */
    private String parameterGroupName;

    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     */
    private String parameterGroupFamily;

    /**
     * The description of the parameter group.
     */
    private String description;

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
    public ClusterParameterGroup withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     *
     * @return The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterParameterGroup withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * The description of the parameter group.
     *
     * @return The description of the parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the parameter group.
     *
     * @param description The description of the parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterParameterGroup withDescription(String description) {
        this.description = description;
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
        if (getParameterGroupFamily() != null) sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterParameterGroup == false) return false;
        ClusterParameterGroup other = (ClusterParameterGroup)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null) return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    