/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceImagePermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkspaceImagePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The permission to copy the image. This permission can be revoked only after an image has been shared.
     * </p>
     */
    private Boolean allowCopyImage;
    /**
     * <p>
     * The identifier of the AWS account to share or unshare the image with.
     * </p>
     * <important>
     * <p>
     * Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     * </p>
     * </important>
     */
    private String sharedAccountId;

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

    public UpdateWorkspaceImagePermissionRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The permission to copy the image. This permission can be revoked only after an image has been shared.
     * </p>
     * 
     * @param allowCopyImage
     *        The permission to copy the image. This permission can be revoked only after an image has been shared.
     */

    public void setAllowCopyImage(Boolean allowCopyImage) {
        this.allowCopyImage = allowCopyImage;
    }

    /**
     * <p>
     * The permission to copy the image. This permission can be revoked only after an image has been shared.
     * </p>
     * 
     * @return The permission to copy the image. This permission can be revoked only after an image has been shared.
     */

    public Boolean getAllowCopyImage() {
        return this.allowCopyImage;
    }

    /**
     * <p>
     * The permission to copy the image. This permission can be revoked only after an image has been shared.
     * </p>
     * 
     * @param allowCopyImage
     *        The permission to copy the image. This permission can be revoked only after an image has been shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceImagePermissionRequest withAllowCopyImage(Boolean allowCopyImage) {
        setAllowCopyImage(allowCopyImage);
        return this;
    }

    /**
     * <p>
     * The permission to copy the image. This permission can be revoked only after an image has been shared.
     * </p>
     * 
     * @return The permission to copy the image. This permission can be revoked only after an image has been shared.
     */

    public Boolean isAllowCopyImage() {
        return this.allowCopyImage;
    }

    /**
     * <p>
     * The identifier of the AWS account to share or unshare the image with.
     * </p>
     * <important>
     * <p>
     * Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     * </p>
     * </important>
     * 
     * @param sharedAccountId
     *        The identifier of the AWS account to share or unshare the image with.</p> <important>
     *        <p>
     *        Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     *        </p>
     */

    public void setSharedAccountId(String sharedAccountId) {
        this.sharedAccountId = sharedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account to share or unshare the image with.
     * </p>
     * <important>
     * <p>
     * Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     * </p>
     * </important>
     * 
     * @return The identifier of the AWS account to share or unshare the image with.</p> <important>
     *         <p>
     *         Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     *         </p>
     */

    public String getSharedAccountId() {
        return this.sharedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account to share or unshare the image with.
     * </p>
     * <important>
     * <p>
     * Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     * </p>
     * </important>
     * 
     * @param sharedAccountId
     *        The identifier of the AWS account to share or unshare the image with.</p> <important>
     *        <p>
     *        Before sharing the image, confirm that you are sharing to the correct AWS account ID.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceImagePermissionRequest withSharedAccountId(String sharedAccountId) {
        setSharedAccountId(sharedAccountId);
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
        if (getAllowCopyImage() != null)
            sb.append("AllowCopyImage: ").append(getAllowCopyImage()).append(",");
        if (getSharedAccountId() != null)
            sb.append("SharedAccountId: ").append(getSharedAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkspaceImagePermissionRequest == false)
            return false;
        UpdateWorkspaceImagePermissionRequest other = (UpdateWorkspaceImagePermissionRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getAllowCopyImage() == null ^ this.getAllowCopyImage() == null)
            return false;
        if (other.getAllowCopyImage() != null && other.getAllowCopyImage().equals(this.getAllowCopyImage()) == false)
            return false;
        if (other.getSharedAccountId() == null ^ this.getSharedAccountId() == null)
            return false;
        if (other.getSharedAccountId() != null && other.getSharedAccountId().equals(this.getSharedAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getAllowCopyImage() == null) ? 0 : getAllowCopyImage().hashCode());
        hashCode = prime * hashCode + ((getSharedAccountId() == null) ? 0 : getSharedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkspaceImagePermissionRequest clone() {
        return (UpdateWorkspaceImagePermissionRequest) super.clone();
    }

}
