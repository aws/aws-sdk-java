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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DescribeWorkspaceDirectories</a> operation.
 * </p>
 */
public class DescribeWorkspaceDirectoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that contains the directory identifiers to retrieve information for. If this member is null,
     * all directories are retrieved.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> directoryIds;
    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of strings that contains the directory identifiers to retrieve information for. If this member is null,
     * all directories are retrieved.
     * </p>
     * 
     * @return An array of strings that contains the directory identifiers to retrieve information for. If this member
     *         is null, all directories are retrieved.
     */

    public java.util.List<String> getDirectoryIds() {
        if (directoryIds == null) {
            directoryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return directoryIds;
    }

    /**
     * <p>
     * An array of strings that contains the directory identifiers to retrieve information for. If this member is null,
     * all directories are retrieved.
     * </p>
     * 
     * @param directoryIds
     *        An array of strings that contains the directory identifiers to retrieve information for. If this member is
     *        null, all directories are retrieved.
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
     * An array of strings that contains the directory identifiers to retrieve information for. If this member is null,
     * all directories are retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectoryIds(java.util.Collection)} or {@link #withDirectoryIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param directoryIds
     *        An array of strings that contains the directory identifiers to retrieve information for. If this member is
     *        null, all directories are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesRequest withDirectoryIds(String... directoryIds) {
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
     * An array of strings that contains the directory identifiers to retrieve information for. If this member is null,
     * all directories are retrieved.
     * </p>
     * 
     * @param directoryIds
     *        An array of strings that contains the directory identifiers to retrieve information for. If this member is
     *        null, all directories are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesRequest withDirectoryIds(java.util.Collection<String> directoryIds) {
        setDirectoryIds(directoryIds);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *         call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDirectoryIds() != null)
            sb.append("DirectoryIds: " + getDirectoryIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceDirectoriesRequest == false)
            return false;
        DescribeWorkspaceDirectoriesRequest other = (DescribeWorkspaceDirectoriesRequest) obj;
        if (other.getDirectoryIds() == null ^ this.getDirectoryIds() == null)
            return false;
        if (other.getDirectoryIds() != null && other.getDirectoryIds().equals(this.getDirectoryIds()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryIds() == null) ? 0 : getDirectoryIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceDirectoriesRequest clone() {
        return (DescribeWorkspaceDirectoriesRequest) super.clone();
    }
}
