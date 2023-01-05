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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListSchedulingPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchedulingPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scheduling policies that match the request.
     * </p>
     */
    private java.util.List<SchedulingPolicyListingDetail> schedulingPolicies;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When the
     * results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of scheduling policies that match the request.
     * </p>
     * 
     * @return A list of scheduling policies that match the request.
     */

    public java.util.List<SchedulingPolicyListingDetail> getSchedulingPolicies() {
        return schedulingPolicies;
    }

    /**
     * <p>
     * A list of scheduling policies that match the request.
     * </p>
     * 
     * @param schedulingPolicies
     *        A list of scheduling policies that match the request.
     */

    public void setSchedulingPolicies(java.util.Collection<SchedulingPolicyListingDetail> schedulingPolicies) {
        if (schedulingPolicies == null) {
            this.schedulingPolicies = null;
            return;
        }

        this.schedulingPolicies = new java.util.ArrayList<SchedulingPolicyListingDetail>(schedulingPolicies);
    }

    /**
     * <p>
     * A list of scheduling policies that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedulingPolicies(java.util.Collection)} or {@link #withSchedulingPolicies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param schedulingPolicies
     *        A list of scheduling policies that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulingPoliciesResult withSchedulingPolicies(SchedulingPolicyListingDetail... schedulingPolicies) {
        if (this.schedulingPolicies == null) {
            setSchedulingPolicies(new java.util.ArrayList<SchedulingPolicyListingDetail>(schedulingPolicies.length));
        }
        for (SchedulingPolicyListingDetail ele : schedulingPolicies) {
            this.schedulingPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scheduling policies that match the request.
     * </p>
     * 
     * @param schedulingPolicies
     *        A list of scheduling policies that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulingPoliciesResult withSchedulingPolicies(java.util.Collection<SchedulingPolicyListingDetail> schedulingPolicies) {
        setSchedulingPolicies(schedulingPolicies);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When the
     * results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When
     *        the results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value
     *        can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When the
     * results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When
     *         the results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value
     *         can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When the
     * results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListSchedulingPolicies</code> request. When
     *        the results of a <code>ListSchedulingPolicies</code> request exceed <code>maxResults</code>, this value
     *        can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulingPoliciesResult withNextToken(String nextToken) {
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
        if (getSchedulingPolicies() != null)
            sb.append("SchedulingPolicies: ").append(getSchedulingPolicies()).append(",");
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

        if (obj instanceof ListSchedulingPoliciesResult == false)
            return false;
        ListSchedulingPoliciesResult other = (ListSchedulingPoliciesResult) obj;
        if (other.getSchedulingPolicies() == null ^ this.getSchedulingPolicies() == null)
            return false;
        if (other.getSchedulingPolicies() != null && other.getSchedulingPolicies().equals(this.getSchedulingPolicies()) == false)
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

        hashCode = prime * hashCode + ((getSchedulingPolicies() == null) ? 0 : getSchedulingPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSchedulingPoliciesResult clone() {
        try {
            return (ListSchedulingPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
