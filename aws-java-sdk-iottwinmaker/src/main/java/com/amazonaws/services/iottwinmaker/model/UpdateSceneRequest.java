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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSceneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The relative path that specifies the location of the content definition file.
     * </p>
     */
    private String contentLocation;
    /**
     * <p>
     * The description of this scene.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of capabilities that the scene uses to render.
     * </p>
     */
    private java.util.List<String> capabilities;

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

    public UpdateSceneRequest withWorkspaceId(String workspaceId) {
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

    public UpdateSceneRequest withSceneId(String sceneId) {
        setSceneId(sceneId);
        return this;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @param contentLocation
     *        The relative path that specifies the location of the content definition file.
     */

    public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @return The relative path that specifies the location of the content definition file.
     */

    public String getContentLocation() {
        return this.contentLocation;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @param contentLocation
     *        The relative path that specifies the location of the content definition file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSceneRequest withContentLocation(String contentLocation) {
        setContentLocation(contentLocation);
        return this;
    }

    /**
     * <p>
     * The description of this scene.
     * </p>
     * 
     * @param description
     *        The description of this scene.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this scene.
     * </p>
     * 
     * @return The description of this scene.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this scene.
     * </p>
     * 
     * @param description
     *        The description of this scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSceneRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of capabilities that the scene uses to render.
     * </p>
     * 
     * @return A list of capabilities that the scene uses to render.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * A list of capabilities that the scene uses to render.
     * </p>
     * 
     * @param capabilities
     *        A list of capabilities that the scene uses to render.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * A list of capabilities that the scene uses to render.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        A list of capabilities that the scene uses to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSceneRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of capabilities that the scene uses to render.
     * </p>
     * 
     * @param capabilities
     *        A list of capabilities that the scene uses to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSceneRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
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
            sb.append("SceneId: ").append(getSceneId()).append(",");
        if (getContentLocation() != null)
            sb.append("ContentLocation: ").append(getContentLocation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSceneRequest == false)
            return false;
        UpdateSceneRequest other = (UpdateSceneRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getSceneId() == null ^ this.getSceneId() == null)
            return false;
        if (other.getSceneId() != null && other.getSceneId().equals(this.getSceneId()) == false)
            return false;
        if (other.getContentLocation() == null ^ this.getContentLocation() == null)
            return false;
        if (other.getContentLocation() != null && other.getContentLocation().equals(this.getContentLocation()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getSceneId() == null) ? 0 : getSceneId().hashCode());
        hashCode = prime * hashCode + ((getContentLocation() == null) ? 0 : getContentLocation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSceneRequest clone() {
        return (UpdateSceneRequest) super.clone();
    }

}
