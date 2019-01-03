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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Export job request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ExportJobRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that
     * endpoints will be exported to.
     */
    private String roleArn;
    /**
     * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     * typically a folder with multiple files.
     * 
     * The URL should follow this format: s3://bucket-name/folder-name/
     * 
     * Amazon Pinpoint will export endpoints to this location.
     */
    private String s3UrlPrefix;
    /**
     * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that
     * belong to the application.
     */
    private String segmentId;
    /** The version of the segment to export if specified. */
    private Integer segmentVersion;

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that
     * endpoints will be exported to.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location
     *        that endpoints will be exported to.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that
     * endpoints will be exported to.
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3
     *         location that endpoints will be exported to.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that
     * endpoints will be exported to.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location
     *        that endpoints will be exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     * typically a folder with multiple files.
     * 
     * The URL should follow this format: s3://bucket-name/folder-name/
     * 
     * Amazon Pinpoint will export endpoints to this location.
     * 
     * @param s3UrlPrefix
     *        A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     *        typically a folder with multiple files.
     * 
     *        The URL should follow this format: s3://bucket-name/folder-name/
     * 
     *        Amazon Pinpoint will export endpoints to this location.
     */

    public void setS3UrlPrefix(String s3UrlPrefix) {
        this.s3UrlPrefix = s3UrlPrefix;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     * typically a folder with multiple files.
     * 
     * The URL should follow this format: s3://bucket-name/folder-name/
     * 
     * Amazon Pinpoint will export endpoints to this location.
     * 
     * @return A URL that points to the location within an Amazon S3 bucket that will receive the export. The location
     *         is typically a folder with multiple files.
     * 
     *         The URL should follow this format: s3://bucket-name/folder-name/
     * 
     *         Amazon Pinpoint will export endpoints to this location.
     */

    public String getS3UrlPrefix() {
        return this.s3UrlPrefix;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     * typically a folder with multiple files.
     * 
     * The URL should follow this format: s3://bucket-name/folder-name/
     * 
     * Amazon Pinpoint will export endpoints to this location.
     * 
     * @param s3UrlPrefix
     *        A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is
     *        typically a folder with multiple files.
     * 
     *        The URL should follow this format: s3://bucket-name/folder-name/
     * 
     *        Amazon Pinpoint will export endpoints to this location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobRequest withS3UrlPrefix(String s3UrlPrefix) {
        setS3UrlPrefix(s3UrlPrefix);
        return this;
    }

    /**
     * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that
     * belong to the application.
     * 
     * @param segmentId
     *        The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the
     *        endpoints that belong to the application.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that
     * belong to the application.
     * 
     * @return The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the
     *         endpoints that belong to the application.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that
     * belong to the application.
     * 
     * @param segmentId
     *        The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the
     *        endpoints that belong to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobRequest withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * The version of the segment to export if specified.
     * 
     * @param segmentVersion
     *        The version of the segment to export if specified.
     */

    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * The version of the segment to export if specified.
     * 
     * @return The version of the segment to export if specified.
     */

    public Integer getSegmentVersion() {
        return this.segmentVersion;
    }

    /**
     * The version of the segment to export if specified.
     * 
     * @param segmentVersion
     *        The version of the segment to export if specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobRequest withSegmentVersion(Integer segmentVersion) {
        setSegmentVersion(segmentVersion);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3UrlPrefix() != null)
            sb.append("S3UrlPrefix: ").append(getS3UrlPrefix()).append(",");
        if (getSegmentId() != null)
            sb.append("SegmentId: ").append(getSegmentId()).append(",");
        if (getSegmentVersion() != null)
            sb.append("SegmentVersion: ").append(getSegmentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportJobRequest == false)
            return false;
        ExportJobRequest other = (ExportJobRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3UrlPrefix() == null ^ this.getS3UrlPrefix() == null)
            return false;
        if (other.getS3UrlPrefix() != null && other.getS3UrlPrefix().equals(this.getS3UrlPrefix()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentVersion() == null ^ this.getSegmentVersion() == null)
            return false;
        if (other.getSegmentVersion() != null && other.getSegmentVersion().equals(this.getSegmentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3UrlPrefix() == null) ? 0 : getS3UrlPrefix().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        return hashCode;
    }

    @Override
    public ExportJobRequest clone() {
        try {
            return (ExportJobRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ExportJobRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
