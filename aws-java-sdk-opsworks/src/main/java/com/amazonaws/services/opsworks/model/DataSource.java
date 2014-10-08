/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an app's data source.
 * </p>
 */
public class DataSource implements Serializable {

    /**
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     * <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     */
    private String type;

    /**
     * The data source's ARN.
     */
    private String arn;

    /**
     * The database name.
     */
    private String databaseName;

    /**
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     * <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     *
     * @return The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     *         <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     * <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     *
     * @param type The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     *         <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     * <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>,
     *         <code>OpsworksMysqlInstance</code>, or <code>RdsDbInstance</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The data source's ARN.
     *
     * @return The data source's ARN.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The data source's ARN.
     *
     * @param arn The data source's ARN.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The data source's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The data source's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataSource withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The database name.
     *
     * @return The database name.
     */
    public String getDatabaseName() {
        return databaseName;
    }
    
    /**
     * The database name.
     *
     * @param databaseName The database name.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    /**
     * The database name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseName The database name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataSource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getDatabaseName() != null) sb.append("DatabaseName: " + getDatabaseName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DataSource == false) return false;
        DataSource other = (DataSource)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null) return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false) return false; 
        return true;
    }
    
}
    