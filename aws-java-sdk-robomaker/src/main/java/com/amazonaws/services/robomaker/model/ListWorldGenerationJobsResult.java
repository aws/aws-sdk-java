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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldGenerationJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorldGenerationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for world generator jobs.
     * </p>
     */
    private java.util.List<WorldGenerationJobSummary> worldGenerationJobSummaries;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for world generator jobs.
     * </p>
     * 
     * @return Summary information for world generator jobs.
     */

    public java.util.List<WorldGenerationJobSummary> getWorldGenerationJobSummaries() {
        return worldGenerationJobSummaries;
    }

    /**
     * <p>
     * Summary information for world generator jobs.
     * </p>
     * 
     * @param worldGenerationJobSummaries
     *        Summary information for world generator jobs.
     */

    public void setWorldGenerationJobSummaries(java.util.Collection<WorldGenerationJobSummary> worldGenerationJobSummaries) {
        if (worldGenerationJobSummaries == null) {
            this.worldGenerationJobSummaries = null;
            return;
        }

        this.worldGenerationJobSummaries = new java.util.ArrayList<WorldGenerationJobSummary>(worldGenerationJobSummaries);
    }

    /**
     * <p>
     * Summary information for world generator jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorldGenerationJobSummaries(java.util.Collection)} or
     * {@link #withWorldGenerationJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param worldGenerationJobSummaries
     *        Summary information for world generator jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldGenerationJobsResult withWorldGenerationJobSummaries(WorldGenerationJobSummary... worldGenerationJobSummaries) {
        if (this.worldGenerationJobSummaries == null) {
            setWorldGenerationJobSummaries(new java.util.ArrayList<WorldGenerationJobSummary>(worldGenerationJobSummaries.length));
        }
        for (WorldGenerationJobSummary ele : worldGenerationJobSummaries) {
            this.worldGenerationJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for world generator jobs.
     * </p>
     * 
     * @param worldGenerationJobSummaries
     *        Summary information for world generator jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldGenerationJobsResult withWorldGenerationJobSummaries(java.util.Collection<WorldGenerationJobSummary> worldGenerationJobSummaries) {
        setWorldGenerationJobSummaries(worldGenerationJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
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
     * <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
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
     * <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
     * <code>nextToken</code> parameter. If there are no remaining results, the previous response object's NextToken
     * parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldGeneratorJobsRequest</code> again and assign that token to the request object's
     *        <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *        NextToken parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldGenerationJobsResult withNextToken(String nextToken) {
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
        if (getWorldGenerationJobSummaries() != null)
            sb.append("WorldGenerationJobSummaries: ").append(getWorldGenerationJobSummaries()).append(",");
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

        if (obj instanceof ListWorldGenerationJobsResult == false)
            return false;
        ListWorldGenerationJobsResult other = (ListWorldGenerationJobsResult) obj;
        if (other.getWorldGenerationJobSummaries() == null ^ this.getWorldGenerationJobSummaries() == null)
            return false;
        if (other.getWorldGenerationJobSummaries() != null && other.getWorldGenerationJobSummaries().equals(this.getWorldGenerationJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getWorldGenerationJobSummaries() == null) ? 0 : getWorldGenerationJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorldGenerationJobsResult clone() {
        try {
            return (ListWorldGenerationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
