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

/**
 * <p>
 * 
 * </p>
 */
public class DBSecurityGroupMembership {

    /**
     * The name of the DB Security Group.
     */
    private String dBSecurityGroupName;

    /**
     * 
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
     * 
     *
     * @return 
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * 
     *
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status 
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
        sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    