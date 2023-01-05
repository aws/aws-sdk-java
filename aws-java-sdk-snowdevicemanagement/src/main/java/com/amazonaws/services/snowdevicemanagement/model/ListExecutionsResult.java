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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     * execution ID, and the status of the execution.
     * </p>
     */
    private java.util.List<ExecutionSummary> executions;
    /**
     * <p>
     * A pagination token to continue to the next page of executions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     * execution ID, and the status of the execution.
     * </p>
     * 
     * @return A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     *         execution ID, and the status of the execution.
     */

    public java.util.List<ExecutionSummary> getExecutions() {
        return executions;
    }

    /**
     * <p>
     * A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     * execution ID, and the status of the execution.
     * </p>
     * 
     * @param executions
     *        A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     *        execution ID, and the status of the execution.
     */

    public void setExecutions(java.util.Collection<ExecutionSummary> executions) {
        if (executions == null) {
            this.executions = null;
            return;
        }

        this.executions = new java.util.ArrayList<ExecutionSummary>(executions);
    }

    /**
     * <p>
     * A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     * execution ID, and the status of the execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutions(java.util.Collection)} or {@link #withExecutions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param executions
     *        A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     *        execution ID, and the status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(ExecutionSummary... executions) {
        if (this.executions == null) {
            setExecutions(new java.util.ArrayList<ExecutionSummary>(executions.length));
        }
        for (ExecutionSummary ele : executions) {
            this.executions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     * execution ID, and the status of the execution.
     * </p>
     * 
     * @param executions
     *        A list of executions. Each execution contains the task ID, the device that the task is executing on, the
     *        execution ID, and the status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(java.util.Collection<ExecutionSummary> executions) {
        setExecutions(executions);
        return this;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of executions.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of executions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of executions.
     * </p>
     * 
     * @return A pagination token to continue to the next page of executions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of executions.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withNextToken(String nextToken) {
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
        if (getExecutions() != null)
            sb.append("Executions: ").append(getExecutions()).append(",");
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

        if (obj instanceof ListExecutionsResult == false)
            return false;
        ListExecutionsResult other = (ListExecutionsResult) obj;
        if (other.getExecutions() == null ^ this.getExecutions() == null)
            return false;
        if (other.getExecutions() != null && other.getExecutions().equals(this.getExecutions()) == false)
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

        hashCode = prime * hashCode + ((getExecutions() == null) ? 0 : getExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExecutionsResult clone() {
        try {
            return (ListExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
