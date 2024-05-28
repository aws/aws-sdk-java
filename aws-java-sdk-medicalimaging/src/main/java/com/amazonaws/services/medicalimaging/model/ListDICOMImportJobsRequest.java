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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDICOMImportJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDICOMImportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The pagination token used to request the list of import jobs on the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The max results count. The upper bound is determined by load testing.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDICOMImportJobsRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @return The filters for listing import jobs based on status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListDICOMImportJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListDICOMImportJobsRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token used to request the list of import jobs on the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to request the list of import jobs on the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to request the list of import jobs on the next page.
     * </p>
     * 
     * @return The pagination token used to request the list of import jobs on the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to request the list of import jobs on the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to request the list of import jobs on the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDICOMImportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The max results count. The upper bound is determined by load testing.
     * </p>
     * 
     * @param maxResults
     *        The max results count. The upper bound is determined by load testing.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The max results count. The upper bound is determined by load testing.
     * </p>
     * 
     * @return The max results count. The upper bound is determined by load testing.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The max results count. The upper bound is determined by load testing.
     * </p>
     * 
     * @param maxResults
     *        The max results count. The upper bound is determined by load testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDICOMImportJobsRequest withMaxResults(Integer maxResults) {
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
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

        if (obj instanceof ListDICOMImportJobsRequest == false)
            return false;
        ListDICOMImportJobsRequest other = (ListDICOMImportJobsRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
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

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDICOMImportJobsRequest clone() {
        return (ListDICOMImportJobsRequest) super.clone();
    }

}
