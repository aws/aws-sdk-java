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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an encryption configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EncryptionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption configuration for S3 data.
     * </p>
     */
    private java.util.List<S3Encryption> s3Encryption;
    /**
     * <p>
     * The encryption configuration for CloudWatch.
     * </p>
     */
    private CloudWatchEncryption cloudWatchEncryption;
    /**
     * <p>
     * The encryption configuration for Job Bookmarks.
     * </p>
     */
    private JobBookmarksEncryption jobBookmarksEncryption;

    /**
     * <p>
     * The encryption configuration for S3 data.
     * </p>
     * 
     * @return The encryption configuration for S3 data.
     */

    public java.util.List<S3Encryption> getS3Encryption() {
        return s3Encryption;
    }

    /**
     * <p>
     * The encryption configuration for S3 data.
     * </p>
     * 
     * @param s3Encryption
     *        The encryption configuration for S3 data.
     */

    public void setS3Encryption(java.util.Collection<S3Encryption> s3Encryption) {
        if (s3Encryption == null) {
            this.s3Encryption = null;
            return;
        }

        this.s3Encryption = new java.util.ArrayList<S3Encryption>(s3Encryption);
    }

    /**
     * <p>
     * The encryption configuration for S3 data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Encryption(java.util.Collection)} or {@link #withS3Encryption(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Encryption
     *        The encryption configuration for S3 data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withS3Encryption(S3Encryption... s3Encryption) {
        if (this.s3Encryption == null) {
            setS3Encryption(new java.util.ArrayList<S3Encryption>(s3Encryption.length));
        }
        for (S3Encryption ele : s3Encryption) {
            this.s3Encryption.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The encryption configuration for S3 data.
     * </p>
     * 
     * @param s3Encryption
     *        The encryption configuration for S3 data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withS3Encryption(java.util.Collection<S3Encryption> s3Encryption) {
        setS3Encryption(s3Encryption);
        return this;
    }

    /**
     * <p>
     * The encryption configuration for CloudWatch.
     * </p>
     * 
     * @param cloudWatchEncryption
     *        The encryption configuration for CloudWatch.
     */

    public void setCloudWatchEncryption(CloudWatchEncryption cloudWatchEncryption) {
        this.cloudWatchEncryption = cloudWatchEncryption;
    }

    /**
     * <p>
     * The encryption configuration for CloudWatch.
     * </p>
     * 
     * @return The encryption configuration for CloudWatch.
     */

    public CloudWatchEncryption getCloudWatchEncryption() {
        return this.cloudWatchEncryption;
    }

    /**
     * <p>
     * The encryption configuration for CloudWatch.
     * </p>
     * 
     * @param cloudWatchEncryption
     *        The encryption configuration for CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withCloudWatchEncryption(CloudWatchEncryption cloudWatchEncryption) {
        setCloudWatchEncryption(cloudWatchEncryption);
        return this;
    }

    /**
     * <p>
     * The encryption configuration for Job Bookmarks.
     * </p>
     * 
     * @param jobBookmarksEncryption
     *        The encryption configuration for Job Bookmarks.
     */

    public void setJobBookmarksEncryption(JobBookmarksEncryption jobBookmarksEncryption) {
        this.jobBookmarksEncryption = jobBookmarksEncryption;
    }

    /**
     * <p>
     * The encryption configuration for Job Bookmarks.
     * </p>
     * 
     * @return The encryption configuration for Job Bookmarks.
     */

    public JobBookmarksEncryption getJobBookmarksEncryption() {
        return this.jobBookmarksEncryption;
    }

    /**
     * <p>
     * The encryption configuration for Job Bookmarks.
     * </p>
     * 
     * @param jobBookmarksEncryption
     *        The encryption configuration for Job Bookmarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withJobBookmarksEncryption(JobBookmarksEncryption jobBookmarksEncryption) {
        setJobBookmarksEncryption(jobBookmarksEncryption);
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
        if (getS3Encryption() != null)
            sb.append("S3Encryption: ").append(getS3Encryption()).append(",");
        if (getCloudWatchEncryption() != null)
            sb.append("CloudWatchEncryption: ").append(getCloudWatchEncryption()).append(",");
        if (getJobBookmarksEncryption() != null)
            sb.append("JobBookmarksEncryption: ").append(getJobBookmarksEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getS3Encryption() == null ^ this.getS3Encryption() == null)
            return false;
        if (other.getS3Encryption() != null && other.getS3Encryption().equals(this.getS3Encryption()) == false)
            return false;
        if (other.getCloudWatchEncryption() == null ^ this.getCloudWatchEncryption() == null)
            return false;
        if (other.getCloudWatchEncryption() != null && other.getCloudWatchEncryption().equals(this.getCloudWatchEncryption()) == false)
            return false;
        if (other.getJobBookmarksEncryption() == null ^ this.getJobBookmarksEncryption() == null)
            return false;
        if (other.getJobBookmarksEncryption() != null && other.getJobBookmarksEncryption().equals(this.getJobBookmarksEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Encryption() == null) ? 0 : getS3Encryption().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchEncryption() == null) ? 0 : getCloudWatchEncryption().hashCode());
        hashCode = prime * hashCode + ((getJobBookmarksEncryption() == null) ? 0 : getJobBookmarksEncryption().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
