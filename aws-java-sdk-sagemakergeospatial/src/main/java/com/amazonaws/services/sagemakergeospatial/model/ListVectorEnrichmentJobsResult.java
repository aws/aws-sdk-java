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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVectorEnrichmentJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains summary information about the Vector Enrichment jobs.
     * </p>
     */
    private java.util.List<ListVectorEnrichmentJobOutputConfig> vectorEnrichmentJobSummaries;

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you receive this token. Use it in your next request to receive
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains summary information about the Vector Enrichment jobs.
     * </p>
     * 
     * @return Contains summary information about the Vector Enrichment jobs.
     */

    public java.util.List<ListVectorEnrichmentJobOutputConfig> getVectorEnrichmentJobSummaries() {
        return vectorEnrichmentJobSummaries;
    }

    /**
     * <p>
     * Contains summary information about the Vector Enrichment jobs.
     * </p>
     * 
     * @param vectorEnrichmentJobSummaries
     *        Contains summary information about the Vector Enrichment jobs.
     */

    public void setVectorEnrichmentJobSummaries(java.util.Collection<ListVectorEnrichmentJobOutputConfig> vectorEnrichmentJobSummaries) {
        if (vectorEnrichmentJobSummaries == null) {
            this.vectorEnrichmentJobSummaries = null;
            return;
        }

        this.vectorEnrichmentJobSummaries = new java.util.ArrayList<ListVectorEnrichmentJobOutputConfig>(vectorEnrichmentJobSummaries);
    }

    /**
     * <p>
     * Contains summary information about the Vector Enrichment jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVectorEnrichmentJobSummaries(java.util.Collection)} or
     * {@link #withVectorEnrichmentJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vectorEnrichmentJobSummaries
     *        Contains summary information about the Vector Enrichment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobsResult withVectorEnrichmentJobSummaries(ListVectorEnrichmentJobOutputConfig... vectorEnrichmentJobSummaries) {
        if (this.vectorEnrichmentJobSummaries == null) {
            setVectorEnrichmentJobSummaries(new java.util.ArrayList<ListVectorEnrichmentJobOutputConfig>(vectorEnrichmentJobSummaries.length));
        }
        for (ListVectorEnrichmentJobOutputConfig ele : vectorEnrichmentJobSummaries) {
            this.vectorEnrichmentJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains summary information about the Vector Enrichment jobs.
     * </p>
     * 
     * @param vectorEnrichmentJobSummaries
     *        Contains summary information about the Vector Enrichment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobsResult withVectorEnrichmentJobSummaries(
            java.util.Collection<ListVectorEnrichmentJobOutputConfig> vectorEnrichmentJobSummaries) {
        setVectorEnrichmentJobSummaries(vectorEnrichmentJobSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getVectorEnrichmentJobSummaries() != null)
            sb.append("VectorEnrichmentJobSummaries: ").append(getVectorEnrichmentJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVectorEnrichmentJobsResult == false)
            return false;
        ListVectorEnrichmentJobsResult other = (ListVectorEnrichmentJobsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVectorEnrichmentJobSummaries() == null ^ this.getVectorEnrichmentJobSummaries() == null)
            return false;
        if (other.getVectorEnrichmentJobSummaries() != null && other.getVectorEnrichmentJobSummaries().equals(this.getVectorEnrichmentJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVectorEnrichmentJobSummaries() == null) ? 0 : getVectorEnrichmentJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListVectorEnrichmentJobsResult clone() {
        try {
            return (ListVectorEnrichmentJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
