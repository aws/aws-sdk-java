/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on S3 location for error reports that result from running a query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/S3Configuration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket under which error reports will be created.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     * </p>
     */
    private String objectKeyPrefix;
    /**
     * <p>
     * Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose
     * SSE_S3 as default.
     * </p>
     */
    private String encryptionOption;

    /**
     * <p>
     * Name of the S3 bucket under which error reports will be created.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket under which error reports will be created.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket under which error reports will be created.
     * </p>
     * 
     * @return Name of the S3 bucket under which error reports will be created.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket under which error reports will be created.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket under which error reports will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     * </p>
     * 
     * @param objectKeyPrefix
     *        Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     */

    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * <p>
     * Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     * </p>
     * 
     * @return Prefix for the error report key. Timestream by default adds the following prefix to the error report
     *         path.
     */

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * <p>
     * Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     * </p>
     * 
     * @param objectKeyPrefix
     *        Prefix for the error report key. Timestream by default adds the following prefix to the error report path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withObjectKeyPrefix(String objectKeyPrefix) {
        setObjectKeyPrefix(objectKeyPrefix);
        return this;
    }

    /**
     * <p>
     * Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose
     * SSE_S3 as default.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption at rest options for the error reports. If no encryption option is specified, Timestream will
     *        choose SSE_S3 as default.
     * @see S3EncryptionOption
     */

    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p>
     * Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose
     * SSE_S3 as default.
     * </p>
     * 
     * @return Encryption at rest options for the error reports. If no encryption option is specified, Timestream will
     *         choose SSE_S3 as default.
     * @see S3EncryptionOption
     */

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * <p>
     * Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose
     * SSE_S3 as default.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption at rest options for the error reports. If no encryption option is specified, Timestream will
     *        choose SSE_S3 as default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public S3Configuration withEncryptionOption(String encryptionOption) {
        setEncryptionOption(encryptionOption);
        return this;
    }

    /**
     * <p>
     * Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose
     * SSE_S3 as default.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption at rest options for the error reports. If no encryption option is specified, Timestream will
     *        choose SSE_S3 as default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public S3Configuration withEncryptionOption(S3EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
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
            sb.append("EncryptionOption: ").append(getEncryptionOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Configuration == false)
            return false;
        S3Configuration other = (S3Configuration) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        return hashCode;
    }

    @Override
    public S3Configuration clone() {
        try {
            return (S3Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.S3ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
