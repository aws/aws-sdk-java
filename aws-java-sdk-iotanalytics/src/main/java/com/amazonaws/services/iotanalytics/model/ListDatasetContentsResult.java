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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetContentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about data set contents that have been created.
     * </p>
     */
    private java.util.List<DatasetContentSummary> datasetContentSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about data set contents that have been created.
     * </p>
     * 
     * @return Summary information about data set contents that have been created.
     */

    public java.util.List<DatasetContentSummary> getDatasetContentSummaries() {
        return datasetContentSummaries;
    }

    /**
     * <p>
     * Summary information about data set contents that have been created.
     * </p>
     * 
     * @param datasetContentSummaries
     *        Summary information about data set contents that have been created.
     */

    public void setDatasetContentSummaries(java.util.Collection<DatasetContentSummary> datasetContentSummaries) {
        if (datasetContentSummaries == null) {
            this.datasetContentSummaries = null;
            return;
        }

        this.datasetContentSummaries = new java.util.ArrayList<DatasetContentSummary>(datasetContentSummaries);
    }

    /**
     * <p>
     * Summary information about data set contents that have been created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetContentSummaries(java.util.Collection)} or
     * {@link #withDatasetContentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param datasetContentSummaries
     *        Summary information about data set contents that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsResult withDatasetContentSummaries(DatasetContentSummary... datasetContentSummaries) {
        if (this.datasetContentSummaries == null) {
            setDatasetContentSummaries(new java.util.ArrayList<DatasetContentSummary>(datasetContentSummaries.length));
        }
        for (DatasetContentSummary ele : datasetContentSummaries) {
            this.datasetContentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about data set contents that have been created.
     * </p>
     * 
     * @param datasetContentSummaries
     *        Summary information about data set contents that have been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsResult withDatasetContentSummaries(java.util.Collection<DatasetContentSummary> datasetContentSummaries) {
        setDatasetContentSummaries(datasetContentSummaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetContentsResult withNextToken(String nextToken) {
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
        if (getDatasetContentSummaries() != null)
            sb.append("DatasetContentSummaries: ").append(getDatasetContentSummaries()).append(",");
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

        if (obj instanceof ListDatasetContentsResult == false)
            return false;
        ListDatasetContentsResult other = (ListDatasetContentsResult) obj;
        if (other.getDatasetContentSummaries() == null ^ this.getDatasetContentSummaries() == null)
            return false;
        if (other.getDatasetContentSummaries() != null && other.getDatasetContentSummaries().equals(this.getDatasetContentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDatasetContentSummaries() == null) ? 0 : getDatasetContentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetContentsResult clone() {
        try {
            return (ListDatasetContentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
