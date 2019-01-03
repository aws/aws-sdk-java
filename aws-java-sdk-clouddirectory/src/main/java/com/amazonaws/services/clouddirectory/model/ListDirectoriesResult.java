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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDirectories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDirectoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all directories that are associated with your account in pagination fashion.
     * </p>
     */
    private java.util.List<Directory> directories;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists all directories that are associated with your account in pagination fashion.
     * </p>
     * 
     * @return Lists all directories that are associated with your account in pagination fashion.
     */

    public java.util.List<Directory> getDirectories() {
        return directories;
    }

    /**
     * <p>
     * Lists all directories that are associated with your account in pagination fashion.
     * </p>
     * 
     * @param directories
     *        Lists all directories that are associated with your account in pagination fashion.
     */

    public void setDirectories(java.util.Collection<Directory> directories) {
        if (directories == null) {
            this.directories = null;
            return;
        }

        this.directories = new java.util.ArrayList<Directory>(directories);
    }

    /**
     * <p>
     * Lists all directories that are associated with your account in pagination fashion.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectories(java.util.Collection)} or {@link #withDirectories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param directories
     *        Lists all directories that are associated with your account in pagination fashion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDirectoriesResult withDirectories(Directory... directories) {
        if (this.directories == null) {
            setDirectories(new java.util.ArrayList<Directory>(directories.length));
        }
        for (Directory ele : directories) {
            this.directories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all directories that are associated with your account in pagination fashion.
     * </p>
     * 
     * @param directories
     *        Lists all directories that are associated with your account in pagination fashion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDirectoriesResult withDirectories(java.util.Collection<Directory> directories) {
        setDirectories(directories);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDirectoriesResult withNextToken(String nextToken) {
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
        if (getDirectories() != null)
            sb.append("Directories: ").append(getDirectories()).append(",");
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

        if (obj instanceof ListDirectoriesResult == false)
            return false;
        ListDirectoriesResult other = (ListDirectoriesResult) obj;
        if (other.getDirectories() == null ^ this.getDirectories() == null)
            return false;
        if (other.getDirectories() != null && other.getDirectories().equals(this.getDirectories()) == false)
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

        hashCode = prime * hashCode + ((getDirectories() == null) ? 0 : getDirectories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDirectoriesResult clone() {
        try {
            return (ListDirectoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
