/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetContentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data set whose contents information you want to list.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See
     * the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     */
    private java.util.Date scheduledOnOrAfter;
    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the
     * field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     */
    private java.util.Date scheduledBefore;

    /**
     * <p>
     * The name of the data set whose contents information you want to list.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set whose contents information you want to list.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the data set whose contents information you want to list.
     * </p>
     * 
     * @return The name of the data set whose contents information you want to list.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the data set whose contents information you want to list.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set whose contents information you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @return The maximum number of results to return in this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See
     * the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @param scheduledOnOrAfter
     *        A filter to limit results to those data set contents whose creation is scheduled on or after the given
     *        time. See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     */

    public void setScheduledOnOrAfter(java.util.Date scheduledOnOrAfter) {
        this.scheduledOnOrAfter = scheduledOnOrAfter;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See
     * the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @return A filter to limit results to those data set contents whose creation is scheduled on or after the given
     *         time. See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     */

    public java.util.Date getScheduledOnOrAfter() {
        return this.scheduledOnOrAfter;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See
     * the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @param scheduledOnOrAfter
     *        A filter to limit results to those data set contents whose creation is scheduled on or after the given
     *        time. See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsRequest withScheduledOnOrAfter(java.util.Date scheduledOnOrAfter) {
        setScheduledOnOrAfter(scheduledOnOrAfter);
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the
     * field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @param scheduledBefore
     *        A filter to limit results to those data set contents whose creation is scheduled before the given time.
     *        See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     */

    public void setScheduledBefore(java.util.Date scheduledBefore) {
        this.scheduledBefore = scheduledBefore;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the
     * field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @return A filter to limit results to those data set contents whose creation is scheduled before the given time.
     *         See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     */

    public java.util.Date getScheduledBefore() {
        return this.scheduledBefore;
    }

    /**
     * <p>
     * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the
     * field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * </p>
     * 
     * @param scheduledBefore
     *        A filter to limit results to those data set contents whose creation is scheduled before the given time.
     *        See the field <code>triggers.schedule</code> in the CreateDataset request. (timestamp)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsRequest withScheduledBefore(java.util.Date scheduledBefore) {
        setScheduledBefore(scheduledBefore);
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
        if (getScheduledOnOrAfter() != null)
            sb.append("ScheduledOnOrAfter: ").append(getScheduledOnOrAfter()).append(",");
        if (getScheduledBefore() != null)
            sb.append("ScheduledBefore: ").append(getScheduledBefore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetContentsRequest == false)
            return false;
        ListDatasetContentsRequest other = (ListDatasetContentsRequest) obj;
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
        if (other.getScheduledOnOrAfter() == null ^ this.getScheduledOnOrAfter() == null)
            return false;
        if (other.getScheduledOnOrAfter() != null && other.getScheduledOnOrAfter().equals(this.getScheduledOnOrAfter()) == false)
            return false;
        if (other.getScheduledBefore() == null ^ this.getScheduledBefore() == null)
            return false;
        if (other.getScheduledBefore() != null && other.getScheduledBefore().equals(this.getScheduledBefore()) == false)
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
        hashCode = prime * hashCode + ((getScheduledOnOrAfter() == null) ? 0 : getScheduledOnOrAfter().hashCode());
        hashCode = prime * hashCode + ((getScheduledBefore() == null) ? 0 : getScheduledBefore().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetContentsRequest clone() {
        return (ListDatasetContentsRequest) super.clone();
    }

}
