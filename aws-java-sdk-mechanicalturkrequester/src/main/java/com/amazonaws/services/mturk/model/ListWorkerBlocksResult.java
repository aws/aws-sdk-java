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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkerBlocks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkerBlocksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextToken;
    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * </p>
     */
    private java.util.List<WorkerBlock> workerBlocks;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerBlocksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of assignments on the page in the filtered results list, equivalent to the number of
     *        assignments returned by this call.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @return The number of assignments on the page in the filtered results list, equivalent to the number of
     *         assignments returned by this call.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of assignments on the page in the filtered results list, equivalent to the number of
     *        assignments returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerBlocksResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * </p>
     * 
     * @return The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     */

    public java.util.List<WorkerBlock> getWorkerBlocks() {
        return workerBlocks;
    }

    /**
     * <p>
     * The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * </p>
     * 
     * @param workerBlocks
     *        The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     */

    public void setWorkerBlocks(java.util.Collection<WorkerBlock> workerBlocks) {
        if (workerBlocks == null) {
            this.workerBlocks = null;
            return;
        }

        this.workerBlocks = new java.util.ArrayList<WorkerBlock>(workerBlocks);
    }

    /**
     * <p>
     * The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkerBlocks(java.util.Collection)} or {@link #withWorkerBlocks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workerBlocks
     *        The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerBlocksResult withWorkerBlocks(WorkerBlock... workerBlocks) {
        if (this.workerBlocks == null) {
            setWorkerBlocks(new java.util.ArrayList<WorkerBlock>(workerBlocks.length));
        }
        for (WorkerBlock ele : workerBlocks) {
            this.workerBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * </p>
     * 
     * @param workerBlocks
     *        The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerBlocksResult withWorkerBlocks(java.util.Collection<WorkerBlock> workerBlocks) {
        setWorkerBlocks(workerBlocks);
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
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getWorkerBlocks() != null)
            sb.append("WorkerBlocks: ").append(getWorkerBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkerBlocksResult == false)
            return false;
        ListWorkerBlocksResult other = (ListWorkerBlocksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getWorkerBlocks() == null ^ this.getWorkerBlocks() == null)
            return false;
        if (other.getWorkerBlocks() != null && other.getWorkerBlocks().equals(this.getWorkerBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getWorkerBlocks() == null) ? 0 : getWorkerBlocks().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkerBlocksResult clone() {
        try {
            return (ListWorkerBlocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
