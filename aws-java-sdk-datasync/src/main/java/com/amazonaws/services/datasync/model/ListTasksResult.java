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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ListTasksResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all the tasks that are returned.
     * </p>
     */
    private java.util.List<TaskListEntry> tasks;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of tasks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all the tasks that are returned.
     * </p>
     * 
     * @return A list of all the tasks that are returned.
     */

    public java.util.List<TaskListEntry> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of all the tasks that are returned.
     * </p>
     * 
     * @param tasks
     *        A list of all the tasks that are returned.
     */

    public void setTasks(java.util.Collection<TaskListEntry> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<TaskListEntry>(tasks);
    }

    /**
     * <p>
     * A list of all the tasks that are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of all the tasks that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTasks(TaskListEntry... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<TaskListEntry>(tasks.length));
        }
        for (TaskListEntry ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the tasks that are returned.
     * </p>
     * 
     * @param tasks
     *        A list of all the tasks that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTasks(java.util.Collection<TaskListEntry> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of tasks.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin returning the next list of tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withNextToken(String nextToken) {
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

        if (obj instanceof ListTasksResult == false)
            return false;
        ListTasksResult other = (ListTasksResult) obj;
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
    public ListTasksResult clone() {
        try {
            return (ListTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
