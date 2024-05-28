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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListOpenCypherQueries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOpenCypherQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of queries that have been accepted but not yet completed, including queries in the queue.
     * </p>
     */
    private Integer acceptedQueryCount;
    /**
     * <p>
     * The number of currently running openCypher queries.
     * </p>
     */
    private Integer runningQueryCount;
    /**
     * <p>
     * A list of current openCypher queries.
     * </p>
     */
    private java.util.List<GremlinQueryStatus> queries;

    /**
     * <p>
     * The number of queries that have been accepted but not yet completed, including queries in the queue.
     * </p>
     * 
     * @param acceptedQueryCount
     *        The number of queries that have been accepted but not yet completed, including queries in the queue.
     */

    public void setAcceptedQueryCount(Integer acceptedQueryCount) {
        this.acceptedQueryCount = acceptedQueryCount;
    }

    /**
     * <p>
     * The number of queries that have been accepted but not yet completed, including queries in the queue.
     * </p>
     * 
     * @return The number of queries that have been accepted but not yet completed, including queries in the queue.
     */

    public Integer getAcceptedQueryCount() {
        return this.acceptedQueryCount;
    }

    /**
     * <p>
     * The number of queries that have been accepted but not yet completed, including queries in the queue.
     * </p>
     * 
     * @param acceptedQueryCount
     *        The number of queries that have been accepted but not yet completed, including queries in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpenCypherQueriesResult withAcceptedQueryCount(Integer acceptedQueryCount) {
        setAcceptedQueryCount(acceptedQueryCount);
        return this;
    }

    /**
     * <p>
     * The number of currently running openCypher queries.
     * </p>
     * 
     * @param runningQueryCount
     *        The number of currently running openCypher queries.
     */

    public void setRunningQueryCount(Integer runningQueryCount) {
        this.runningQueryCount = runningQueryCount;
    }

    /**
     * <p>
     * The number of currently running openCypher queries.
     * </p>
     * 
     * @return The number of currently running openCypher queries.
     */

    public Integer getRunningQueryCount() {
        return this.runningQueryCount;
    }

    /**
     * <p>
     * The number of currently running openCypher queries.
     * </p>
     * 
     * @param runningQueryCount
     *        The number of currently running openCypher queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpenCypherQueriesResult withRunningQueryCount(Integer runningQueryCount) {
        setRunningQueryCount(runningQueryCount);
        return this;
    }

    /**
     * <p>
     * A list of current openCypher queries.
     * </p>
     * 
     * @return A list of current openCypher queries.
     */

    public java.util.List<GremlinQueryStatus> getQueries() {
        return queries;
    }

    /**
     * <p>
     * A list of current openCypher queries.
     * </p>
     * 
     * @param queries
     *        A list of current openCypher queries.
     */

    public void setQueries(java.util.Collection<GremlinQueryStatus> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new java.util.ArrayList<GremlinQueryStatus>(queries);
    }

    /**
     * <p>
     * A list of current openCypher queries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     *        A list of current openCypher queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpenCypherQueriesResult withQueries(GremlinQueryStatus... queries) {
        if (this.queries == null) {
            setQueries(new java.util.ArrayList<GremlinQueryStatus>(queries.length));
        }
        for (GremlinQueryStatus ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of current openCypher queries.
     * </p>
     * 
     * @param queries
     *        A list of current openCypher queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOpenCypherQueriesResult withQueries(java.util.Collection<GremlinQueryStatus> queries) {
        setQueries(queries);
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
        if (getAcceptedQueryCount() != null)
            sb.append("AcceptedQueryCount: ").append(getAcceptedQueryCount()).append(",");
        if (getRunningQueryCount() != null)
            sb.append("RunningQueryCount: ").append(getRunningQueryCount()).append(",");
        if (getQueries() != null)
            sb.append("Queries: ").append(getQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOpenCypherQueriesResult == false)
            return false;
        ListOpenCypherQueriesResult other = (ListOpenCypherQueriesResult) obj;
        if (other.getAcceptedQueryCount() == null ^ this.getAcceptedQueryCount() == null)
            return false;
        if (other.getAcceptedQueryCount() != null && other.getAcceptedQueryCount().equals(this.getAcceptedQueryCount()) == false)
            return false;
        if (other.getRunningQueryCount() == null ^ this.getRunningQueryCount() == null)
            return false;
        if (other.getRunningQueryCount() != null && other.getRunningQueryCount().equals(this.getRunningQueryCount()) == false)
            return false;
        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptedQueryCount() == null) ? 0 : getAcceptedQueryCount().hashCode());
        hashCode = prime * hashCode + ((getRunningQueryCount() == null) ? 0 : getRunningQueryCount().hashCode());
        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        return hashCode;
    }

    @Override
    public ListOpenCypherQueriesResult clone() {
        try {
            return (ListOpenCypherQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
