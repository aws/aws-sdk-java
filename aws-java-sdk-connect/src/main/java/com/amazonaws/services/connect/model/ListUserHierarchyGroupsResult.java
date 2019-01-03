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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserHierarchyGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>HierarchyGroupSummary</code> objects.
     * </p>
     */
    private java.util.List<HierarchyGroupSummary> userHierarchyGroupSummaryList;
    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>HierarchyGroupSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>HierarchyGroupSummary</code> objects.
     */

    public java.util.List<HierarchyGroupSummary> getUserHierarchyGroupSummaryList() {
        return userHierarchyGroupSummaryList;
    }

    /**
     * <p>
     * An array of <code>HierarchyGroupSummary</code> objects.
     * </p>
     * 
     * @param userHierarchyGroupSummaryList
     *        An array of <code>HierarchyGroupSummary</code> objects.
     */

    public void setUserHierarchyGroupSummaryList(java.util.Collection<HierarchyGroupSummary> userHierarchyGroupSummaryList) {
        if (userHierarchyGroupSummaryList == null) {
            this.userHierarchyGroupSummaryList = null;
            return;
        }

        this.userHierarchyGroupSummaryList = new java.util.ArrayList<HierarchyGroupSummary>(userHierarchyGroupSummaryList);
    }

    /**
     * <p>
     * An array of <code>HierarchyGroupSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserHierarchyGroupSummaryList(java.util.Collection)} or
     * {@link #withUserHierarchyGroupSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userHierarchyGroupSummaryList
     *        An array of <code>HierarchyGroupSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserHierarchyGroupsResult withUserHierarchyGroupSummaryList(HierarchyGroupSummary... userHierarchyGroupSummaryList) {
        if (this.userHierarchyGroupSummaryList == null) {
            setUserHierarchyGroupSummaryList(new java.util.ArrayList<HierarchyGroupSummary>(userHierarchyGroupSummaryList.length));
        }
        for (HierarchyGroupSummary ele : userHierarchyGroupSummaryList) {
            this.userHierarchyGroupSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>HierarchyGroupSummary</code> objects.
     * </p>
     * 
     * @param userHierarchyGroupSummaryList
     *        An array of <code>HierarchyGroupSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserHierarchyGroupsResult withUserHierarchyGroupSummaryList(java.util.Collection<HierarchyGroupSummary> userHierarchyGroupSummaryList) {
        setUserHierarchyGroupSummaryList(userHierarchyGroupSummaryList);
        return this;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @return A string returned in the response. Use the value returned in the response as the value of the NextToken
     *         in a subsequent request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserHierarchyGroupsResult withNextToken(String nextToken) {
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
        if (getUserHierarchyGroupSummaryList() != null)
            sb.append("UserHierarchyGroupSummaryList: ").append(getUserHierarchyGroupSummaryList()).append(",");
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

        if (obj instanceof ListUserHierarchyGroupsResult == false)
            return false;
        ListUserHierarchyGroupsResult other = (ListUserHierarchyGroupsResult) obj;
        if (other.getUserHierarchyGroupSummaryList() == null ^ this.getUserHierarchyGroupSummaryList() == null)
            return false;
        if (other.getUserHierarchyGroupSummaryList() != null
                && other.getUserHierarchyGroupSummaryList().equals(this.getUserHierarchyGroupSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getUserHierarchyGroupSummaryList() == null) ? 0 : getUserHierarchyGroupSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserHierarchyGroupsResult clone() {
        try {
            return (ListUserHierarchyGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
