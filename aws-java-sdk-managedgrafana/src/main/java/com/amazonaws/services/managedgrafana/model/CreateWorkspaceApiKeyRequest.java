/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceApiKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the key. Keynames must be unique to the workspace.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * Specifies the permission level of the key.
     * </p>
     * <p>
     * Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     * </p>
     */
    private String keyRole;
    /**
     * <p>
     * Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     * </p>
     */
    private Integer secondsToLive;
    /**
     * <p>
     * The ID of the workspace to create an API key.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * Specifies the name of the key. Keynames must be unique to the workspace.
     * </p>
     * 
     * @param keyName
     *        Specifies the name of the key. Keynames must be unique to the workspace.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * Specifies the name of the key. Keynames must be unique to the workspace.
     * </p>
     * 
     * @return Specifies the name of the key. Keynames must be unique to the workspace.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * Specifies the name of the key. Keynames must be unique to the workspace.
     * </p>
     * 
     * @param keyName
     *        Specifies the name of the key. Keynames must be unique to the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * Specifies the permission level of the key.
     * </p>
     * <p>
     * Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     * </p>
     * 
     * @param keyRole
     *        Specifies the permission level of the key.</p>
     *        <p>
     *        Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     */

    public void setKeyRole(String keyRole) {
        this.keyRole = keyRole;
    }

    /**
     * <p>
     * Specifies the permission level of the key.
     * </p>
     * <p>
     * Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     * </p>
     * 
     * @return Specifies the permission level of the key.</p>
     *         <p>
     *         Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     */

    public String getKeyRole() {
        return this.keyRole;
    }

    /**
     * <p>
     * Specifies the permission level of the key.
     * </p>
     * <p>
     * Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     * </p>
     * 
     * @param keyRole
     *        Specifies the permission level of the key.</p>
     *        <p>
     *        Valid values: <code>VIEWER</code>|<code>EDITOR</code>|<code>ADMIN</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyRequest withKeyRole(String keyRole) {
        setKeyRole(keyRole);
        return this;
    }

    /**
     * <p>
     * Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     * </p>
     * 
     * @param secondsToLive
     *        Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     */

    public void setSecondsToLive(Integer secondsToLive) {
        this.secondsToLive = secondsToLive;
    }

    /**
     * <p>
     * Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     * </p>
     * 
     * @return Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     */

    public Integer getSecondsToLive() {
        return this.secondsToLive;
    }

    /**
     * <p>
     * Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     * </p>
     * 
     * @param secondsToLive
     *        Specifies the time in seconds until the key expires. Keys can be valid for up to 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyRequest withSecondsToLive(Integer secondsToLive) {
        setSecondsToLive(secondsToLive);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to create an API key.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to create an API key.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to create an API key.
     * </p>
     * 
     * @return The ID of the workspace to create an API key.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to create an API key.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to create an API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyRequest withWorkspaceId(String workspaceId) {
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
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getKeyRole() != null)
            sb.append("KeyRole: ").append(getKeyRole()).append(",");
        if (getSecondsToLive() != null)
            sb.append("SecondsToLive: ").append(getSecondsToLive()).append(",");
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

        if (obj instanceof CreateWorkspaceApiKeyRequest == false)
            return false;
        CreateWorkspaceApiKeyRequest other = (CreateWorkspaceApiKeyRequest) obj;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getKeyRole() == null ^ this.getKeyRole() == null)
            return false;
        if (other.getKeyRole() != null && other.getKeyRole().equals(this.getKeyRole()) == false)
            return false;
        if (other.getSecondsToLive() == null ^ this.getSecondsToLive() == null)
            return false;
        if (other.getSecondsToLive() != null && other.getSecondsToLive().equals(this.getSecondsToLive()) == false)
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

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getKeyRole() == null) ? 0 : getKeyRole().hashCode());
        hashCode = prime * hashCode + ((getSecondsToLive() == null) ? 0 : getSecondsToLive().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceApiKeyRequest clone() {
        return (CreateWorkspaceApiKeyRequest) super.clone();
    }

}
