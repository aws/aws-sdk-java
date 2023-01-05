/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetQueryResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryResultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     * </p>
     */
    @Deprecated
    private String eventDataStore;
    /**
     * <p>
     * The ID of the query for which you want to get results.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of query results to display on a single page.
     * </p>
     */
    private Integer maxQueryResults;

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     */
    @Deprecated
    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     * </p>
     * 
     * @return The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     */
    @Deprecated
    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetQueryResultsRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
        return this;
    }

    /**
     * <p>
     * The ID of the query for which you want to get results.
     * </p>
     * 
     * @param queryId
     *        The ID of the query for which you want to get results.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the query for which you want to get results.
     * </p>
     * 
     * @return The ID of the query for which you want to get results.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the query for which you want to get results.
     * </p>
     * 
     * @param queryId
     *        The ID of the query for which you want to get results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of query results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @return A token you can use to get the next page of query results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of query results to display on a single page.
     * </p>
     * 
     * @param maxQueryResults
     *        The maximum number of query results to display on a single page.
     */

    public void setMaxQueryResults(Integer maxQueryResults) {
        this.maxQueryResults = maxQueryResults;
    }

    /**
     * <p>
     * The maximum number of query results to display on a single page.
     * </p>
     * 
     * @return The maximum number of query results to display on a single page.
     */

    public Integer getMaxQueryResults() {
        return this.maxQueryResults;
    }

    /**
     * <p>
     * The maximum number of query results to display on a single page.
     * </p>
     * 
     * @param maxQueryResults
     *        The maximum number of query results to display on a single page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withMaxQueryResults(Integer maxQueryResults) {
        setMaxQueryResults(maxQueryResults);
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
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore()).append(",");
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxQueryResults() != null)
            sb.append("MaxQueryResults: ").append(getMaxQueryResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsRequest == false)
            return false;
        GetQueryResultsRequest other = (GetQueryResultsRequest) obj;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
            return false;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxQueryResults() == null ^ this.getMaxQueryResults() == null)
            return false;
        if (other.getMaxQueryResults() != null && other.getMaxQueryResults().equals(this.getMaxQueryResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxQueryResults() == null) ? 0 : getMaxQueryResults().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryResultsRequest clone() {
        return (GetQueryResultsRequest) super.clone();
    }

}
