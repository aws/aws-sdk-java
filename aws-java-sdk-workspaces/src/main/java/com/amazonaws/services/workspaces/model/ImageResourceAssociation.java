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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the association between an application and an image resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImageResourceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageResourceAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     */
    private String associatedResourceId;
    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     */
    private String associatedResourceType;
    /**
     * <p>
     * The time the association is created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The time the association status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The identifier of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The status of the image resource association.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason the association deployment failed.
     * </p>
     */
    private AssociationStateReason stateReason;

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @param associatedResourceId
     *        The identifier of the associated resource.
     */

    public void setAssociatedResourceId(String associatedResourceId) {
        this.associatedResourceId = associatedResourceId;
    }

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @return The identifier of the associated resource.
     */

    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @param associatedResourceId
     *        The identifier of the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResourceAssociation withAssociatedResourceId(String associatedResourceId) {
        setAssociatedResourceId(associatedResourceId);
        return this;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceType
     *        The resource type of the associated resources.
     * @see ImageAssociatedResourceType
     */

    public void setAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @return The resource type of the associated resources.
     * @see ImageAssociatedResourceType
     */

    public String getAssociatedResourceType() {
        return this.associatedResourceType;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceType
     *        The resource type of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageAssociatedResourceType
     */

    public ImageResourceAssociation withAssociatedResourceType(String associatedResourceType) {
        setAssociatedResourceType(associatedResourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceType
     *        The resource type of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageAssociatedResourceType
     */

    public ImageResourceAssociation withAssociatedResourceType(ImageAssociatedResourceType associatedResourceType) {
        this.associatedResourceType = associatedResourceType.toString();
        return this;
    }

    /**
     * <p>
     * The time the association is created.
     * </p>
     * 
     * @param created
     *        The time the association is created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The time the association is created.
     * </p>
     * 
     * @return The time the association is created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The time the association is created.
     * </p>
     * 
     * @param created
     *        The time the association is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResourceAssociation withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The time the association status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the association status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the association status was last updated.
     * </p>
     * 
     * @return The time the association status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the association status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the association status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResourceAssociation withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @return The identifier of the image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResourceAssociation withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The status of the image resource association.
     * </p>
     * 
     * @param state
     *        The status of the image resource association.
     * @see AssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the image resource association.
     * </p>
     * 
     * @return The status of the image resource association.
     * @see AssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the image resource association.
     * </p>
     * 
     * @param state
     *        The status of the image resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationState
     */

    public ImageResourceAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the image resource association.
     * </p>
     * 
     * @param state
     *        The status of the image resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationState
     */

    public ImageResourceAssociation withState(AssociationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason the association deployment failed.
     * </p>
     * 
     * @param stateReason
     *        The reason the association deployment failed.
     */

    public void setStateReason(AssociationStateReason stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason the association deployment failed.
     * </p>
     * 
     * @return The reason the association deployment failed.
     */

    public AssociationStateReason getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason the association deployment failed.
     * </p>
     * 
     * @param stateReason
     *        The reason the association deployment failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResourceAssociation withStateReason(AssociationStateReason stateReason) {
        setStateReason(stateReason);
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
        if (getAssociatedResourceId() != null)
            sb.append("AssociatedResourceId: ").append(getAssociatedResourceId()).append(",");
        if (getAssociatedResourceType() != null)
            sb.append("AssociatedResourceType: ").append(getAssociatedResourceType()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageResourceAssociation == false)
            return false;
        ImageResourceAssociation other = (ImageResourceAssociation) obj;
        if (other.getAssociatedResourceId() == null ^ this.getAssociatedResourceId() == null)
            return false;
        if (other.getAssociatedResourceId() != null && other.getAssociatedResourceId().equals(this.getAssociatedResourceId()) == false)
            return false;
        if (other.getAssociatedResourceType() == null ^ this.getAssociatedResourceType() == null)
            return false;
        if (other.getAssociatedResourceType() != null && other.getAssociatedResourceType().equals(this.getAssociatedResourceType()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedResourceId() == null) ? 0 : getAssociatedResourceId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceType() == null) ? 0 : getAssociatedResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        return hashCode;
    }

    @Override
    public ImageResourceAssociation clone() {
        try {
            return (ImageResourceAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ImageResourceAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
