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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceDirectoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the directories. If the value is null, all directories are retrieved.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> directoryIds;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of the directories. If the value is null, all directories are retrieved.
     * </p>
     * 
     * @return The identifiers of the directories. If the value is null, all directories are retrieved.
     */

    public java.util.List<String> getDirectoryIds() {
        if (directoryIds == null) {
            directoryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return directoryIds;
    }

    /**
     * <p>
     * The identifiers of the directories. If the value is null, all directories are retrieved.
     * </p>
     * 
     * @param directoryIds
     *        The identifiers of the directories. If the value is null, all directories are retrieved.
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
     * The identifiers of the directories. If the value is null, all directories are retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectoryIds(java.util.Collection)} or {@link #withDirectoryIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param directoryIds
     *        The identifiers of the directories. If the value is null, all directories are retrieved.
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
     * The identifiers of the directories. If the value is null, all directories are retrieved.
     * </p>
     * 
     * @param directoryIds
     *        The identifiers of the directories. If the value is null, all directories are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesRequest withDirectoryIds(java.util.Collection<String> directoryIds) {
        setDirectoryIds(directoryIds);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesRequest withNextToken(String nextToken) {
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
        if (getDirectoryIds() != null)
            sb.append("DirectoryIds: ").append(getDirectoryIds()).append(",");
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
