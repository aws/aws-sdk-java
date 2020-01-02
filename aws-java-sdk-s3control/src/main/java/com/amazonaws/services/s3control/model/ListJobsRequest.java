/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String accountId;
    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     */
    private java.util.List<String> jobStatuses;
    /**
     * <p>
     * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     * <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     * request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there are more
     * jobs than this number, the response will include a pagination token in the <code>NextToken</code> field to enable
     * you to retrieve the next page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p/>
     * 
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p/>
     * 
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     * 
     * @return The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * @see JobStatus
     */

    public java.util.List<String> getJobStatuses() {
        return jobStatuses;
    }

    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     * 
     * @param jobStatuses
     *        The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * @see JobStatus
     */

    public void setJobStatuses(java.util.Collection<String> jobStatuses) {
        if (jobStatuses == null) {
            this.jobStatuses = null;
            return;
        }

        this.jobStatuses = new java.util.ArrayList<String>(jobStatuses);
    }

    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobStatuses(java.util.Collection)} or {@link #withJobStatuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobStatuses
     *        The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatuses(String... jobStatuses) {
        if (this.jobStatuses == null) {
            setJobStatuses(new java.util.ArrayList<String>(jobStatuses.length));
        }
        for (String ele : jobStatuses) {
            this.jobStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     * 
     * @param jobStatuses
     *        The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatuses(java.util.Collection<String> jobStatuses) {
        setJobStatuses(jobStatuses);
        return this;
    }

    /**
     * <p>
     * The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * </p>
     * 
     * @param jobStatuses
     *        The <code>List Jobs</code> request returns jobs that match the statuses listed in this element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatuses(JobStatus... jobStatuses) {
        java.util.ArrayList<String> jobStatusesCopy = new java.util.ArrayList<String>(jobStatuses.length);
        for (JobStatus value : jobStatuses) {
            jobStatusesCopy.add(value.toString());
        }
        if (getJobStatuses() == null) {
            setJobStatuses(jobStatusesCopy);
        } else {
            getJobStatuses().addAll(jobStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     * <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     * request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     *        <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     *        request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     * <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     * request.
     * </p>
     * 
     * @return A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     *         <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous
     *         <code>List Jobs</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     * <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     * request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Use the token that Amazon S3 returned in the
     *        <code>NextToken</code> element of the <code>ListJobsResult</code> from the previous <code>List Jobs</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there are more
     * jobs than this number, the response will include a pagination token in the <code>NextToken</code> field to enable
     * you to retrieve the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there
     *        are more jobs than this number, the response will include a pagination token in the <code>NextToken</code>
     *        field to enable you to retrieve the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there are more
     * jobs than this number, the response will include a pagination token in the <code>NextToken</code> field to enable
     * you to retrieve the next page of results.
     * </p>
     * 
     * @return The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there
     *         are more jobs than this number, the response will include a pagination token in the
     *         <code>NextToken</code> field to enable you to retrieve the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there are more
     * jobs than this number, the response will include a pagination token in the <code>NextToken</code> field to enable
     * you to retrieve the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs that Amazon S3 will include in the <code>List Jobs</code> response. If there
     *        are more jobs than this number, the response will include a pagination token in the <code>NextToken</code>
     *        field to enable you to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxResults(Integer maxResults) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getJobStatuses() != null)
            sb.append("JobStatuses: ").append(getJobStatuses()).append(",");
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

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getJobStatuses() == null ^ this.getJobStatuses() == null)
            return false;
        if (other.getJobStatuses() != null && other.getJobStatuses().equals(this.getJobStatuses()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobStatuses() == null) ? 0 : getJobStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
