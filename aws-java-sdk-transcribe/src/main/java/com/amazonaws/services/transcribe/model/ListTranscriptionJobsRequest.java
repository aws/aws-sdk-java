/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTranscriptionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When specified, returns only transcription jobs with the specified status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of jobs to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only transcription jobs with the specified status.
     * </p>
     * 
     * @param status
     *        When specified, returns only transcription jobs with the specified status.
     * @see TranscriptionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * When specified, returns only transcription jobs with the specified status.
     * </p>
     * 
     * @return When specified, returns only transcription jobs with the specified status.
     * @see TranscriptionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * When specified, returns only transcription jobs with the specified status.
     * </p>
     * 
     * @param status
     *        When specified, returns only transcription jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListTranscriptionJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When specified, returns only transcription jobs with the specified status.
     * </p>
     * 
     * @param status
     *        When specified, returns only transcription jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListTranscriptionJobsRequest withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @return If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     *         <code>NextToken</code> to fetch the next set of jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>ListTranscriptionJobs</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTranscriptionJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response.
     * </p>
     * 
     * @return The maximum number of jobs to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTranscriptionJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTranscriptionJobsRequest == false)
            return false;
        ListTranscriptionJobsRequest other = (ListTranscriptionJobsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTranscriptionJobsRequest clone() {
        return (ListTranscriptionJobsRequest) super.clone();
    }

}
