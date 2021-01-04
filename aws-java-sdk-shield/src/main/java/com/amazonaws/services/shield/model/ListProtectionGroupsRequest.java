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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtectionGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectionGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the first
     * call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced returns
     * the first 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the first
     * call.
     * </p>
     * 
     * @param nextToken
     *        The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the
     *        first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the first
     * call.
     * </p>
     * 
     * @return The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the
     *         first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the first
     * call.
     * </p>
     * 
     * @param nextToken
     *        The next token value from a previous call to <code>ListProtectionGroups</code>. Pass null if this is the
     *        first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced returns
     * the first 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced
     *        returns the first 20 results.</p>
     *        <p>
     *        This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *        of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *        to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *        that you can use in your next request, to get the next batch of objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced returns
     * the first 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @return The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced
     *         returns the first 20 results.</p>
     *         <p>
     *         This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *         of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *         to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *         that you can use in your next request, to get the next batch of objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced returns
     * the first 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <a>ProtectionGroup</a> objects to return. If you leave this blank, Shield Advanced
     *        returns the first 20 results.</p>
     *        <p>
     *        This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *        of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *        to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *        that you can use in your next request, to get the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProtectionGroupsRequest == false)
            return false;
        ListProtectionGroupsRequest other = (ListProtectionGroupsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectionGroupsRequest clone() {
        return (ListProtectionGroupsRequest) super.clone();
    }

}
