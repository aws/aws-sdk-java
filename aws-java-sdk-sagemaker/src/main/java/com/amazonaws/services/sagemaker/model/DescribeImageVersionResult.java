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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeImageVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The registry path of the container image on which this image version is based.
     * </p>
     */
    private String baseImage;
    /**
     * <p>
     * The registry path of the container image that contains this image version.
     * </p>
     */
    private String containerImage;
    /**
     * <p>
     * When the version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When a create or delete operation fails, the reason for the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image the version is based on.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The ARN of the version.
     * </p>
     */
    private String imageVersionArn;
    /**
     * <p>
     * The status of the version.
     * </p>
     */
    private String imageVersionStatus;
    /**
     * <p>
     * When the version was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The registry path of the container image on which this image version is based.
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image on which this image version is based.
     */

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * <p>
     * The registry path of the container image on which this image version is based.
     * </p>
     * 
     * @return The registry path of the container image on which this image version is based.
     */

    public String getBaseImage() {
        return this.baseImage;
    }

    /**
     * <p>
     * The registry path of the container image on which this image version is based.
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image on which this image version is based.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withBaseImage(String baseImage) {
        setBaseImage(baseImage);
        return this;
    }

    /**
     * <p>
     * The registry path of the container image that contains this image version.
     * </p>
     * 
     * @param containerImage
     *        The registry path of the container image that contains this image version.
     */

    public void setContainerImage(String containerImage) {
        this.containerImage = containerImage;
    }

    /**
     * <p>
     * The registry path of the container image that contains this image version.
     * </p>
     * 
     * @return The registry path of the container image that contains this image version.
     */

    public String getContainerImage() {
        return this.containerImage;
    }

    /**
     * <p>
     * The registry path of the container image that contains this image version.
     * </p>
     * 
     * @param containerImage
     *        The registry path of the container image that contains this image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withContainerImage(String containerImage) {
        setContainerImage(containerImage);
        return this;
    }

    /**
     * <p>
     * When the version was created.
     * </p>
     * 
     * @param creationTime
     *        When the version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the version was created.
     * </p>
     * 
     * @return When the version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the version was created.
     * </p>
     * 
     * @param creationTime
     *        When the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When a create or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        When a create or delete operation fails, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * When a create or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @return When a create or delete operation fails, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * When a create or delete operation fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        When a create or delete operation fails, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image the version is based on.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image the version is based on.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image the version is based on.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image the version is based on.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image the version is based on.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image the version is based on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the version.
     * </p>
     * 
     * @param imageVersionArn
     *        The ARN of the version.
     */

    public void setImageVersionArn(String imageVersionArn) {
        this.imageVersionArn = imageVersionArn;
    }

    /**
     * <p>
     * The ARN of the version.
     * </p>
     * 
     * @return The ARN of the version.
     */

    public String getImageVersionArn() {
        return this.imageVersionArn;
    }

    /**
     * <p>
     * The ARN of the version.
     * </p>
     * 
     * @param imageVersionArn
     *        The ARN of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withImageVersionArn(String imageVersionArn) {
        setImageVersionArn(imageVersionArn);
        return this;
    }

    /**
     * <p>
     * The status of the version.
     * </p>
     * 
     * @param imageVersionStatus
     *        The status of the version.
     * @see ImageVersionStatus
     */

    public void setImageVersionStatus(String imageVersionStatus) {
        this.imageVersionStatus = imageVersionStatus;
    }

    /**
     * <p>
     * The status of the version.
     * </p>
     * 
     * @return The status of the version.
     * @see ImageVersionStatus
     */

    public String getImageVersionStatus() {
        return this.imageVersionStatus;
    }

    /**
     * <p>
     * The status of the version.
     * </p>
     * 
     * @param imageVersionStatus
     *        The status of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageVersionStatus
     */

    public DescribeImageVersionResult withImageVersionStatus(String imageVersionStatus) {
        setImageVersionStatus(imageVersionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the version.
     * </p>
     * 
     * @param imageVersionStatus
     *        The status of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageVersionStatus
     */

    public DescribeImageVersionResult withImageVersionStatus(ImageVersionStatus imageVersionStatus) {
        this.imageVersionStatus = imageVersionStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the version was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the version was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the version was last modified.
     * </p>
     * 
     * @return When the version was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the version was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the version was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageVersionResult withVersion(Integer version) {
        setVersion(version);
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
        if (getBaseImage() != null)
            sb.append("BaseImage: ").append(getBaseImage()).append(",");
        if (getContainerImage() != null)
            sb.append("ContainerImage: ").append(getContainerImage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getImageVersionArn() != null)
            sb.append("ImageVersionArn: ").append(getImageVersionArn()).append(",");
        if (getImageVersionStatus() != null)
            sb.append("ImageVersionStatus: ").append(getImageVersionStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageVersionResult == false)
            return false;
        DescribeImageVersionResult other = (DescribeImageVersionResult) obj;
        if (other.getBaseImage() == null ^ this.getBaseImage() == null)
            return false;
        if (other.getBaseImage() != null && other.getBaseImage().equals(this.getBaseImage()) == false)
            return false;
        if (other.getContainerImage() == null ^ this.getContainerImage() == null)
            return false;
        if (other.getContainerImage() != null && other.getContainerImage().equals(this.getContainerImage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getImageVersionArn() == null ^ this.getImageVersionArn() == null)
            return false;
        if (other.getImageVersionArn() != null && other.getImageVersionArn().equals(this.getImageVersionArn()) == false)
            return false;
        if (other.getImageVersionStatus() == null ^ this.getImageVersionStatus() == null)
            return false;
        if (other.getImageVersionStatus() != null && other.getImageVersionStatus().equals(this.getImageVersionStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseImage() == null) ? 0 : getBaseImage().hashCode());
        hashCode = prime * hashCode + ((getContainerImage() == null) ? 0 : getContainerImage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getImageVersionArn() == null) ? 0 : getImageVersionArn().hashCode());
        hashCode = prime * hashCode + ((getImageVersionStatus() == null) ? 0 : getImageVersionStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageVersionResult clone() {
        try {
            return (DescribeImageVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
