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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the labels in the dataset.
     * </p>
     */
    private java.util.List<DatasetLabelDescription> datasetLabelDescriptions;
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the labels in the dataset.
     * </p>
     * 
     * @return A list of the labels in the dataset.
     */

    public java.util.List<DatasetLabelDescription> getDatasetLabelDescriptions() {
        return datasetLabelDescriptions;
    }

    /**
     * <p>
     * A list of the labels in the dataset.
     * </p>
     * 
     * @param datasetLabelDescriptions
     *        A list of the labels in the dataset.
     */

    public void setDatasetLabelDescriptions(java.util.Collection<DatasetLabelDescription> datasetLabelDescriptions) {
        if (datasetLabelDescriptions == null) {
            this.datasetLabelDescriptions = null;
            return;
        }

        this.datasetLabelDescriptions = new java.util.ArrayList<DatasetLabelDescription>(datasetLabelDescriptions);
    }

    /**
     * <p>
     * A list of the labels in the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetLabelDescriptions(java.util.Collection)} or
     * {@link #withDatasetLabelDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param datasetLabelDescriptions
     *        A list of the labels in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetLabelsResult withDatasetLabelDescriptions(DatasetLabelDescription... datasetLabelDescriptions) {
        if (this.datasetLabelDescriptions == null) {
            setDatasetLabelDescriptions(new java.util.ArrayList<DatasetLabelDescription>(datasetLabelDescriptions.length));
        }
        for (DatasetLabelDescription ele : datasetLabelDescriptions) {
            this.datasetLabelDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the labels in the dataset.
     * </p>
     * 
     * @param datasetLabelDescriptions
     *        A list of the labels in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetLabelsResult withDatasetLabelDescriptions(java.util.Collection<DatasetLabelDescription> datasetLabelDescriptions) {
        setDatasetLabelDescriptions(datasetLabelDescriptions);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *         Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetLabelsResult withNextToken(String nextToken) {
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
        if (getDatasetLabelDescriptions() != null)
            sb.append("DatasetLabelDescriptions: ").append(getDatasetLabelDescriptions()).append(",");
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

        if (obj instanceof ListDatasetLabelsResult == false)
            return false;
        ListDatasetLabelsResult other = (ListDatasetLabelsResult) obj;
        if (other.getDatasetLabelDescriptions() == null ^ this.getDatasetLabelDescriptions() == null)
            return false;
        if (other.getDatasetLabelDescriptions() != null && other.getDatasetLabelDescriptions().equals(this.getDatasetLabelDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getDatasetLabelDescriptions() == null) ? 0 : getDatasetLabelDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetLabelsResult clone() {
        try {
            return (ListDatasetLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
