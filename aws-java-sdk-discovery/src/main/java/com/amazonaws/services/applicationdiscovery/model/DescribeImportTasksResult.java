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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
     * </p>
     */
    private java.util.List<ImportTask> tasks;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
     * </p>
     * 
     * @return A returned array of import tasks that match any applied filters, up to the specified number of maximum
     *         results.
     */

    public java.util.List<ImportTask> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
     * </p>
     * 
     * @param tasks
     *        A returned array of import tasks that match any applied filters, up to the specified number of maximum
     *        results.
     */

    public void setTasks(java.util.Collection<ImportTask> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<ImportTask>(tasks);
    }

    /**
     * <p>
     * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A returned array of import tasks that match any applied filters, up to the specified number of maximum
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksResult withTasks(ImportTask... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<ImportTask>(tasks.length));
        }
        for (ImportTask ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
     * </p>
     * 
     * @param tasks
     *        A returned array of import tasks that match any applied filters, up to the specified number of maximum
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksResult withTasks(java.util.Collection<ImportTask> tasks) {
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

        if (obj instanceof DescribeImportTasksResult == false)
            return false;
        DescribeImportTasksResult other = (DescribeImportTasksResult) obj;
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
    public DescribeImportTasksResult clone() {
        try {
            return (DescribeImportTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
