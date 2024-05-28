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
 * Copy source image set properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopySourceImageSetProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySourceImageSetProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image set identifier for the copied source image set.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The latest version identifier for the copied source image set.
     * </p>
     */
    private String latestVersionId;
    /**
     * <p>
     * The image set state of the copied source image set.
     * </p>
     */
    private String imageSetState;
    /**
     * <p>
     * The workflow status of the copied source image set.
     * </p>
     */
    private String imageSetWorkflowStatus;
    /**
     * <p>
     * The timestamp when the source image set properties were created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when the source image set properties were updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the source image set.
     * </p>
     */
    private String imageSetArn;

    /**
     * <p>
     * The image set identifier for the copied source image set.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier for the copied source image set.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier for the copied source image set.
     * </p>
     * 
     * @return The image set identifier for the copied source image set.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier for the copied source image set.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier for the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySourceImageSetProperties withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The latest version identifier for the copied source image set.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the copied source image set.
     */

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the copied source image set.
     * </p>
     * 
     * @return The latest version identifier for the copied source image set.
     */

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the copied source image set.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySourceImageSetProperties withLatestVersionId(String latestVersionId) {
        setLatestVersionId(latestVersionId);
        return this;
    }

    /**
     * <p>
     * The image set state of the copied source image set.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the copied source image set.
     * @see ImageSetState
     */

    public void setImageSetState(String imageSetState) {
        this.imageSetState = imageSetState;
    }

    /**
     * <p>
     * The image set state of the copied source image set.
     * </p>
     * 
     * @return The image set state of the copied source image set.
     * @see ImageSetState
     */

    public String getImageSetState() {
        return this.imageSetState;
    }

    /**
     * <p>
     * The image set state of the copied source image set.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public CopySourceImageSetProperties withImageSetState(String imageSetState) {
        setImageSetState(imageSetState);
        return this;
    }

    /**
     * <p>
     * The image set state of the copied source image set.
     * </p>
     * 
     * @param imageSetState
     *        The image set state of the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public CopySourceImageSetProperties withImageSetState(ImageSetState imageSetState) {
        this.imageSetState = imageSetState.toString();
        return this;
    }

    /**
     * <p>
     * The workflow status of the copied source image set.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The workflow status of the copied source image set.
     * @see ImageSetWorkflowStatus
     */

    public void setImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The workflow status of the copied source image set.
     * </p>
     * 
     * @return The workflow status of the copied source image set.
     * @see ImageSetWorkflowStatus
     */

    public String getImageSetWorkflowStatus() {
        return this.imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The workflow status of the copied source image set.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The workflow status of the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public CopySourceImageSetProperties withImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        setImageSetWorkflowStatus(imageSetWorkflowStatus);
        return this;
    }

    /**
     * <p>
     * The workflow status of the copied source image set.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The workflow status of the copied source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public CopySourceImageSetProperties withImageSetWorkflowStatus(ImageSetWorkflowStatus imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the source image set properties were created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were created.
     * </p>
     * 
     * @return The timestamp when the source image set properties were created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the source image set properties were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySourceImageSetProperties withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the source image set properties were updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were updated.
     * </p>
     * 
     * @return The timestamp when the source image set properties were updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the source image set properties were updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the source image set properties were updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySourceImageSetProperties withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the source image set.
     * </p>
     * 
     * @param imageSetArn
     *        The Amazon Resource Name (ARN) assigned to the source image set.
     */

    public void setImageSetArn(String imageSetArn) {
        this.imageSetArn = imageSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the source image set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) assigned to the source image set.
     */

    public String getImageSetArn() {
        return this.imageSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the source image set.
     * </p>
     * 
     * @param imageSetArn
     *        The Amazon Resource Name (ARN) assigned to the source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySourceImageSetProperties withImageSetArn(String imageSetArn) {
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

        if (obj instanceof CopySourceImageSetProperties == false)
            return false;
        CopySourceImageSetProperties other = (CopySourceImageSetProperties) obj;
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
    public CopySourceImageSetProperties clone() {
        try {
            return (CopySourceImageSetProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.CopySourceImageSetPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
