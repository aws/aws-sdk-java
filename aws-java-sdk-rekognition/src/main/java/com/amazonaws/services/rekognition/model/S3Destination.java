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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference results of a video
 * analysis operation. These results include the name of the stream processor resource, the session ID of the stream
 * processing session, and labeled timestamps and bounding boxes for detected labels.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the owner of
     * the Amazon S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The prefix value of the location within the bucket that you want the information to be published to. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using
     * prefixes</a>.
     * </p>
     */
    private String keyPrefix;

    /**
     * <p>
     * The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the owner of
     * the Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the
     *        owner of the Amazon S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the owner of
     * the Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the
     *         owner of the Amazon S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the owner of
     * the Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the
     *        owner of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The prefix value of the location within the bucket that you want the information to be published to. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using
     * prefixes</a>.
     * </p>
     * 
     * @param keyPrefix
     *        The prefix value of the location within the bucket that you want the information to be published to. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using prefixes</a>.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The prefix value of the location within the bucket that you want the information to be published to. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using
     * prefixes</a>.
     * </p>
     * 
     * @return The prefix value of the location within the bucket that you want the information to be published to. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using prefixes</a>.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The prefix value of the location within the bucket that you want the information to be published to. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using
     * prefixes</a>.
     * </p>
     * 
     * @param keyPrefix
     *        The prefix value of the location within the bucket that you want the information to be published to. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Using prefixes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
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
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix());
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
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
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
        com.amazonaws.services.rekognition.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
