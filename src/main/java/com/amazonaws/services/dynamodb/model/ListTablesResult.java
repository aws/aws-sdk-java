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
package com.amazonaws.services.dynamodb.model;

/**
 * List Tables Result
 */
public class ListTablesResult {

    private java.util.List<String> tableNames;

    /**
     * The name of the last table in the current list. Use this value as the
     * <code>ExclusiveStartTableName</code> in a new request to continue the
     * list until all the table names are returned. If this value is null,
     * all table names have been returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String lastEvaluatedTableName;

    /**
     * Returns the value of the TableNames property for this object.
     *
     * @return The value of the TableNames property for this object.
     */
    public java.util.List<String> getTableNames() {
        
        return tableNames;
    }
    
    /**
     * Sets the value of the TableNames property for this object.
     *
     * @param tableNames The new value for the TableNames property for this object.
     */
    public void setTableNames(java.util.Collection<String> tableNames) {
        if (tableNames == null) {
            this.tableNames = null;
            return;
        }

        java.util.List<String> tableNamesCopy = new java.util.ArrayList<String>(tableNames.size());
        tableNamesCopy.addAll(tableNames);
        this.tableNames = tableNamesCopy;
    }
    
    /**
     * Sets the value of the TableNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableNames The new value for the TableNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesResult withTableNames(String... tableNames) {
        if (getTableNames() == null) setTableNames(new java.util.ArrayList<String>(tableNames.length));
        for (String value : tableNames) {
            getTableNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the TableNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableNames The new value for the TableNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesResult withTableNames(java.util.Collection<String> tableNames) {
        if (tableNames == null) {
            this.tableNames = null;
        } else {
            java.util.List<String> tableNamesCopy = new java.util.ArrayList<String>(tableNames.size());
            tableNamesCopy.addAll(tableNames);
            this.tableNames = tableNamesCopy;
        }

        return this;
    }
    
    /**
     * The name of the last table in the current list. Use this value as the
     * <code>ExclusiveStartTableName</code> in a new request to continue the
     * list until all the table names are returned. If this value is null,
     * all table names have been returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the last table in the current list. Use this value as the
     *         <code>ExclusiveStartTableName</code> in a new request to continue the
     *         list until all the table names are returned. If this value is null,
     *         all table names have been returned.
     */
    public String getLastEvaluatedTableName() {
        return lastEvaluatedTableName;
    }
    
    /**
     * The name of the last table in the current list. Use this value as the
     * <code>ExclusiveStartTableName</code> in a new request to continue the
     * list until all the table names are returned. If this value is null,
     * all table names have been returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName The name of the last table in the current list. Use this value as the
     *         <code>ExclusiveStartTableName</code> in a new request to continue the
     *         list until all the table names are returned. If this value is null,
     *         all table names have been returned.
     */
    public void setLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
    }
    
    /**
     * The name of the last table in the current list. Use this value as the
     * <code>ExclusiveStartTableName</code> in a new request to continue the
     * list until all the table names are returned. If this value is null,
     * all table names have been returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName The name of the last table in the current list. Use this value as the
     *         <code>ExclusiveStartTableName</code> in a new request to continue the
     *         list until all the table names are returned. If this value is null,
     *         all table names have been returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesResult withLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
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
        if (tableNames != null) sb.append("TableNames: " + tableNames + ", ");
        if (lastEvaluatedTableName != null) sb.append("LastEvaluatedTableName: " + lastEvaluatedTableName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableNames() == null) ? 0 : getTableNames().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedTableName() == null) ? 0 : getLastEvaluatedTableName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListTablesResult == false) return false;
        ListTablesResult other = (ListTablesResult)obj;
        
        if (other.getTableNames() == null ^ this.getTableNames() == null) return false;
        if (other.getTableNames() != null && other.getTableNames().equals(this.getTableNames()) == false) return false; 
        if (other.getLastEvaluatedTableName() == null ^ this.getLastEvaluatedTableName() == null) return false;
        if (other.getLastEvaluatedTableName() != null && other.getLastEvaluatedTableName().equals(this.getLastEvaluatedTableName()) == false) return false; 
        return true;
    }
    
}
    