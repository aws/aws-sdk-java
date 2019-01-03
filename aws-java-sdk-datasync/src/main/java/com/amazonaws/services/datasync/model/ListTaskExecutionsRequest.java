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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * ListTaskExecutions
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The maximum number of executed tasks to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of the executed tasks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task whose tasks you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of executed tasks to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of executed tasks to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of executed tasks to list.
     * </p>
     * 
     * @return The maximum number of executed tasks to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of executed tasks to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of executed tasks to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of the executed tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin the next list of the executed tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of the executed tasks.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin the next list of the executed tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of the executed tasks.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin the next list of the executed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskExecutionsRequest withNextToken(String nextToken) {
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListTaskExecutionsRequest == false)
            return false;
        ListTaskExecutionsRequest other = (ListTaskExecutionsRequest) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskExecutionsRequest clone() {
        return (ListTaskExecutionsRequest) super.clone();
    }

}
