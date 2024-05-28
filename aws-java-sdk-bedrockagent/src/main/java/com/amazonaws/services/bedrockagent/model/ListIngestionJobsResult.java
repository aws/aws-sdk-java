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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIngestionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains information about an ingestion job.
     * </p>
     */
    private java.util.List<IngestionJobSummary> ingestionJobSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects, each of which contains information about an ingestion job.
     * </p>
     * 
     * @return A list of objects, each of which contains information about an ingestion job.
     */

    public java.util.List<IngestionJobSummary> getIngestionJobSummaries() {
        return ingestionJobSummaries;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an ingestion job.
     * </p>
     * 
     * @param ingestionJobSummaries
     *        A list of objects, each of which contains information about an ingestion job.
     */

    public void setIngestionJobSummaries(java.util.Collection<IngestionJobSummary> ingestionJobSummaries) {
        if (ingestionJobSummaries == null) {
            this.ingestionJobSummaries = null;
            return;
        }

        this.ingestionJobSummaries = new java.util.ArrayList<IngestionJobSummary>(ingestionJobSummaries);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an ingestion job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngestionJobSummaries(java.util.Collection)} or
     * {@link #withIngestionJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ingestionJobSummaries
     *        A list of objects, each of which contains information about an ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsResult withIngestionJobSummaries(IngestionJobSummary... ingestionJobSummaries) {
        if (this.ingestionJobSummaries == null) {
            setIngestionJobSummaries(new java.util.ArrayList<IngestionJobSummary>(ingestionJobSummaries.length));
        }
        for (IngestionJobSummary ele : ingestionJobSummaries) {
            this.ingestionJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an ingestion job.
     * </p>
     * 
     * @param ingestionJobSummaries
     *        A list of objects, each of which contains information about an ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsResult withIngestionJobSummaries(java.util.Collection<IngestionJobSummary> ingestionJobSummaries) {
        setIngestionJobSummaries(ingestionJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         use this token when making another request in the <code>nextToken</code> field to return the next batch
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsResult withNextToken(String nextToken) {
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
        if (getIngestionJobSummaries() != null)
            sb.append("IngestionJobSummaries: ").append(getIngestionJobSummaries()).append(",");
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

        if (obj instanceof ListIngestionJobsResult == false)
            return false;
        ListIngestionJobsResult other = (ListIngestionJobsResult) obj;
        if (other.getIngestionJobSummaries() == null ^ this.getIngestionJobSummaries() == null)
            return false;
        if (other.getIngestionJobSummaries() != null && other.getIngestionJobSummaries().equals(this.getIngestionJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getIngestionJobSummaries() == null) ? 0 : getIngestionJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIngestionJobsResult clone() {
        try {
            return (ListIngestionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
