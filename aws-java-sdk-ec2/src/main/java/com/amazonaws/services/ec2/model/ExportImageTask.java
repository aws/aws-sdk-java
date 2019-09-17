/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an export image task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportImageTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportImageTask implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the export image task.
     * </p>
     */
    private String exportImageTaskId;
    /**
     * <p>
     * The ID of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     */
    private ExportTaskS3Location s3ExportLocation;
    /**
     * <p>
     * The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, and <code>deleted</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the export image task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     * 
     * @param description
     *        A description of the image being exported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     * 
     * @return A description of the image being exported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     * 
     * @param description
     *        A description of the image being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     * 
     * @param exportImageTaskId
     *        The ID of the export image task.
     */

    public void setExportImageTaskId(String exportImageTaskId) {
        this.exportImageTaskId = exportImageTaskId;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     * 
     * @return The ID of the export image task.
     */

    public String getExportImageTaskId() {
        return this.exportImageTaskId;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     * 
     * @param exportImageTaskId
     *        The ID of the export image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withExportImageTaskId(String exportImageTaskId) {
        setExportImageTaskId(exportImageTaskId);
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

    public ExportImageTask withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     * 
     * @param progress
     *        The percent complete of the export image task.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     * 
     * @return The percent complete of the export image task.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     * 
     * @param progress
     *        The percent complete of the export image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     * 
     * @param s3ExportLocation
     *        Information about the destination S3 bucket.
     */

    public void setS3ExportLocation(ExportTaskS3Location s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     * 
     * @return Information about the destination S3 bucket.
     */

    public ExportTaskS3Location getS3ExportLocation() {
        return this.s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     * 
     * @param s3ExportLocation
     *        Information about the destination S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withS3ExportLocation(ExportTaskS3Location s3ExportLocation) {
        setS3ExportLocation(s3ExportLocation);
        return this;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, and <code>deleted</code>.
     * </p>
     * 
     * @param status
     *        The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     *        <code>deleting</code>, and <code>deleted</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, and <code>deleted</code>.
     * </p>
     * 
     * @return The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     *         <code>deleting</code>, and <code>deleted</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, and <code>deleted</code>.
     * </p>
     * 
     * @param status
     *        The status of the export image task. The possible values are <code>active</code>, <code>completed</code>,
     *        <code>deleting</code>, and <code>deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the export image task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     * 
     * @return The status message for the export image task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the export image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportImageTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExportImageTaskId() != null)
            sb.append("ExportImageTaskId: ").append(getExportImageTaskId()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getS3ExportLocation() != null)
            sb.append("S3ExportLocation: ").append(getS3ExportLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportImageTask == false)
            return false;
        ExportImageTask other = (ExportImageTask) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportImageTaskId() == null ^ this.getExportImageTaskId() == null)
            return false;
        if (other.getExportImageTaskId() != null && other.getExportImageTaskId().equals(this.getExportImageTaskId()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getS3ExportLocation() == null ^ this.getS3ExportLocation() == null)
            return false;
        if (other.getS3ExportLocation() != null && other.getS3ExportLocation().equals(this.getS3ExportLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExportImageTaskId() == null) ? 0 : getExportImageTaskId().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getS3ExportLocation() == null) ? 0 : getS3ExportLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ExportImageTask clone() {
        try {
            return (ExportImageTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
