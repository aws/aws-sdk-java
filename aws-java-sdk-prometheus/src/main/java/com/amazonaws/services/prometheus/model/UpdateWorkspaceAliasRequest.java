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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <code>UpdateWorkspaceAlias</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkspaceAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new alias for the workspace. It does not need to be unique.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The new alias for the workspace. It does not need to be unique.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @param alias
     *        The new alias for the workspace. It does not need to be unique.</p>
     *        <p>
     *        Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end
     *        of the alias that you specify.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The new alias for the workspace. It does not need to be unique.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @return The new alias for the workspace. It does not need to be unique.</p>
     *         <p>
     *         Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and
     *         end of the alias that you specify.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The new alias for the workspace. It does not need to be unique.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @param alias
     *        The new alias for the workspace. It does not need to be unique.</p>
     *        <p>
     *        Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end
     *        of the alias that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceAliasRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @return A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceAliasRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @return The ID of the workspace to update.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceAliasRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkspaceAliasRequest == false)
            return false;
        UpdateWorkspaceAliasRequest other = (UpdateWorkspaceAliasRequest) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkspaceAliasRequest clone() {
        return (UpdateWorkspaceAliasRequest) super.clone();
    }

}
