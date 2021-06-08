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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectMitigationActionsTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter criteria.
     * </p>
     */
    private java.util.List<DetectMitigationActionsTaskSummary> tasks;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter criteria.
     * </p>
     * 
     * @return The collection of ML Detect mitigation tasks that matched the filter criteria.
     */

    public java.util.List<DetectMitigationActionsTaskSummary> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter criteria.
     * </p>
     * 
     * @param tasks
     *        The collection of ML Detect mitigation tasks that matched the filter criteria.
     */

    public void setTasks(java.util.Collection<DetectMitigationActionsTaskSummary> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<DetectMitigationActionsTaskSummary>(tasks);
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        The collection of ML Detect mitigation tasks that matched the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksResult withTasks(DetectMitigationActionsTaskSummary... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<DetectMitigationActionsTaskSummary>(tasks.length));
        }
        for (DetectMitigationActionsTaskSummary ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter criteria.
     * </p>
     * 
     * @param tasks
     *        The collection of ML Detect mitigation tasks that matched the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksResult withTasks(java.util.Collection<DetectMitigationActionsTaskSummary> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *         additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksResult withNextToken(String nextToken) {
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
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
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

        if (obj instanceof ListDetectMitigationActionsTasksResult == false)
            return false;
        ListDetectMitigationActionsTasksResult other = (ListDetectMitigationActionsTasksResult) obj;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
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

        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectMitigationActionsTasksResult clone() {
        try {
            return (ListDetectMitigationActionsTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
