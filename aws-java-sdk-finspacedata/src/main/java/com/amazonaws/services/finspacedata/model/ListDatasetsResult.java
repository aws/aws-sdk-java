/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response for the ListDatasets operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Datasets.
     * </p>
     */
    private java.util.List<Dataset> datasets;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of Datasets.
     * </p>
     * 
     * @return List of Datasets.
     */

    public java.util.List<Dataset> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * List of Datasets.
     * </p>
     * 
     * @param datasets
     *        List of Datasets.
     */

    public void setDatasets(java.util.Collection<Dataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<Dataset>(datasets);
    }

    /**
     * <p>
     * List of Datasets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     *        List of Datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasets(Dataset... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<Dataset>(datasets.length));
        }
        for (Dataset ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Datasets.
     * </p>
     * 
     * @param datasets
     *        List of Datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasets(java.util.Collection<Dataset> datasets) {
        setDatasets(datasets);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
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
