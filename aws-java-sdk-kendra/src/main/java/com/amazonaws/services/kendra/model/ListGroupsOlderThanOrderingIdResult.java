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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsOlderThanOrderingIdResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     */
    private java.util.List<GroupSummary> groupsSummaries;
    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * 
     * @return Summary information for list of groups that are mapped to users before a given ordering or timestamp
     *         identifier.
     */

    public java.util.List<GroupSummary> getGroupsSummaries() {
        return groupsSummaries;
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * 
     * @param groupsSummaries
     *        Summary information for list of groups that are mapped to users before a given ordering or timestamp
     *        identifier.
     */

    public void setGroupsSummaries(java.util.Collection<GroupSummary> groupsSummaries) {
        if (groupsSummaries == null) {
            this.groupsSummaries = null;
            return;
        }

        this.groupsSummaries = new java.util.ArrayList<GroupSummary>(groupsSummaries);
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupsSummaries(java.util.Collection)} or {@link #withGroupsSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupsSummaries
     *        Summary information for list of groups that are mapped to users before a given ordering or timestamp
     *        identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdResult withGroupsSummaries(GroupSummary... groupsSummaries) {
        if (this.groupsSummaries == null) {
            setGroupsSummaries(new java.util.ArrayList<GroupSummary>(groupsSummaries.length));
        }
        for (GroupSummary ele : groupsSummaries) {
            this.groupsSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * 
     * @param groupsSummaries
     *        Summary information for list of groups that are mapped to users before a given ordering or timestamp
     *        identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdResult withGroupsSummaries(java.util.Collection<GroupSummary> groupsSummaries) {
        setGroupsSummaries(groupsSummaries);
        return this;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @param nextToken
     *        The next items in the list of groups that go beyond the maximum.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @return The next items in the list of groups that go beyond the maximum.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @param nextToken
     *        The next items in the list of groups that go beyond the maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdResult withNextToken(String nextToken) {
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
        if (getGroupsSummaries() != null)
            sb.append("GroupsSummaries: ").append(getGroupsSummaries()).append(",");
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

        if (obj instanceof ListGroupsOlderThanOrderingIdResult == false)
            return false;
        ListGroupsOlderThanOrderingIdResult other = (ListGroupsOlderThanOrderingIdResult) obj;
        if (other.getGroupsSummaries() == null ^ this.getGroupsSummaries() == null)
            return false;
        if (other.getGroupsSummaries() != null && other.getGroupsSummaries().equals(this.getGroupsSummaries()) == false)
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

        hashCode = prime * hashCode + ((getGroupsSummaries() == null) ? 0 : getGroupsSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsOlderThanOrderingIdResult clone() {
        try {
            return (ListGroupsOlderThanOrderingIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
