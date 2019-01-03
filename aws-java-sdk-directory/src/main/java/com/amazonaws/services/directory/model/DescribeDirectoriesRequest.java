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
 * <p>
 * Contains the inputs for the <a>DescribeDirectories</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDirectories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of identifiers of the directories for which to obtain the information. If this member is null, all
     * directories that belong to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> directoryIds;
    /**
     * <p>
     * The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to <a>DescribeDirectories</a>.
     * Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * A list of identifiers of the directories for which to obtain the information. If this member is null, all
     * directories that belong to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @return A list of identifiers of the directories for which to obtain the information. If this member is null, all
     *         directories that belong to the current account are returned.</p>
     *         <p>
     *         An empty list results in an <code>InvalidParameterException</code> being thrown.
     */

    public java.util.List<String> getDirectoryIds() {
        if (directoryIds == null) {
            directoryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return directoryIds;
    }

    /**
     * <p>
     * A list of identifiers of the directories for which to obtain the information. If this member is null, all
     * directories that belong to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @param directoryIds
     *        A list of identifiers of the directories for which to obtain the information. If this member is null, all
     *        directories that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     */

    public void setDirectoryIds(java.util.Collection<String> directoryIds) {
        if (directoryIds == null) {
            this.directoryIds = null;
            return;
        }

        this.directoryIds = new com.amazonaws.internal.SdkInternalList<String>(directoryIds);
    }

    /**
     * <p>
     * A list of identifiers of the directories for which to obtain the information. If this member is null, all
     * directories that belong to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectoryIds(java.util.Collection)} or {@link #withDirectoryIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param directoryIds
     *        A list of identifiers of the directories for which to obtain the information. If this member is null, all
     *        directories that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesRequest withDirectoryIds(String... directoryIds) {
        if (this.directoryIds == null) {
            setDirectoryIds(new com.amazonaws.internal.SdkInternalList<String>(directoryIds.length));
        }
        for (String ele : directoryIds) {
            this.directoryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers of the directories for which to obtain the information. If this member is null, all
     * directories that belong to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @param directoryIds
     *        A list of identifiers of the directories for which to obtain the information. If this member is null, all
     *        directories that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesRequest withDirectoryIds(java.util.Collection<String> directoryIds) {
        setDirectoryIds(directoryIds);
        return this;
    }

    /**
     * <p>
     * The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to <a>DescribeDirectories</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to
     *        <a>DescribeDirectories</a>. Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to <a>DescribeDirectories</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to
     *         <a>DescribeDirectories</a>. Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to <a>DescribeDirectories</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeDirectoriesResult.NextToken</code> value from a previous call to
     *        <a>DescribeDirectories</a>. Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *        the limitations of the operation.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @return The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *         the limitations of the operation.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *        the limitations of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesRequest withLimit(Integer limit) {
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
        if (getDirectoryIds() != null)
            sb.append("DirectoryIds: ").append(getDirectoryIds()).append(",");
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

        if (obj instanceof DescribeDirectoriesRequest == false)
            return false;
        DescribeDirectoriesRequest other = (DescribeDirectoriesRequest) obj;
        if (other.getDirectoryIds() == null ^ this.getDirectoryIds() == null)
            return false;
        if (other.getDirectoryIds() != null && other.getDirectoryIds().equals(this.getDirectoryIds()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryIds() == null) ? 0 : getDirectoryIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectoriesRequest clone() {
        return (DescribeDirectoriesRequest) super.clone();
    }

}
