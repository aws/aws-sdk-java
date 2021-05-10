/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects.
     * </p>
     */
    private java.util.List<RepositorySummary> repositories;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects.
     * </p>
     * 
     * @return The returned list of <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *         >RepositorySummary</a> objects.
     */

    public java.util.List<RepositorySummary> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects.
     * </p>
     * 
     * @param repositories
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *        >RepositorySummary</a> objects.
     */

    public void setRepositories(java.util.Collection<RepositorySummary> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<RepositorySummary>(repositories);
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *        >RepositorySummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesResult withRepositories(RepositorySummary... repositories) {
        if (this.repositories == null) {
            setRepositories(new java.util.ArrayList<RepositorySummary>(repositories.length));
        }
        for (RepositorySummary ele : repositories) {
            this.repositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects.
     * </p>
     * 
     * @param repositories
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *        >RepositorySummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesResult withRepositories(java.util.Collection<RepositorySummary> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListRepositoriesResult == false)
            return false;
        ListRepositoriesResult other = (ListRepositoriesResult) obj;
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
    public ListRepositoriesResult clone() {
        try {
            return (ListRepositoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
