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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ListProtectionsRequest.NextToken</code> value from a previous call to <code>ListProtections</code>.
     * Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results will
     * be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the
     * number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there are still
     * more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to return, AWS WAF will
     * always also return a <code>NextToken</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>ListProtectionsRequest.NextToken</code> value from a previous call to <code>ListProtections</code>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListProtectionsRequest.NextToken</code> value from a previous call to
     *        <code>ListProtections</code>. Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListProtectionsRequest.NextToken</code> value from a previous call to <code>ListProtections</code>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>ListProtectionsRequest.NextToken</code> value from a previous call to
     *         <code>ListProtections</code>. Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>ListProtectionsRequest.NextToken</code> value from a previous call to <code>ListProtections</code>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListProtectionsRequest.NextToken</code> value from a previous call to
     *        <code>ListProtections</code>. Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results will
     * be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the
     * number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there are still
     * more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to return, AWS WAF will
     * always also return a <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results
     *        will be returned.</p>
     *        <p>
     *        This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is,
     *        the number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there
     *        are still more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to
     *        return, AWS WAF will always also return a <code>NextToken</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results will
     * be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the
     * number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there are still
     * more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to return, AWS WAF will
     * always also return a <code>NextToken</code>.
     * </p>
     * 
     * @return The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20
     *         results will be returned.</p>
     *         <p>
     *         This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is,
     *         the number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if
     *         there are still more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects
     *         to return, AWS WAF will always also return a <code>NextToken</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results will
     * be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the
     * number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there are still
     * more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to return, AWS WAF will
     * always also return a <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <a>Protection</a> objects to be returned. If this is left blank the first 20 results
     *        will be returned.</p>
     *        <p>
     *        This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is,
     *        the number of <a>Protection</a> objects returned could be less than <code>MaxResults</code>, even if there
     *        are still more <a>Protection</a> objects yet to return. If there are more <a>Protection</a> objects to
     *        return, AWS WAF will always also return a <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListProtectionsRequest == false)
            return false;
        ListProtectionsRequest other = (ListProtectionsRequest) obj;
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
    public ListProtectionsRequest clone() {
        return (ListProtectionsRequest) super.clone();
    }

}
