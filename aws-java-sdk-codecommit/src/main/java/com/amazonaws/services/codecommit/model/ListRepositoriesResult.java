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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a list repositories operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the repositories called by the list repositories operation.
     * </p>
     */
    private java.util.List<RepositoryNameIdPair> repositories;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for
     * list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records
     * is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the repositories called by the list repositories operation.
     * </p>
     * 
     * @return Lists the repositories called by the list repositories operation.
     */

    public java.util.List<RepositoryNameIdPair> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * Lists the repositories called by the list repositories operation.
     * </p>
     * 
     * @param repositories
     *        Lists the repositories called by the list repositories operation.
     */

    public void setRepositories(java.util.Collection<RepositoryNameIdPair> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<RepositoryNameIdPair>(repositories);
    }

    /**
     * <p>
     * Lists the repositories called by the list repositories operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        Lists the repositories called by the list repositories operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesResult withRepositories(RepositoryNameIdPair... repositories) {
        if (this.repositories == null) {
            setRepositories(new java.util.ArrayList<RepositoryNameIdPair>(repositories.length));
        }
        for (RepositoryNameIdPair ele : repositories) {
            this.repositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the repositories called by the list repositories operation.
     * </p>
     * 
     * @param repositories
     *        Lists the repositories called by the list repositories operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesResult withRepositories(java.util.Collection<RepositoryNameIdPair> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for
     * list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records
     * is retrieved.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation. Batch sizes are
     *        1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page
     *        of 1,000 records is retrieved.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for
     * list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records
     * is retrieved.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the results of the operation. Batch sizes are
     *         1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another
     *         page of 1,000 records is retrieved.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for
     * list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records
     * is retrieved.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation. Batch sizes are
     *        1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page
     *        of 1,000 records is retrieved.
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
