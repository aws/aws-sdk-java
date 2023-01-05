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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduledQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scheduled queries.
     * </p>
     */
    private java.util.List<ScheduledQuery> scheduledQueries;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of scheduled queries.
     * </p>
     * 
     * @return A list of scheduled queries.
     */

    public java.util.List<ScheduledQuery> getScheduledQueries() {
        return scheduledQueries;
    }

    /**
     * <p>
     * A list of scheduled queries.
     * </p>
     * 
     * @param scheduledQueries
     *        A list of scheduled queries.
     */

    public void setScheduledQueries(java.util.Collection<ScheduledQuery> scheduledQueries) {
        if (scheduledQueries == null) {
            this.scheduledQueries = null;
            return;
        }

        this.scheduledQueries = new java.util.ArrayList<ScheduledQuery>(scheduledQueries);
    }

    /**
     * <p>
     * A list of scheduled queries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledQueries(java.util.Collection)} or {@link #withScheduledQueries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduledQueries
     *        A list of scheduled queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledQueriesResult withScheduledQueries(ScheduledQuery... scheduledQueries) {
        if (this.scheduledQueries == null) {
            setScheduledQueries(new java.util.ArrayList<ScheduledQuery>(scheduledQueries.length));
        }
        for (ScheduledQuery ele : scheduledQueries) {
            this.scheduledQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scheduled queries.
     * </p>
     * 
     * @param scheduledQueries
     *        A list of scheduled queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledQueriesResult withScheduledQueries(java.util.Collection<ScheduledQuery> scheduledQueries) {
        setScheduledQueries(scheduledQueries);
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

    public ListScheduledQueriesResult withNextToken(String nextToken) {
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
        if (getScheduledQueries() != null)
            sb.append("ScheduledQueries: ").append(getScheduledQueries()).append(",");
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

        if (obj instanceof ListScheduledQueriesResult == false)
            return false;
        ListScheduledQueriesResult other = (ListScheduledQueriesResult) obj;
        if (other.getScheduledQueries() == null ^ this.getScheduledQueries() == null)
            return false;
        if (other.getScheduledQueries() != null && other.getScheduledQueries().equals(this.getScheduledQueries()) == false)
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

        hashCode = prime * hashCode + ((getScheduledQueries() == null) ? 0 : getScheduledQueries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduledQueriesResult clone() {
        try {
            return (ListScheduledQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
