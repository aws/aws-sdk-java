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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileCachesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response object for the <code>DescribeFileCaches</code> operation.
     * </p>
     */
    private java.util.List<FileCache> fileCaches;

    private String nextToken;

    /**
     * <p>
     * The response object for the <code>DescribeFileCaches</code> operation.
     * </p>
     * 
     * @return The response object for the <code>DescribeFileCaches</code> operation.
     */

    public java.util.List<FileCache> getFileCaches() {
        return fileCaches;
    }

    /**
     * <p>
     * The response object for the <code>DescribeFileCaches</code> operation.
     * </p>
     * 
     * @param fileCaches
     *        The response object for the <code>DescribeFileCaches</code> operation.
     */

    public void setFileCaches(java.util.Collection<FileCache> fileCaches) {
        if (fileCaches == null) {
            this.fileCaches = null;
            return;
        }

        this.fileCaches = new java.util.ArrayList<FileCache>(fileCaches);
    }

    /**
     * <p>
     * The response object for the <code>DescribeFileCaches</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileCaches(java.util.Collection)} or {@link #withFileCaches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileCaches
     *        The response object for the <code>DescribeFileCaches</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesResult withFileCaches(FileCache... fileCaches) {
        if (this.fileCaches == null) {
            setFileCaches(new java.util.ArrayList<FileCache>(fileCaches.length));
        }
        for (FileCache ele : fileCaches) {
            this.fileCaches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response object for the <code>DescribeFileCaches</code> operation.
     * </p>
     * 
     * @param fileCaches
     *        The response object for the <code>DescribeFileCaches</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileCachesResult withFileCaches(java.util.Collection<FileCache> fileCaches) {
        setFileCaches(fileCaches);
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

    public DescribeFileCachesResult withNextToken(String nextToken) {
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
        if (getFileCaches() != null)
            sb.append("FileCaches: ").append(getFileCaches()).append(",");
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

        if (obj instanceof DescribeFileCachesResult == false)
            return false;
        DescribeFileCachesResult other = (DescribeFileCachesResult) obj;
        if (other.getFileCaches() == null ^ this.getFileCaches() == null)
            return false;
        if (other.getFileCaches() != null && other.getFileCaches().equals(this.getFileCaches()) == false)
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

        hashCode = prime * hashCode + ((getFileCaches() == null) ? 0 : getFileCaches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileCachesResult clone() {
        try {
            return (DescribeFileCachesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
