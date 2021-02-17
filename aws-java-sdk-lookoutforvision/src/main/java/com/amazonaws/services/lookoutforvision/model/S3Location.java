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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location training output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket that contains the training output.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The path of the folder, within the S3 bucket, that contains the training output.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The S3 bucket that contains the training output.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that contains the training output.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the training output.
     * </p>
     * 
     * @return The S3 bucket that contains the training output.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the training output.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that contains the training output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The path of the folder, within the S3 bucket, that contains the training output.
     * </p>
     * 
     * @param prefix
     *        The path of the folder, within the S3 bucket, that contains the training output.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The path of the folder, within the S3 bucket, that contains the training output.
     * </p>
     * 
     * @return The path of the folder, within the S3 bucket, that contains the training output.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The path of the folder, within the S3 bucket, that contains the training output.
     * </p>
     * 
     * @param prefix
     *        The path of the folder, within the S3 bucket, that contains the training output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withPrefix(String prefix) {
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

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
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
        com.amazonaws.services.lookoutforvision.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
