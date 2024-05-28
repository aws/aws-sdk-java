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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchContactFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     */
    private java.util.List<ContactFlow> contactFlows;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @return Information about the contact flows.
     */

    public java.util.List<ContactFlow> getContactFlows() {
        return contactFlows;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param contactFlows
     *        Information about the contact flows.
     */

    public void setContactFlows(java.util.Collection<ContactFlow> contactFlows) {
        if (contactFlows == null) {
            this.contactFlows = null;
            return;
        }

        this.contactFlows = new java.util.ArrayList<ContactFlow>(contactFlows);
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactFlows(java.util.Collection)} or {@link #withContactFlows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactFlows
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactFlowsResult withContactFlows(ContactFlow... contactFlows) {
        if (this.contactFlows == null) {
            setContactFlows(new java.util.ArrayList<ContactFlow>(contactFlows.length));
        }
        for (ContactFlow ele : contactFlows) {
            this.contactFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param contactFlows
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactFlowsResult withContactFlows(java.util.Collection<ContactFlow> contactFlows) {
        setContactFlows(contactFlows);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactFlowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of contact flows which matched your search query.
     */

    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     * 
     * @return The total number of contact flows which matched your search query.
     */

    public Long getApproximateTotalCount() {
        return this.approximateTotalCount;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of contact flows which matched your search query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactFlowsResult withApproximateTotalCount(Long approximateTotalCount) {
        setApproximateTotalCount(approximateTotalCount);
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
        if (getContactFlows() != null)
            sb.append("ContactFlows: ").append(getContactFlows()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: ").append(getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchContactFlowsResult == false)
            return false;
        SearchContactFlowsResult other = (SearchContactFlowsResult) obj;
        if (other.getContactFlows() == null ^ this.getContactFlows() == null)
            return false;
        if (other.getContactFlows() != null && other.getContactFlows().equals(this.getContactFlows()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactFlows() == null) ? 0 : getContactFlows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchContactFlowsResult clone() {
        try {
            return (SearchContactFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
