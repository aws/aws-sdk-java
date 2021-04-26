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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetExportJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of dataset export jobs.
     * </p>
     */
    private java.util.List<DatasetExportJobSummary> datasetExportJobs;
    /**
     * <p>
     * A token for getting the next set of dataset export jobs (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of dataset export jobs.
     * </p>
     * 
     * @return The list of dataset export jobs.
     */

    public java.util.List<DatasetExportJobSummary> getDatasetExportJobs() {
        return datasetExportJobs;
    }

    /**
     * <p>
     * The list of dataset export jobs.
     * </p>
     * 
     * @param datasetExportJobs
     *        The list of dataset export jobs.
     */

    public void setDatasetExportJobs(java.util.Collection<DatasetExportJobSummary> datasetExportJobs) {
        if (datasetExportJobs == null) {
            this.datasetExportJobs = null;
            return;
        }

        this.datasetExportJobs = new java.util.ArrayList<DatasetExportJobSummary>(datasetExportJobs);
    }

    /**
     * <p>
     * The list of dataset export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetExportJobs(java.util.Collection)} or {@link #withDatasetExportJobs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param datasetExportJobs
     *        The list of dataset export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsResult withDatasetExportJobs(DatasetExportJobSummary... datasetExportJobs) {
        if (this.datasetExportJobs == null) {
            setDatasetExportJobs(new java.util.ArrayList<DatasetExportJobSummary>(datasetExportJobs.length));
        }
        for (DatasetExportJobSummary ele : datasetExportJobs) {
            this.datasetExportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of dataset export jobs.
     * </p>
     * 
     * @param datasetExportJobs
     *        The list of dataset export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsResult withDatasetExportJobs(java.util.Collection<DatasetExportJobSummary> datasetExportJobs) {
        setDatasetExportJobs(datasetExportJobs);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of dataset export jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of dataset export jobs (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset export jobs (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of dataset export jobs (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset export jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of dataset export jobs (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetExportJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDatasetExportJobs() != null)
            sb.append("DatasetExportJobs: ").append(getDatasetExportJobs()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetExportJobsResult == false)
            return false;
        ListDatasetExportJobsResult other = (ListDatasetExportJobsResult) obj;
        if (other.getDatasetExportJobs() == null ^ this.getDatasetExportJobs() == null)
            return false;
        if (other.getDatasetExportJobs() != null && other.getDatasetExportJobs().equals(this.getDatasetExportJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetExportJobs() == null) ? 0 : getDatasetExportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetExportJobsResult clone() {
        try {
            return (ListDatasetExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
