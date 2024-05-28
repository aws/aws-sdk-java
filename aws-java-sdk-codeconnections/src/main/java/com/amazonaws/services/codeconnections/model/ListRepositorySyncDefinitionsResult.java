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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListRepositorySyncDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositorySyncDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code> is a
     * mapping from a repository branch to all the Amazon Web Services resources that are being synced from that branch.
     * </p>
     */
    private java.util.List<RepositorySyncDefinition> repositorySyncDefinitions;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code> is a
     * mapping from a repository branch to all the Amazon Web Services resources that are being synced from that branch.
     * </p>
     * 
     * @return The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code>
     *         is a mapping from a repository branch to all the Amazon Web Services resources that are being synced from
     *         that branch.
     */

    public java.util.List<RepositorySyncDefinition> getRepositorySyncDefinitions() {
        return repositorySyncDefinitions;
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code> is a
     * mapping from a repository branch to all the Amazon Web Services resources that are being synced from that branch.
     * </p>
     * 
     * @param repositorySyncDefinitions
     *        The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code>
     *        is a mapping from a repository branch to all the Amazon Web Services resources that are being synced from
     *        that branch.
     */

    public void setRepositorySyncDefinitions(java.util.Collection<RepositorySyncDefinition> repositorySyncDefinitions) {
        if (repositorySyncDefinitions == null) {
            this.repositorySyncDefinitions = null;
            return;
        }

        this.repositorySyncDefinitions = new java.util.ArrayList<RepositorySyncDefinition>(repositorySyncDefinitions);
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code> is a
     * mapping from a repository branch to all the Amazon Web Services resources that are being synced from that branch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositorySyncDefinitions(java.util.Collection)} or
     * {@link #withRepositorySyncDefinitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param repositorySyncDefinitions
     *        The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code>
     *        is a mapping from a repository branch to all the Amazon Web Services resources that are being synced from
     *        that branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositorySyncDefinitionsResult withRepositorySyncDefinitions(RepositorySyncDefinition... repositorySyncDefinitions) {
        if (this.repositorySyncDefinitions == null) {
            setRepositorySyncDefinitions(new java.util.ArrayList<RepositorySyncDefinition>(repositorySyncDefinitions.length));
        }
        for (RepositorySyncDefinition ele : repositorySyncDefinitions) {
            this.repositorySyncDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code> is a
     * mapping from a repository branch to all the Amazon Web Services resources that are being synced from that branch.
     * </p>
     * 
     * @param repositorySyncDefinitions
     *        The list of repository sync definitions returned by the request. A <code>RepositorySyncDefinition</code>
     *        is a mapping from a repository branch to all the Amazon Web Services resources that are being synced from
     *        that branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositorySyncDefinitionsResult withRepositorySyncDefinitions(java.util.Collection<RepositorySyncDefinition> repositorySyncDefinitions) {
        setRepositorySyncDefinitions(repositorySyncDefinitions);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositorySyncDefinitionsResult withNextToken(String nextToken) {
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
        if (getRepositorySyncDefinitions() != null)
            sb.append("RepositorySyncDefinitions: ").append(getRepositorySyncDefinitions()).append(",");
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

        if (obj instanceof ListRepositorySyncDefinitionsResult == false)
            return false;
        ListRepositorySyncDefinitionsResult other = (ListRepositorySyncDefinitionsResult) obj;
        if (other.getRepositorySyncDefinitions() == null ^ this.getRepositorySyncDefinitions() == null)
            return false;
        if (other.getRepositorySyncDefinitions() != null && other.getRepositorySyncDefinitions().equals(this.getRepositorySyncDefinitions()) == false)
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

        hashCode = prime * hashCode + ((getRepositorySyncDefinitions() == null) ? 0 : getRepositorySyncDefinitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositorySyncDefinitionsResult clone() {
        try {
            return (ListRepositorySyncDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
