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

/**
 * <p>
 * </p>
 */
public class ResetDBClusterParameterGroupResult implements Serializable, Cloneable {

    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     */
    private String dBClusterParameterGroupName;

    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     *
     * @return The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResetDBClusterParameterGroupResult withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
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
        if (getDBClusterParameterGroupName() != null) sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetDBClusterParameterGroupResult == false) return false;
        ResetDBClusterParameterGroupResult other = (ResetDBClusterParameterGroupResult)obj;
        
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        return true;
    }
    
    @Override
    public ResetDBClusterParameterGroupResult clone() {
        try {
            return (ResetDBClusterParameterGroupResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    