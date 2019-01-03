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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetQueryResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The log events that matched the query criteria during the most recent time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array. Each
     * of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.List<ResultField>> results;
    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log events that matched the query criteria,
     * and the total number of bytes in the log events that were scanned.
     * </p>
     */
    private QueryStatistics statistics;
    /**
     * <p>
     * The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     * <code>Unknown</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The log events that matched the query criteria during the most recent time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array. Each
     * of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * 
     * @return The log events that matched the query criteria during the most recent time it ran.</p>
     *         <p>
     *         The <code>results</code> value is an array of arrays. Each log event is one object in the top-level
     *         array. Each of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     */

    public java.util.List<java.util.List<ResultField>> getResults() {
        if (results == null) {
            results = new com.amazonaws.internal.SdkInternalList<java.util.List<ResultField>>();
        }
        return results;
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array. Each
     * of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * 
     * @param results
     *        The log events that matched the query criteria during the most recent time it ran.</p>
     *        <p>
     *        The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array.
     *        Each of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     */

    public void setResults(java.util.Collection<java.util.List<ResultField>> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new com.amazonaws.internal.SdkInternalList<java.util.List<ResultField>>(results);
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array. Each
     * of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        The log events that matched the query criteria during the most recent time it ran.</p>
     *        <p>
     *        The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array.
     *        Each of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withResults(java.util.List<ResultField>... results) {
        if (this.results == null) {
            setResults(new com.amazonaws.internal.SdkInternalList<java.util.List<ResultField>>(results.length));
        }
        for (java.util.List<ResultField> ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array. Each
     * of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * 
     * @param results
     *        The log events that matched the query criteria during the most recent time it ran.</p>
     *        <p>
     *        The <code>results</code> value is an array of arrays. Each log event is one object in the top-level array.
     *        Each of these log event objects is an array of <code>field</code>/<code>value</code> pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withResults(java.util.Collection<java.util.List<ResultField>> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log events that matched the query criteria,
     * and the total number of bytes in the log events that were scanned.
     * </p>
     * 
     * @param statistics
     *        Includes the number of log events scanned by the query, the number of log events that matched the query
     *        criteria, and the total number of bytes in the log events that were scanned.
     */

    public void setStatistics(QueryStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log events that matched the query criteria,
     * and the total number of bytes in the log events that were scanned.
     * </p>
     * 
     * @return Includes the number of log events scanned by the query, the number of log events that matched the query
     *         criteria, and the total number of bytes in the log events that were scanned.
     */

    public QueryStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log events that matched the query criteria,
     * and the total number of bytes in the log events that were scanned.
     * </p>
     * 
     * @param statistics
     *        Includes the number of log events scanned by the query, the number of log events that matched the query
     *        criteria, and the total number of bytes in the log events that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withStatistics(QueryStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     * <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     *        <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     *        <code>Unknown</code>.
     * @see QueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     * <code>Unknown</code>.
     * </p>
     * 
     * @return The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     *         <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     *         <code>Unknown</code>.
     * @see QueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     * <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     *        <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     *        <code>Unknown</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public GetQueryResultsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     * <code>Unknown</code>.
     * </p>
     * 
     * @param status
     *        The status of the most recent running of the query. Possible values are <code>Cancelled</code>,
     *        <code>Complete</code>, <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, and
     *        <code>Unknown</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public GetQueryResultsResult withStatus(QueryStatus status) {
        this.status = status.toString();
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsResult == false)
            return false;
        GetQueryResultsResult other = (GetQueryResultsResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryResultsResult clone() {
        try {
            return (GetQueryResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
