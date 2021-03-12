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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectionAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified connection aliases.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConnectionAlias> connectionAliases;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the specified connection aliases.
     * </p>
     * 
     * @return Information about the specified connection aliases.
     */

    public java.util.List<ConnectionAlias> getConnectionAliases() {
        if (connectionAliases == null) {
            connectionAliases = new com.amazonaws.internal.SdkInternalList<ConnectionAlias>();
        }
        return connectionAliases;
    }

    /**
     * <p>
     * Information about the specified connection aliases.
     * </p>
     * 
     * @param connectionAliases
     *        Information about the specified connection aliases.
     */

    public void setConnectionAliases(java.util.Collection<ConnectionAlias> connectionAliases) {
        if (connectionAliases == null) {
            this.connectionAliases = null;
            return;
        }

        this.connectionAliases = new com.amazonaws.internal.SdkInternalList<ConnectionAlias>(connectionAliases);
    }

    /**
     * <p>
     * Information about the specified connection aliases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionAliases(java.util.Collection)} or {@link #withConnectionAliases(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param connectionAliases
     *        Information about the specified connection aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesResult withConnectionAliases(ConnectionAlias... connectionAliases) {
        if (this.connectionAliases == null) {
            setConnectionAliases(new com.amazonaws.internal.SdkInternalList<ConnectionAlias>(connectionAliases.length));
        }
        for (ConnectionAlias ele : connectionAliases) {
            this.connectionAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the specified connection aliases.
     * </p>
     * 
     * @param connectionAliases
     *        Information about the specified connection aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesResult withConnectionAliases(java.util.Collection<ConnectionAlias> connectionAliases) {
        setConnectionAliases(connectionAliases);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesResult withNextToken(String nextToken) {
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
        if (getConnectionAliases() != null)
            sb.append("ConnectionAliases: ").append(getConnectionAliases()).append(",");
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

        if (obj instanceof DescribeConnectionAliasesResult == false)
            return false;
        DescribeConnectionAliasesResult other = (DescribeConnectionAliasesResult) obj;
        if (other.getConnectionAliases() == null ^ this.getConnectionAliases() == null)
            return false;
        if (other.getConnectionAliases() != null && other.getConnectionAliases().equals(this.getConnectionAliases()) == false)
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

        hashCode = prime * hashCode + ((getConnectionAliases() == null) ? 0 : getConnectionAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionAliasesResult clone() {
        try {
            return (DescribeConnectionAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
