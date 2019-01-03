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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A filter that limits the results to those with the specified parent group.
     * </p>
     */
    private String parentGroup;
    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     */
    private String namePrefixFilter;
    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     */
    private Boolean recursive;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent group.
     * </p>
     * 
     * @param parentGroup
     *        A filter that limits the results to those with the specified parent group.
     */

    public void setParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent group.
     * </p>
     * 
     * @return A filter that limits the results to those with the specified parent group.
     */

    public String getParentGroup() {
        return this.parentGroup;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent group.
     * </p>
     * 
     * @param parentGroup
     *        A filter that limits the results to those with the specified parent group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsRequest withParentGroup(String parentGroup) {
        setParentGroup(parentGroup);
        return this;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * 
     * @param namePrefixFilter
     *        A filter that limits the results to those with the specified name prefix.
     */

    public void setNamePrefixFilter(String namePrefixFilter) {
        this.namePrefixFilter = namePrefixFilter;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * 
     * @return A filter that limits the results to those with the specified name prefix.
     */

    public String getNamePrefixFilter() {
        return this.namePrefixFilter;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * 
     * @param namePrefixFilter
     *        A filter that limits the results to those with the specified name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsRequest withNamePrefixFilter(String namePrefixFilter) {
        setNamePrefixFilter(namePrefixFilter);
        return this;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @param recursive
     *        If true, return child groups as well.
     */

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @return If true, return child groups as well.
     */

    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @param recursive
     *        If true, return child groups as well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsRequest withRecursive(Boolean recursive) {
        setRecursive(recursive);
        return this;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @return If true, return child groups as well.
     */

    public Boolean isRecursive() {
        return this.recursive;
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
        if (getParentGroup() != null)
            sb.append("ParentGroup: ").append(getParentGroup()).append(",");
        if (getNamePrefixFilter() != null)
            sb.append("NamePrefixFilter: ").append(getNamePrefixFilter()).append(",");
        if (getRecursive() != null)
            sb.append("Recursive: ").append(getRecursive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingGroupsRequest == false)
            return false;
        ListThingGroupsRequest other = (ListThingGroupsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getParentGroup() == null ^ this.getParentGroup() == null)
            return false;
        if (other.getParentGroup() != null && other.getParentGroup().equals(this.getParentGroup()) == false)
            return false;
        if (other.getNamePrefixFilter() == null ^ this.getNamePrefixFilter() == null)
            return false;
        if (other.getNamePrefixFilter() != null && other.getNamePrefixFilter().equals(this.getNamePrefixFilter()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getParentGroup() == null) ? 0 : getParentGroup().hashCode());
        hashCode = prime * hashCode + ((getNamePrefixFilter() == null) ? 0 : getNamePrefixFilter().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        return hashCode;
    }

    @Override
    public ListThingGroupsRequest clone() {
        return (ListThingGroupsRequest) super.clone();
    }

}
