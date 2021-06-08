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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of columns in the table.
     * </p>
     */
    private java.util.List<ColumnMetadata> columnList;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The table name.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * A list of columns in the table.
     * </p>
     * 
     * @return A list of columns in the table.
     */

    public java.util.List<ColumnMetadata> getColumnList() {
        return columnList;
    }

    /**
     * <p>
     * A list of columns in the table.
     * </p>
     * 
     * @param columnList
     *        A list of columns in the table.
     */

    public void setColumnList(java.util.Collection<ColumnMetadata> columnList) {
        if (columnList == null) {
            this.columnList = null;
            return;
        }

        this.columnList = new java.util.ArrayList<ColumnMetadata>(columnList);
    }

    /**
     * <p>
     * A list of columns in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnList(java.util.Collection)} or {@link #withColumnList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnList
     *        A list of columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableResult withColumnList(ColumnMetadata... columnList) {
        if (this.columnList == null) {
            setColumnList(new java.util.ArrayList<ColumnMetadata>(columnList.length));
        }
        for (ColumnMetadata ele : columnList) {
            this.columnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns in the table.
     * </p>
     * 
     * @param columnList
     *        A list of columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableResult withColumnList(java.util.Collection<ColumnMetadata> columnList) {
        setColumnList(columnList);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is
     *         empty, all response records have been retrieved for the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @param tableName
     *        The table name.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @return The table name.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @param tableName
     *        The table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableResult withTableName(String tableName) {
        setTableName(tableName);
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
        if (getColumnList() != null)
            sb.append("ColumnList: ").append(getColumnList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTableResult == false)
            return false;
        DescribeTableResult other = (DescribeTableResult) obj;
        if (other.getColumnList() == null ^ this.getColumnList() == null)
            return false;
        if (other.getColumnList() != null && other.getColumnList().equals(this.getColumnList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnList() == null) ? 0 : getColumnList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTableResult clone() {
        try {
            return (DescribeTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
