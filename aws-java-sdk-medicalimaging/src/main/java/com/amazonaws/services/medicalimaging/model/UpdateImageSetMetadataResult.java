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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UpdateImageSetMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImageSetMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The image set identifier.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     */
    private String latestVersionId;
    /**
     * <p>
     * The image set state.
     * </p>
     */
    private String imageSetState;
    /**
     * <p>
     * The image set workflow status.
     * </p>
     */
    private String imageSetWorkflowStatus;
    /**
     * <p>
     * The timestamp when image set metadata was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when image set metadata was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The error message thrown if an update image set metadata action fails.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @return The image set identifier.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @param latestVersionId
     *        The latest image set version identifier.
     */

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @return The latest image set version identifier.
     */

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @param latestVersionId
     *        The latest image set version identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withLatestVersionId(String latestVersionId) {
        setLatestVersionId(latestVersionId);
        return this;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @see ImageSetState
     */

    public void setImageSetState(String imageSetState) {
        this.imageSetState = imageSetState;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @return The image set state.
     * @see ImageSetState
     */

    public String getImageSetState() {
        return this.imageSetState;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public UpdateImageSetMetadataResult withImageSetState(String imageSetState) {
        setImageSetState(imageSetState);
        return this;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public UpdateImageSetMetadataResult withImageSetState(ImageSetState imageSetState) {
        this.imageSetState = imageSetState.toString();
        return this;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @see ImageSetWorkflowStatus
     */

    public void setImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @return The image set workflow status.
     * @see ImageSetWorkflowStatus
     */

    public String getImageSetWorkflowStatus() {
        return this.imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public UpdateImageSetMetadataResult withImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        setImageSetWorkflowStatus(imageSetWorkflowStatus);
        return this;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public UpdateImageSetMetadataResult withImageSetWorkflowStatus(ImageSetWorkflowStatus imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when image set metadata was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when image set metadata was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when image set metadata was created.
     * </p>
     * 
     * @return The timestamp when image set metadata was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when image set metadata was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when image set metadata was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when image set metadata was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when image set metadata was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when image set metadata was updated.
     * </p>
     * 
     * @return The timestamp when image set metadata was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when image set metadata was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when image set metadata was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The error message thrown if an update image set metadata action fails.
     * </p>
     * 
     * @param message
     *        The error message thrown if an update image set metadata action fails.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message thrown if an update image set metadata action fails.
     * </p>
     * 
     * @return The error message thrown if an update image set metadata action fails.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message thrown if an update image set metadata action fails.
     * </p>
     * 
     * @param message
     *        The error message thrown if an update image set metadata action fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataResult withMessage(String message) {
        setMessage(message);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getLatestVersionId() != null)
            sb.append("LatestVersionId: ").append(getLatestVersionId()).append(",");
        if (getImageSetState() != null)
            sb.append("ImageSetState: ").append(getImageSetState()).append(",");
        if (getImageSetWorkflowStatus() != null)
            sb.append("ImageSetWorkflowStatus: ").append(getImageSetWorkflowStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateImageSetMetadataResult == false)
            return false;
        UpdateImageSetMetadataResult other = (UpdateImageSetMetadataResult) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getLatestVersionId() == null ^ this.getLatestVersionId() == null)
            return false;
        if (other.getLatestVersionId() != null && other.getLatestVersionId().equals(this.getLatestVersionId()) == false)
            return false;
        if (other.getImageSetState() == null ^ this.getImageSetState() == null)
            return false;
        if (other.getImageSetState() != null && other.getImageSetState().equals(this.getImageSetState()) == false)
            return false;
        if (other.getImageSetWorkflowStatus() == null ^ this.getImageSetWorkflowStatus() == null)
            return false;
        if (other.getImageSetWorkflowStatus() != null && other.getImageSetWorkflowStatus().equals(this.getImageSetWorkflowStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionId() == null) ? 0 : getLatestVersionId().hashCode());
        hashCode = prime * hashCode + ((getImageSetState() == null) ? 0 : getImageSetState().hashCode());
        hashCode = prime * hashCode + ((getImageSetWorkflowStatus() == null) ? 0 : getImageSetWorkflowStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateImageSetMetadataResult clone() {
        try {
            return (UpdateImageSetMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
