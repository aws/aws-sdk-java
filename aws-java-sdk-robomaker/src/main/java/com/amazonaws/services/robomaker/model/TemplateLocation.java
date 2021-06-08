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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a template location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/TemplateLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket name.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @return The Amazon S3 bucket name.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateLocation withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @param s3Key
     *        The list of S3 keys identifying the data source files.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @return The list of S3 keys identifying the data source files.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @param s3Key
     *        The list of S3 keys identifying the data source files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateLocation withS3Key(String s3Key) {
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

        if (obj instanceof TemplateLocation == false)
            return false;
        TemplateLocation other = (TemplateLocation) obj;
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
    public TemplateLocation clone() {
        try {
            return (TemplateLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.TemplateLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
