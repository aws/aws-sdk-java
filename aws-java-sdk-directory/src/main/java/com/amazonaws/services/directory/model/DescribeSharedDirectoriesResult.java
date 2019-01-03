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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSharedDirectories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSharedDirectoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all shared directories in your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SharedDirectory> sharedDirectories;
    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all shared directories in your account.
     * </p>
     * 
     * @return A list of all shared directories in your account.
     */

    public java.util.List<SharedDirectory> getSharedDirectories() {
        if (sharedDirectories == null) {
            sharedDirectories = new com.amazonaws.internal.SdkInternalList<SharedDirectory>();
        }
        return sharedDirectories;
    }

    /**
     * <p>
     * A list of all shared directories in your account.
     * </p>
     * 
     * @param sharedDirectories
     *        A list of all shared directories in your account.
     */

    public void setSharedDirectories(java.util.Collection<SharedDirectory> sharedDirectories) {
        if (sharedDirectories == null) {
            this.sharedDirectories = null;
            return;
        }

        this.sharedDirectories = new com.amazonaws.internal.SdkInternalList<SharedDirectory>(sharedDirectories);
    }

    /**
     * <p>
     * A list of all shared directories in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedDirectories(java.util.Collection)} or {@link #withSharedDirectories(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sharedDirectories
     *        A list of all shared directories in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesResult withSharedDirectories(SharedDirectory... sharedDirectories) {
        if (this.sharedDirectories == null) {
            setSharedDirectories(new com.amazonaws.internal.SdkInternalList<SharedDirectory>(sharedDirectories.length));
        }
        for (SharedDirectory ele : sharedDirectories) {
            this.sharedDirectories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all shared directories in your account.
     * </p>
     * 
     * @param sharedDirectories
     *        A list of all shared directories in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesResult withSharedDirectories(java.util.Collection<SharedDirectory> sharedDirectories) {
        setSharedDirectories(sharedDirectories);
        return this;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, token that indicates that more results are available. Pass this value for the
     *        <code>NextToken</code> parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the
     *        next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, token that indicates that more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the
     *         next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, token that indicates that more results are available. Pass this value for the
     *        <code>NextToken</code> parameter in a subsequent call to <a>DescribeSharedDirectories</a> to retrieve the
     *        next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSharedDirectoriesResult withNextToken(String nextToken) {
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
        if (getSharedDirectories() != null)
            sb.append("SharedDirectories: ").append(getSharedDirectories()).append(",");
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

        if (obj instanceof DescribeSharedDirectoriesResult == false)
            return false;
        DescribeSharedDirectoriesResult other = (DescribeSharedDirectoriesResult) obj;
        if (other.getSharedDirectories() == null ^ this.getSharedDirectories() == null)
            return false;
        if (other.getSharedDirectories() != null && other.getSharedDirectories().equals(this.getSharedDirectories()) == false)
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

        hashCode = prime * hashCode + ((getSharedDirectories() == null) ? 0 : getSharedDirectories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSharedDirectoriesResult clone() {
        try {
            return (DescribeSharedDirectoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
