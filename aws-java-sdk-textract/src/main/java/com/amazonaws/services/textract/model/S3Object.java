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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 bucket name and file name that identifies the document.
 * </p>
 * <p>
 * The AWS Region for the S3 bucket that contains the document must match the Region that you use for Amazon Textract
 * operations.
 * </p>
 * <p>
 * For Amazon Textract to process a file in an S3 bucket, the user must have permission to access the S3 bucket and
 * file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/S3Object" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Object implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous operations also
     * support PDF files.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous operations also
     * support PDF files.
     * </p>
     * 
     * @param name
     *        The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous
     *        operations also support PDF files.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous operations also
     * support PDF files.
     * </p>
     * 
     * @return The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous
     *         operations also support PDF files.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous operations also
     * support PDF files.
     * </p>
     * 
     * @param name
     *        The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous
     *        operations also support PDF files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * 
     * @param version
     *        If the bucket has versioning enabled, you can specify the object version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * 
     * @return If the bucket has versioning enabled, you can specify the object version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * 
     * @param version
     *        If the bucket has versioning enabled, you can specify the object version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public S3Object clone() {
        try {
            return (S3Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.S3ObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
