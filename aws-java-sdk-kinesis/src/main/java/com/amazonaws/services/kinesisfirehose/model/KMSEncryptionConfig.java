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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an encryption key for a destination in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/KMSEncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KMSEncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination
     * Amazon S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     */
    private String aWSKMSKeyARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination
     * Amazon S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param aWSKMSKeyARN
     *        The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the
     *        destination Amazon S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setAWSKMSKeyARN(String aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination
     * Amazon S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the
     *         destination Amazon S3 bucket. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getAWSKMSKeyARN() {
        return this.aWSKMSKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination
     * Amazon S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param aWSKMSKeyARN
     *        The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the
     *        destination Amazon S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KMSEncryptionConfig withAWSKMSKeyARN(String aWSKMSKeyARN) {
        setAWSKMSKeyARN(aWSKMSKeyARN);
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
        if (getAWSKMSKeyARN() != null)
            sb.append("AWSKMSKeyARN: ").append(getAWSKMSKeyARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KMSEncryptionConfig == false)
            return false;
        KMSEncryptionConfig other = (KMSEncryptionConfig) obj;
        if (other.getAWSKMSKeyARN() == null ^ this.getAWSKMSKeyARN() == null)
            return false;
        if (other.getAWSKMSKeyARN() != null && other.getAWSKMSKeyARN().equals(this.getAWSKMSKeyARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSKMSKeyARN() == null) ? 0 : getAWSKMSKeyARN().hashCode());
        return hashCode;
    }

    @Override
    public KMSEncryptionConfig clone() {
        try {
            return (KMSEncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.KMSEncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
