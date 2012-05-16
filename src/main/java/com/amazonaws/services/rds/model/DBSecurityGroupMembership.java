/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * 
 * <ul>
 * <li> ModifyDBInstance </li>
 * <li> RebootDBInstance </li>
 * <li> RestoreDBInstanceFromDBSnapshot </li>
 * <li> RestoreDBInstanceToPointInTime </li>
 * 
 * </ul>
 */
public class DBSecurityGroupMembership {

    /**
     * The name of the DB Security Group.
     */
    private String dBSecurityGroupName;

    /**
     * The status of the DB Security Group.
     */
    private String status;

    /**
     * Default constructor for a new DBSecurityGroupMembership object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DBSecurityGroupMembership() {}
    
    /**
     * The name of the DB Security Group.
     *
     * @return The name of the DB Security Group.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group.
     *
     * @param dBSecurityGroupName The name of the DB Security Group.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSecurityGroupMembership withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }
    
    
    /**
     * The status of the DB Security Group.
     *
     * @return The status of the DB Security Group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the DB Security Group.
     *
     * @param status The status of the DB Security Group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the DB Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the DB Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSecurityGroupMembership withStatus(String status) {
        this.status = status;
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
        if (dBSecurityGroupName != null) sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DBSecurityGroupMembership == false) return false;
        DBSecurityGroupMembership other = (DBSecurityGroupMembership)obj;
        
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null) return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    