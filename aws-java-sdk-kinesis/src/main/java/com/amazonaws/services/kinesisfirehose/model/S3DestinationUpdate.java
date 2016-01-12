/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an update for a destination in Amazon S3.
 * </p>
 */
public class S3DestinationUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for
     * delivered S3 files. You can specify an extra prefix to be added in front
     * of the time format prefix. Note that if the prefix ends with a slash, it
     * appears as a folder in the S3 bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     * >Amazon S3 Object Name Format</a> in the <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/">guide-fh-dev</a>.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The buffering option. If no value is specified,
     * <code>BufferingHints</code> object default values are used.
     * </p>
     */
    private BufferingHints bufferingHints;
    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     */
    private String compressionFormat;
    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no
     * encryption.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket.
     */
    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @return The ARN of the S3 bucket.
     */
    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DestinationUpdate withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for
     * delivered S3 files. You can specify an extra prefix to be added in front
     * of the time format prefix. Note that if the prefix ends with a slash, it
     * appears as a folder in the S3 bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     * >Amazon S3 Object Name Format</a> in the <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/">guide-fh-dev</a>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for
     *        delivered S3 files. You can specify an extra prefix to be added in
     *        front of the time format prefix. Note that if the prefix ends with
     *        a slash, it appears as a folder in the S3 bucket. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     *        >Amazon S3 Object Name Format</a> in the <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/"
     *        >guide-fh-dev</a>.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for
     * delivered S3 files. You can specify an extra prefix to be added in front
     * of the time format prefix. Note that if the prefix ends with a slash, it
     * appears as a folder in the S3 bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     * >Amazon S3 Object Name Format</a> in the <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/">guide-fh-dev</a>.
     * </p>
     * 
     * @return The "YYYY/MM/DD/HH" time format prefix is automatically used for
     *         delivered S3 files. You can specify an extra prefix to be added
     *         in front of the time format prefix. Note that if the prefix ends
     *         with a slash, it appears as a folder in the S3 bucket. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     *         >Amazon S3 Object Name Format</a> in the <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/"
     *         >guide-fh-dev</a>.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for
     * delivered S3 files. You can specify an extra prefix to be added in front
     * of the time format prefix. Note that if the prefix ends with a slash, it
     * appears as a folder in the S3 bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     * >Amazon S3 Object Name Format</a> in the <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/">guide-fh-dev</a>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for
     *        delivered S3 files. You can specify an extra prefix to be added in
     *        front of the time format prefix. Note that if the prefix ends with
     *        a slash, it appears as a folder in the S3 bucket. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html"
     *        >Amazon S3 Object Name Format</a> in the <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/"
     *        >guide-fh-dev</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DestinationUpdate withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The buffering option. If no value is specified,
     * <code>BufferingHints</code> object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option. If no value is specified,
     *        <code>BufferingHints</code> object default values are used.
     */
    public void setBufferingHints(BufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering option. If no value is specified,
     * <code>BufferingHints</code> object default values are used.
     * </p>
     * 
     * @return The buffering option. If no value is specified,
     *         <code>BufferingHints</code> object default values are used.
     */
    public BufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering option. If no value is specified,
     * <code>BufferingHints</code> object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option. If no value is specified,
     *        <code>BufferingHints</code> object default values are used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DestinationUpdate withBufferingHints(BufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is
     *        <code>NOCOMPRESSION</code>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified for Amazon Redshift destinations because they
     *        are not supported by the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket.
     * @see CompressionFormat
     */
    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     * 
     * @return The compression format. If no value is specified, the default is
     *         <code>NOCOMPRESSION</code>.</p>
     *         <p>
     *         The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *         cannot be specified for Amazon Redshift destinations because they
     *         are not supported by the Amazon Redshift <code>COPY</code>
     *         operation that reads from the S3 bucket.
     * @see CompressionFormat
     */
    public String getCompressionFormat() {
        return this.compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is
     *        <code>NOCOMPRESSION</code>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified for Amazon Redshift destinations because they
     *        are not supported by the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CompressionFormat
     */
    public S3DestinationUpdate withCompressionFormat(String compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is
     *        <code>NOCOMPRESSION</code>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified for Amazon Redshift destinations because they
     *        are not supported by the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CompressionFormat
     */
    public void setCompressionFormat(CompressionFormat compressionFormat) {
        this.compressionFormat = compressionFormat.toString();
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is
     * <code>NOCOMPRESSION</code>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified for Amazon Redshift destinations because they are not supported
     * by the Amazon Redshift <code>COPY</code> operation that reads from the S3
     * bucket.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is
     *        <code>NOCOMPRESSION</code>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified for Amazon Redshift destinations because they
     *        are not supported by the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CompressionFormat
     */
    public S3DestinationUpdate withCompressionFormat(
            CompressionFormat compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no
     * encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the
     *        default is no encryption.
     */
    public void setEncryptionConfiguration(
            EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no
     * encryption.
     * </p>
     * 
     * @return The encryption configuration. If no value is specified, the
     *         default is no encryption.
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no
     * encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the
     *        default is no encryption.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DestinationUpdate withEncryptionConfiguration(
            EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getBucketARN() != null)
            sb.append("BucketARN: " + getBucketARN() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: " + getBufferingHints() + ",");
        if (getCompressionFormat() != null)
            sb.append("CompressionFormat: " + getCompressionFormat() + ",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: "
                    + getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationUpdate == false)
            return false;
        S3DestinationUpdate other = (S3DestinationUpdate) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null
                && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null
                && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getBufferingHints() == null
                ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null
                && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getCompressionFormat() == null
                ^ this.getCompressionFormat() == null)
            return false;
        if (other.getCompressionFormat() != null
                && other.getCompressionFormat().equals(
                        this.getCompressionFormat()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null
                ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null
                && other.getEncryptionConfiguration().equals(
                        this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode
                + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getBufferingHints() == null) ? 0 : getBufferingHints()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCompressionFormat() == null) ? 0
                        : getCompressionFormat().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionConfiguration() == null) ? 0
                        : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationUpdate clone() {
        try {
            return (S3DestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}