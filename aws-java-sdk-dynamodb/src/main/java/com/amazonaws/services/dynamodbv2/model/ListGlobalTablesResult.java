/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListGlobalTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGlobalTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of global table names.
     * </p>
     */
    private java.util.List<GlobalTable> globalTables;
    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     */
    private String lastEvaluatedGlobalTableName;

    /**
     * <p>
     * List of global table names.
     * </p>
     * 
     * @return List of global table names.
     */

    public java.util.List<GlobalTable> getGlobalTables() {
        return globalTables;
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     * 
     * @param globalTables
     *        List of global table names.
     */

    public void setGlobalTables(java.util.Collection<GlobalTable> globalTables) {
        if (globalTables == null) {
            this.globalTables = null;
            return;
        }

        this.globalTables = new java.util.ArrayList<GlobalTable>(globalTables);
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalTables(java.util.Collection)} or {@link #withGlobalTables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param globalTables
     *        List of global table names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesResult withGlobalTables(GlobalTable... globalTables) {
        if (this.globalTables == null) {
            setGlobalTables(new java.util.ArrayList<GlobalTable>(globalTables.length));
        }
        for (GlobalTable ele : globalTables) {
            this.globalTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     * 
     * @param globalTables
     *        List of global table names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesResult withGlobalTables(java.util.Collection<GlobalTable> globalTables) {
        setGlobalTables(globalTables);
        return this;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * 
     * @param lastEvaluatedGlobalTableName
     *        Last evaluated global table name.
     */

    public void setLastEvaluatedGlobalTableName(String lastEvaluatedGlobalTableName) {
        this.lastEvaluatedGlobalTableName = lastEvaluatedGlobalTableName;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * 
     * @return Last evaluated global table name.
     */

    public String getLastEvaluatedGlobalTableName() {
        return this.lastEvaluatedGlobalTableName;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * 
     * @param lastEvaluatedGlobalTableName
     *        Last evaluated global table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesResult withLastEvaluatedGlobalTableName(String lastEvaluatedGlobalTableName) {
        setLastEvaluatedGlobalTableName(lastEvaluatedGlobalTableName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalTables() != null)
            sb.append("GlobalTables: ").append(getGlobalTables()).append(",");
        if (getLastEvaluatedGlobalTableName() != null)
            sb.append("LastEvaluatedGlobalTableName: ").append(getLastEvaluatedGlobalTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGlobalTablesResult == false)
            return false;
        ListGlobalTablesResult other = (ListGlobalTablesResult) obj;
        if (other.getGlobalTables() == null ^ this.getGlobalTables() == null)
            return false;
        if (other.getGlobalTables() != null && other.getGlobalTables().equals(this.getGlobalTables()) == false)
            return false;
        if (other.getLastEvaluatedGlobalTableName() == null ^ this.getLastEvaluatedGlobalTableName() == null)
            return false;
        if (other.getLastEvaluatedGlobalTableName() != null && other.getLastEvaluatedGlobalTableName().equals(this.getLastEvaluatedGlobalTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTables() == null) ? 0 : getGlobalTables().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedGlobalTableName() == null) ? 0 : getLastEvaluatedGlobalTableName().hashCode());
        return hashCode;
    }

    @Override
    public ListGlobalTablesResult clone() {
        try {
            return (ListGlobalTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
