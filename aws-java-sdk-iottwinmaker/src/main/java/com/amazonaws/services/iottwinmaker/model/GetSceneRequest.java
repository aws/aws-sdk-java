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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSceneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the scene.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ID of the scene.
     * </p>
     */
    private String sceneId;

    /**
     * <p>
     * The ID of the workspace that contains the scene.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the scene.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the scene.
     * </p>
     * 
     * @return The ID of the workspace that contains the scene.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the scene.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @param sceneId
     *        The ID of the scene.
     */

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @return The ID of the scene.
     */

    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @param sceneId
     *        The ID of the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneRequest withSceneId(String sceneId) {
        setSceneId(sceneId);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getSceneId() != null)
            sb.append("SceneId: ").append(getSceneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSceneRequest == false)
            return false;
        GetSceneRequest other = (GetSceneRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getSceneId() == null ^ this.getSceneId() == null)
            return false;
        if (other.getSceneId() != null && other.getSceneId().equals(this.getSceneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getSceneId() == null) ? 0 : getSceneId().hashCode());
        return hashCode;
    }

    @Override
    public GetSceneRequest clone() {
        return (GetSceneRequest) super.clone();
    }

}
