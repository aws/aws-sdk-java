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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects, one for each resource that meets the filter criteria specified in the request.
     * </p>
     */
    private java.util.List<MatchingResource> matchingResources;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each resource that meets the filter criteria specified in the request.
     * </p>
     * 
     * @return An array of objects, one for each resource that meets the filter criteria specified in the request.
     */

    public java.util.List<MatchingResource> getMatchingResources() {
        return matchingResources;
    }

    /**
     * <p>
     * An array of objects, one for each resource that meets the filter criteria specified in the request.
     * </p>
     * 
     * @param matchingResources
     *        An array of objects, one for each resource that meets the filter criteria specified in the request.
     */

    public void setMatchingResources(java.util.Collection<MatchingResource> matchingResources) {
        if (matchingResources == null) {
            this.matchingResources = null;
            return;
        }

        this.matchingResources = new java.util.ArrayList<MatchingResource>(matchingResources);
    }

    /**
     * <p>
     * An array of objects, one for each resource that meets the filter criteria specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingResources(java.util.Collection)} or {@link #withMatchingResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchingResources
     *        An array of objects, one for each resource that meets the filter criteria specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withMatchingResources(MatchingResource... matchingResources) {
        if (this.matchingResources == null) {
            setMatchingResources(new java.util.ArrayList<MatchingResource>(matchingResources.length));
        }
        for (MatchingResource ele : matchingResources) {
            this.matchingResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each resource that meets the filter criteria specified in the request.
     * </p>
     * 
     * @param matchingResources
     *        An array of objects, one for each resource that meets the filter criteria specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withMatchingResources(java.util.Collection<MatchingResource> matchingResources) {
        setMatchingResources(matchingResources);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withNextToken(String nextToken) {
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
        if (getMatchingResources() != null)
            sb.append("MatchingResources: ").append(getMatchingResources()).append(",");
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

        if (obj instanceof SearchResourcesResult == false)
            return false;
        SearchResourcesResult other = (SearchResourcesResult) obj;
        if (other.getMatchingResources() == null ^ this.getMatchingResources() == null)
            return false;
        if (other.getMatchingResources() != null && other.getMatchingResources().equals(this.getMatchingResources()) == false)
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

        hashCode = prime * hashCode + ((getMatchingResources() == null) ? 0 : getMatchingResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesResult clone() {
        try {
            return (SearchResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
