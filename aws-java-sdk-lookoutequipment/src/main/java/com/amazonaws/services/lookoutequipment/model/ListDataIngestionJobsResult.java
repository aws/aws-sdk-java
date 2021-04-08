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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataIngestionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of data ingestion jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies information about the specific data ingestion job, including dataset name and status.
     * </p>
     */
    private java.util.List<DataIngestionJobSummary> dataIngestionJobSummaries;

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

    public ListDataIngestionJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies information about the specific data ingestion job, including dataset name and status.
     * </p>
     * 
     * @return Specifies information about the specific data ingestion job, including dataset name and status.
     */

    public java.util.List<DataIngestionJobSummary> getDataIngestionJobSummaries() {
        return dataIngestionJobSummaries;
    }

    /**
     * <p>
     * Specifies information about the specific data ingestion job, including dataset name and status.
     * </p>
     * 
     * @param dataIngestionJobSummaries
     *        Specifies information about the specific data ingestion job, including dataset name and status.
     */

    public void setDataIngestionJobSummaries(java.util.Collection<DataIngestionJobSummary> dataIngestionJobSummaries) {
        if (dataIngestionJobSummaries == null) {
            this.dataIngestionJobSummaries = null;
            return;
        }

        this.dataIngestionJobSummaries = new java.util.ArrayList<DataIngestionJobSummary>(dataIngestionJobSummaries);
    }

    /**
     * <p>
     * Specifies information about the specific data ingestion job, including dataset name and status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataIngestionJobSummaries(java.util.Collection)} or
     * {@link #withDataIngestionJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataIngestionJobSummaries
     *        Specifies information about the specific data ingestion job, including dataset name and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIngestionJobsResult withDataIngestionJobSummaries(DataIngestionJobSummary... dataIngestionJobSummaries) {
        if (this.dataIngestionJobSummaries == null) {
            setDataIngestionJobSummaries(new java.util.ArrayList<DataIngestionJobSummary>(dataIngestionJobSummaries.length));
        }
        for (DataIngestionJobSummary ele : dataIngestionJobSummaries) {
            this.dataIngestionJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies information about the specific data ingestion job, including dataset name and status.
     * </p>
     * 
     * @param dataIngestionJobSummaries
     *        Specifies information about the specific data ingestion job, including dataset name and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIngestionJobsResult withDataIngestionJobSummaries(java.util.Collection<DataIngestionJobSummary> dataIngestionJobSummaries) {
        setDataIngestionJobSummaries(dataIngestionJobSummaries);
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
        if (getDataIngestionJobSummaries() != null)
            sb.append("DataIngestionJobSummaries: ").append(getDataIngestionJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataIngestionJobsResult == false)
            return false;
        ListDataIngestionJobsResult other = (ListDataIngestionJobsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDataIngestionJobSummaries() == null ^ this.getDataIngestionJobSummaries() == null)
            return false;
        if (other.getDataIngestionJobSummaries() != null && other.getDataIngestionJobSummaries().equals(this.getDataIngestionJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDataIngestionJobSummaries() == null) ? 0 : getDataIngestionJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListDataIngestionJobsResult clone() {
        try {
            return (ListDataIngestionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
