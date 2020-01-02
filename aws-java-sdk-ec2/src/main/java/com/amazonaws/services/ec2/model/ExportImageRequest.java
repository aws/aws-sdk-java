/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ExportImageRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ExportImageRequest> {

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description of the image being exported. The maximum length is 255 bytes.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The disk image format.
     * </p>
     */
    private String diskImageFormat;
    /**
     * <p>
     * The ID of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to
     * the AWS account vm-import-export@amazon.com.
     * </p>
     */
    private ExportTaskS3LocationRequest s3ExportLocation;
    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     * parameter is not specified, the default role is named 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     * 
     * @param clientToken
     *        Token to enable idempotency for export image requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     * 
     * @return Token to enable idempotency for export image requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     * 
     * @param clientToken
     *        Token to enable idempotency for export image requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255 bytes.
     * </p>
     * 
     * @param description
     *        A description of the image being exported. The maximum length is 255 bytes.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255 bytes.
     * </p>
     * 
     * @return A description of the image being exported. The maximum length is 255 bytes.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255 bytes.
     * </p>
     * 
     * @param description
     *        A description of the image being exported. The maximum length is 255 bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param diskImageFormat
     *        The disk image format.
     * @see DiskImageFormat
     */

    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @return The disk image format.
     * @see DiskImageFormat
     */

    public String getDiskImageFormat() {
        return this.diskImageFormat;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param diskImageFormat
     *        The disk image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public ExportImageRequest withDiskImageFormat(String diskImageFormat) {
        setDiskImageFormat(diskImageFormat);
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param diskImageFormat
     *        The disk image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public ExportImageRequest withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     * 
     * @param imageId
     *        The ID of the image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     * 
     * @return The ID of the image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     * 
     * @param imageId
     *        The ID of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to
     * the AWS account vm-import-export@amazon.com.
     * </p>
     * 
     * @param s3ExportLocation
     *        Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP
     *        permissions to the AWS account vm-import-export@amazon.com.
     */

    public void setS3ExportLocation(ExportTaskS3LocationRequest s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to
     * the AWS account vm-import-export@amazon.com.
     * </p>
     * 
     * @return Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP
     *         permissions to the AWS account vm-import-export@amazon.com.
     */

    public ExportTaskS3LocationRequest getS3ExportLocation() {
        return this.s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to
     * the AWS account vm-import-export@amazon.com.
     * </p>
     * 
     * @param s3ExportLocation
     *        Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP
     *        permissions to the AWS account vm-import-export@amazon.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageRequest withS3ExportLocation(ExportTaskS3LocationRequest s3ExportLocation) {
        setS3ExportLocation(s3ExportLocation);
        return this;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     * parameter is not specified, the default role is named 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     *        parameter is not specified, the default role is named 'vmimport'.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     * parameter is not specified, the default role is named 'vmimport'.
     * </p>
     * 
     * @return The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     *         parameter is not specified, the default role is named 'vmimport'.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     * parameter is not specified, the default role is named 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this
     *        parameter is not specified, the default role is named 'vmimport'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ExportImageRequest> getDryRunRequest() {
        Request<ExportImageRequest> request = new ExportImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiskImageFormat() != null)
            sb.append("DiskImageFormat: ").append(getDiskImageFormat()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getS3ExportLocation() != null)
            sb.append("S3ExportLocation: ").append(getS3ExportLocation()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportImageRequest == false)
            return false;
        ExportImageRequest other = (ExportImageRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null)
            return false;
        if (other.getDiskImageFormat() != null && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getS3ExportLocation() == null ^ this.getS3ExportLocation() == null)
            return false;
        if (other.getS3ExportLocation() != null && other.getS3ExportLocation().equals(this.getS3ExportLocation()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getS3ExportLocation() == null) ? 0 : getS3ExportLocation().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public ExportImageRequest clone() {
        return (ExportImageRequest) super.clone();
    }
}
