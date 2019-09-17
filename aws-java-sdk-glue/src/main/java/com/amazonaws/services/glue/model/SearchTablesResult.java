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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SearchTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only the
     * tables that you have access to.
     * </p>
     */
    private java.util.List<Table> tableList;

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @return A continuation token, present if the current list segment is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only the
     * tables that you have access to.
     * </p>
     * 
     * @return A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only
     *         the tables that you have access to.
     */

    public java.util.List<Table> getTableList() {
        return tableList;
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only the
     * tables that you have access to.
     * </p>
     * 
     * @param tableList
     *        A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only
     *        the tables that you have access to.
     */

    public void setTableList(java.util.Collection<Table> tableList) {
        if (tableList == null) {
            this.tableList = null;
            return;
        }

        this.tableList = new java.util.ArrayList<Table>(tableList);
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only the
     * tables that you have access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableList(java.util.Collection)} or {@link #withTableList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tableList
     *        A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only
     *        the tables that you have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesResult withTableList(Table... tableList) {
        if (this.tableList == null) {
            setTableList(new java.util.ArrayList<Table>(tableList.length));
        }
        for (Table ele : tableList) {
            this.tableList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only the
     * tables that you have access to.
     * </p>
     * 
     * @param tableList
     *        A list of the requested <code>Table</code> objects. The <code>SearchTables</code> response returns only
     *        the tables that you have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesResult withTableList(java.util.Collection<Table> tableList) {
        setTableList(tableList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTableList() != null)
            sb.append("TableList: ").append(getTableList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTablesResult == false)
            return false;
        SearchTablesResult other = (SearchTablesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTableList() == null ^ this.getTableList() == null)
            return false;
        if (other.getTableList() != null && other.getTableList().equals(this.getTableList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTableList() == null) ? 0 : getTableList().hashCode());
        return hashCode;
    }

    @Override
    public SearchTablesResult clone() {
        try {
            return (SearchTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
