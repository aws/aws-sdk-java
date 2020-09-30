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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegionalBucketsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     */
    private String accountId;
    /** <p/> */
    private String nextToken;
    /** <p/> */
    private Integer maxResults;
    /**
     * <p>
     * The ID of the AWS Outposts.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String outpostId;

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @return The AWS account ID of the Outposts bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p/>
     * 
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p/>
     * 
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Outposts.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param outpostId
     *        The ID of the AWS Outposts.</p> <note>
     *        <p>
     *        This is required by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outposts.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return The ID of the AWS Outposts.</p> <note>
     *         <p>
     *         This is required by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outposts.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param outpostId
     *        The ID of the AWS Outposts.</p> <note>
     *        <p>
     *        This is required by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegionalBucketsRequest == false)
            return false;
        ListRegionalBucketsRequest other = (ListRegionalBucketsRequest) obj;
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
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
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
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public ListRegionalBucketsRequest clone() {
        return (ListRegionalBucketsRequest) super.clone();
    }

}
