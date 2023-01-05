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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchJobExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of batch job executions for an application.
     * </p>
     */
    private java.util.List<BatchJobExecutionSummary> batchJobExecutions;
    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all batch job executions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of batch job executions for an application.
     * </p>
     * 
     * @return Returns a list of batch job executions for an application.
     */

    public java.util.List<BatchJobExecutionSummary> getBatchJobExecutions() {
        return batchJobExecutions;
    }

    /**
     * <p>
     * Returns a list of batch job executions for an application.
     * </p>
     * 
     * @param batchJobExecutions
     *        Returns a list of batch job executions for an application.
     */

    public void setBatchJobExecutions(java.util.Collection<BatchJobExecutionSummary> batchJobExecutions) {
        if (batchJobExecutions == null) {
            this.batchJobExecutions = null;
            return;
        }

        this.batchJobExecutions = new java.util.ArrayList<BatchJobExecutionSummary>(batchJobExecutions);
    }

    /**
     * <p>
     * Returns a list of batch job executions for an application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchJobExecutions(java.util.Collection)} or {@link #withBatchJobExecutions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param batchJobExecutions
     *        Returns a list of batch job executions for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsResult withBatchJobExecutions(BatchJobExecutionSummary... batchJobExecutions) {
        if (this.batchJobExecutions == null) {
            setBatchJobExecutions(new java.util.ArrayList<BatchJobExecutionSummary>(batchJobExecutions.length));
        }
        for (BatchJobExecutionSummary ele : batchJobExecutions) {
            this.batchJobExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of batch job executions for an application.
     * </p>
     * 
     * @param batchJobExecutions
     *        Returns a list of batch job executions for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsResult withBatchJobExecutions(java.util.Collection<BatchJobExecutionSummary> batchJobExecutions) {
        setBatchJobExecutions(batchJobExecutions);
        return this;
    }

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all batch job executions.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's returned when the response doesn't contain all batch job executions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all batch job executions.
     * </p>
     * 
     * @return A pagination token that's returned when the response doesn't contain all batch job executions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all batch job executions.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's returned when the response doesn't contain all batch job executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsResult withNextToken(String nextToken) {
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
        if (getBatchJobExecutions() != null)
            sb.append("BatchJobExecutions: ").append(getBatchJobExecutions()).append(",");
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

        if (obj instanceof ListBatchJobExecutionsResult == false)
            return false;
        ListBatchJobExecutionsResult other = (ListBatchJobExecutionsResult) obj;
        if (other.getBatchJobExecutions() == null ^ this.getBatchJobExecutions() == null)
            return false;
        if (other.getBatchJobExecutions() != null && other.getBatchJobExecutions().equals(this.getBatchJobExecutions()) == false)
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

        hashCode = prime * hashCode + ((getBatchJobExecutions() == null) ? 0 : getBatchJobExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchJobExecutionsResult clone() {
        try {
            return (ListBatchJobExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
