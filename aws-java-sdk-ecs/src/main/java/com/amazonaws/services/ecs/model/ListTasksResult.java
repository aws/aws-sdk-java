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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of task ARN entries for the <code>ListTasks</code> request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> taskArns;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results of a
     * <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of task ARN entries for the <code>ListTasks</code> request.
     * </p>
     * 
     * @return The list of task ARN entries for the <code>ListTasks</code> request.
     */

    public java.util.List<String> getTaskArns() {
        if (taskArns == null) {
            taskArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return taskArns;
    }

    /**
     * <p>
     * The list of task ARN entries for the <code>ListTasks</code> request.
     * </p>
     * 
     * @param taskArns
     *        The list of task ARN entries for the <code>ListTasks</code> request.
     */

    public void setTaskArns(java.util.Collection<String> taskArns) {
        if (taskArns == null) {
            this.taskArns = null;
            return;
        }

        this.taskArns = new com.amazonaws.internal.SdkInternalList<String>(taskArns);
    }

    /**
     * <p>
     * The list of task ARN entries for the <code>ListTasks</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskArns(java.util.Collection)} or {@link #withTaskArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskArns
     *        The list of task ARN entries for the <code>ListTasks</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTaskArns(String... taskArns) {
        if (this.taskArns == null) {
            setTaskArns(new com.amazonaws.internal.SdkInternalList<String>(taskArns.length));
        }
        for (String ele : taskArns) {
            this.taskArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of task ARN entries for the <code>ListTasks</code> request.
     * </p>
     * 
     * @param taskArns
     *        The list of task ARN entries for the <code>ListTasks</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksResult withTaskArns(java.util.Collection<String> taskArns) {
        setTaskArns(taskArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results of a
     * <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results
     *        of a <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results of a
     * <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results
     *         of a <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     *         the next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results of a
     * <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListTasks</code> request. When the results
     *        of a <code>ListTasks</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
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
        if (getTaskArns() != null)
            sb.append("TaskArns: ").append(getTaskArns()).append(",");
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
        if (other.getTaskArns() == null ^ this.getTaskArns() == null)
            return false;
        if (other.getTaskArns() != null && other.getTaskArns().equals(this.getTaskArns()) == false)
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

        hashCode = prime * hashCode + ((getTaskArns() == null) ? 0 : getTaskArns().hashCode());
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
