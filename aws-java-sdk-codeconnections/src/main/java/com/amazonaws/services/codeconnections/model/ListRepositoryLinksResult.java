/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListRepositoryLinks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoryLinksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the repository links called by the list repository links operation.
     * </p>
     */
    private java.util.List<RepositoryLinkInfo> repositoryLinks;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the repository links called by the list repository links operation.
     * </p>
     * 
     * @return Lists the repository links called by the list repository links operation.
     */

    public java.util.List<RepositoryLinkInfo> getRepositoryLinks() {
        return repositoryLinks;
    }

    /**
     * <p>
     * Lists the repository links called by the list repository links operation.
     * </p>
     * 
     * @param repositoryLinks
     *        Lists the repository links called by the list repository links operation.
     */

    public void setRepositoryLinks(java.util.Collection<RepositoryLinkInfo> repositoryLinks) {
        if (repositoryLinks == null) {
            this.repositoryLinks = null;
            return;
        }

        this.repositoryLinks = new java.util.ArrayList<RepositoryLinkInfo>(repositoryLinks);
    }

    /**
     * <p>
     * Lists the repository links called by the list repository links operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryLinks(java.util.Collection)} or {@link #withRepositoryLinks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryLinks
     *        Lists the repository links called by the list repository links operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryLinksResult withRepositoryLinks(RepositoryLinkInfo... repositoryLinks) {
        if (this.repositoryLinks == null) {
            setRepositoryLinks(new java.util.ArrayList<RepositoryLinkInfo>(repositoryLinks.length));
        }
        for (RepositoryLinkInfo ele : repositoryLinks) {
            this.repositoryLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the repository links called by the list repository links operation.
     * </p>
     * 
     * @param repositoryLinks
     *        Lists the repository links called by the list repository links operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryLinksResult withRepositoryLinks(java.util.Collection<RepositoryLinkInfo> repositoryLinks) {
        setRepositoryLinks(repositoryLinks);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the results of the operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoryLinksResult withNextToken(String nextToken) {
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
        if (getRepositoryLinks() != null)
            sb.append("RepositoryLinks: ").append(getRepositoryLinks()).append(",");
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

        if (obj instanceof ListRepositoryLinksResult == false)
            return false;
        ListRepositoryLinksResult other = (ListRepositoryLinksResult) obj;
        if (other.getRepositoryLinks() == null ^ this.getRepositoryLinks() == null)
            return false;
        if (other.getRepositoryLinks() != null && other.getRepositoryLinks().equals(this.getRepositoryLinks()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryLinks() == null) ? 0 : getRepositoryLinks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoryLinksResult clone() {
        try {
            return (ListRepositoryLinksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
