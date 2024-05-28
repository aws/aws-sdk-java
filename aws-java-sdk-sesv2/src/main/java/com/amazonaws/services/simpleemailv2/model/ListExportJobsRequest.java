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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to list all export jobs with filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position in the
     * list of export jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional export
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve additional export
     * jobs.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * </p>
     */
    private String exportSourceType;
    /**
     * <p>
     * A value used to list export jobs that have a certain <code>JobStatus</code>.
     * </p>
     */
    private String jobStatus;

    /**
     * <p>
     * The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position in the
     * list of export jobs.
     * </p>
     * 
     * @param nextToken
     *        The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position
     *        in the list of export jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position in the
     * list of export jobs.
     * </p>
     * 
     * @return The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the
     *         position in the list of export jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position in the
     * list of export jobs.
     * </p>
     * 
     * @param nextToken
     *        The pagination token returned from a previous call to <code>ListExportJobs</code> to indicate the position
     *        in the list of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional export
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve additional export
     * jobs.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional
     *        export jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *        Use the <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve
     *        additional export jobs.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional export
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve additional export
     * jobs.
     * </p>
     * 
     * @return Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional
     *         export jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *         Use the <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve
     *         additional export jobs.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional export
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve additional export
     * jobs.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of export jobs to return at once. Use this parameter to paginate results. If additional
     *        export jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *        Use the <code>NextToken</code> value in subsequent calls to <code>ListExportJobs</code> to retrieve
     *        additional export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportJobsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * </p>
     * 
     * @param exportSourceType
     *        A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * @see ExportSourceType
     */

    public void setExportSourceType(String exportSourceType) {
        this.exportSourceType = exportSourceType;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * </p>
     * 
     * @return A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * @see ExportSourceType
     */

    public String getExportSourceType() {
        return this.exportSourceType;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * </p>
     * 
     * @param exportSourceType
     *        A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSourceType
     */

    public ListExportJobsRequest withExportSourceType(String exportSourceType) {
        setExportSourceType(exportSourceType);
        return this;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * </p>
     * 
     * @param exportSourceType
     *        A value used to list export jobs that have a certain <code>ExportSourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSourceType
     */

    public ListExportJobsRequest withExportSourceType(ExportSourceType exportSourceType) {
        this.exportSourceType = exportSourceType.toString();
        return this;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>JobStatus</code>.
     * </p>
     * 
     * @param jobStatus
     *        A value used to list export jobs that have a certain <code>JobStatus</code>.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>JobStatus</code>.
     * </p>
     * 
     * @return A value used to list export jobs that have a certain <code>JobStatus</code>.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>JobStatus</code>.
     * </p>
     * 
     * @param jobStatus
     *        A value used to list export jobs that have a certain <code>JobStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListExportJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * A value used to list export jobs that have a certain <code>JobStatus</code>.
     * </p>
     * 
     * @param jobStatus
     *        A value used to list export jobs that have a certain <code>JobStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListExportJobsRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getExportSourceType() != null)
            sb.append("ExportSourceType: ").append(getExportSourceType()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExportJobsRequest == false)
            return false;
        ListExportJobsRequest other = (ListExportJobsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getExportSourceType() == null ^ this.getExportSourceType() == null)
            return false;
        if (other.getExportSourceType() != null && other.getExportSourceType().equals(this.getExportSourceType()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getExportSourceType() == null) ? 0 : getExportSourceType().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListExportJobsRequest clone() {
        return (ListExportJobsRequest) super.clone();
    }

}
