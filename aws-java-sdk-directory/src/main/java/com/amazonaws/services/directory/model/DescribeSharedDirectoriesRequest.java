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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSharedDirectories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSharedDirectoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the identifier of the directory in the directory owner account.
     * </p>
     */
    private String ownerDirectoryId;
    /**
     * <p>
     * A list of identifiers of all shared directories in your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sharedDirectoryIds;
    /**
     * <p>
     * The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     * <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of shared directories to return in the response object.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Returns the identifier of the directory in the directory owner account.
     * </p>
     * 
     * @param ownerDirectoryId
     *        Returns the identifier of the directory in the directory owner account.
     */

    public void setOwnerDirectoryId(String ownerDirectoryId) {
        this.ownerDirectoryId = ownerDirectoryId;
    }

    /**
     * <p>
     * Returns the identifier of the directory in the directory owner account.
     * </p>
     * 
     * @return Returns the identifier of the directory in the directory owner account.
     */

    public String getOwnerDirectoryId() {
        return this.ownerDirectoryId;
    }

    /**
     * <p>
     * Returns the identifier of the directory in the directory owner account.
     * </p>
     * 
     * @param ownerDirectoryId
     *        Returns the identifier of the directory in the directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesRequest withOwnerDirectoryId(String ownerDirectoryId) {
        setOwnerDirectoryId(ownerDirectoryId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers of all shared directories in your account.
     * </p>
     * 
     * @return A list of identifiers of all shared directories in your account.
     */

    public java.util.List<String> getSharedDirectoryIds() {
        if (sharedDirectoryIds == null) {
            sharedDirectoryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sharedDirectoryIds;
    }

    /**
     * <p>
     * A list of identifiers of all shared directories in your account.
     * </p>
     * 
     * @param sharedDirectoryIds
     *        A list of identifiers of all shared directories in your account.
     */

    public void setSharedDirectoryIds(java.util.Collection<String> sharedDirectoryIds) {
        if (sharedDirectoryIds == null) {
            this.sharedDirectoryIds = null;
            return;
        }

        this.sharedDirectoryIds = new com.amazonaws.internal.SdkInternalList<String>(sharedDirectoryIds);
    }

    /**
     * <p>
     * A list of identifiers of all shared directories in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedDirectoryIds(java.util.Collection)} or {@link #withSharedDirectoryIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sharedDirectoryIds
     *        A list of identifiers of all shared directories in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesRequest withSharedDirectoryIds(String... sharedDirectoryIds) {
        if (this.sharedDirectoryIds == null) {
            setSharedDirectoryIds(new com.amazonaws.internal.SdkInternalList<String>(sharedDirectoryIds.length));
        }
        for (String ele : sharedDirectoryIds) {
            this.sharedDirectoryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers of all shared directories in your account.
     * </p>
     * 
     * @param sharedDirectoryIds
     *        A list of identifiers of all shared directories in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesRequest withSharedDirectoryIds(java.util.Collection<String> sharedDirectoryIds) {
        setSharedDirectoryIds(sharedDirectoryIds);
        return this;
    }

    /**
     * <p>
     * The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     * <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     *        <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     * <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     *         <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     * <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeSharedDirectoriesResult.NextToken</code> value from a previous call to
     *        <a>DescribeSharedDirectories</a>. Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of shared directories to return in the response object.
     * </p>
     * 
     * @param limit
     *        The number of shared directories to return in the response object.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of shared directories to return in the response object.
     * </p>
     * 
     * @return The number of shared directories to return in the response object.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of shared directories to return in the response object.
     * </p>
     * 
     * @param limit
     *        The number of shared directories to return in the response object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getOwnerDirectoryId() != null)
            sb.append("OwnerDirectoryId: ").append(getOwnerDirectoryId()).append(",");
        if (getSharedDirectoryIds() != null)
            sb.append("SharedDirectoryIds: ").append(getSharedDirectoryIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSharedDirectoriesRequest == false)
            return false;
        DescribeSharedDirectoriesRequest other = (DescribeSharedDirectoriesRequest) obj;
        if (other.getOwnerDirectoryId() == null ^ this.getOwnerDirectoryId() == null)
            return false;
        if (other.getOwnerDirectoryId() != null && other.getOwnerDirectoryId().equals(this.getOwnerDirectoryId()) == false)
            return false;
        if (other.getSharedDirectoryIds() == null ^ this.getSharedDirectoryIds() == null)
            return false;
        if (other.getSharedDirectoryIds() != null && other.getSharedDirectoryIds().equals(this.getSharedDirectoryIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerDirectoryId() == null) ? 0 : getOwnerDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSharedDirectoryIds() == null) ? 0 : getSharedDirectoryIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSharedDirectoriesRequest clone() {
        return (DescribeSharedDirectoriesRequest) super.clone();
    }

}
