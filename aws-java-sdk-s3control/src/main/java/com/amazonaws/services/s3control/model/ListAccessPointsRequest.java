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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID for owner of the bucket whose access points you want to list.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the bucket whose associated access points you want to list.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in the
     * <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next page of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If the specified bucket has more than
     * this number of access points, then the response will include a continuation token in the <code>NextToken</code>
     * field that you can use to retrieve the next page of access points.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS account ID for owner of the bucket whose access points you want to list.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for owner of the bucket whose access points you want to list.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for owner of the bucket whose access points you want to list.
     * </p>
     * 
     * @return The AWS account ID for owner of the bucket whose access points you want to list.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID for owner of the bucket whose access points you want to list.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for owner of the bucket whose access points you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the bucket whose associated access points you want to list.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket whose associated access points you want to list.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket whose associated access points you want to list.
     * </p>
     * 
     * @return The name of the bucket whose associated access points you want to list.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket whose associated access points you want to list.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket whose associated access points you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in the
     * <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in
     *        the <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in the
     * <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next page of
     * results.
     * </p>
     * 
     * @return A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token
     *         in the <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in the
     * <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A continuation token. If a previous call to <code>ListAccessPoints</code> returned a continuation token in
     *        the <code>NextToken</code> field, then providing that value here causes Amazon S3 to retrieve the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If the specified bucket has more than
     * this number of access points, then the response will include a continuation token in the <code>NextToken</code>
     * field that you can use to retrieve the next page of access points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access points that you want to include in the list. If the specified bucket has more
     *        than this number of access points, then the response will include a continuation token in the
     *        <code>NextToken</code> field that you can use to retrieve the next page of access points.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If the specified bucket has more than
     * this number of access points, then the response will include a continuation token in the <code>NextToken</code>
     * field that you can use to retrieve the next page of access points.
     * </p>
     * 
     * @return The maximum number of access points that you want to include in the list. If the specified bucket has
     *         more than this number of access points, then the response will include a continuation token in the
     *         <code>NextToken</code> field that you can use to retrieve the next page of access points.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of access points that you want to include in the list. If the specified bucket has more than
     * this number of access points, then the response will include a continuation token in the <code>NextToken</code>
     * field that you can use to retrieve the next page of access points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access points that you want to include in the list. If the specified bucket has more
     *        than this number of access points, then the response will include a continuation token in the
     *        <code>NextToken</code> field that you can use to retrieve the next page of access points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsRequest withMaxResults(Integer maxResults) {
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
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

        if (obj instanceof ListAccessPointsRequest == false)
            return false;
        ListAccessPointsRequest other = (ListAccessPointsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
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
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPointsRequest clone() {
        return (ListAccessPointsRequest) super.clone();
    }

}
