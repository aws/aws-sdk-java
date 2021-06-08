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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPointsForObjectLambdaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If there are more than this number of
     * access points, then the response will include a continuation token in the <code>NextToken</code> field that you
     * can use to retrieve the next page of access points.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The account ID for the account that owns the specified Object Lambda Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @return The account ID for the account that owns the specified Object Lambda Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the account that owns the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The account ID for the account that owns the specified Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @param nextToken
     *        If the list has more access points than can be returned in one call to this API, this field contains a
     *        continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *        points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @return If the list has more access points than can be returned in one call to this API, this field contains a
     *         continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *         points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @param nextToken
     *        If the list has more access points than can be returned in one call to this API, this field contains a
     *        continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *        points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If there are more than this number of
     * access points, then the response will include a continuation token in the <code>NextToken</code> field that you
     * can use to retrieve the next page of access points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access points that you want to include in the list. If there are more than this
     *        number of access points, then the response will include a continuation token in the <code>NextToken</code>
     *        field that you can use to retrieve the next page of access points.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If there are more than this number of
     * access points, then the response will include a continuation token in the <code>NextToken</code> field that you
     * can use to retrieve the next page of access points.
     * </p>
     * 
     * @return The maximum number of access points that you want to include in the list. If there are more than this
     *         number of access points, then the response will include a continuation token in the
     *         <code>NextToken</code> field that you can use to retrieve the next page of access points.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If there are more than this number of
     * access points, then the response will include a continuation token in the <code>NextToken</code> field that you
     * can use to retrieve the next page of access points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access points that you want to include in the list. If there are more than this
     *        number of access points, then the response will include a continuation token in the <code>NextToken</code>
     *        field that you can use to retrieve the next page of access points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaRequest withMaxResults(Integer maxResults) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
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

        if (obj instanceof ListAccessPointsForObjectLambdaRequest == false)
            return false;
        ListAccessPointsForObjectLambdaRequest other = (ListAccessPointsForObjectLambdaRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPointsForObjectLambdaRequest clone() {
        return (ListAccessPointsForObjectLambdaRequest) super.clone();
    }

}
