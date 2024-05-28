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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDatasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The dataset properties list.
     * </p>
     */
    private java.util.List<DatasetProperties> datasetPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The dataset properties list.
     * </p>
     * 
     * @return The dataset properties list.
     */

    public java.util.List<DatasetProperties> getDatasetPropertiesList() {
        return datasetPropertiesList;
    }

    /**
     * <p>
     * The dataset properties list.
     * </p>
     * 
     * @param datasetPropertiesList
     *        The dataset properties list.
     */

    public void setDatasetPropertiesList(java.util.Collection<DatasetProperties> datasetPropertiesList) {
        if (datasetPropertiesList == null) {
            this.datasetPropertiesList = null;
            return;
        }

        this.datasetPropertiesList = new java.util.ArrayList<DatasetProperties>(datasetPropertiesList);
    }

    /**
     * <p>
     * The dataset properties list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetPropertiesList(java.util.Collection)} or
     * {@link #withDatasetPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param datasetPropertiesList
     *        The dataset properties list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasetPropertiesList(DatasetProperties... datasetPropertiesList) {
        if (this.datasetPropertiesList == null) {
            setDatasetPropertiesList(new java.util.ArrayList<DatasetProperties>(datasetPropertiesList.length));
        }
        for (DatasetProperties ele : datasetPropertiesList) {
            this.datasetPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dataset properties list.
     * </p>
     * 
     * @param datasetPropertiesList
     *        The dataset properties list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetsResult withDatasetPropertiesList(java.util.Collection<DatasetProperties> datasetPropertiesList) {
        setDatasetPropertiesList(datasetPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
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
        if (getDatasetPropertiesList() != null)
            sb.append("DatasetPropertiesList: ").append(getDatasetPropertiesList()).append(",");
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
        if (other.getDatasetPropertiesList() == null ^ this.getDatasetPropertiesList() == null)
            return false;
        if (other.getDatasetPropertiesList() != null && other.getDatasetPropertiesList().equals(this.getDatasetPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getDatasetPropertiesList() == null) ? 0 : getDatasetPropertiesList().hashCode());
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
