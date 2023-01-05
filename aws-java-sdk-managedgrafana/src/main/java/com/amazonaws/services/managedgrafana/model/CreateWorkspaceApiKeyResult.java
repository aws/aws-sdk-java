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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceApiKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The name of the key that was created.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The ID of the workspace that the key is valid for.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * </p>
     * 
     * @param key
     *        The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * </p>
     * 
     * @return The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * </p>
     * 
     * @param key
     *        The key token. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyResult withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the key that was created.
     * </p>
     * 
     * @param keyName
     *        The name of the key that was created.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key that was created.
     * </p>
     * 
     * @return The name of the key that was created.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key that was created.
     * </p>
     * 
     * @param keyName
     *        The name of the key that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyResult withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace that the key is valid for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that the key is valid for.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that the key is valid for.
     * </p>
     * 
     * @return The ID of the workspace that the key is valid for.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that the key is valid for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that the key is valid for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceApiKeyResult withWorkspaceId(String workspaceId) {
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
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
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

        if (obj instanceof CreateWorkspaceApiKeyResult == false)
            return false;
        CreateWorkspaceApiKeyResult other = (CreateWorkspaceApiKeyResult) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceApiKeyResult clone() {
        try {
            return (CreateWorkspaceApiKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
