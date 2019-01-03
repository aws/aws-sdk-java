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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectoryConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the directory configurations. Note that although the response syntax in this topic includes the
     * account password, this password is not returned in the actual response.
     * </p>
     */
    private java.util.List<DirectoryConfig> directoryConfigs;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the directory configurations. Note that although the response syntax in this topic includes the
     * account password, this password is not returned in the actual response.
     * </p>
     * 
     * @return Information about the directory configurations. Note that although the response syntax in this topic
     *         includes the account password, this password is not returned in the actual response.
     */

    public java.util.List<DirectoryConfig> getDirectoryConfigs() {
        return directoryConfigs;
    }

    /**
     * <p>
     * Information about the directory configurations. Note that although the response syntax in this topic includes the
     * account password, this password is not returned in the actual response.
     * </p>
     * 
     * @param directoryConfigs
     *        Information about the directory configurations. Note that although the response syntax in this topic
     *        includes the account password, this password is not returned in the actual response.
     */

    public void setDirectoryConfigs(java.util.Collection<DirectoryConfig> directoryConfigs) {
        if (directoryConfigs == null) {
            this.directoryConfigs = null;
            return;
        }

        this.directoryConfigs = new java.util.ArrayList<DirectoryConfig>(directoryConfigs);
    }

    /**
     * <p>
     * Information about the directory configurations. Note that although the response syntax in this topic includes the
     * account password, this password is not returned in the actual response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectoryConfigs(java.util.Collection)} or {@link #withDirectoryConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param directoryConfigs
     *        Information about the directory configurations. Note that although the response syntax in this topic
     *        includes the account password, this password is not returned in the actual response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoryConfigsResult withDirectoryConfigs(DirectoryConfig... directoryConfigs) {
        if (this.directoryConfigs == null) {
            setDirectoryConfigs(new java.util.ArrayList<DirectoryConfig>(directoryConfigs.length));
        }
        for (DirectoryConfig ele : directoryConfigs) {
            this.directoryConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the directory configurations. Note that although the response syntax in this topic includes the
     * account password, this password is not returned in the actual response.
     * </p>
     * 
     * @param directoryConfigs
     *        Information about the directory configurations. Note that although the response syntax in this topic
     *        includes the account password, this password is not returned in the actual response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoryConfigsResult withDirectoryConfigs(java.util.Collection<DirectoryConfig> directoryConfigs) {
        setDirectoryConfigs(directoryConfigs);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectoryConfigsResult withNextToken(String nextToken) {
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
        if (getDirectoryConfigs() != null)
            sb.append("DirectoryConfigs: ").append(getDirectoryConfigs()).append(",");
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

        if (obj instanceof DescribeDirectoryConfigsResult == false)
            return false;
        DescribeDirectoryConfigsResult other = (DescribeDirectoryConfigsResult) obj;
        if (other.getDirectoryConfigs() == null ^ this.getDirectoryConfigs() == null)
            return false;
        if (other.getDirectoryConfigs() != null && other.getDirectoryConfigs().equals(this.getDirectoryConfigs()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryConfigs() == null) ? 0 : getDirectoryConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectoryConfigsResult clone() {
        try {
            return (DescribeDirectoryConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
