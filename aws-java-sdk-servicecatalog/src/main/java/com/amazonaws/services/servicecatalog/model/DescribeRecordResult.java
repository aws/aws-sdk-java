/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed record information for the specified product.
     * </p>
     */
    private RecordDetail recordDetail;
    /**
     * <p>
     * A list of outputs for the specified Product object created as the result of a request. For example, a
     * CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * </p>
     */
    private java.util.List<RecordOutput> recordOutputs;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Detailed record information for the specified product.
     * </p>
     * 
     * @param recordDetail
     *        Detailed record information for the specified product.
     */

    public void setRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
    }

    /**
     * <p>
     * Detailed record information for the specified product.
     * </p>
     * 
     * @return Detailed record information for the specified product.
     */

    public RecordDetail getRecordDetail() {
        return this.recordDetail;
    }

    /**
     * <p>
     * Detailed record information for the specified product.
     * </p>
     * 
     * @param recordDetail
     *        Detailed record information for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordResult withRecordDetail(RecordDetail recordDetail) {
        setRecordDetail(recordDetail);
        return this;
    }

    /**
     * <p>
     * A list of outputs for the specified Product object created as the result of a request. For example, a
     * CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * </p>
     * 
     * @return A list of outputs for the specified Product object created as the result of a request. For example, a
     *         CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     */

    public java.util.List<RecordOutput> getRecordOutputs() {
        return recordOutputs;
    }

    /**
     * <p>
     * A list of outputs for the specified Product object created as the result of a request. For example, a
     * CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * </p>
     * 
     * @param recordOutputs
     *        A list of outputs for the specified Product object created as the result of a request. For example, a
     *        CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     */

    public void setRecordOutputs(java.util.Collection<RecordOutput> recordOutputs) {
        if (recordOutputs == null) {
            this.recordOutputs = null;
            return;
        }

        this.recordOutputs = new java.util.ArrayList<RecordOutput>(recordOutputs);
    }

    /**
     * <p>
     * A list of outputs for the specified Product object created as the result of a request. For example, a
     * CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordOutputs(java.util.Collection)} or {@link #withRecordOutputs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recordOutputs
     *        A list of outputs for the specified Product object created as the result of a request. For example, a
     *        CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordResult withRecordOutputs(RecordOutput... recordOutputs) {
        if (this.recordOutputs == null) {
            setRecordOutputs(new java.util.ArrayList<RecordOutput>(recordOutputs.length));
        }
        for (RecordOutput ele : recordOutputs) {
            this.recordOutputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of outputs for the specified Product object created as the result of a request. For example, a
     * CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * </p>
     * 
     * @param recordOutputs
     *        A list of outputs for the specified Product object created as the result of a request. For example, a
     *        CloudFormation-backed product that creates an S3 bucket would have an output for the S3 bucket URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordResult withRecordOutputs(java.util.Collection<RecordOutput> recordOutputs) {
        setRecordOutputs(recordOutputs);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @return The page token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecordDetail() != null)
            sb.append("RecordDetail: " + getRecordDetail() + ",");
        if (getRecordOutputs() != null)
            sb.append("RecordOutputs: " + getRecordOutputs() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecordResult == false)
            return false;
        DescribeRecordResult other = (DescribeRecordResult) obj;
        if (other.getRecordDetail() == null ^ this.getRecordDetail() == null)
            return false;
        if (other.getRecordDetail() != null && other.getRecordDetail().equals(this.getRecordDetail()) == false)
            return false;
        if (other.getRecordOutputs() == null ^ this.getRecordOutputs() == null)
            return false;
        if (other.getRecordOutputs() != null && other.getRecordOutputs().equals(this.getRecordOutputs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordDetail() == null) ? 0 : getRecordDetail().hashCode());
        hashCode = prime * hashCode + ((getRecordOutputs() == null) ? 0 : getRecordOutputs().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecordResult clone() {
        try {
            return (DescribeRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
