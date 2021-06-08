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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgePackagingJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgePackagingJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summaries of edge packaging jobs.
     * </p>
     */
    private java.util.List<EdgePackagingJobSummary> edgePackagingJobSummaries;
    /**
     * <p>
     * Token to use when calling the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries of edge packaging jobs.
     * </p>
     * 
     * @return Summaries of edge packaging jobs.
     */

    public java.util.List<EdgePackagingJobSummary> getEdgePackagingJobSummaries() {
        return edgePackagingJobSummaries;
    }

    /**
     * <p>
     * Summaries of edge packaging jobs.
     * </p>
     * 
     * @param edgePackagingJobSummaries
     *        Summaries of edge packaging jobs.
     */

    public void setEdgePackagingJobSummaries(java.util.Collection<EdgePackagingJobSummary> edgePackagingJobSummaries) {
        if (edgePackagingJobSummaries == null) {
            this.edgePackagingJobSummaries = null;
            return;
        }

        this.edgePackagingJobSummaries = new java.util.ArrayList<EdgePackagingJobSummary>(edgePackagingJobSummaries);
    }

    /**
     * <p>
     * Summaries of edge packaging jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgePackagingJobSummaries(java.util.Collection)} or
     * {@link #withEdgePackagingJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param edgePackagingJobSummaries
     *        Summaries of edge packaging jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsResult withEdgePackagingJobSummaries(EdgePackagingJobSummary... edgePackagingJobSummaries) {
        if (this.edgePackagingJobSummaries == null) {
            setEdgePackagingJobSummaries(new java.util.ArrayList<EdgePackagingJobSummary>(edgePackagingJobSummaries.length));
        }
        for (EdgePackagingJobSummary ele : edgePackagingJobSummaries) {
            this.edgePackagingJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries of edge packaging jobs.
     * </p>
     * 
     * @param edgePackagingJobSummaries
     *        Summaries of edge packaging jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsResult withEdgePackagingJobSummaries(java.util.Collection<EdgePackagingJobSummary> edgePackagingJobSummaries) {
        setEdgePackagingJobSummaries(edgePackagingJobSummaries);
        return this;
    }

    /**
     * <p>
     * Token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Token to use when calling the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to use when calling the next page of results.
     * </p>
     * 
     * @return Token to use when calling the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Token to use when calling the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsResult withNextToken(String nextToken) {
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
        if (getEdgePackagingJobSummaries() != null)
            sb.append("EdgePackagingJobSummaries: ").append(getEdgePackagingJobSummaries()).append(",");
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

        if (obj instanceof ListEdgePackagingJobsResult == false)
            return false;
        ListEdgePackagingJobsResult other = (ListEdgePackagingJobsResult) obj;
        if (other.getEdgePackagingJobSummaries() == null ^ this.getEdgePackagingJobSummaries() == null)
            return false;
        if (other.getEdgePackagingJobSummaries() != null && other.getEdgePackagingJobSummaries().equals(this.getEdgePackagingJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getEdgePackagingJobSummaries() == null) ? 0 : getEdgePackagingJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgePackagingJobsResult clone() {
        try {
            return (ListEdgePackagingJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
