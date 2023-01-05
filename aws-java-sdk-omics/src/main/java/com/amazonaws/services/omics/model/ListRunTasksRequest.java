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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRunTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The maximum number of run tasks to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String startingToken;
    /**
     * <p>
     * Filter the list by status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunTasksRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The maximum number of run tasks to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of run tasks to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of run tasks to return in one page of results.
     * </p>
     * 
     * @return The maximum number of run tasks to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of run tasks to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of run tasks to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param startingToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setStartingToken(String startingToken) {
        this.startingToken = startingToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getStartingToken() {
        return this.startingToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param startingToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunTasksRequest withStartingToken(String startingToken) {
        setStartingToken(startingToken);
        return this;
    }

    /**
     * <p>
     * Filter the list by status.
     * </p>
     * 
     * @param status
     *        Filter the list by status.
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filter the list by status.
     * </p>
     * 
     * @return Filter the list by status.
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filter the list by status.
     * </p>
     * 
     * @param status
     *        Filter the list by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListRunTasksRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filter the list by status.
     * </p>
     * 
     * @param status
     *        Filter the list by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListRunTasksRequest withStatus(TaskStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartingToken() != null)
            sb.append("StartingToken: ").append(getStartingToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRunTasksRequest == false)
            return false;
        ListRunTasksRequest other = (ListRunTasksRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartingToken() == null ^ this.getStartingToken() == null)
            return false;
        if (other.getStartingToken() != null && other.getStartingToken().equals(this.getStartingToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartingToken() == null) ? 0 : getStartingToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListRunTasksRequest clone() {
        return (ListRunTasksRequest) super.clone();
    }

}
