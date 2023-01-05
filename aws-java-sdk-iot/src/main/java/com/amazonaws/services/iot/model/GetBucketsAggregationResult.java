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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketsAggregationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of things that fit the query string criteria.
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     * <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     */
    private java.util.List<Bucket> buckets;

    /**
     * <p>
     * The total number of things that fit the query string criteria.
     * </p>
     * 
     * @param totalCount
     *        The total number of things that fit the query string criteria.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of things that fit the query string criteria.
     * </p>
     * 
     * @return The total number of things that fit the query string criteria.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of things that fit the query string criteria.
     * </p>
     * 
     * @param totalCount
     *        The total number of things that fit the query string criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     * <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * 
     * @return The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     *         <code>count</code>.</p>
     *         <p>
     *         <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     *         </p>
     *         <p>
     *         <code>count</code>: The number of documents that have that value.
     */

    public java.util.List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     * <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * 
     * @param buckets
     *        The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     *        <code>count</code>.</p>
     *        <p>
     *        <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     *        </p>
     *        <p>
     *        <code>count</code>: The number of documents that have that value.
     */

    public void setBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<Bucket>(buckets);
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     * <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuckets(java.util.Collection)} or {@link #withBuckets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buckets
     *        The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     *        <code>count</code>.</p>
     *        <p>
     *        <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     *        </p>
     *        <p>
     *        <code>count</code>: The number of documents that have that value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationResult withBuckets(Bucket... buckets) {
        if (this.buckets == null) {
            setBuckets(new java.util.ArrayList<Bucket>(buckets.length));
        }
        for (Bucket ele : buckets) {
            this.buckets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     * <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * 
     * @param buckets
     *        The main part of the response with a list of buckets. Each bucket contains a <code>keyValue</code> and a
     *        <code>count</code>.</p>
     *        <p>
     *        <code>keyValue</code>: The aggregation field value counted for the particular bucket.
     *        </p>
     *        <p>
     *        <code>count</code>: The number of documents that have that value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationResult withBuckets(java.util.Collection<Bucket> buckets) {
        setBuckets(buckets);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getBuckets() != null)
            sb.append("Buckets: ").append(getBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketsAggregationResult == false)
            return false;
        GetBucketsAggregationResult other = (GetBucketsAggregationResult) obj;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketsAggregationResult clone() {
        try {
            return (GetBucketsAggregationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
