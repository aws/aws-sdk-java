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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates a file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/S3Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Amazon S3 bucket. For more information about buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating, configuring, and
     * working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about folders in
     * Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing
     * objects in the Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     */
    private String objectKeyPrefix;

    /**
     * <p>
     * The name of an Amazon S3 bucket. For more information about buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating, configuring, and
     * working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param bucketName
     *        The name of an Amazon S3 bucket. For more information about buckets, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating,
     *        configuring, and working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User
     *        Guide</i>.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket. For more information about buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating, configuring, and
     * working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @return The name of an Amazon S3 bucket. For more information about buckets, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating,
     *         configuring, and working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User
     *         Guide</i>.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket. For more information about buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating, configuring, and
     * working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param bucketName
     *        The name of an Amazon S3 bucket. For more information about buckets, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating,
     *        configuring, and working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about folders in
     * Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing
     * objects in the Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param objectKeyPrefix
     *        A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about
     *        folders in Amazon S3, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing objects in the
     *        Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * <p>
     * A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about folders in
     * Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing
     * objects in the Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @return A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about
     *         folders in Amazon S3, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing objects in the
     *         Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * <p>
     * A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about folders in
     * Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing
     * objects in the Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param objectKeyPrefix
     *        A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about
     *        folders in Amazon S3, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-folders.html">Organizing objects in the
     *        Amazon S3 console using folders</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withObjectKeyPrefix(String objectKeyPrefix) {
        setObjectKeyPrefix(objectKeyPrefix);
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
            sb.append("ObjectKeyPrefix: ").append(getObjectKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Destination == false)
            return false;
        S3Destination other = (S3Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKeyPrefix() == null ^ this.getObjectKeyPrefix() == null)
            return false;
        if (other.getObjectKeyPrefix() != null && other.getObjectKeyPrefix().equals(this.getObjectKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3Destination clone() {
        try {
            return (S3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
