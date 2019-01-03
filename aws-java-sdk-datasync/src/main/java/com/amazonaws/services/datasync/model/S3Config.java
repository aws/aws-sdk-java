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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used to access an Amazon
 * S3 bucket. For detailed information about using such a role, see <a href=
 * "https://alpha-aws-docs.aws.amazon.com/sync-service/latest/userguide/create-locations-cli.html#create-location-s3-cli"
 * >Components and Terminology</a> in the <i>AWS DataSync User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/S3Config" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Config implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a> operation.
     * </p>
     */
    private String bucketAccessRoleArn;

    /**
     * <p>
     * The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a> operation.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a>
     *        operation.
     */

    public void setBucketAccessRoleArn(String bucketAccessRoleArn) {
        this.bucketAccessRoleArn = bucketAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a> operation.
     * </p>
     * 
     * @return The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a>
     *         operation.
     */

    public String getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a> operation.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        The Amazon S3 bucket to access. This bucket is used as a parameter in the <a>CreateLocationS3</a>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withBucketAccessRoleArn(String bucketAccessRoleArn) {
        setBucketAccessRoleArn(bucketAccessRoleArn);
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
        if (getBucketAccessRoleArn() != null)
            sb.append("BucketAccessRoleArn: ").append(getBucketAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Config == false)
            return false;
        S3Config other = (S3Config) obj;
        if (other.getBucketAccessRoleArn() == null ^ this.getBucketAccessRoleArn() == null)
            return false;
        if (other.getBucketAccessRoleArn() != null && other.getBucketAccessRoleArn().equals(this.getBucketAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketAccessRoleArn() == null) ? 0 : getBucketAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Config clone() {
        try {
            return (S3Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.S3ConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
