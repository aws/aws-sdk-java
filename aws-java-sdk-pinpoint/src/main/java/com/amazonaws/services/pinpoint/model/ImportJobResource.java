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
 * <p>
 * Provides information about the resource settings for a job that imports endpoint definitions from one or more files.
 * The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer
 * by using the Amazon Pinpoint console.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ImportJobResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are
     * imported.
     * </p>
     */
    private Boolean defineSegment;
    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are
     * imported.
     * </p>
     */
    private Boolean registerEndpoints;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import.
     * This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint
     * definitions from the files in this location, including any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key for an individual object or a prefix
     * that qualifies multiple objects.
     * </p>
     */
    private String s3Url;
    /**
     * <p>
     * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job
     * updates an existing segment.
     * </p>
     */
    private String segmentId;
    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is
     * true.
     * </p>
     */
    private String segmentName;

    /**
     * <p>
     * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @param defineSegment
     *        Specifies whether the import job creates a segment that contains the endpoints, when the endpoint
     *        definitions are imported.
     */

    public void setDefineSegment(Boolean defineSegment) {
        this.defineSegment = defineSegment;
    }

    /**
     * <p>
     * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @return Specifies whether the import job creates a segment that contains the endpoints, when the endpoint
     *         definitions are imported.
     */

    public Boolean getDefineSegment() {
        return this.defineSegment;
    }

    /**
     * <p>
     * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @param defineSegment
     *        Specifies whether the import job creates a segment that contains the endpoints, when the endpoint
     *        definitions are imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withDefineSegment(Boolean defineSegment) {
        setDefineSegment(defineSegment);
        return this;
    }

    /**
     * <p>
     * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @return Specifies whether the import job creates a segment that contains the endpoints, when the endpoint
     *         definitions are imported.
     */

    public Boolean isDefineSegment() {
        return this.defineSegment;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *        Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we
     *        removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon
     *        Pinpoint.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @return (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *         Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we
     *         removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon
     *         Pinpoint.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *        Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we
     *        removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon
     *        Pinpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     * 
     * @param format
     *        The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     *        comma-separated values format; and, JSON, for newline-delimited JSON format.</p>
     *        <p>
     *        If the files are stored in an Amazon S3 location and that location contains multiple files that use
     *        different formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     * 
     * @return The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     *         comma-separated values format; and, JSON, for newline-delimited JSON format.</p>
     *         <p>
     *         If the files are stored in an Amazon S3 location and that location contains multiple files that use
     *         different formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     * 
     * @param format
     *        The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     *        comma-separated values format; and, JSON, for newline-delimited JSON format.</p>
     *        <p>
     *        If the files are stored in an Amazon S3 location and that location contains multiple files that use
     *        different formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ImportJobResource withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     * 
     * @param format
     *        The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     *        comma-separated values format; and, JSON, for newline-delimited JSON format.</p>
     *        <p>
     *        If the files are stored in an Amazon S3 location and that location contains multiple files that use
     *        different formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * @see Format
     */

    public void setFormat(Format format) {
        withFormat(format);
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     * comma-separated values format; and, JSON, for newline-delimited JSON format.
     * </p>
     * <p>
     * If the files are stored in an Amazon S3 location and that location contains multiple files that use different
     * formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * </p>
     * 
     * @param format
     *        The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for
     *        comma-separated values format; and, JSON, for newline-delimited JSON format.</p>
     *        <p>
     *        If the files are stored in an Amazon S3 location and that location contains multiple files that use
     *        different formats, Amazon Pinpoint imports data only from the files that use the specified format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ImportJobResource withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @param registerEndpoints
     *        Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint
     *        definitions are imported.
     */

    public void setRegisterEndpoints(Boolean registerEndpoints) {
        this.registerEndpoints = registerEndpoints;
    }

    /**
     * <p>
     * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @return Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint
     *         definitions are imported.
     */

    public Boolean getRegisterEndpoints() {
        return this.registerEndpoints;
    }

    /**
     * <p>
     * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @param registerEndpoints
     *        Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint
     *        definitions are imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withRegisterEndpoints(Boolean registerEndpoints) {
        setRegisterEndpoints(registerEndpoints);
        return this;
    }

    /**
     * <p>
     * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are
     * imported.
     * </p>
     * 
     * @return Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint
     *         definitions are imported.
     */

    public Boolean isRegisterEndpoints() {
        return this.registerEndpoints;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     *        Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes
     *         Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     *        Pinpoint to access the Amazon S3 location to import endpoint definitions from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import.
     * This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint
     * definitions from the files in this location, including any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key for an individual object or a prefix
     * that qualifies multiple objects.
     * </p>
     * 
     * @param s3Url
     *        The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to
     *        import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint
     *        imports endpoint definitions from the files in this location, including any subfolders that the folder
     *        contains.</p>
     *        <p>
     *        The URL should be in the following format:
     *        s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-
     *        name</replaceable>/<replaceable>file-name</replaceable>. The location can end with the key for an
     *        individual object or a prefix that qualifies multiple objects.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import.
     * This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint
     * definitions from the files in this location, including any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key for an individual object or a prefix
     * that qualifies multiple objects.
     * </p>
     * 
     * @return The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to
     *         import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint
     *         imports endpoint definitions from the files in this location, including any subfolders that the folder
     *         contains.</p>
     *         <p>
     *         The URL should be in the following format:
     *         s3://<replaceable>bucket-name</replaceable>/<replaceable>folder
     *         -name</replaceable>/<replaceable>file-name</replaceable>. The location can end with the key for an
     *         individual object or a prefix that qualifies multiple objects.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import.
     * This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint
     * definitions from the files in this location, including any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key for an individual object or a prefix
     * that qualifies multiple objects.
     * </p>
     * 
     * @param s3Url
     *        The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to
     *        import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint
     *        imports endpoint definitions from the files in this location, including any subfolders that the folder
     *        contains.</p>
     *        <p>
     *        The URL should be in the following format:
     *        s3://<replaceable>bucket-name</replaceable>/<replaceable>folder-
     *        name</replaceable>/<replaceable>file-name</replaceable>. The location can end with the key for an
     *        individual object or a prefix that qualifies multiple objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withS3Url(String s3Url) {
        setS3Url(s3Url);
        return this;
    }

    /**
     * <p>
     * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job
     * updates an existing segment.
     * </p>
     * 
     * @param segmentId
     *        The identifier for the segment that the import job updates or adds endpoint definitions to, if the import
     *        job updates an existing segment.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job
     * updates an existing segment.
     * </p>
     * 
     * @return The identifier for the segment that the import job updates or adds endpoint definitions to, if the import
     *         job updates an existing segment.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job
     * updates an existing segment.
     * </p>
     * 
     * @param segmentId
     *        The identifier for the segment that the import job updates or adds endpoint definitions to, if the import
     *        job updates an existing segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is
     * true.
     * </p>
     * 
     * @param segmentName
     *        The custom name for the segment that's created by the import job, if the value of the DefineSegment
     *        property is true.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is
     * true.
     * </p>
     * 
     * @return The custom name for the segment that's created by the import job, if the value of the DefineSegment
     *         property is true.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is
     * true.
     * </p>
     * 
     * @param segmentName
     *        The custom name for the segment that's created by the import job, if the value of the DefineSegment
     *        property is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResource withSegmentName(String segmentName) {
        setSegmentName(segmentName);
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
        if (getDefineSegment() != null)
            sb.append("DefineSegment: ").append(getDefineSegment()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getRegisterEndpoints() != null)
            sb.append("RegisterEndpoints: ").append(getRegisterEndpoints()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url()).append(",");
        if (getSegmentId() != null)
            sb.append("SegmentId: ").append(getSegmentId()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportJobResource == false)
            return false;
        ImportJobResource other = (ImportJobResource) obj;
        if (other.getDefineSegment() == null ^ this.getDefineSegment() == null)
            return false;
        if (other.getDefineSegment() != null && other.getDefineSegment().equals(this.getDefineSegment()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getRegisterEndpoints() == null ^ this.getRegisterEndpoints() == null)
            return false;
        if (other.getRegisterEndpoints() != null && other.getRegisterEndpoints().equals(this.getRegisterEndpoints()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefineSegment() == null) ? 0 : getDefineSegment().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getRegisterEndpoints() == null) ? 0 : getRegisterEndpoints().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        return hashCode;
    }

    @Override
    public ImportJobResource clone() {
        try {
            return (ImportJobResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ImportJobResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
