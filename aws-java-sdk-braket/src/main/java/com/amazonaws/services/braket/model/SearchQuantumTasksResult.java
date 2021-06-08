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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchQuantumTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * </p>
     */
    private java.util.List<QuantumTaskSummary> quantumTasks;

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or null if there are no additional results. Use the token value in
     *        a subsequent request to continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @return A token used for pagination of results, or null if there are no additional results. Use the token value
     *         in a subsequent request to continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or null if there are no additional results. Use the token value in
     *        a subsequent request to continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * </p>
     * 
     * @return An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     */

    public java.util.List<QuantumTaskSummary> getQuantumTasks() {
        return quantumTasks;
    }

    /**
     * <p>
     * An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * </p>
     * 
     * @param quantumTasks
     *        An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     */

    public void setQuantumTasks(java.util.Collection<QuantumTaskSummary> quantumTasks) {
        if (quantumTasks == null) {
            this.quantumTasks = null;
            return;
        }

        this.quantumTasks = new java.util.ArrayList<QuantumTaskSummary>(quantumTasks);
    }

    /**
     * <p>
     * An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuantumTasks(java.util.Collection)} or {@link #withQuantumTasks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param quantumTasks
     *        An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksResult withQuantumTasks(QuantumTaskSummary... quantumTasks) {
        if (this.quantumTasks == null) {
            setQuantumTasks(new java.util.ArrayList<QuantumTaskSummary>(quantumTasks.length));
        }
        for (QuantumTaskSummary ele : quantumTasks) {
            this.quantumTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * </p>
     * 
     * @param quantumTasks
     *        An array of <code>QuantumTaskSummary</code> objects for tasks that match the specified filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksResult withQuantumTasks(java.util.Collection<QuantumTaskSummary> quantumTasks) {
        setQuantumTasks(quantumTasks);
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
        if (getQuantumTasks() != null)
            sb.append("QuantumTasks: ").append(getQuantumTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchQuantumTasksResult == false)
            return false;
        SearchQuantumTasksResult other = (SearchQuantumTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQuantumTasks() == null ^ this.getQuantumTasks() == null)
            return false;
        if (other.getQuantumTasks() != null && other.getQuantumTasks().equals(this.getQuantumTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQuantumTasks() == null) ? 0 : getQuantumTasks().hashCode());
        return hashCode;
    }

    @Override
    public SearchQuantumTasksResult clone() {
        try {
            return (SearchQuantumTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
