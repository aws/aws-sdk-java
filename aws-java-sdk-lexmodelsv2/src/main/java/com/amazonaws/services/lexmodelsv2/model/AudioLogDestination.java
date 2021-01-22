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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of audio log files collected when conversation logging is enabled for a bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AudioLogDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioLogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the <code>roleArn</code>
     * parameter of the <a>CreateBot</a> operation must have permission to write to this bucket.
     * </p>
     */
    private S3BucketLogDestination s3Bucket;

    /**
     * <p>
     * The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the <code>roleArn</code>
     * parameter of the <a>CreateBot</a> operation must have permission to write to this bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the
     *        <code>roleArn</code> parameter of the <a>CreateBot</a> operation must have permission to write to this
     *        bucket.
     */

    public void setS3Bucket(S3BucketLogDestination s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the <code>roleArn</code>
     * parameter of the <a>CreateBot</a> operation must have permission to write to this bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the
     *         <code>roleArn</code> parameter of the <a>CreateBot</a> operation must have permission to write to this
     *         bucket.
     */

    public S3BucketLogDestination getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the <code>roleArn</code>
     * parameter of the <a>CreateBot</a> operation must have permission to write to this bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the
     *        <code>roleArn</code> parameter of the <a>CreateBot</a> operation must have permission to write to this
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioLogDestination withS3Bucket(S3BucketLogDestination s3Bucket) {
        setS3Bucket(s3Bucket);
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
            sb.append("S3Bucket: ").append(getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioLogDestination == false)
            return false;
        AudioLogDestination other = (AudioLogDestination) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public AudioLogDestination clone() {
        try {
            return (AudioLogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AudioLogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
