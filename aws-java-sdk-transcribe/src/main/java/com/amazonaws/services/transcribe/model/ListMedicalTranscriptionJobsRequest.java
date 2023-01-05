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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMedicalTranscriptionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the
     * newest job first. If you don't include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified string. The search is not case sensitive.
     * </p>
     */
    private String jobNameContains;
    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the
     * newest job first. If you don't include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * 
     * @param status
     *        Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with
     *        the newest job first. If you don't include <code>Status</code>, all medical transcription jobs are
     *        returned.
     * @see TranscriptionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the
     * newest job first. If you don't include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * 
     * @return Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date,
     *         with the newest job first. If you don't include <code>Status</code>, all medical transcription jobs are
     *         returned.
     * @see TranscriptionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the
     * newest job first. If you don't include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * 
     * @param status
     *        Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with
     *        the newest job first. If you don't include <code>Status</code>, all medical transcription jobs are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListMedicalTranscriptionJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with the
     * newest job first. If you don't include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * 
     * @param status
     *        Returns only medical transcription jobs with the specified status. Jobs are ordered by creation date, with
     *        the newest job first. If you don't include <code>Status</code>, all medical transcription jobs are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListMedicalTranscriptionJobsRequest withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @param jobNameContains
     *        Returns only the medical transcription jobs that contain the specified string. The search is not case
     *        sensitive.
     */

    public void setJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @return Returns only the medical transcription jobs that contain the specified string. The search is not case
     *         sensitive.
     */

    public String getJobNameContains() {
        return this.jobNameContains;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified string. The search is not case sensitive.
     * </p>
     * 
     * @param jobNameContains
     *        Returns only the medical transcription jobs that contain the specified string. The search is not case
     *        sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsRequest withJobNameContains(String jobNameContains) {
        setJobNameContains(jobNameContains);
        return this;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     *        <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *        results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *        copied string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @return If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     *         <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *         results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     * <code>NextToken</code> is displayed in the response with an associated string. To get the next page of results,
     * copy this string and repeat your request, including <code>NextToken</code> with the value of the copied string.
     * Repeat as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If your <code>ListMedicalTranscriptionJobs</code> request returns more results than can be displayed,
     *        <code>NextToken</code> is displayed in the response with an associated string. To get the next page of
     *        results, copy this string and repeat your request, including <code>NextToken</code> with the value of the
     *        copied string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of medical transcription jobs to return in each page of results. If there are fewer
     *        results than the value that you specify, only the actual results are returned. If you don't specify a
     *        value, a default of 5 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @return The maximum number of medical transcription jobs to return in each page of results. If there are fewer
     *         results than the value that you specify, only the actual results are returned. If you don't specify a
     *         value, a default of 5 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page of results. If there are fewer results
     * than the value that you specify, only the actual results are returned. If you don't specify a value, a default of
     * 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of medical transcription jobs to return in each page of results. If there are fewer
     *        results than the value that you specify, only the actual results are returned. If you don't specify a
     *        value, a default of 5 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobNameContains() != null)
            sb.append("JobNameContains: ").append(getJobNameContains()).append(",");
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

        if (obj instanceof ListMedicalTranscriptionJobsRequest == false)
            return false;
        ListMedicalTranscriptionJobsRequest other = (ListMedicalTranscriptionJobsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobNameContains() == null ^ this.getJobNameContains() == null)
            return false;
        if (other.getJobNameContains() != null && other.getJobNameContains().equals(this.getJobNameContains()) == false)
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
        hashCode = prime * hashCode + ((getJobNameContains() == null) ? 0 : getJobNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMedicalTranscriptionJobsRequest clone() {
        return (ListMedicalTranscriptionJobsRequest) super.clone();
    }

}
