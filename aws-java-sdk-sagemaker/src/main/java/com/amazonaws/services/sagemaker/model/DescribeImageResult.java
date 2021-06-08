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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the image was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the image as displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * When a create, update, or delete operation fails, the reason for the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The status of the image.
     * </p>
     */
    private String imageStatus;
    /**
     * <p>
     * When the image was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * When the image was created.
     * </p>
     * 
     * @param creationTime
     *        When the image was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the image was created.
     * </p>
     * 
     * @return When the image was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the image was created.
     * </p>
     * 
     * @param creationTime
     *        When the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public DescribeImageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the image as displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the image as displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the image as displayed.
     * </p>
     * 
     * @return The name of the image as displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the image as displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the image as displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * When a create, update, or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        When a create, update, or delete operation fails, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * When a create, update, or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @return When a create, update, or delete operation fails, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * When a create, update, or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        When a create, update, or delete operation fails, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param imageStatus
     *        The status of the image.
     * @see ImageStatus
     */

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @return The status of the image.
     * @see ImageStatus
     */

    public String getImageStatus() {
        return this.imageStatus;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param imageStatus
     *        The status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageStatus
     */

    public DescribeImageResult withImageStatus(String imageStatus) {
        setImageStatus(imageStatus);
        return this;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param imageStatus
     *        The status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageStatus
     */

    public DescribeImageResult withImageStatus(ImageStatus imageStatus) {
        this.imageStatus = imageStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the image was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the image was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the image was last modified.
     * </p>
     * 
     * @return When the image was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the image was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the image was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageStatus() != null)
            sb.append("ImageStatus: ").append(getImageStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageResult == false)
            return false;
        DescribeImageResult other = (DescribeImageResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getImageStatus() == null ^ this.getImageStatus() == null)
            return false;
        if (other.getImageStatus() != null && other.getImageStatus().equals(this.getImageStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageStatus() == null) ? 0 : getImageStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageResult clone() {
        try {
            return (DescribeImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
