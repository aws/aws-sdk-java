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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlowExecutionRecords"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowExecutionRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of all instances when this flow was run.
     * </p>
     */
    private java.util.List<ExecutionRecord> flowExecutions;
    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of all instances when this flow was run.
     * </p>
     * 
     * @return Returns a list of all instances when this flow was run.
     */

    public java.util.List<ExecutionRecord> getFlowExecutions() {
        return flowExecutions;
    }

    /**
     * <p>
     * Returns a list of all instances when this flow was run.
     * </p>
     * 
     * @param flowExecutions
     *        Returns a list of all instances when this flow was run.
     */

    public void setFlowExecutions(java.util.Collection<ExecutionRecord> flowExecutions) {
        if (flowExecutions == null) {
            this.flowExecutions = null;
            return;
        }

        this.flowExecutions = new java.util.ArrayList<ExecutionRecord>(flowExecutions);
    }

    /**
     * <p>
     * Returns a list of all instances when this flow was run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowExecutions(java.util.Collection)} or {@link #withFlowExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param flowExecutions
     *        Returns a list of all instances when this flow was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowExecutionRecordsResult withFlowExecutions(ExecutionRecord... flowExecutions) {
        if (this.flowExecutions == null) {
            setFlowExecutions(new java.util.ArrayList<ExecutionRecord>(flowExecutions.length));
        }
        for (ExecutionRecord ele : flowExecutions) {
            this.flowExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of all instances when this flow was run.
     * </p>
     * 
     * @param flowExecutions
     *        Returns a list of all instances when this flow was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowExecutionRecordsResult withFlowExecutions(java.util.Collection<ExecutionRecord> flowExecutions) {
        setFlowExecutions(flowExecutions);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @return The pagination token for the next page of data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowExecutionRecordsResult withNextToken(String nextToken) {
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
        if (getFlowExecutions() != null)
            sb.append("FlowExecutions: ").append(getFlowExecutions()).append(",");
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

        if (obj instanceof DescribeFlowExecutionRecordsResult == false)
            return false;
        DescribeFlowExecutionRecordsResult other = (DescribeFlowExecutionRecordsResult) obj;
        if (other.getFlowExecutions() == null ^ this.getFlowExecutions() == null)
            return false;
        if (other.getFlowExecutions() != null && other.getFlowExecutions().equals(this.getFlowExecutions()) == false)
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

        hashCode = prime * hashCode + ((getFlowExecutions() == null) ? 0 : getFlowExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowExecutionRecordsResult clone() {
        try {
            return (DescribeFlowExecutionRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
