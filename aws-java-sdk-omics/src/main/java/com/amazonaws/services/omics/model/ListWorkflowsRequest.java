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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filter the list by workflow type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Filter the list by workflow name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String startingToken;
    /**
     * <p>
     * The maximum number of workflows to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filter the list by workflow type.
     * </p>
     * 
     * @param type
     *        Filter the list by workflow type.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Filter the list by workflow type.
     * </p>
     * 
     * @return Filter the list by workflow type.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Filter the list by workflow type.
     * </p>
     * 
     * @param type
     *        Filter the list by workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Filter the list by workflow type.
     * </p>
     * 
     * @param type
     *        Filter the list by workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsRequest withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Filter the list by workflow name.
     * </p>
     * 
     * @param name
     *        Filter the list by workflow name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Filter the list by workflow name.
     * </p>
     * 
     * @return Filter the list by workflow name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Filter the list by workflow name.
     * </p>
     * 
     * @param name
     *        Filter the list by workflow name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withName(String name) {
        setName(name);
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

    public ListWorkflowsRequest withStartingToken(String startingToken) {
        setStartingToken(startingToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of workflows to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workflows to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of workflows to return in one page of results.
     * </p>
     * 
     * @return The maximum number of workflows to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of workflows to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workflows to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartingToken() != null)
            sb.append("StartingToken: ").append(getStartingToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsRequest == false)
            return false;
        ListWorkflowsRequest other = (ListWorkflowsRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartingToken() == null ^ this.getStartingToken() == null)
            return false;
        if (other.getStartingToken() != null && other.getStartingToken().equals(this.getStartingToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartingToken() == null) ? 0 : getStartingToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsRequest clone() {
        return (ListWorkflowsRequest) super.clone();
    }

}
