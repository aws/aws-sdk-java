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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of tasks per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token to continue to the next page of tasks.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A structure used to filter the list of tasks.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The maximum number of tasks per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tasks per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tasks per page.
     * </p>
     * 
     * @return The maximum number of tasks per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tasks per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tasks per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

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

    public ListTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A structure used to filter the list of tasks.
     * </p>
     * 
     * @param state
     *        A structure used to filter the list of tasks.
     * @see TaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * A structure used to filter the list of tasks.
     * </p>
     * 
     * @return A structure used to filter the list of tasks.
     * @see TaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * A structure used to filter the list of tasks.
     * </p>
     * 
     * @param state
     *        A structure used to filter the list of tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public ListTasksRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * A structure used to filter the list of tasks.
     * </p>
     * 
     * @param state
     *        A structure used to filter the list of tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public ListTasksRequest withState(TaskState state) {
        this.state = state.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTasksRequest == false)
            return false;
        ListTasksRequest other = (ListTasksRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListTasksRequest clone() {
        return (ListTasksRequest) super.clone();
    }

}
