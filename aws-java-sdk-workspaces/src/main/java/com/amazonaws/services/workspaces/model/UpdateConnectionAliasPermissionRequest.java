/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectionAliasPermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionAliasPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the connection alias that you want to update permissions for.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * Indicates whether to share or unshare the connection alias with the specified AWS account.
     * </p>
     */
    private ConnectionAliasPermission connectionAliasPermission;

    /**
     * <p>
     * The identifier of the connection alias that you want to update permissions for.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias that you want to update permissions for.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias that you want to update permissions for.
     * </p>
     * 
     * @return The identifier of the connection alias that you want to update permissions for.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias that you want to update permissions for.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias that you want to update permissions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAliasPermissionRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to share or unshare the connection alias with the specified AWS account.
     * </p>
     * 
     * @param connectionAliasPermission
     *        Indicates whether to share or unshare the connection alias with the specified AWS account.
     */

    public void setConnectionAliasPermission(ConnectionAliasPermission connectionAliasPermission) {
        this.connectionAliasPermission = connectionAliasPermission;
    }

    /**
     * <p>
     * Indicates whether to share or unshare the connection alias with the specified AWS account.
     * </p>
     * 
     * @return Indicates whether to share or unshare the connection alias with the specified AWS account.
     */

    public ConnectionAliasPermission getConnectionAliasPermission() {
        return this.connectionAliasPermission;
    }

    /**
     * <p>
     * Indicates whether to share or unshare the connection alias with the specified AWS account.
     * </p>
     * 
     * @param connectionAliasPermission
     *        Indicates whether to share or unshare the connection alias with the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAliasPermissionRequest withConnectionAliasPermission(ConnectionAliasPermission connectionAliasPermission) {
        setConnectionAliasPermission(connectionAliasPermission);
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
        if (getConnectionAliasPermission() != null)
            sb.append("ConnectionAliasPermission: ").append(getConnectionAliasPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionAliasPermissionRequest == false)
            return false;
        UpdateConnectionAliasPermissionRequest other = (UpdateConnectionAliasPermissionRequest) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getConnectionAliasPermission() == null ^ this.getConnectionAliasPermission() == null)
            return false;
        if (other.getConnectionAliasPermission() != null && other.getConnectionAliasPermission().equals(this.getConnectionAliasPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getConnectionAliasPermission() == null) ? 0 : getConnectionAliasPermission().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionAliasPermissionRequest clone() {
        return (UpdateConnectionAliasPermissionRequest) super.clone();
    }

}
