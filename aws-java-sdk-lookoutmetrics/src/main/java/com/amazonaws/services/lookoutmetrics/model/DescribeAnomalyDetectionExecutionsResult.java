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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetectionExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnomalyDetectionExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of detection jobs.
     * </p>
     */
    private java.util.List<ExecutionStatus> executionList;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of detection jobs.
     * </p>
     * 
     * @return A list of detection jobs.
     */

    public java.util.List<ExecutionStatus> getExecutionList() {
        return executionList;
    }

    /**
     * <p>
     * A list of detection jobs.
     * </p>
     * 
     * @param executionList
     *        A list of detection jobs.
     */

    public void setExecutionList(java.util.Collection<ExecutionStatus> executionList) {
        if (executionList == null) {
            this.executionList = null;
            return;
        }

        this.executionList = new java.util.ArrayList<ExecutionStatus>(executionList);
    }

    /**
     * <p>
     * A list of detection jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionList(java.util.Collection)} or {@link #withExecutionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param executionList
     *        A list of detection jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectionExecutionsResult withExecutionList(ExecutionStatus... executionList) {
        if (this.executionList == null) {
            setExecutionList(new java.util.ArrayList<ExecutionStatus>(executionList.length));
        }
        for (ExecutionStatus ele : executionList) {
            this.executionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of detection jobs.
     * </p>
     * 
     * @param executionList
     *        A list of detection jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectionExecutionsResult withExecutionList(java.util.Collection<ExecutionStatus> executionList) {
        setExecutionList(executionList);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectionExecutionsResult withNextToken(String nextToken) {
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
        if (getExecutionList() != null)
            sb.append("ExecutionList: ").append(getExecutionList()).append(",");
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

        if (obj instanceof DescribeAnomalyDetectionExecutionsResult == false)
            return false;
        DescribeAnomalyDetectionExecutionsResult other = (DescribeAnomalyDetectionExecutionsResult) obj;
        if (other.getExecutionList() == null ^ this.getExecutionList() == null)
            return false;
        if (other.getExecutionList() != null && other.getExecutionList().equals(this.getExecutionList()) == false)
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

        hashCode = prime * hashCode + ((getExecutionList() == null) ? 0 : getExecutionList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnomalyDetectionExecutionsResult clone() {
        try {
            return (DescribeAnomalyDetectionExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
