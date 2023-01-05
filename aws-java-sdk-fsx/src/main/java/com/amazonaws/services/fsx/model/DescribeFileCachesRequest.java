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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileCachesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * IDs of the caches whose descriptions you want to retrieve (String).
     * </p>
     */
    private java.util.List<String> fileCacheIds;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * IDs of the caches whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @return IDs of the caches whose descriptions you want to retrieve (String).
     */

    public java.util.List<String> getFileCacheIds() {
        return fileCacheIds;
    }

    /**
     * <p>
     * IDs of the caches whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param fileCacheIds
     *        IDs of the caches whose descriptions you want to retrieve (String).
     */

    public void setFileCacheIds(java.util.Collection<String> fileCacheIds) {
        if (fileCacheIds == null) {
            this.fileCacheIds = null;
            return;
        }

        this.fileCacheIds = new java.util.ArrayList<String>(fileCacheIds);
    }

    /**
     * <p>
     * IDs of the caches whose descriptions you want to retrieve (String).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileCacheIds(java.util.Collection)} or {@link #withFileCacheIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileCacheIds
     *        IDs of the caches whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesRequest withFileCacheIds(String... fileCacheIds) {
        if (this.fileCacheIds == null) {
            setFileCacheIds(new java.util.ArrayList<String>(fileCacheIds.length));
        }
        for (String ele : fileCacheIds) {
            this.fileCacheIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IDs of the caches whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param fileCacheIds
     *        IDs of the caches whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesRequest withFileCacheIds(java.util.Collection<String> fileCacheIds) {
        setFileCacheIds(fileCacheIds);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesRequest withNextToken(String nextToken) {
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
        if (getFileCacheIds() != null)
            sb.append("FileCacheIds: ").append(getFileCacheIds()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeFileCachesRequest == false)
            return false;
        DescribeFileCachesRequest other = (DescribeFileCachesRequest) obj;
        if (other.getFileCacheIds() == null ^ this.getFileCacheIds() == null)
            return false;
        if (other.getFileCacheIds() != null && other.getFileCacheIds().equals(this.getFileCacheIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFileCacheIds() == null) ? 0 : getFileCacheIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileCachesRequest clone() {
        return (DescribeFileCachesRequest) super.clone();
    }

}
