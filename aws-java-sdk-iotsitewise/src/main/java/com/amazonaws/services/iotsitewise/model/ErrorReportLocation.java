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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 destination where errors associated with the job creation request are saved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ErrorReportLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorReportLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key that
     * is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a
     * forward slash (/). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorReportLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key that
     * is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a
     * forward slash (/). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param prefix
     *        Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key
     *        that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must
     *        end with a forward slash (/). For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key that
     * is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a
     * forward slash (/). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @return Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a
     *         key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix
     *         must end with a forward slash (/). For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *         prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key that
     * is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a
     * forward slash (/). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param prefix
     *        Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key
     *        that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must
     *        end with a forward slash (/). For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorReportLocation withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorReportLocation == false)
            return false;
        ErrorReportLocation other = (ErrorReportLocation) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ErrorReportLocation clone() {
        try {
            return (ErrorReportLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ErrorReportLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
