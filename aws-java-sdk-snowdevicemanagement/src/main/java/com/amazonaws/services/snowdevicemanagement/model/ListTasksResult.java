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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token to continue to the next page of tasks.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of task structures containing details about each task.
     * </p>
     */
    private java.util.List<TaskSummary> tasks;

    /**
     * <p>
     * A pagination token to continue to the next page of tasks.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of tasks.
     * </p>
     * 
     * @return A pagination token to continue to the next page of tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of tasks.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of task structures containing details about each task.
     * </p>
     * 
     * @return A list of task structures containing details about each task.
     */

    public java.util.List<TaskSummary> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of task structures containing details about each task.
     * </p>
     * 
     * @param tasks
     *        A list of task structures containing details about each task.
     */

    public void setTasks(java.util.Collection<TaskSummary> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<TaskSummary>(tasks);
    }

    /**
     * <p>
     * A list of task structures containing details about each task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of task structures containing details about each task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTasks(TaskSummary... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<TaskSummary>(tasks.length));
        }
        for (TaskSummary ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of task structures containing details about each task.
     * </p>
     * 
     * @param tasks
     *        A list of task structures containing details about each task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTasks(java.util.Collection<TaskSummary> tasks) {
        setTasks(tasks);
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
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTasksResult == false)
            return false;
        ListTasksResult other = (ListTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        return hashCode;
    }

    @Override
    public ListTasksResult clone() {
        try {
            return (ListTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
