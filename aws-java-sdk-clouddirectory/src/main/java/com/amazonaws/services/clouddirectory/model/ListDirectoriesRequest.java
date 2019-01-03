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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDirectories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDirectoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDirectoriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @return The maximum number of results to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDirectoriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     * 
     * @param state
     *        The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * @see DirectoryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     * 
     * @return The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * @see DirectoryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     * 
     * @param state
     *        The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryState
     */

    public ListDirectoriesRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     * 
     * @param state
     *        The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * @see DirectoryState
     */

    public void setState(DirectoryState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * </p>
     * 
     * @param state
     *        The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryState
     */

    public ListDirectoriesRequest withState(DirectoryState state) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListDirectoriesRequest == false)
            return false;
        ListDirectoriesRequest other = (ListDirectoriesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListDirectoriesRequest clone() {
        return (ListDirectoriesRequest) super.clone();
    }

}
