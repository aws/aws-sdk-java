/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListColumnStatisticsTaskRuns" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListColumnStatisticsTaskRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of column statistics task run IDs.
     * </p>
     */
    private java.util.List<String> columnStatisticsTaskRunIds;
    /**
     * <p>
     * A continuation token, if not all task run IDs have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of column statistics task run IDs.
     * </p>
     * 
     * @return A list of column statistics task run IDs.
     */

    public java.util.List<String> getColumnStatisticsTaskRunIds() {
        return columnStatisticsTaskRunIds;
    }

    /**
     * <p>
     * A list of column statistics task run IDs.
     * </p>
     * 
     * @param columnStatisticsTaskRunIds
     *        A list of column statistics task run IDs.
     */

    public void setColumnStatisticsTaskRunIds(java.util.Collection<String> columnStatisticsTaskRunIds) {
        if (columnStatisticsTaskRunIds == null) {
            this.columnStatisticsTaskRunIds = null;
            return;
        }

        this.columnStatisticsTaskRunIds = new java.util.ArrayList<String>(columnStatisticsTaskRunIds);
    }

    /**
     * <p>
     * A list of column statistics task run IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnStatisticsTaskRunIds(java.util.Collection)} or
     * {@link #withColumnStatisticsTaskRunIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param columnStatisticsTaskRunIds
     *        A list of column statistics task run IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListColumnStatisticsTaskRunsResult withColumnStatisticsTaskRunIds(String... columnStatisticsTaskRunIds) {
        if (this.columnStatisticsTaskRunIds == null) {
            setColumnStatisticsTaskRunIds(new java.util.ArrayList<String>(columnStatisticsTaskRunIds.length));
        }
        for (String ele : columnStatisticsTaskRunIds) {
            this.columnStatisticsTaskRunIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of column statistics task run IDs.
     * </p>
     * 
     * @param columnStatisticsTaskRunIds
     *        A list of column statistics task run IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListColumnStatisticsTaskRunsResult withColumnStatisticsTaskRunIds(java.util.Collection<String> columnStatisticsTaskRunIds) {
        setColumnStatisticsTaskRunIds(columnStatisticsTaskRunIds);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all task run IDs have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all task run IDs have yet been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all task run IDs have yet been returned.
     * </p>
     * 
     * @return A continuation token, if not all task run IDs have yet been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all task run IDs have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all task run IDs have yet been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListColumnStatisticsTaskRunsResult withNextToken(String nextToken) {
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
        if (getColumnStatisticsTaskRunIds() != null)
            sb.append("ColumnStatisticsTaskRunIds: ").append(getColumnStatisticsTaskRunIds()).append(",");
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

        if (obj instanceof ListColumnStatisticsTaskRunsResult == false)
            return false;
        ListColumnStatisticsTaskRunsResult other = (ListColumnStatisticsTaskRunsResult) obj;
        if (other.getColumnStatisticsTaskRunIds() == null ^ this.getColumnStatisticsTaskRunIds() == null)
            return false;
        if (other.getColumnStatisticsTaskRunIds() != null && other.getColumnStatisticsTaskRunIds().equals(this.getColumnStatisticsTaskRunIds()) == false)
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

        hashCode = prime * hashCode + ((getColumnStatisticsTaskRunIds() == null) ? 0 : getColumnStatisticsTaskRunIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListColumnStatisticsTaskRunsResult clone() {
        try {
            return (ListColumnStatisticsTaskRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
