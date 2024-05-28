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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetOpenCypherQueryStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenCypherQueryStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the query for which status is being returned.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The openCypher query string.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The openCypher query evaluation status.
     * </p>
     */
    private QueryEvalStats queryEvalStats;

    /**
     * <p>
     * The unique ID of the query for which status is being returned.
     * </p>
     * 
     * @param queryId
     *        The unique ID of the query for which status is being returned.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique ID of the query for which status is being returned.
     * </p>
     * 
     * @return The unique ID of the query for which status is being returned.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The unique ID of the query for which status is being returned.
     * </p>
     * 
     * @param queryId
     *        The unique ID of the query for which status is being returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenCypherQueryStatusResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @param queryString
     *        The openCypher query string.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @return The openCypher query string.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @param queryString
     *        The openCypher query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenCypherQueryStatusResult withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The openCypher query evaluation status.
     * </p>
     * 
     * @param queryEvalStats
     *        The openCypher query evaluation status.
     */

    public void setQueryEvalStats(QueryEvalStats queryEvalStats) {
        this.queryEvalStats = queryEvalStats;
    }

    /**
     * <p>
     * The openCypher query evaluation status.
     * </p>
     * 
     * @return The openCypher query evaluation status.
     */

    public QueryEvalStats getQueryEvalStats() {
        return this.queryEvalStats;
    }

    /**
     * <p>
     * The openCypher query evaluation status.
     * </p>
     * 
     * @param queryEvalStats
     *        The openCypher query evaluation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenCypherQueryStatusResult withQueryEvalStats(QueryEvalStats queryEvalStats) {
        setQueryEvalStats(queryEvalStats);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getQueryEvalStats() != null)
            sb.append("QueryEvalStats: ").append(getQueryEvalStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenCypherQueryStatusResult == false)
            return false;
        GetOpenCypherQueryStatusResult other = (GetOpenCypherQueryStatusResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryEvalStats() == null ^ this.getQueryEvalStats() == null)
            return false;
        if (other.getQueryEvalStats() != null && other.getQueryEvalStats().equals(this.getQueryEvalStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryEvalStats() == null) ? 0 : getQueryEvalStats().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenCypherQueryStatusResult clone() {
        try {
            return (GetOpenCypherQueryStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
