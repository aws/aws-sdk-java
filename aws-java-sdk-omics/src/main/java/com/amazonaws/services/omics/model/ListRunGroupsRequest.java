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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRunGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of run groups to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The run groups' name.
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
     * The maximum number of run groups to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of run groups to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of run groups to return in one page of results.
     * </p>
     * 
     * @return The maximum number of run groups to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of run groups to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of run groups to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The run groups' name.
     * </p>
     * 
     * @param name
     *        The run groups' name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The run groups' name.
     * </p>
     * 
     * @return The run groups' name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The run groups' name.
     * </p>
     * 
     * @param name
     *        The run groups' name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunGroupsRequest withName(String name) {
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

    public ListRunGroupsRequest withStartingToken(String startingToken) {
        setStartingToken(startingToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartingToken() != null)
            sb.append("StartingToken: ").append(getStartingToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRunGroupsRequest == false)
            return false;
        ListRunGroupsRequest other = (ListRunGroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartingToken() == null ^ this.getStartingToken() == null)
            return false;
        if (other.getStartingToken() != null && other.getStartingToken().equals(this.getStartingToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartingToken() == null) ? 0 : getStartingToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRunGroupsRequest clone() {
        return (ListRunGroupsRequest) super.clone();
    }

}
