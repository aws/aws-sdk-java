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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Simple Storage Service (Amazon S3) bucket location in which a journal export job writes the journal
 * contents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/S3ExportConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ExportConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * The following are examples of valid <code>Prefix</code> values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JournalExports-ForMyLedger/Testing/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JournalExports</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>My:Tests/</code>
     * </p>
     * </li>
     * </ul>
     */
    private String prefix;
    /**
     * <p>
     * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     * </p>
     */
    private S3EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The Amazon S3 bucket name in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket name in which a journal export job writes the journal contents.</p>
     *        <p>
     *        The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *        Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon S3 bucket name in which a journal export job writes the journal contents.</p>
     *         <p>
     *         The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *         Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket name in which a journal export job writes the journal contents.</p>
     *        <p>
     *        The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *        Limitations</a> in the <i>Amazon S3 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * The following are examples of valid <code>Prefix</code> values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JournalExports-ForMyLedger/Testing/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JournalExports</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>My:Tests/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param prefix
     *        The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.</p>
     *        <p>
     *        The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        The following are examples of valid <code>Prefix</code> values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JournalExports-ForMyLedger/Testing/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JournalExports</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>My:Tests/</code>
     *        </p>
     *        </li>
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * The following are examples of valid <code>Prefix</code> values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JournalExports-ForMyLedger/Testing/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JournalExports</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>My:Tests/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.</p>
     *         <p>
     *         The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in
     *         the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     *         <p>
     *         The following are examples of valid <code>Prefix</code> values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>JournalExports-ForMyLedger/Testing/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JournalExports</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>My:Tests/</code>
     *         </p>
     *         </li>
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.
     * </p>
     * <p>
     * The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * The following are examples of valid <code>Prefix</code> values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JournalExports-ForMyLedger/Testing/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JournalExports</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>My:Tests/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param prefix
     *        The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents.</p>
     *        <p>
     *        The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        The following are examples of valid <code>Prefix</code> values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JournalExports-ForMyLedger/Testing/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JournalExports</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>My:Tests/</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     */

    public void setEncryptionConfiguration(S3EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     * </p>
     * 
     * @return The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     */

    public S3EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withEncryptionConfiguration(S3EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ExportConfiguration == false)
            return false;
        S3ExportConfiguration other = (S3ExportConfiguration) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public S3ExportConfiguration clone() {
        try {
            return (S3ExportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.S3ExportConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
