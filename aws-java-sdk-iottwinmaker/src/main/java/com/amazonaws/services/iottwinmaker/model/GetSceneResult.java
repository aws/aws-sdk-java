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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSceneResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The ARN of the scene.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The description of the scene.
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

    public GetSceneResult withWorkspaceId(String workspaceId) {
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

    public GetSceneResult withSceneId(String sceneId) {
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

    public GetSceneResult withContentLocation(String contentLocation) {
        setContentLocation(contentLocation);
        return this;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @param arn
     *        The ARN of the scene.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @return The ARN of the scene.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @param arn
     *        The ARN of the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the scene was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @return The date and time when the scene was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the scene was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @return The date and time when the scene was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The description of the scene.
     * </p>
     * 
     * @param description
     *        The description of the scene.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the scene.
     * </p>
     * 
     * @return The description of the scene.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the scene.
     * </p>
     * 
     * @param description
     *        The description of the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSceneResult withDescription(String description) {
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

    public GetSceneResult withCapabilities(String... capabilities) {
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

    public GetSceneResult withCapabilities(java.util.Collection<String> capabilities) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
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

        if (obj instanceof GetSceneResult == false)
            return false;
        GetSceneResult other = (GetSceneResult) obj;
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public GetSceneResult clone() {
        try {
            return (GetSceneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
