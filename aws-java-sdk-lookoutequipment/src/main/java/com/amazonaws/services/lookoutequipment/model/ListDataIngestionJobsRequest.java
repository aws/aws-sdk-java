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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataIngestionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset being used for the data ingestion job.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of data ingestion jobs to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the dataset being used for the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used for the data ingestion job.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used for the data ingestion job.
     * </p>
     * 
     * @return The name of the dataset being used for the data ingestion job.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used for the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used for the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIngestionJobsRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIngestionJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of data ingestion jobs to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of data ingestion jobs to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of data ingestion jobs to list.
     * </p>
     * 
     * @return Specifies the maximum number of data ingestion jobs to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of data ingestion jobs to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of data ingestion jobs to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIngestionJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @see IngestionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @return Indicates the status of the data ingestion job.
     * @see IngestionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public ListDataIngestionJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public ListDataIngestionJobsRequest withStatus(IngestionJobStatus status) {
        this.status = status.toString();
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataIngestionJobsRequest == false)
            return false;
        ListDataIngestionJobsRequest other = (ListDataIngestionJobsRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListDataIngestionJobsRequest clone() {
        return (ListDataIngestionJobsRequest) super.clone();
    }

}
