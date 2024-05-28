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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     */
    private Integer nextItemOffset;
    /**
     * <p>
     * Tasks in the search.
     * </p>
     */
    private java.util.List<TaskSearchSummary> tasks;
    /**
     * <p>
     * The total number of results in the search.
     * </p>
     */
    private Integer totalResults;

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @param nextItemOffset
     *        The next incremental starting point after the defined <code>itemOffset</code>.
     */

    public void setNextItemOffset(Integer nextItemOffset) {
        this.nextItemOffset = nextItemOffset;
    }

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @return The next incremental starting point after the defined <code>itemOffset</code>.
     */

    public Integer getNextItemOffset() {
        return this.nextItemOffset;
    }

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @param nextItemOffset
     *        The next incremental starting point after the defined <code>itemOffset</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTasksResult withNextItemOffset(Integer nextItemOffset) {
        setNextItemOffset(nextItemOffset);
        return this;
    }

    /**
     * <p>
     * Tasks in the search.
     * </p>
     * 
     * @return Tasks in the search.
     */

    public java.util.List<TaskSearchSummary> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * Tasks in the search.
     * </p>
     * 
     * @param tasks
     *        Tasks in the search.
     */

    public void setTasks(java.util.Collection<TaskSearchSummary> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<TaskSearchSummary>(tasks);
    }

    /**
     * <p>
     * Tasks in the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        Tasks in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTasksResult withTasks(TaskSearchSummary... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<TaskSearchSummary>(tasks.length));
        }
        for (TaskSearchSummary ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tasks in the search.
     * </p>
     * 
     * @param tasks
     *        Tasks in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTasksResult withTasks(java.util.Collection<TaskSearchSummary> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of results in the search.
     */

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @return The total number of results in the search.
     */

    public Integer getTotalResults() {
        return this.totalResults;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of results in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTasksResult withTotalResults(Integer totalResults) {
        setTotalResults(totalResults);
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
        if (getNextItemOffset() != null)
            sb.append("NextItemOffset: ").append(getNextItemOffset()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getTotalResults() != null)
            sb.append("TotalResults: ").append(getTotalResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTasksResult == false)
            return false;
        SearchTasksResult other = (SearchTasksResult) obj;
        if (other.getNextItemOffset() == null ^ this.getNextItemOffset() == null)
            return false;
        if (other.getNextItemOffset() != null && other.getNextItemOffset().equals(this.getNextItemOffset()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getTotalResults() == null ^ this.getTotalResults() == null)
            return false;
        if (other.getTotalResults() != null && other.getTotalResults().equals(this.getTotalResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextItemOffset() == null) ? 0 : getNextItemOffset().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getTotalResults() == null) ? 0 : getTotalResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchTasksResult clone() {
        try {
            return (SearchTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
