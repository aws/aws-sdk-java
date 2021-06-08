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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     */
    private java.util.List<AccessPolicySummary> accessPolicySummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * 
     * @return A list that summarizes each access policy.
     */

    public java.util.List<AccessPolicySummary> getAccessPolicySummaries() {
        return accessPolicySummaries;
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * 
     * @param accessPolicySummaries
     *        A list that summarizes each access policy.
     */

    public void setAccessPolicySummaries(java.util.Collection<AccessPolicySummary> accessPolicySummaries) {
        if (accessPolicySummaries == null) {
            this.accessPolicySummaries = null;
            return;
        }

        this.accessPolicySummaries = new java.util.ArrayList<AccessPolicySummary>(accessPolicySummaries);
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessPolicySummaries(java.util.Collection)} or
     * {@link #withAccessPolicySummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accessPolicySummaries
     *        A list that summarizes each access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesResult withAccessPolicySummaries(AccessPolicySummary... accessPolicySummaries) {
        if (this.accessPolicySummaries == null) {
            setAccessPolicySummaries(new java.util.ArrayList<AccessPolicySummary>(accessPolicySummaries.length));
        }
        for (AccessPolicySummary ele : accessPolicySummaries) {
            this.accessPolicySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * 
     * @param accessPolicySummaries
     *        A list that summarizes each access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesResult withAccessPolicySummaries(java.util.Collection<AccessPolicySummary> accessPolicySummaries) {
        setAccessPolicySummaries(accessPolicySummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesResult withNextToken(String nextToken) {
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
        if (getAccessPolicySummaries() != null)
            sb.append("AccessPolicySummaries: ").append(getAccessPolicySummaries()).append(",");
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

        if (obj instanceof ListAccessPoliciesResult == false)
            return false;
        ListAccessPoliciesResult other = (ListAccessPoliciesResult) obj;
        if (other.getAccessPolicySummaries() == null ^ this.getAccessPolicySummaries() == null)
            return false;
        if (other.getAccessPolicySummaries() != null && other.getAccessPolicySummaries().equals(this.getAccessPolicySummaries()) == false)
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

        hashCode = prime * hashCode + ((getAccessPolicySummaries() == null) ? 0 : getAccessPolicySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPoliciesResult clone() {
        try {
            return (ListAccessPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
