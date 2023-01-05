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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the new WorkSpace image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     */
    private OperatingSystem operatingSystem;
    /**
     * <p>
     * The availability status of the image.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this
     * value is set to DEDICATED. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own Windows
     * Desktop Images.</a>.
     * </p>
     */
    private String requiredTenancy;
    /**
     * <p>
     * The date when the image was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The identifier of the Amazon Web Services account that owns the image.
     * </p>
     */
    private String ownerAccountId;

    /**
     * <p>
     * The identifier of the new WorkSpace image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the new WorkSpace image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the new WorkSpace image.
     * </p>
     * 
     * @return The identifier of the new WorkSpace image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the new WorkSpace image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the new WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @param description
     *        The description of the image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @return The description of the image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @param description
     *        The description of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the image is running.
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @return The operating system that the image is running.
     */

    public OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the image is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withOperatingSystem(OperatingSystem operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The availability status of the image.
     * </p>
     * 
     * @param state
     *        The availability status of the image.
     * @see WorkspaceImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The availability status of the image.
     * </p>
     * 
     * @return The availability status of the image.
     * @see WorkspaceImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The availability status of the image.
     * </p>
     * 
     * @param state
     *        The availability status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageState
     */

    public CreateWorkspaceImageResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The availability status of the image.
     * </p>
     * 
     * @param state
     *        The availability status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageState
     */

    public CreateWorkspaceImageResult withState(WorkspaceImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this
     * value is set to DEDICATED. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own Windows
     * Desktop Images.</a>.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is
     *        enabled, this value is set to DEDICATED. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own
     *        Windows Desktop Images.</a>.
     * @see WorkspaceImageRequiredTenancy
     */

    public void setRequiredTenancy(String requiredTenancy) {
        this.requiredTenancy = requiredTenancy;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this
     * value is set to DEDICATED. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own Windows
     * Desktop Images.</a>.
     * </p>
     * 
     * @return Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is
     *         enabled, this value is set to DEDICATED. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own
     *         Windows Desktop Images.</a>.
     * @see WorkspaceImageRequiredTenancy
     */

    public String getRequiredTenancy() {
        return this.requiredTenancy;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this
     * value is set to DEDICATED. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own Windows
     * Desktop Images.</a>.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is
     *        enabled, this value is set to DEDICATED. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own
     *        Windows Desktop Images.</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageRequiredTenancy
     */

    public CreateWorkspaceImageResult withRequiredTenancy(String requiredTenancy) {
        setRequiredTenancy(requiredTenancy);
        return this;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this
     * value is set to DEDICATED. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own Windows
     * Desktop Images.</a>.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is
     *        enabled, this value is set to DEDICATED. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.htm"> Bring Your Own
     *        Windows Desktop Images.</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageRequiredTenancy
     */

    public CreateWorkspaceImageResult withRequiredTenancy(WorkspaceImageRequiredTenancy requiredTenancy) {
        this.requiredTenancy = requiredTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The date when the image was created.
     * </p>
     * 
     * @param created
     *        The date when the image was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date when the image was created.
     * </p>
     * 
     * @return The date when the image was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date when the image was created.
     * </p>
     * 
     * @param created
     *        The date when the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that owns the image.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the Amazon Web Services account that owns the image.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that owns the image.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account that owns the image.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that owns the image.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the Amazon Web Services account that owns the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRequiredTenancy() != null)
            sb.append("RequiredTenancy: ").append(getRequiredTenancy()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspaceImageResult == false)
            return false;
        CreateWorkspaceImageResult other = (CreateWorkspaceImageResult) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRequiredTenancy() == null ^ this.getRequiredTenancy() == null)
            return false;
        if (other.getRequiredTenancy() != null && other.getRequiredTenancy().equals(this.getRequiredTenancy()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRequiredTenancy() == null) ? 0 : getRequiredTenancy().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceImageResult clone() {
        try {
            return (CreateWorkspaceImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
