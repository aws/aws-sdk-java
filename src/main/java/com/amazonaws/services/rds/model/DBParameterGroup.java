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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the CreateDBParameterGroup action.
 * </p>
 * <p>
 * This data type is used as a request parameter in the DeleteDBParameterGroup action, and as a response element in the DescribeDBParameterGroups
 * action.
 * </p>
 */
public class DBParameterGroup implements Serializable {

    /**
     * Provides the name of the DB parameter group.
     */
    private String dBParameterGroupName;

    /**
     * Provides the name of the DB parameter group family that this DB
     * parameter group is compatible with.
     */
    private String dBParameterGroupFamily;

    /**
     * Provides the customer-specified description for this DB parameter
     * group.
     */
    private String description;

    /**
     * Provides the name of the DB parameter group.
     *
     * @return Provides the name of the DB parameter group.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * Provides the name of the DB parameter group.
     *
     * @param dBParameterGroupName Provides the name of the DB parameter group.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * Provides the name of the DB parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName Provides the name of the DB parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBParameterGroup withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * Provides the name of the DB parameter group family that this DB
     * parameter group is compatible with.
     *
     * @return Provides the name of the DB parameter group family that this DB
     *         parameter group is compatible with.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * Provides the name of the DB parameter group family that this DB
     * parameter group is compatible with.
     *
     * @param dBParameterGroupFamily Provides the name of the DB parameter group family that this DB
     *         parameter group is compatible with.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * Provides the name of the DB parameter group family that this DB
     * parameter group is compatible with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily Provides the name of the DB parameter group family that this DB
     *         parameter group is compatible with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBParameterGroup withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * Provides the customer-specified description for this DB parameter
     * group.
     *
     * @return Provides the customer-specified description for this DB parameter
     *         group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides the customer-specified description for this DB parameter
     * group.
     *
     * @param description Provides the customer-specified description for this DB parameter
     *         group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides the customer-specified description for this DB parameter
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides the customer-specified description for this DB parameter
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBParameterGroup withDescription(String description) {
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
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getDBParameterGroupFamily() != null) sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBParameterGroup == false) return false;
        DBParameterGroup other = (DBParameterGroup)obj;
        
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null) return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    