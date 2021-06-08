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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the bucket where the Amazon S3 Storage Lens metrics export files are located.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3BucketDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketDestination implements Serializable, Cloneable {

    /** <p/> */
    private String format;
    /**
     * <p>
     * The schema version of the export file.
     * </p>
     */
    private String outputSchemaVersion;
    /**
     * <p>
     * The account ID of the owner of the S3 Storage Lens metrics export bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The prefix of the destination bucket where the metrics export will be delivered.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The container for the type encryption of the metrics exports in this bucket.
     * </p>
     */
    private StorageLensDataExportEncryption encryption;

    /**
     * <p/>
     * 
     * @param format
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p/>
     * 
     * @return
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p/>
     * 
     * @param format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public S3BucketDestination withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p/>
     * 
     * @param format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public S3BucketDestination withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The schema version of the export file.
     * </p>
     * 
     * @param outputSchemaVersion
     *        The schema version of the export file.
     * @see OutputSchemaVersion
     */

    public void setOutputSchemaVersion(String outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
    }

    /**
     * <p>
     * The schema version of the export file.
     * </p>
     * 
     * @return The schema version of the export file.
     * @see OutputSchemaVersion
     */

    public String getOutputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    /**
     * <p>
     * The schema version of the export file.
     * </p>
     * 
     * @param outputSchemaVersion
     *        The schema version of the export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputSchemaVersion
     */

    public S3BucketDestination withOutputSchemaVersion(String outputSchemaVersion) {
        setOutputSchemaVersion(outputSchemaVersion);
        return this;
    }

    /**
     * <p>
     * The schema version of the export file.
     * </p>
     * 
     * @param outputSchemaVersion
     *        The schema version of the export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputSchemaVersion
     */

    public S3BucketDestination withOutputSchemaVersion(OutputSchemaVersion outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The account ID of the owner of the S3 Storage Lens metrics export bucket.
     * </p>
     * 
     * @param accountId
     *        The account ID of the owner of the S3 Storage Lens metrics export bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the owner of the S3 Storage Lens metrics export bucket.
     * </p>
     * 
     * @return The account ID of the owner of the S3 Storage Lens metrics export bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the owner of the S3 Storage Lens metrics export bucket.
     * </p>
     * 
     * @param accountId
     *        The account ID of the owner of the S3 Storage Lens metrics export bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDestination withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     *        <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following
     *         format:
     *         <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:
     *        <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:bucket/<i>your-destination-bucket-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDestination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The prefix of the destination bucket where the metrics export will be delivered.
     * </p>
     * 
     * @param prefix
     *        The prefix of the destination bucket where the metrics export will be delivered.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the destination bucket where the metrics export will be delivered.
     * </p>
     * 
     * @return The prefix of the destination bucket where the metrics export will be delivered.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix of the destination bucket where the metrics export will be delivered.
     * </p>
     * 
     * @param prefix
     *        The prefix of the destination bucket where the metrics export will be delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDestination withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The container for the type encryption of the metrics exports in this bucket.
     * </p>
     * 
     * @param encryption
     *        The container for the type encryption of the metrics exports in this bucket.
     */

    public void setEncryption(StorageLensDataExportEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The container for the type encryption of the metrics exports in this bucket.
     * </p>
     * 
     * @return The container for the type encryption of the metrics exports in this bucket.
     */

    public StorageLensDataExportEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The container for the type encryption of the metrics exports in this bucket.
     * </p>
     * 
     * @param encryption
     *        The container for the type encryption of the metrics exports in this bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDestination withEncryption(StorageLensDataExportEncryption encryption) {
        setEncryption(encryption);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getOutputSchemaVersion() != null)
            sb.append("OutputSchemaVersion: ").append(getOutputSchemaVersion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketDestination == false)
            return false;
        S3BucketDestination other = (S3BucketDestination) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getOutputSchemaVersion() == null ^ this.getOutputSchemaVersion() == null)
            return false;
        if (other.getOutputSchemaVersion() != null && other.getOutputSchemaVersion().equals(this.getOutputSchemaVersion()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemaVersion() == null) ? 0 : getOutputSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketDestination clone() {
        try {
            return (S3BucketDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
