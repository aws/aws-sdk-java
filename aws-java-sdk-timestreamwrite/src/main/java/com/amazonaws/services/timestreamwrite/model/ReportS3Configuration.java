/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ReportS3Configuration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportS3Configuration implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String bucketName;
    /** <p/> */
    private String objectKeyPrefix;
    /** <p/> */
    private String encryptionOption;
    /** <p/> */
    private String kmsKeyId;

    /**
     * <p/>
     * 
     * @param bucketName
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p/>
     * 
     * @param bucketName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportS3Configuration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectKeyPrefix
     */

    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * <p/>
     * 
     * @param objectKeyPrefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportS3Configuration withObjectKeyPrefix(String objectKeyPrefix) {
        setObjectKeyPrefix(objectKeyPrefix);
        return this;
    }

    /**
     * <p/>
     * 
     * @param encryptionOption
     * @see S3EncryptionOption
     */

    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3EncryptionOption
     */

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * <p/>
     * 
     * @param encryptionOption
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public ReportS3Configuration withEncryptionOption(String encryptionOption) {
        setEncryptionOption(encryptionOption);
        return this;
    }

    /**
     * <p/>
     * 
     * @param encryptionOption
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public ReportS3Configuration withEncryptionOption(S3EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportS3Configuration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getObjectKeyPrefix() != null)
            sb.append("ObjectKeyPrefix: ").append(getObjectKeyPrefix()).append(",");
        if (getEncryptionOption() != null)
            sb.append("EncryptionOption: ").append(getEncryptionOption()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportS3Configuration == false)
            return false;
        ReportS3Configuration other = (ReportS3Configuration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKeyPrefix() == null ^ this.getObjectKeyPrefix() == null)
            return false;
        if (other.getObjectKeyPrefix() != null && other.getObjectKeyPrefix().equals(this.getObjectKeyPrefix()) == false)
            return false;
        if (other.getEncryptionOption() == null ^ this.getEncryptionOption() == null)
            return false;
        if (other.getEncryptionOption() != null && other.getEncryptionOption().equals(this.getEncryptionOption()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ReportS3Configuration clone() {
        try {
            return (ReportS3Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.ReportS3ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
