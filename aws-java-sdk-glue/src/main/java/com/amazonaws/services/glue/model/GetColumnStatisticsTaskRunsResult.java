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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetColumnStatisticsTaskRuns" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetColumnStatisticsTaskRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of column statistics task runs.
     * </p>
     */
    private java.util.List<ColumnStatisticsTaskRun> columnStatisticsTaskRuns;
    /**
     * <p>
     * A continuation token, if not all task runs have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of column statistics task runs.
     * </p>
     * 
     * @return A list of column statistics task runs.
     */

    public java.util.List<ColumnStatisticsTaskRun> getColumnStatisticsTaskRuns() {
        return columnStatisticsTaskRuns;
    }

    /**
     * <p>
     * A list of column statistics task runs.
     * </p>
     * 
     * @param columnStatisticsTaskRuns
     *        A list of column statistics task runs.
     */

    public void setColumnStatisticsTaskRuns(java.util.Collection<ColumnStatisticsTaskRun> columnStatisticsTaskRuns) {
        if (columnStatisticsTaskRuns == null) {
            this.columnStatisticsTaskRuns = null;
            return;
        }

        this.columnStatisticsTaskRuns = new java.util.ArrayList<ColumnStatisticsTaskRun>(columnStatisticsTaskRuns);
    }

    /**
     * <p>
     * A list of column statistics task runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnStatisticsTaskRuns(java.util.Collection)} or
     * {@link #withColumnStatisticsTaskRuns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param columnStatisticsTaskRuns
     *        A list of column statistics task runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsTaskRunsResult withColumnStatisticsTaskRuns(ColumnStatisticsTaskRun... columnStatisticsTaskRuns) {
        if (this.columnStatisticsTaskRuns == null) {
            setColumnStatisticsTaskRuns(new java.util.ArrayList<ColumnStatisticsTaskRun>(columnStatisticsTaskRuns.length));
        }
        for (ColumnStatisticsTaskRun ele : columnStatisticsTaskRuns) {
            this.columnStatisticsTaskRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of column statistics task runs.
     * </p>
     * 
     * @param columnStatisticsTaskRuns
     *        A list of column statistics task runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsTaskRunsResult withColumnStatisticsTaskRuns(java.util.Collection<ColumnStatisticsTaskRun> columnStatisticsTaskRuns) {
        setColumnStatisticsTaskRuns(columnStatisticsTaskRuns);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all task runs have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all task runs have yet been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all task runs have yet been returned.
     * </p>
     * 
     * @return A continuation token, if not all task runs have yet been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all task runs have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all task runs have yet been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsTaskRunsResult withNextToken(String nextToken) {
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
        if (getColumnStatisticsTaskRuns() != null)
            sb.append("ColumnStatisticsTaskRuns: ").append(getColumnStatisticsTaskRuns()).append(",");
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

        if (obj instanceof GetColumnStatisticsTaskRunsResult == false)
            return false;
        GetColumnStatisticsTaskRunsResult other = (GetColumnStatisticsTaskRunsResult) obj;
        if (other.getColumnStatisticsTaskRuns() == null ^ this.getColumnStatisticsTaskRuns() == null)
            return false;
        if (other.getColumnStatisticsTaskRuns() != null && other.getColumnStatisticsTaskRuns().equals(this.getColumnStatisticsTaskRuns()) == false)
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

        hashCode = prime * hashCode + ((getColumnStatisticsTaskRuns() == null) ? 0 : getColumnStatisticsTaskRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetColumnStatisticsTaskRunsResult clone() {
        try {
            return (GetColumnStatisticsTaskRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
