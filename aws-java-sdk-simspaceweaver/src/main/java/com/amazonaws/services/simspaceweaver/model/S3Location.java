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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A location in Amazon Simple Storage Service (Amazon S3) where SimSpace Weaver stores simulation data, such as your
 * app zip files and schema file. For more information about Amazon S3, see the <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple Storage Service User
 * Guide</i> </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

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
     * The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">Uploading,
     * downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     */
    private String objectKey;

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

    public S3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">Uploading,
     * downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param objectKey
     *        The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see
     *        <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">
     *        Uploading, downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service
     *        User Guide</i>.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">Uploading,
     * downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @return The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see
     *         <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">
     *         Uploading, downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service
     *         User Guide</i>.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">Uploading,
     * downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param objectKey
     *        The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see
     *        <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html">
     *        Uploading, downloading, and working with objects in Amazon S3</a> in the <i>Amazon Simple Storage Service
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withObjectKey(String objectKey) {
        setObjectKey(objectKey);
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
        if (getObjectKey() != null)
            sb.append("ObjectKey: ").append(getObjectKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKey() == null ^ this.getObjectKey() == null)
            return false;
        if (other.getObjectKey() != null && other.getObjectKey().equals(this.getObjectKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKey() == null) ? 0 : getObjectKey().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
