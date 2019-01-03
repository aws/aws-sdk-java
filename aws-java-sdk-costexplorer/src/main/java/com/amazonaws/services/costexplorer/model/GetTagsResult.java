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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The tags that match your request.
     * </p>
     */
    private java.util.List<String> tags;
    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     */
    private Integer returnSize;
    /**
     * <p>
     * The total number of query results.
     * </p>
     */
    private Integer totalSize;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @return The token for the next set of retrievable results. AWS provides the token when the response from a
     *         previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * 
     * @return The tags that match your request.
     */

    public java.util.List<String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * 
     * @param tags
     *        The tags that match your request.
     */

    public void setTags(java.util.Collection<String> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<String>(tags);
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsResult withTags(String... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<String>(tags.length));
        }
        for (String ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * 
     * @param tags
     *        The tags that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsResult withTags(java.util.Collection<String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     * 
     * @param returnSize
     *        The number of query results that AWS returns at a time.
     */

    public void setReturnSize(Integer returnSize) {
        this.returnSize = returnSize;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     * 
     * @return The number of query results that AWS returns at a time.
     */

    public Integer getReturnSize() {
        return this.returnSize;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     * 
     * @param returnSize
     *        The number of query results that AWS returns at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsResult withReturnSize(Integer returnSize) {
        setReturnSize(returnSize);
        return this;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     * 
     * @param totalSize
     *        The total number of query results.
     */

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     * 
     * @return The total number of query results.
     */

    public Integer getTotalSize() {
        return this.totalSize;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     * 
     * @param totalSize
     *        The total number of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsResult withTotalSize(Integer totalSize) {
        setTotalSize(totalSize);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getReturnSize() != null)
            sb.append("ReturnSize: ").append(getReturnSize()).append(",");
        if (getTotalSize() != null)
            sb.append("TotalSize: ").append(getTotalSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagsResult == false)
            return false;
        GetTagsResult other = (GetTagsResult) obj;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getReturnSize() == null ^ this.getReturnSize() == null)
            return false;
        if (other.getReturnSize() != null && other.getReturnSize().equals(this.getReturnSize()) == false)
            return false;
        if (other.getTotalSize() == null ^ this.getTotalSize() == null)
            return false;
        if (other.getTotalSize() != null && other.getTotalSize().equals(this.getTotalSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getReturnSize() == null) ? 0 : getReturnSize().hashCode());
        hashCode = prime * hashCode + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        return hashCode;
    }

    @Override
    public GetTagsResult clone() {
        try {
            return (GetTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
