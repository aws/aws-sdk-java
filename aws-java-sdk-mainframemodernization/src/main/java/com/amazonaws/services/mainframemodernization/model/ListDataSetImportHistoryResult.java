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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSetImportHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSetImportHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data set import tasks.
     * </p>
     */
    private java.util.List<DataSetImportTask> dataSetImportTasks;
    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The data set import tasks.
     * </p>
     * 
     * @return The data set import tasks.
     */

    public java.util.List<DataSetImportTask> getDataSetImportTasks() {
        return dataSetImportTasks;
    }

    /**
     * <p>
     * The data set import tasks.
     * </p>
     * 
     * @param dataSetImportTasks
     *        The data set import tasks.
     */

    public void setDataSetImportTasks(java.util.Collection<DataSetImportTask> dataSetImportTasks) {
        if (dataSetImportTasks == null) {
            this.dataSetImportTasks = null;
            return;
        }

        this.dataSetImportTasks = new java.util.ArrayList<DataSetImportTask>(dataSetImportTasks);
    }

    /**
     * <p>
     * The data set import tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetImportTasks(java.util.Collection)} or {@link #withDataSetImportTasks(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dataSetImportTasks
     *        The data set import tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetImportHistoryResult withDataSetImportTasks(DataSetImportTask... dataSetImportTasks) {
        if (this.dataSetImportTasks == null) {
            setDataSetImportTasks(new java.util.ArrayList<DataSetImportTask>(dataSetImportTasks.length));
        }
        for (DataSetImportTask ele : dataSetImportTasks) {
            this.dataSetImportTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data set import tasks.
     * </p>
     * 
     * @param dataSetImportTasks
     *        The data set import tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetImportHistoryResult withDataSetImportTasks(java.util.Collection<DataSetImportTask> dataSetImportTasks) {
        setDataSetImportTasks(dataSetImportTasks);
        return this;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return If there are more items to return, this contains a token that is passed to a subsequent call to this
     *         operation to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSetImportHistoryResult withNextToken(String nextToken) {
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
        if (getDataSetImportTasks() != null)
            sb.append("DataSetImportTasks: ").append(getDataSetImportTasks()).append(",");
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

        if (obj instanceof ListDataSetImportHistoryResult == false)
            return false;
        ListDataSetImportHistoryResult other = (ListDataSetImportHistoryResult) obj;
        if (other.getDataSetImportTasks() == null ^ this.getDataSetImportTasks() == null)
            return false;
        if (other.getDataSetImportTasks() != null && other.getDataSetImportTasks().equals(this.getDataSetImportTasks()) == false)
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

        hashCode = prime * hashCode + ((getDataSetImportTasks() == null) ? 0 : getDataSetImportTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSetImportHistoryResult clone() {
        try {
            return (ListDataSetImportHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
