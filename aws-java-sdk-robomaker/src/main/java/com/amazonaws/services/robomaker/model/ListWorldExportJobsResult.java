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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorldExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for world export jobs.
     * </p>
     */
    private java.util.List<WorldExportJobSummary> worldExportJobSummaries;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for world export jobs.
     * </p>
     * 
     * @return Summary information for world export jobs.
     */

    public java.util.List<WorldExportJobSummary> getWorldExportJobSummaries() {
        return worldExportJobSummaries;
    }

    /**
     * <p>
     * Summary information for world export jobs.
     * </p>
     * 
     * @param worldExportJobSummaries
     *        Summary information for world export jobs.
     */

    public void setWorldExportJobSummaries(java.util.Collection<WorldExportJobSummary> worldExportJobSummaries) {
        if (worldExportJobSummaries == null) {
            this.worldExportJobSummaries = null;
            return;
        }

        this.worldExportJobSummaries = new java.util.ArrayList<WorldExportJobSummary>(worldExportJobSummaries);
    }

    /**
     * <p>
     * Summary information for world export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorldExportJobSummaries(java.util.Collection)} or
     * {@link #withWorldExportJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param worldExportJobSummaries
     *        Summary information for world export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldExportJobsResult withWorldExportJobSummaries(WorldExportJobSummary... worldExportJobSummaries) {
        if (this.worldExportJobSummaries == null) {
            setWorldExportJobSummaries(new java.util.ArrayList<WorldExportJobSummary>(worldExportJobSummaries.length));
        }
        for (WorldExportJobSummary ele : worldExportJobSummaries) {
            this.worldExportJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for world export jobs.
     * </p>
     * 
     * @param worldExportJobSummaries
     *        Summary information for world export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldExportJobsResult withWorldExportJobSummaries(java.util.Collection<WorldExportJobSummary> worldExportJobSummaries) {
        setWorldExportJobSummaries(worldExportJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     *        <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *        NextToken parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     *         <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *         NextToken parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldExportJobsRequest</code> again and assign that token to the request object's
     *        <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *        NextToken parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldExportJobsResult withNextToken(String nextToken) {
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
        if (getWorldExportJobSummaries() != null)
            sb.append("WorldExportJobSummaries: ").append(getWorldExportJobSummaries()).append(",");
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

        if (obj instanceof ListWorldExportJobsResult == false)
            return false;
        ListWorldExportJobsResult other = (ListWorldExportJobsResult) obj;
        if (other.getWorldExportJobSummaries() == null ^ this.getWorldExportJobSummaries() == null)
            return false;
        if (other.getWorldExportJobSummaries() != null && other.getWorldExportJobSummaries().equals(this.getWorldExportJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getWorldExportJobSummaries() == null) ? 0 : getWorldExportJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorldExportJobsResult clone() {
        try {
            return (ListWorldExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
