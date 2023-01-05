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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that each contain information about one group.
     * </p>
     */
    private java.util.List<GroupSummary> groups;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroups</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that each contain information about one group.
     * </p>
     * 
     * @return An array of structures that each contain information about one group.
     */

    public java.util.List<GroupSummary> getGroups() {
        return groups;
    }

    /**
     * <p>
     * An array of structures that each contain information about one group.
     * </p>
     * 
     * @param groups
     *        An array of structures that each contain information about one group.
     */

    public void setGroups(java.util.Collection<GroupSummary> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupSummary>(groups);
    }

    /**
     * <p>
     * An array of structures that each contain information about one group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        An array of structures that each contain information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroups(GroupSummary... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<GroupSummary>(groups.length));
        }
        for (GroupSummary ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one group.
     * </p>
     * 
     * @param groups
     *        An array of structures that each contain information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroups(java.util.Collection<GroupSummary> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroups</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>ListGroups</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroups</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>ListGroups</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroups</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>ListGroups</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withNextToken(String nextToken) {
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
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

        if (obj instanceof ListGroupsResult == false)
            return false;
        ListGroupsResult other = (ListGroupsResult) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsResult clone() {
        try {
            return (ListGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
