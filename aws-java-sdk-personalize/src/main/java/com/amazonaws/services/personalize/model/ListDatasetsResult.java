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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata information.
     * </p>
     */
    private java.util.List<DatasetSummary> datasets;
    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata information.
     * </p>
     * 
     * @return An array of <code>Dataset</code> objects. Each object provides metadata information.
     */

    public java.util.List<DatasetSummary> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata information.
     * </p>
     * 
     * @param datasets
     *        An array of <code>Dataset</code> objects. Each object provides metadata information.
     */

    public void setDatasets(java.util.Collection<DatasetSummary> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DatasetSummary>(datasets);
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     *        An array of <code>Dataset</code> objects. Each object provides metadata information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasets(DatasetSummary... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<DatasetSummary>(datasets.length));
        }
        for (DatasetSummary ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata information.
     * </p>
     * 
     * @param datasets
     *        An array of <code>Dataset</code> objects. Each object provides metadata information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasets(java.util.Collection<DatasetSummary> datasets) {
        setDatasets(datasets);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of datasets (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of datasets (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of datasets (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withNextToken(String nextToken) {
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
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets()).append(",");
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

        if (obj instanceof ListDatasetsResult == false)
            return false;
        ListDatasetsResult other = (ListDatasetsResult) obj;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
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

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
