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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRestoreJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     * </p>
     */
    private String byAccountId;
    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     */
    private java.util.Date byCreatedBefore;
    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     */
    private java.util.Date byCreatedAfter;
    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     */
    private String byStatus;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @return The maximum number of items to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     * </p>
     * 
     * @param byAccountId
     *        The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     */

    public void setByAccountId(String byAccountId) {
        this.byAccountId = byAccountId;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     * </p>
     * 
     * @return The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     */

    public String getByAccountId() {
        return this.byAccountId;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     * </p>
     * 
     * @param byAccountId
     *        The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreJobsRequest withByAccountId(String byAccountId) {
        setByAccountId(byAccountId);
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only restore jobs that were created before the specified date.
     */

    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     * 
     * @return Returns only restore jobs that were created before the specified date.
     */

    public java.util.Date getByCreatedBefore() {
        return this.byCreatedBefore;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only restore jobs that were created before the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreJobsRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        setByCreatedBefore(byCreatedBefore);
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only restore jobs that were created after the specified date.
     */

    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     * 
     * @return Returns only restore jobs that were created after the specified date.
     */

    public java.util.Date getByCreatedAfter() {
        return this.byCreatedAfter;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only restore jobs that were created after the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRestoreJobsRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        setByCreatedAfter(byCreatedAfter);
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * 
     * @param byStatus
     *        Returns only restore jobs associated with the specified job status.
     * @see RestoreJobStatus
     */

    public void setByStatus(String byStatus) {
        this.byStatus = byStatus;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * 
     * @return Returns only restore jobs associated with the specified job status.
     * @see RestoreJobStatus
     */

    public String getByStatus() {
        return this.byStatus;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * 
     * @param byStatus
     *        Returns only restore jobs associated with the specified job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobStatus
     */

    public ListRestoreJobsRequest withByStatus(String byStatus) {
        setByStatus(byStatus);
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * 
     * @param byStatus
     *        Returns only restore jobs associated with the specified job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobStatus
     */

    public ListRestoreJobsRequest withByStatus(RestoreJobStatus byStatus) {
        this.byStatus = byStatus.toString();
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getByAccountId() != null)
            sb.append("ByAccountId: ").append(getByAccountId()).append(",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: ").append(getByCreatedBefore()).append(",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: ").append(getByCreatedAfter()).append(",");
        if (getByStatus() != null)
            sb.append("ByStatus: ").append(getByStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRestoreJobsRequest == false)
            return false;
        ListRestoreJobsRequest other = (ListRestoreJobsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getByAccountId() == null ^ this.getByAccountId() == null)
            return false;
        if (other.getByAccountId() != null && other.getByAccountId().equals(this.getByAccountId()) == false)
            return false;
        if (other.getByCreatedBefore() == null ^ this.getByCreatedBefore() == null)
            return false;
        if (other.getByCreatedBefore() != null && other.getByCreatedBefore().equals(this.getByCreatedBefore()) == false)
            return false;
        if (other.getByCreatedAfter() == null ^ this.getByCreatedAfter() == null)
            return false;
        if (other.getByCreatedAfter() != null && other.getByCreatedAfter().equals(this.getByCreatedAfter()) == false)
            return false;
        if (other.getByStatus() == null ^ this.getByStatus() == null)
            return false;
        if (other.getByStatus() != null && other.getByStatus().equals(this.getByStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getByAccountId() == null) ? 0 : getByAccountId().hashCode());
        hashCode = prime * hashCode + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getByStatus() == null) ? 0 : getByStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListRestoreJobsRequest clone() {
        return (ListRestoreJobsRequest) super.clone();
    }

}
