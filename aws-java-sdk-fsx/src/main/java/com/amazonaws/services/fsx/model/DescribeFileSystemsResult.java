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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response object for <code>DescribeFileSystems</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     */
    private java.util.List<FileSystem> fileSystems;
    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextToken</code> value in the later request to fetch the descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @return An array of file system descriptions.
     */

    public java.util.List<FileSystem> getFileSystems() {
        return fileSystems;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     */

    public void setFileSystems(java.util.Collection<FileSystem> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
            return;
        }

        this.fileSystems = new java.util.ArrayList<FileSystem>(fileSystems);
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystems(java.util.Collection)} or {@link #withFileSystems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withFileSystems(FileSystem... fileSystems) {
        if (this.fileSystems == null) {
            setFileSystems(new java.util.ArrayList<FileSystem>(fileSystems.length));
        }
        for (FileSystem ele : fileSystems) {
            this.fileSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withFileSystems(java.util.Collection<FileSystem> fileSystems) {
        setFileSystems(fileSystems);
        return this;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextToken</code> value in the later request to fetch the descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more file systems than returned in the response (String). You can use the
     *        <code>NextToken</code> value in the later request to fetch the descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextToken</code> value in the later request to fetch the descriptions.
     * </p>
     * 
     * @return Present if there are more file systems than returned in the response (String). You can use the
     *         <code>NextToken</code> value in the later request to fetch the descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextToken</code> value in the later request to fetch the descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more file systems than returned in the response (String). You can use the
     *        <code>NextToken</code> value in the later request to fetch the descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withNextToken(String nextToken) {
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
        if (getFileSystems() != null)
            sb.append("FileSystems: ").append(getFileSystems()).append(",");
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

        if (obj instanceof DescribeFileSystemsResult == false)
            return false;
        DescribeFileSystemsResult other = (DescribeFileSystemsResult) obj;
        if (other.getFileSystems() == null ^ this.getFileSystems() == null)
            return false;
        if (other.getFileSystems() != null && other.getFileSystems().equals(this.getFileSystems()) == false)
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

        hashCode = prime * hashCode + ((getFileSystems() == null) ? 0 : getFileSystems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemsResult clone() {
        try {
            return (DescribeFileSystemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
