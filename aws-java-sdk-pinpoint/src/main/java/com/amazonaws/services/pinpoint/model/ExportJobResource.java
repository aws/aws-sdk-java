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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the resource settings for a job that exports endpoint definitions to a file. The file can
 * be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or
 * downloaded directly to a computer by using the Amazon Pinpoint console.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ExportJobResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     * Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions
     * were exported to. This location is typically a folder that contains multiple files. The URL should be in the
     * following format: s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     * </p>
     */
    private String s3UrlPrefix;
    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present,
     * Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
     * </p>
     */
    private String segmentId;
    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported from.
     * </p>
     */
    private Integer segmentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     * Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     *        Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     * Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized
     *         Amazon Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     * Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon
     *        Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions
     * were exported to. This location is typically a folder that contains multiple files. The URL should be in the
     * following format: s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     * </p>
     * 
     * @param s3UrlPrefix
     *        The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint
     *        definitions were exported to. This location is typically a folder that contains multiple files. The URL
     *        should be in the following format:
     *        s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     */

    public void setS3UrlPrefix(String s3UrlPrefix) {
        this.s3UrlPrefix = s3UrlPrefix;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions
     * were exported to. This location is typically a folder that contains multiple files. The URL should be in the
     * following format: s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     * </p>
     * 
     * @return The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint
     *         definitions were exported to. This location is typically a folder that contains multiple files. The URL
     *         should be in the following format:
     *         s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     */

    public String getS3UrlPrefix() {
        return this.s3UrlPrefix;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions
     * were exported to. This location is typically a folder that contains multiple files. The URL should be in the
     * following format: s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     * </p>
     * 
     * @param s3UrlPrefix
     *        The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint
     *        definitions were exported to. This location is typically a folder that contains multiple files. The URL
     *        should be in the following format:
     *        s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable>/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResource withS3UrlPrefix(String s3UrlPrefix) {
        setS3UrlPrefix(s3UrlPrefix);
        return this;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present,
     * Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
     * </p>
     * 
     * @param segmentId
     *        The identifier for the segment that the endpoint definitions were exported from. If this value isn't
     *        present, Amazon Pinpoint exported definitions for all the endpoints that are associated with the
     *        application.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present,
     * Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
     * </p>
     * 
     * @return The identifier for the segment that the endpoint definitions were exported from. If this value isn't
     *         present, Amazon Pinpoint exported definitions for all the endpoints that are associated with the
     *         application.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present,
     * Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
     * </p>
     * 
     * @param segmentId
     *        The identifier for the segment that the endpoint definitions were exported from. If this value isn't
     *        present, Amazon Pinpoint exported definitions for all the endpoints that are associated with the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResource withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported from.
     * </p>
     * 
     * @param segmentVersion
     *        The version of the segment that the endpoint definitions were exported from.
     */

    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported from.
     * </p>
     * 
     * @return The version of the segment that the endpoint definitions were exported from.
     */

    public Integer getSegmentVersion() {
        return this.segmentVersion;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported from.
     * </p>
     * 
     * @param segmentVersion
     *        The version of the segment that the endpoint definitions were exported from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResource withSegmentVersion(Integer segmentVersion) {
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

        if (obj instanceof ExportJobResource == false)
            return false;
        ExportJobResource other = (ExportJobResource) obj;
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
    public ExportJobResource clone() {
        try {
            return (ExportJobResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ExportJobResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
