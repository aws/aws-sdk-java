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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRepositoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of repository objects corresponding to valid repositories.
     * </p>
     */
    private java.util.List<Repository> repositories;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When the
     * results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of repository objects corresponding to valid repositories.
     * </p>
     * 
     * @return A list of repository objects corresponding to valid repositories.
     */

    public java.util.List<Repository> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * A list of repository objects corresponding to valid repositories.
     * </p>
     * 
     * @param repositories
     *        A list of repository objects corresponding to valid repositories.
     */

    public void setRepositories(java.util.Collection<Repository> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<Repository>(repositories);
    }

    /**
     * <p>
     * A list of repository objects corresponding to valid repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        A list of repository objects corresponding to valid repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoriesResult withRepositories(Repository... repositories) {
        if (this.repositories == null) {
            setRepositories(new java.util.ArrayList<Repository>(repositories.length));
        }
        for (Repository ele : repositories) {
            this.repositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of repository objects corresponding to valid repositories.
     * </p>
     * 
     * @param repositories
     *        A list of repository objects corresponding to valid repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoriesResult withRepositories(java.util.Collection<Repository> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When the
     * results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When
     *        the results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can
     *        be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When the
     * results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When
     *         the results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can
     *         be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When the
     * results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeRepositories</code> request. When
     *        the results of a <code>DescribeRepositories</code> request exceed <code>maxResults</code>, this value can
     *        be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoriesResult withNextToken(String nextToken) {
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
        if (getRepositories() != null)
            sb.append("Repositories: ").append(getRepositories()).append(",");
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

        if (obj instanceof DescribeRepositoriesResult == false)
            return false;
        DescribeRepositoriesResult other = (DescribeRepositoriesResult) obj;
        if (other.getRepositories() == null ^ this.getRepositories() == null)
            return false;
        if (other.getRepositories() != null && other.getRepositories().equals(this.getRepositories()) == false)
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

        hashCode = prime * hashCode + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRepositoriesResult clone() {
        try {
            return (DescribeRepositoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
