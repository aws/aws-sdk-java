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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * </p>
     */
    private java.util.List<DatasetSummary> datasetSummaries;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of datasets.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of datasets.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * </p>
     * 
     * @return Provides information about the specified dataset, including creation time, dataset ARN, and status.
     */

    public java.util.List<DatasetSummary> getDatasetSummaries() {
        return datasetSummaries;
    }

    /**
     * <p>
     * Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * </p>
     * 
     * @param datasetSummaries
     *        Provides information about the specified dataset, including creation time, dataset ARN, and status.
     */

    public void setDatasetSummaries(java.util.Collection<DatasetSummary> datasetSummaries) {
        if (datasetSummaries == null) {
            this.datasetSummaries = null;
            return;
        }

        this.datasetSummaries = new java.util.ArrayList<DatasetSummary>(datasetSummaries);
    }

    /**
     * <p>
     * Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetSummaries(java.util.Collection)} or {@link #withDatasetSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param datasetSummaries
     *        Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasetSummaries(DatasetSummary... datasetSummaries) {
        if (this.datasetSummaries == null) {
            setDatasetSummaries(new java.util.ArrayList<DatasetSummary>(datasetSummaries.length));
        }
        for (DatasetSummary ele : datasetSummaries) {
            this.datasetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * </p>
     * 
     * @param datasetSummaries
     *        Provides information about the specified dataset, including creation time, dataset ARN, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasetSummaries(java.util.Collection<DatasetSummary> datasetSummaries) {
        setDatasetSummaries(datasetSummaries);
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
        if (getDatasetSummaries() != null)
            sb.append("DatasetSummaries: ").append(getDatasetSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetsResult == false)
            return false;
        ListDatasetsResult other = (ListDatasetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDatasetSummaries() == null ^ this.getDatasetSummaries() == null)
            return false;
        if (other.getDatasetSummaries() != null && other.getDatasetSummaries().equals(this.getDatasetSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDatasetSummaries() == null) ? 0 : getDatasetSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetsResult clone() {
        try {
            return (ListDatasetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
