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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the S3 bucket for the disk image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UserBucketDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserBucketDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The S3 bucket from which the disk image was created.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The file name of the disk image.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * The S3 bucket from which the disk image was created.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket from which the disk image was created.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket from which the disk image was created.
     * </p>
     * 
     * @return The S3 bucket from which the disk image was created.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket from which the disk image was created.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket from which the disk image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserBucketDetails withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The file name of the disk image.
     * </p>
     * 
     * @param s3Key
     *        The file name of the disk image.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The file name of the disk image.
     * </p>
     * 
     * @return The file name of the disk image.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The file name of the disk image.
     * </p>
     * 
     * @param s3Key
     *        The file name of the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserBucketDetails withS3Key(String s3Key) {
        setS3Key(s3Key);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserBucketDetails == false)
            return false;
        UserBucketDetails other = (UserBucketDetails) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public UserBucketDetails clone() {
        try {
            return (UserBucketDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
