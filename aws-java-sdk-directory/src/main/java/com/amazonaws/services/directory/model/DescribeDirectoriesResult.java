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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of the <a>DescribeDirectories</a> operation.
 * </p>
 */
public class DescribeDirectoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <a>DirectoryDescription</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DirectoryDescription> directoryDescriptions;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <a>DirectoryDescription</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @return The list of <a>DirectoryDescription</a> objects that were retrieved.</p>
     *         <p>
     *         It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *         of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *         the limitations of the operation have been exceeded.
     */

    public java.util.List<DirectoryDescription> getDirectoryDescriptions() {
        if (directoryDescriptions == null) {
            directoryDescriptions = new com.amazonaws.internal.SdkInternalList<DirectoryDescription>();
        }
        return directoryDescriptions;
    }

    /**
     * <p>
     * The list of <a>DirectoryDescription</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @param directoryDescriptions
     *        The list of <a>DirectoryDescription</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     */

    public void setDirectoryDescriptions(java.util.Collection<DirectoryDescription> directoryDescriptions) {
        if (directoryDescriptions == null) {
            this.directoryDescriptions = null;
            return;
        }

        this.directoryDescriptions = new com.amazonaws.internal.SdkInternalList<DirectoryDescription>(directoryDescriptions);
    }

    /**
     * <p>
     * The list of <a>DirectoryDescription</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectoryDescriptions(java.util.Collection)} or
     * {@link #withDirectoryDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param directoryDescriptions
     *        The list of <a>DirectoryDescription</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesResult withDirectoryDescriptions(DirectoryDescription... directoryDescriptions) {
        if (this.directoryDescriptions == null) {
            setDirectoryDescriptions(new com.amazonaws.internal.SdkInternalList<DirectoryDescription>(directoryDescriptions.length));
        }
        for (DirectoryDescription ele : directoryDescriptions) {
            this.directoryDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>DirectoryDescription</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @param directoryDescriptions
     *        The list of <a>DirectoryDescription</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesResult withDirectoryDescriptions(java.util.Collection<DirectoryDescription> directoryDescriptions) {
        setDirectoryDescriptions(directoryDescriptions);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>DescribeDirectories</a> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *         subsequent call to <a>DescribeDirectories</a> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoriesResult withNextToken(String nextToken) {
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
        if (getDirectoryDescriptions() != null)
            sb.append("DirectoryDescriptions: " + getDirectoryDescriptions() + ",");
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

        if (obj instanceof DescribeDirectoriesResult == false)
            return false;
        DescribeDirectoriesResult other = (DescribeDirectoriesResult) obj;
        if (other.getDirectoryDescriptions() == null ^ this.getDirectoryDescriptions() == null)
            return false;
        if (other.getDirectoryDescriptions() != null && other.getDirectoryDescriptions().equals(this.getDirectoryDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryDescriptions() == null) ? 0 : getDirectoryDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectoriesResult clone() {
        try {
            return (DescribeDirectoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
