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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An encryption rule to apply to the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketServerSideEncryptionRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketServerSideEncryptionRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code> object
     * request doesn't specify any server-side encryption, this default encryption is applied.
     * </p>
     */
    private AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code> object
     * request doesn't specify any server-side encryption, this default encryption is applied.
     * </p>
     * 
     * @param applyServerSideEncryptionByDefault
     *        Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code>
     *        object request doesn't specify any server-side encryption, this default encryption is applied.
     */

    public void setApplyServerSideEncryptionByDefault(AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
    }

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code> object
     * request doesn't specify any server-side encryption, this default encryption is applied.
     * </p>
     * 
     * @return Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code>
     *         object request doesn't specify any server-side encryption, this default encryption is applied.
     */

    public AwsS3BucketServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code> object
     * request doesn't specify any server-side encryption, this default encryption is applied.
     * </p>
     * 
     * @param applyServerSideEncryptionByDefault
     *        Specifies the default server-side encryption to apply to new objects in the bucket. If a <code>PUT</code>
     *        object request doesn't specify any server-side encryption, this default encryption is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketServerSideEncryptionRule withApplyServerSideEncryptionByDefault(
            AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        setApplyServerSideEncryptionByDefault(applyServerSideEncryptionByDefault);
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
        if (getApplyServerSideEncryptionByDefault() != null)
            sb.append("ApplyServerSideEncryptionByDefault: ").append(getApplyServerSideEncryptionByDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketServerSideEncryptionRule == false)
            return false;
        AwsS3BucketServerSideEncryptionRule other = (AwsS3BucketServerSideEncryptionRule) obj;
        if (other.getApplyServerSideEncryptionByDefault() == null ^ this.getApplyServerSideEncryptionByDefault() == null)
            return false;
        if (other.getApplyServerSideEncryptionByDefault() != null
                && other.getApplyServerSideEncryptionByDefault().equals(this.getApplyServerSideEncryptionByDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyServerSideEncryptionByDefault() == null) ? 0 : getApplyServerSideEncryptionByDefault().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketServerSideEncryptionRule clone() {
        try {
            return (AwsS3BucketServerSideEncryptionRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketServerSideEncryptionRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
