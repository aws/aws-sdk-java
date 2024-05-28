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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an audit log destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about an Amazon S3 bucket.
     * </p>
     */
    private S3Bucket s3Bucket;
    /**
     * <p>
     * Contains information about an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     */
    private FirehoseStream firehoseStream;

    /**
     * <p>
     * Contains information about an Amazon S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Contains information about an Amazon S3 bucket.
     */

    public void setS3Bucket(S3Bucket s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Contains information about an Amazon S3 bucket.
     * </p>
     * 
     * @return Contains information about an Amazon S3 bucket.
     */

    public S3Bucket getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Contains information about an Amazon S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Contains information about an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withS3Bucket(S3Bucket s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * Contains information about an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param firehoseStream
     *        Contains information about an Amazon Kinesis Data Firehose delivery stream.
     */

    public void setFirehoseStream(FirehoseStream firehoseStream) {
        this.firehoseStream = firehoseStream;
    }

    /**
     * <p>
     * Contains information about an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @return Contains information about an Amazon Kinesis Data Firehose delivery stream.
     */

    public FirehoseStream getFirehoseStream() {
        return this.firehoseStream;
    }

    /**
     * <p>
     * Contains information about an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param firehoseStream
     *        Contains information about an Amazon Kinesis Data Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withFirehoseStream(FirehoseStream firehoseStream) {
        setFirehoseStream(firehoseStream);
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
        if (getFirehoseStream() != null)
            sb.append("FirehoseStream: ").append(getFirehoseStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getFirehoseStream() == null ^ this.getFirehoseStream() == null)
            return false;
        if (other.getFirehoseStream() != null && other.getFirehoseStream().equals(this.getFirehoseStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getFirehoseStream() == null) ? 0 : getFirehoseStream().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
