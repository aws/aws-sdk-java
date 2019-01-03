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
 * ListTaskExecutionsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of executed tasks.
     * </p>
     */
    private java.util.List<TaskExecutionListEntry> taskExecutions;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of executed tasks.
     * </p>
     * 
     * @return A list of executed tasks.
     */

    public java.util.List<TaskExecutionListEntry> getTaskExecutions() {
        return taskExecutions;
    }

    /**
     * <p>
     * A list of executed tasks.
     * </p>
     * 
     * @param taskExecutions
     *        A list of executed tasks.
     */

    public void setTaskExecutions(java.util.Collection<TaskExecutionListEntry> taskExecutions) {
        if (taskExecutions == null) {
            this.taskExecutions = null;
            return;
        }

        this.taskExecutions = new java.util.ArrayList<TaskExecutionListEntry>(taskExecutions);
    }

    /**
     * <p>
     * A list of executed tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskExecutions(java.util.Collection)} or {@link #withTaskExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param taskExecutions
     *        A list of executed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsResult withTaskExecutions(TaskExecutionListEntry... taskExecutions) {
        if (this.taskExecutions == null) {
            setTaskExecutions(new java.util.ArrayList<TaskExecutionListEntry>(taskExecutions.length));
        }
        for (TaskExecutionListEntry ele : taskExecutions) {
            this.taskExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of executed tasks.
     * </p>
     * 
     * @param taskExecutions
     *        A list of executed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsResult withTaskExecutions(java.util.Collection<TaskExecutionListEntry> taskExecutions) {
        setTaskExecutions(taskExecutions);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of executed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsResult withNextToken(String nextToken) {
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
        if (getTaskExecutions() != null)
            sb.append("TaskExecutions: ").append(getTaskExecutions()).append(",");
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

        if (obj instanceof ListTaskExecutionsResult == false)
            return false;
        ListTaskExecutionsResult other = (ListTaskExecutionsResult) obj;
        if (other.getTaskExecutions() == null ^ this.getTaskExecutions() == null)
            return false;
        if (other.getTaskExecutions() != null && other.getTaskExecutions().equals(this.getTaskExecutions()) == false)
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

        hashCode = prime * hashCode + ((getTaskExecutions() == null) ? 0 : getTaskExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskExecutionsResult clone() {
        try {
            return (ListTaskExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
