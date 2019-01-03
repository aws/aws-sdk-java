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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetQueryExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a query execution.
     * </p>
     */
    private java.util.List<QueryExecution> queryExecutions;
    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     */
    private java.util.List<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds;

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * 
     * @return Information about a query execution.
     */

    public java.util.List<QueryExecution> getQueryExecutions() {
        return queryExecutions;
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * 
     * @param queryExecutions
     *        Information about a query execution.
     */

    public void setQueryExecutions(java.util.Collection<QueryExecution> queryExecutions) {
        if (queryExecutions == null) {
            this.queryExecutions = null;
            return;
        }

        this.queryExecutions = new java.util.ArrayList<QueryExecution>(queryExecutions);
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryExecutions(java.util.Collection)} or {@link #withQueryExecutions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryExecutions
     *        Information about a query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionResult withQueryExecutions(QueryExecution... queryExecutions) {
        if (this.queryExecutions == null) {
            setQueryExecutions(new java.util.ArrayList<QueryExecution>(queryExecutions.length));
        }
        for (QueryExecution ele : queryExecutions) {
            this.queryExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * 
     * @param queryExecutions
     *        Information about a query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionResult withQueryExecutions(java.util.Collection<QueryExecution> queryExecutions) {
        setQueryExecutions(queryExecutions);
        return this;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * 
     * @return Information about the query executions that failed to run.
     */

    public java.util.List<UnprocessedQueryExecutionId> getUnprocessedQueryExecutionIds() {
        return unprocessedQueryExecutionIds;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * 
     * @param unprocessedQueryExecutionIds
     *        Information about the query executions that failed to run.
     */

    public void setUnprocessedQueryExecutionIds(java.util.Collection<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds) {
        if (unprocessedQueryExecutionIds == null) {
            this.unprocessedQueryExecutionIds = null;
            return;
        }

        this.unprocessedQueryExecutionIds = new java.util.ArrayList<UnprocessedQueryExecutionId>(unprocessedQueryExecutionIds);
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedQueryExecutionIds(java.util.Collection)} or
     * {@link #withUnprocessedQueryExecutionIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedQueryExecutionIds
     *        Information about the query executions that failed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionResult withUnprocessedQueryExecutionIds(UnprocessedQueryExecutionId... unprocessedQueryExecutionIds) {
        if (this.unprocessedQueryExecutionIds == null) {
            setUnprocessedQueryExecutionIds(new java.util.ArrayList<UnprocessedQueryExecutionId>(unprocessedQueryExecutionIds.length));
        }
        for (UnprocessedQueryExecutionId ele : unprocessedQueryExecutionIds) {
            this.unprocessedQueryExecutionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * 
     * @param unprocessedQueryExecutionIds
     *        Information about the query executions that failed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionResult withUnprocessedQueryExecutionIds(java.util.Collection<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds) {
        setUnprocessedQueryExecutionIds(unprocessedQueryExecutionIds);
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
        if (getQueryExecutions() != null)
            sb.append("QueryExecutions: ").append(getQueryExecutions()).append(",");
        if (getUnprocessedQueryExecutionIds() != null)
            sb.append("UnprocessedQueryExecutionIds: ").append(getUnprocessedQueryExecutionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetQueryExecutionResult == false)
            return false;
        BatchGetQueryExecutionResult other = (BatchGetQueryExecutionResult) obj;
        if (other.getQueryExecutions() == null ^ this.getQueryExecutions() == null)
            return false;
        if (other.getQueryExecutions() != null && other.getQueryExecutions().equals(this.getQueryExecutions()) == false)
            return false;
        if (other.getUnprocessedQueryExecutionIds() == null ^ this.getUnprocessedQueryExecutionIds() == null)
            return false;
        if (other.getUnprocessedQueryExecutionIds() != null && other.getUnprocessedQueryExecutionIds().equals(this.getUnprocessedQueryExecutionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutions() == null) ? 0 : getQueryExecutions().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedQueryExecutionIds() == null) ? 0 : getUnprocessedQueryExecutionIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetQueryExecutionResult clone() {
        try {
            return (BatchGetQueryExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
