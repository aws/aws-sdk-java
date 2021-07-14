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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFHIRExportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This parameter limits the response to the export job with the specified Data Store ID.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity specified by
     * the user.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * This parameter limits the response to the export job with the specified job name.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * This parameter limits the response to the export jobs with the specified job status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted before a user specified date.
     * </p>
     */
    private java.util.Date submittedBefore;
    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted after a user specified date.
     * </p>
     */
    private java.util.Date submittedAfter;

    /**
     * <p>
     * This parameter limits the response to the export job with the specified Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        This parameter limits the response to the export job with the specified Data Store ID.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * This parameter limits the response to the export job with the specified Data Store ID.
     * </p>
     * 
     * @return This parameter limits the response to the export job with the specified Data Store ID.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * This parameter limits the response to the export job with the specified Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        This parameter limits the response to the export job with the specified Data Store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @param nextToken
     *        A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @return A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @param nextToken
     *        A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity specified by
     * the user.
     * </p>
     * 
     * @param maxResults
     *        This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity
     *        specified by the user.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity specified by
     * the user.
     * </p>
     * 
     * @return This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity
     *         specified by the user.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity specified by
     * the user.
     * </p>
     * 
     * @param maxResults
     *        This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity
     *        specified by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This parameter limits the response to the export job with the specified job name.
     * </p>
     * 
     * @param jobName
     *        This parameter limits the response to the export job with the specified job name.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * This parameter limits the response to the export job with the specified job name.
     * </p>
     * 
     * @return This parameter limits the response to the export job with the specified job name.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * This parameter limits the response to the export job with the specified job name.
     * </p>
     * 
     * @param jobName
     *        This parameter limits the response to the export job with the specified job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * This parameter limits the response to the export jobs with the specified job status.
     * </p>
     * 
     * @param jobStatus
     *        This parameter limits the response to the export jobs with the specified job status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * This parameter limits the response to the export jobs with the specified job status.
     * </p>
     * 
     * @return This parameter limits the response to the export jobs with the specified job status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * This parameter limits the response to the export jobs with the specified job status.
     * </p>
     * 
     * @param jobStatus
     *        This parameter limits the response to the export jobs with the specified job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListFHIRExportJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * This parameter limits the response to the export jobs with the specified job status.
     * </p>
     * 
     * @param jobStatus
     *        This parameter limits the response to the export jobs with the specified job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListFHIRExportJobsRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted before a user specified date.
     * </p>
     * 
     * @param submittedBefore
     *        This parameter limits the response to FHIR export jobs submitted before a user specified date.
     */

    public void setSubmittedBefore(java.util.Date submittedBefore) {
        this.submittedBefore = submittedBefore;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted before a user specified date.
     * </p>
     * 
     * @return This parameter limits the response to FHIR export jobs submitted before a user specified date.
     */

    public java.util.Date getSubmittedBefore() {
        return this.submittedBefore;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted before a user specified date.
     * </p>
     * 
     * @param submittedBefore
     *        This parameter limits the response to FHIR export jobs submitted before a user specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withSubmittedBefore(java.util.Date submittedBefore) {
        setSubmittedBefore(submittedBefore);
        return this;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted after a user specified date.
     * </p>
     * 
     * @param submittedAfter
     *        This parameter limits the response to FHIR export jobs submitted after a user specified date.
     */

    public void setSubmittedAfter(java.util.Date submittedAfter) {
        this.submittedAfter = submittedAfter;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted after a user specified date.
     * </p>
     * 
     * @return This parameter limits the response to FHIR export jobs submitted after a user specified date.
     */

    public java.util.Date getSubmittedAfter() {
        return this.submittedAfter;
    }

    /**
     * <p>
     * This parameter limits the response to FHIR export jobs submitted after a user specified date.
     * </p>
     * 
     * @param submittedAfter
     *        This parameter limits the response to FHIR export jobs submitted after a user specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsRequest withSubmittedAfter(java.util.Date submittedAfter) {
        setSubmittedAfter(submittedAfter);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getSubmittedBefore() != null)
            sb.append("SubmittedBefore: ").append(getSubmittedBefore()).append(",");
        if (getSubmittedAfter() != null)
            sb.append("SubmittedAfter: ").append(getSubmittedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFHIRExportJobsRequest == false)
            return false;
        ListFHIRExportJobsRequest other = (ListFHIRExportJobsRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSubmittedBefore() == null ^ this.getSubmittedBefore() == null)
            return false;
        if (other.getSubmittedBefore() != null && other.getSubmittedBefore().equals(this.getSubmittedBefore()) == false)
            return false;
        if (other.getSubmittedAfter() == null ^ this.getSubmittedAfter() == null)
            return false;
        if (other.getSubmittedAfter() != null && other.getSubmittedAfter().equals(this.getSubmittedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmittedBefore() == null) ? 0 : getSubmittedBefore().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAfter() == null) ? 0 : getSubmittedAfter().hashCode());
        return hashCode;
    }

    @Override
    public ListFHIRExportJobsRequest clone() {
        return (ListFHIRExportJobsRequest) super.clone();
    }

}
