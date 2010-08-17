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
public class DBParameterGroup {

    /**
     * Provides the name of the DB Parameter Group.
     */
    private String dBParameterGroupName;

    /**
     * Provides the name of the DB Parameter Group Family that this DB
     * Parameter Group is compatible with.
     */
    private String dBParameterGroupFamily;

    /**
     * Provides the customer-specified description for this DB Parameter
     * Group.
     */
    private String description;

    /**
     * Provides the name of the DB Parameter Group.
     *
     * @return Provides the name of the DB Parameter Group.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * Provides the name of the DB Parameter Group.
     *
     * @param dBParameterGroupName Provides the name of the DB Parameter Group.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * Provides the name of the DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName Provides the name of the DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBParameterGroup withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * Provides the name of the DB Parameter Group Family that this DB
     * Parameter Group is compatible with.
     *
     * @return Provides the name of the DB Parameter Group Family that this DB
     *         Parameter Group is compatible with.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * Provides the name of the DB Parameter Group Family that this DB
     * Parameter Group is compatible with.
     *
     * @param dBParameterGroupFamily Provides the name of the DB Parameter Group Family that this DB
     *         Parameter Group is compatible with.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * Provides the name of the DB Parameter Group Family that this DB
     * Parameter Group is compatible with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily Provides the name of the DB Parameter Group Family that this DB
     *         Parameter Group is compatible with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBParameterGroup withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * Provides the customer-specified description for this DB Parameter
     * Group.
     *
     * @return Provides the customer-specified description for this DB Parameter
     *         Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides the customer-specified description for this DB Parameter
     * Group.
     *
     * @param description Provides the customer-specified description for this DB Parameter
     *         Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides the customer-specified description for this DB Parameter
     * Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides the customer-specified description for this DB Parameter
     *         Group.
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
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    