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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Copy the image set properties of the destination image set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyDestinationImageSetProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDestinationImageSetProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image set identifier of the copied image set properties.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The latest version identifier for the destination image set properties.
     * </p>
     */
    private String latestVersionId;
    /**
     * <p>
     * The image set state of the destination image set properties.
     * </p>
     */
    private String imageSetState;
    /**
     * <p>
     * The image set workflow status of the destination image set properties.
     * </p>
     */
    private String imageSetWorkflowStatus;
    /**
     * <p>
     * The timestamp when the destination image set properties were created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when the destination image set properties were last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the destination image set.
     * </p>
     */
    private String imageSetArn;

    /**
     * <p>
     * The image set identifier of the copied image set properties.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier of the copied image set properties.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier of the copied image set properties.
     * </p>
     * 
     * @return The image set identifier of the copied image set properties.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier of the copied image set properties.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier of the copied image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSetProperties withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set properties.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the destination image set properties.
     */

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set properties.
     * </p>
     * 
     * @return The latest version identifier for the destination image set properties.
     */

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set properties.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the destination image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSetProperties withLatestVersionId(String latestVersionId) {
        setLatestVersionId(latestVersionId);
        return this;
    }

    /**
     * <p>
     * The image set state of the destination image set properties.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the destination image set properties.
     * @see ImageSetState
     */

    public void setImageSetState(String imageSetState) {
        this.imageSetState = imageSetState;
    }

    /**
     * <p>
     * The image set state of the destination image set properties.
     * </p>
     * 
     * @return The image set state of the destination image set properties.
     * @see ImageSetState
     */

    public String getImageSetState() {
        return this.imageSetState;
    }

    /**
     * <p>
     * The image set state of the destination image set properties.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the destination image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public CopyDestinationImageSetProperties withImageSetState(String imageSetState) {
        setImageSetState(imageSetState);
        return this;
    }

    /**
     * <p>
     * The image set state of the destination image set properties.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the destination image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public CopyDestinationImageSetProperties withImageSetState(ImageSetState imageSetState) {
        this.imageSetState = imageSetState.toString();
        return this;
    }

    /**
     * <p>
     * The image set workflow status of the destination image set properties.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status of the destination image set properties.
     * @see ImageSetWorkflowStatus
     */

    public void setImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status of the destination image set properties.
     * </p>
     * 
     * @return The image set workflow status of the destination image set properties.
     * @see ImageSetWorkflowStatus
     */

    public String getImageSetWorkflowStatus() {
        return this.imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status of the destination image set properties.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status of the destination image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public CopyDestinationImageSetProperties withImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        setImageSetWorkflowStatus(imageSetWorkflowStatus);
        return this;
    }

    /**
     * <p>
     * The image set workflow status of the destination image set properties.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status of the destination image set properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public CopyDestinationImageSetProperties withImageSetWorkflowStatus(ImageSetWorkflowStatus imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the destination image set properties were created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were created.
     * </p>
     * 
     * @return The timestamp when the destination image set properties were created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the destination image set properties were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSetProperties withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the destination image set properties were last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were last updated.
     * </p>
     * 
     * @return The timestamp when the destination image set properties were last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the destination image set properties were last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the destination image set properties were last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSetProperties withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the destination image set.
     * </p>
     * 
     * @param imageSetArn
     *        The Amazon Resource Name (ARN) assigned to the destination image set.
     */

    public void setImageSetArn(String imageSetArn) {
        this.imageSetArn = imageSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the destination image set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) assigned to the destination image set.
     */

    public String getImageSetArn() {
        return this.imageSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the destination image set.
     * </p>
     * 
     * @param imageSetArn
     *        The Amazon Resource Name (ARN) assigned to the destination image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSetProperties withImageSetArn(String imageSetArn) {
        setImageSetArn(imageSetArn);
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
        if (getImageSetArn() != null)
            sb.append("ImageSetArn: ").append(getImageSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDestinationImageSetProperties == false)
            return false;
        CopyDestinationImageSetProperties other = (CopyDestinationImageSetProperties) obj;
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
        if (other.getImageSetArn() == null ^ this.getImageSetArn() == null)
            return false;
        if (other.getImageSetArn() != null && other.getImageSetArn().equals(this.getImageSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionId() == null) ? 0 : getLatestVersionId().hashCode());
        hashCode = prime * hashCode + ((getImageSetState() == null) ? 0 : getImageSetState().hashCode());
        hashCode = prime * hashCode + ((getImageSetWorkflowStatus() == null) ? 0 : getImageSetWorkflowStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getImageSetArn() == null) ? 0 : getImageSetArn().hashCode());
        return hashCode;
    }

    @Override
    public CopyDestinationImageSetProperties clone() {
        try {
            return (CopyDestinationImageSetProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.CopyDestinationImageSetPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
