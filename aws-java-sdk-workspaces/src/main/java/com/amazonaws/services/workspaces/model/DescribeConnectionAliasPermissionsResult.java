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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliasPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectionAliasPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * The permissions associated with a connection alias.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConnectionAliasPermission> connectionAliasPermissions;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @return The identifier of the connection alias.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasPermissionsResult withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * The permissions associated with a connection alias.
     * </p>
     * 
     * @return The permissions associated with a connection alias.
     */

    public java.util.List<ConnectionAliasPermission> getConnectionAliasPermissions() {
        if (connectionAliasPermissions == null) {
            connectionAliasPermissions = new com.amazonaws.internal.SdkInternalList<ConnectionAliasPermission>();
        }
        return connectionAliasPermissions;
    }

    /**
     * <p>
     * The permissions associated with a connection alias.
     * </p>
     * 
     * @param connectionAliasPermissions
     *        The permissions associated with a connection alias.
     */

    public void setConnectionAliasPermissions(java.util.Collection<ConnectionAliasPermission> connectionAliasPermissions) {
        if (connectionAliasPermissions == null) {
            this.connectionAliasPermissions = null;
            return;
        }

        this.connectionAliasPermissions = new com.amazonaws.internal.SdkInternalList<ConnectionAliasPermission>(connectionAliasPermissions);
    }

    /**
     * <p>
     * The permissions associated with a connection alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionAliasPermissions(java.util.Collection)} or
     * {@link #withConnectionAliasPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectionAliasPermissions
     *        The permissions associated with a connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasPermissionsResult withConnectionAliasPermissions(ConnectionAliasPermission... connectionAliasPermissions) {
        if (this.connectionAliasPermissions == null) {
            setConnectionAliasPermissions(new com.amazonaws.internal.SdkInternalList<ConnectionAliasPermission>(connectionAliasPermissions.length));
        }
        for (ConnectionAliasPermission ele : connectionAliasPermissions) {
            this.connectionAliasPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions associated with a connection alias.
     * </p>
     * 
     * @param connectionAliasPermissions
     *        The permissions associated with a connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasPermissionsResult withConnectionAliasPermissions(java.util.Collection<ConnectionAliasPermission> connectionAliasPermissions) {
        setConnectionAliasPermissions(connectionAliasPermissions);
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

    public DescribeConnectionAliasPermissionsResult withNextToken(String nextToken) {
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
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getConnectionAliasPermissions() != null)
            sb.append("ConnectionAliasPermissions: ").append(getConnectionAliasPermissions()).append(",");
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

        if (obj instanceof DescribeConnectionAliasPermissionsResult == false)
            return false;
        DescribeConnectionAliasPermissionsResult other = (DescribeConnectionAliasPermissionsResult) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getConnectionAliasPermissions() == null ^ this.getConnectionAliasPermissions() == null)
            return false;
        if (other.getConnectionAliasPermissions() != null && other.getConnectionAliasPermissions().equals(this.getConnectionAliasPermissions()) == false)
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

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getConnectionAliasPermissions() == null) ? 0 : getConnectionAliasPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionAliasPermissionsResult clone() {
        try {
            return (DescribeConnectionAliasPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
