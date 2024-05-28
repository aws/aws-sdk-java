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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListBatchLoadTasks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchLoadTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of batch load task details.
     * </p>
     */
    private java.util.List<BatchLoadTask> batchLoadTasks;

    /**
     * <p>
     * A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     * </p>
     * 
     * @return A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchLoadTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of batch load task details.
     * </p>
     * 
     * @return A list of batch load task details.
     */

    public java.util.List<BatchLoadTask> getBatchLoadTasks() {
        return batchLoadTasks;
    }

    /**
     * <p>
     * A list of batch load task details.
     * </p>
     * 
     * @param batchLoadTasks
     *        A list of batch load task details.
     */

    public void setBatchLoadTasks(java.util.Collection<BatchLoadTask> batchLoadTasks) {
        if (batchLoadTasks == null) {
            this.batchLoadTasks = null;
            return;
        }

        this.batchLoadTasks = new java.util.ArrayList<BatchLoadTask>(batchLoadTasks);
    }

    /**
     * <p>
     * A list of batch load task details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchLoadTasks(java.util.Collection)} or {@link #withBatchLoadTasks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param batchLoadTasks
     *        A list of batch load task details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchLoadTasksResult withBatchLoadTasks(BatchLoadTask... batchLoadTasks) {
        if (this.batchLoadTasks == null) {
            setBatchLoadTasks(new java.util.ArrayList<BatchLoadTask>(batchLoadTasks.length));
        }
        for (BatchLoadTask ele : batchLoadTasks) {
            this.batchLoadTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of batch load task details.
     * </p>
     * 
     * @param batchLoadTasks
     *        A list of batch load task details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchLoadTasksResult withBatchLoadTasks(java.util.Collection<BatchLoadTask> batchLoadTasks) {
        setBatchLoadTasks(batchLoadTasks);
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
        if (getBatchLoadTasks() != null)
            sb.append("BatchLoadTasks: ").append(getBatchLoadTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBatchLoadTasksResult == false)
            return false;
        ListBatchLoadTasksResult other = (ListBatchLoadTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBatchLoadTasks() == null ^ this.getBatchLoadTasks() == null)
            return false;
        if (other.getBatchLoadTasks() != null && other.getBatchLoadTasks().equals(this.getBatchLoadTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBatchLoadTasks() == null) ? 0 : getBatchLoadTasks().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchLoadTasksResult clone() {
        try {
            return (ListBatchLoadTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
