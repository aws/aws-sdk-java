/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of suppressed email addresses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSuppressedDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of summaries, each containing a summary for a suppressed email destination.
     * </p>
     */
    private java.util.List<SuppressedDestinationSummary> suppressedDestinationSummaries;
    /**
     * <p>
     * A token that indicates that there are additional email addresses on the suppression list for your account. To
     * view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of summaries, each containing a summary for a suppressed email destination.
     * </p>
     * 
     * @return A list of summaries, each containing a summary for a suppressed email destination.
     */

    public java.util.List<SuppressedDestinationSummary> getSuppressedDestinationSummaries() {
        return suppressedDestinationSummaries;
    }

    /**
     * <p>
     * A list of summaries, each containing a summary for a suppressed email destination.
     * </p>
     * 
     * @param suppressedDestinationSummaries
     *        A list of summaries, each containing a summary for a suppressed email destination.
     */

    public void setSuppressedDestinationSummaries(java.util.Collection<SuppressedDestinationSummary> suppressedDestinationSummaries) {
        if (suppressedDestinationSummaries == null) {
            this.suppressedDestinationSummaries = null;
            return;
        }

        this.suppressedDestinationSummaries = new java.util.ArrayList<SuppressedDestinationSummary>(suppressedDestinationSummaries);
    }

    /**
     * <p>
     * A list of summaries, each containing a summary for a suppressed email destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuppressedDestinationSummaries(java.util.Collection)} or
     * {@link #withSuppressedDestinationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param suppressedDestinationSummaries
     *        A list of summaries, each containing a summary for a suppressed email destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsResult withSuppressedDestinationSummaries(SuppressedDestinationSummary... suppressedDestinationSummaries) {
        if (this.suppressedDestinationSummaries == null) {
            setSuppressedDestinationSummaries(new java.util.ArrayList<SuppressedDestinationSummary>(suppressedDestinationSummaries.length));
        }
        for (SuppressedDestinationSummary ele : suppressedDestinationSummaries) {
            this.suppressedDestinationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summaries, each containing a summary for a suppressed email destination.
     * </p>
     * 
     * @param suppressedDestinationSummaries
     *        A list of summaries, each containing a summary for a suppressed email destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsResult withSuppressedDestinationSummaries(java.util.Collection<SuppressedDestinationSummary> suppressedDestinationSummaries) {
        setSuppressedDestinationSummaries(suppressedDestinationSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there are additional email addresses on the suppression list for your account. To
     * view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional email addresses on the suppression list for your account.
     *        To view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>,
     *        and pass this token in the <code>NextToken</code> parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional email addresses on the suppression list for your account. To
     * view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return A token that indicates that there are additional email addresses on the suppression list for your
     *         account. To view additional suppressed addresses, issue another request to
     *         <code>ListSuppressedDestinations</code>, and pass this token in the <code>NextToken</code> parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional email addresses on the suppression list for your account. To
     * view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional email addresses on the suppression list for your account.
     *        To view additional suppressed addresses, issue another request to <code>ListSuppressedDestinations</code>,
     *        and pass this token in the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsResult withNextToken(String nextToken) {
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
        if (getSuppressedDestinationSummaries() != null)
            sb.append("SuppressedDestinationSummaries: ").append(getSuppressedDestinationSummaries()).append(",");
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

        if (obj instanceof ListSuppressedDestinationsResult == false)
            return false;
        ListSuppressedDestinationsResult other = (ListSuppressedDestinationsResult) obj;
        if (other.getSuppressedDestinationSummaries() == null ^ this.getSuppressedDestinationSummaries() == null)
            return false;
        if (other.getSuppressedDestinationSummaries() != null
                && other.getSuppressedDestinationSummaries().equals(this.getSuppressedDestinationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSuppressedDestinationSummaries() == null) ? 0 : getSuppressedDestinationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSuppressedDestinationsResult clone() {
        try {
            return (ListSuppressedDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
