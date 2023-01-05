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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListPipes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     */
    private String currentState;
    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The maximum number of pipes to include in the response.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A value that will return a subset of the pipes associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an HTTP 400 InvalidToken error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The prefix matching the pipe source.
     * </p>
     */
    private String sourcePrefix;
    /**
     * <p>
     * The prefix matching the pipe target.
     * </p>
     */
    private String targetPrefix;

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @see PipeState
     */

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @return The state the pipe is in.
     * @see PipeState
     */

    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public ListPipesRequest withCurrentState(String currentState) {
        setCurrentState(currentState);
        return this;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public ListPipesRequest withCurrentState(PipeState currentState) {
        this.currentState = currentState.toString();
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @see RequestedPipeState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @return The state the pipe should be in.
     * @see RequestedPipeState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeState
     */

    public ListPipesRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeState
     */

    public ListPipesRequest withDesiredState(RequestedPipeState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of pipes to include in the response.
     * </p>
     * 
     * @param limit
     *        The maximum number of pipes to include in the response.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of pipes to include in the response.
     * </p>
     * 
     * @return The maximum number of pipes to include in the response.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of pipes to include in the response.
     * </p>
     * 
     * @param limit
     *        The maximum number of pipes to include in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A value that will return a subset of the pipes associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @param namePrefix
     *        A value that will return a subset of the pipes associated with this account. For example,
     *        <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * A value that will return a subset of the pipes associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @return A value that will return a subset of the pipes associated with this account. For example,
     *         <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * A value that will return a subset of the pipes associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @param namePrefix
     *        A value that will return a subset of the pipes associated with this account. For example,
     *        <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipesRequest withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The prefix matching the pipe source.
     * </p>
     * 
     * @param sourcePrefix
     *        The prefix matching the pipe source.
     */

    public void setSourcePrefix(String sourcePrefix) {
        this.sourcePrefix = sourcePrefix;
    }

    /**
     * <p>
     * The prefix matching the pipe source.
     * </p>
     * 
     * @return The prefix matching the pipe source.
     */

    public String getSourcePrefix() {
        return this.sourcePrefix;
    }

    /**
     * <p>
     * The prefix matching the pipe source.
     * </p>
     * 
     * @param sourcePrefix
     *        The prefix matching the pipe source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipesRequest withSourcePrefix(String sourcePrefix) {
        setSourcePrefix(sourcePrefix);
        return this;
    }

    /**
     * <p>
     * The prefix matching the pipe target.
     * </p>
     * 
     * @param targetPrefix
     *        The prefix matching the pipe target.
     */

    public void setTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
    }

    /**
     * <p>
     * The prefix matching the pipe target.
     * </p>
     * 
     * @return The prefix matching the pipe target.
     */

    public String getTargetPrefix() {
        return this.targetPrefix;
    }

    /**
     * <p>
     * The prefix matching the pipe target.
     * </p>
     * 
     * @param targetPrefix
     *        The prefix matching the pipe target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipesRequest withTargetPrefix(String targetPrefix) {
        setTargetPrefix(targetPrefix);
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
        if (getCurrentState() != null)
            sb.append("CurrentState: ").append(getCurrentState()).append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getSourcePrefix() != null)
            sb.append("SourcePrefix: ").append(getSourcePrefix()).append(",");
        if (getTargetPrefix() != null)
            sb.append("TargetPrefix: ").append(getTargetPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipesRequest == false)
            return false;
        ListPipesRequest other = (ListPipesRequest) obj;
        if (other.getCurrentState() == null ^ this.getCurrentState() == null)
            return false;
        if (other.getCurrentState() != null && other.getCurrentState().equals(this.getCurrentState()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSourcePrefix() == null ^ this.getSourcePrefix() == null)
            return false;
        if (other.getSourcePrefix() != null && other.getSourcePrefix().equals(this.getSourcePrefix()) == false)
            return false;
        if (other.getTargetPrefix() == null ^ this.getTargetPrefix() == null)
            return false;
        if (other.getTargetPrefix() != null && other.getTargetPrefix().equals(this.getTargetPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSourcePrefix() == null) ? 0 : getSourcePrefix().hashCode());
        hashCode = prime * hashCode + ((getTargetPrefix() == null) ? 0 : getTargetPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListPipesRequest clone() {
        return (ListPipesRequest) super.clone();
    }

}
