/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of states.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The types.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of states.
     * </p>
     * 
     * @return A list of states.
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * A list of states.
     * </p>
     * 
     * @param states
     *        A list of states.
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * A list of states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        A list of states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of states.
     * </p>
     * 
     * @param states
     *        A list of states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The types.
     * </p>
     * 
     * @return The types.
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The types.
     * </p>
     * 
     * @param types
     *        The types.
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types.
     * </p>
     * 
     * @param types
     *        The types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsRequest withTypes(java.util.Collection<String> types) {
        setTypes(types);
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
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudioComponentsRequest == false)
            return false;
        ListStudioComponentsRequest other = (ListStudioComponentsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioComponentsRequest clone() {
        return (ListStudioComponentsRequest) super.clone();
    }

}
