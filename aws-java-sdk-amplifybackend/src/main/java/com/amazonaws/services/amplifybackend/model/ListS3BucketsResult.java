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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListS3Buckets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListS3BucketsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of S3 buckets.
     * </p>
     */
    private java.util.List<S3BucketInfo> buckets;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of S3 buckets.
     * </p>
     * 
     * @return The list of S3 buckets.
     */

    public java.util.List<S3BucketInfo> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * The list of S3 buckets.
     * </p>
     * 
     * @param buckets
     *        The list of S3 buckets.
     */

    public void setBuckets(java.util.Collection<S3BucketInfo> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<S3BucketInfo>(buckets);
    }

    /**
     * <p>
     * The list of S3 buckets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuckets(java.util.Collection)} or {@link #withBuckets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buckets
     *        The list of S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3BucketsResult withBuckets(S3BucketInfo... buckets) {
        if (this.buckets == null) {
            setBuckets(new java.util.ArrayList<S3BucketInfo>(buckets.length));
        }
        for (S3BucketInfo ele : buckets) {
            this.buckets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of S3 buckets.
     * </p>
     * 
     * @param buckets
     *        The list of S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3BucketsResult withBuckets(java.util.Collection<S3BucketInfo> buckets) {
        setBuckets(buckets);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3BucketsResult withNextToken(String nextToken) {
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
        if (getBuckets() != null)
            sb.append("Buckets: ").append(getBuckets()).append(",");
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

        if (obj instanceof ListS3BucketsResult == false)
            return false;
        ListS3BucketsResult other = (ListS3BucketsResult) obj;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
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

        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListS3BucketsResult clone() {
        try {
            return (ListS3BucketsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
