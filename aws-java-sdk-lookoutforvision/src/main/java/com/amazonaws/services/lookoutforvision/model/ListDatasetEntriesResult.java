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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetEntriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the entries (JSON Lines) within the dataset.
     * </p>
     */
    private java.util.List<String> datasetEntries;
    /**
     * <p>
     * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent
     * request to retrieve the next set ofdataset entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the entries (JSON Lines) within the dataset.
     * </p>
     * 
     * @return A list of the entries (JSON Lines) within the dataset.
     */

    public java.util.List<String> getDatasetEntries() {
        return datasetEntries;
    }

    /**
     * <p>
     * A list of the entries (JSON Lines) within the dataset.
     * </p>
     * 
     * @param datasetEntries
     *        A list of the entries (JSON Lines) within the dataset.
     */

    public void setDatasetEntries(java.util.Collection<String> datasetEntries) {
        if (datasetEntries == null) {
            this.datasetEntries = null;
            return;
        }

        this.datasetEntries = new java.util.ArrayList<String>(datasetEntries);
    }

    /**
     * <p>
     * A list of the entries (JSON Lines) within the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetEntries(java.util.Collection)} or {@link #withDatasetEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param datasetEntries
     *        A list of the entries (JSON Lines) within the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesResult withDatasetEntries(String... datasetEntries) {
        if (this.datasetEntries == null) {
            setDatasetEntries(new java.util.ArrayList<String>(datasetEntries.length));
        }
        for (String ele : datasetEntries) {
            this.datasetEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the entries (JSON Lines) within the dataset.
     * </p>
     * 
     * @param datasetEntries
     *        A list of the entries (JSON Lines) within the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesResult withDatasetEntries(java.util.Collection<String> datasetEntries) {
        setDatasetEntries(datasetEntries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent
     * request to retrieve the next set ofdataset entries.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the
     *        subsequent request to retrieve the next set ofdataset entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent
     * request to retrieve the next set ofdataset entries.
     * </p>
     * 
     * @return If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the
     *         subsequent request to retrieve the next set ofdataset entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent
     * request to retrieve the next set ofdataset entries.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the
     *        subsequent request to retrieve the next set ofdataset entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesResult withNextToken(String nextToken) {
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
        if (getDatasetEntries() != null)
            sb.append("DatasetEntries: ").append(getDatasetEntries()).append(",");
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

        if (obj instanceof ListDatasetEntriesResult == false)
            return false;
        ListDatasetEntriesResult other = (ListDatasetEntriesResult) obj;
        if (other.getDatasetEntries() == null ^ this.getDatasetEntries() == null)
            return false;
        if (other.getDatasetEntries() != null && other.getDatasetEntries().equals(this.getDatasetEntries()) == false)
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

        hashCode = prime * hashCode + ((getDatasetEntries() == null) ? 0 : getDatasetEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetEntriesResult clone() {
        try {
            return (ListDatasetEntriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
