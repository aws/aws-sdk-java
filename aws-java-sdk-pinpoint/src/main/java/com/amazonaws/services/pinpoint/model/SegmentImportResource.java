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
 * Segment import definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentImportResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentImportResource implements Serializable, Cloneable, StructuredPojo {

    /** The number of channel types in the imported segment. */
    private java.util.Map<String, Integer> channelCounts;
    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     */
    private String externalId;
    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     */
    private String format;
    /** The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3. */
    private String roleArn;
    /** The URL of the S3 bucket that the segment was imported from. */
    private String s3Url;
    /** The number of endpoints that were successfully imported to create this segment. */
    private Integer size;

    /**
     * The number of channel types in the imported segment.
     * 
     * @return The number of channel types in the imported segment.
     */

    public java.util.Map<String, Integer> getChannelCounts() {
        return channelCounts;
    }

    /**
     * The number of channel types in the imported segment.
     * 
     * @param channelCounts
     *        The number of channel types in the imported segment.
     */

    public void setChannelCounts(java.util.Map<String, Integer> channelCounts) {
        this.channelCounts = channelCounts;
    }

    /**
     * The number of channel types in the imported segment.
     * 
     * @param channelCounts
     *        The number of channel types in the imported segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource withChannelCounts(java.util.Map<String, Integer> channelCounts) {
        setChannelCounts(channelCounts);
        return this;
    }

    public SegmentImportResource addChannelCountsEntry(String key, Integer value) {
        if (null == this.channelCounts) {
            this.channelCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.channelCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.channelCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChannelCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource clearChannelCountsEntries() {
        this.channelCounts = null;
        return this;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by
     *        Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended
     *        for IAM roles assumed by Amazon Pinpoint.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @return (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used
     *         by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not
     *         recommended for IAM roles assumed by Amazon Pinpoint.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by
     *        Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended
     *        for IAM roles assumed by Amazon Pinpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * 
     * @param format
     *        The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * 
     * @return The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * 
     * @param format
     *        The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public SegmentImportResource withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * 
     * @param format
     *        The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * @see Format
     */

    public void setFormat(Format format) {
        withFormat(format);
    }

    /**
     * The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * 
     * @param format
     *        The format of the endpoint files that were imported to create this segment. Valid values: CSV, JSON
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public SegmentImportResource withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in
     *        Amazon S3.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in
     *         Amazon S3.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in
     *        Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The URL of the S3 bucket that the segment was imported from.
     * 
     * @param s3Url
     *        The URL of the S3 bucket that the segment was imported from.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * The URL of the S3 bucket that the segment was imported from.
     * 
     * @return The URL of the S3 bucket that the segment was imported from.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * The URL of the S3 bucket that the segment was imported from.
     * 
     * @param s3Url
     *        The URL of the S3 bucket that the segment was imported from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource withS3Url(String s3Url) {
        setS3Url(s3Url);
        return this;
    }

    /**
     * The number of endpoints that were successfully imported to create this segment.
     * 
     * @param size
     *        The number of endpoints that were successfully imported to create this segment.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * The number of endpoints that were successfully imported to create this segment.
     * 
     * @return The number of endpoints that were successfully imported to create this segment.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * The number of endpoints that were successfully imported to create this segment.
     * 
     * @param size
     *        The number of endpoints that were successfully imported to create this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentImportResource withSize(Integer size) {
        setSize(size);
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
        if (getChannelCounts() != null)
            sb.append("ChannelCounts: ").append(getChannelCounts()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentImportResource == false)
            return false;
        SegmentImportResource other = (SegmentImportResource) obj;
        if (other.getChannelCounts() == null ^ this.getChannelCounts() == null)
            return false;
        if (other.getChannelCounts() != null && other.getChannelCounts().equals(this.getChannelCounts()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelCounts() == null) ? 0 : getChannelCounts().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public SegmentImportResource clone() {
        try {
            return (SegmentImportResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentImportResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
