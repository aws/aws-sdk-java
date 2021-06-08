/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tables.
     * </p>
     */
    private java.util.List<Table> tables;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of tables.
     * </p>
     * 
     * @return A list of tables.
     */

    public java.util.List<Table> getTables() {
        return tables;
    }

    /**
     * <p>
     * A list of tables.
     * </p>
     * 
     * @param tables
     *        A list of tables.
     */

    public void setTables(java.util.Collection<Table> tables) {
        if (tables == null) {
            this.tables = null;
            return;
        }

        this.tables = new java.util.ArrayList<Table>(tables);
    }

    /**
     * <p>
     * A list of tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTables(java.util.Collection)} or {@link #withTables(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tables
     *        A list of tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesResult withTables(Table... tables) {
        if (this.tables == null) {
            setTables(new java.util.ArrayList<Table>(tables.length));
        }
        for (Table ele : tables) {
            this.tables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tables.
     * </p>
     * 
     * @param tables
     *        A list of tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesResult withTables(java.util.Collection<Table> tables) {
        setTables(tables);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTables() != null)
            sb.append("Tables: ").append(getTables()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTablesResult == false)
            return false;
        ListTablesResult other = (ListTablesResult) obj;
        if (other.getTables() == null ^ this.getTables() == null)
            return false;
        if (other.getTables() != null && other.getTables().equals(this.getTables()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTables() == null) ? 0 : getTables().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTablesResult clone() {
        try {
            return (ListTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
