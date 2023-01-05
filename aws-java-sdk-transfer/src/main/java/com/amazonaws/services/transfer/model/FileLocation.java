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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Amazon S3 or EFS file details to be used in the step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/FileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     * </p>
     */
    private S3FileLocation s3FileLocation;
    /**
     * <p>
     * Specifies the Amazon EFS identifier and the path for the file being used.
     * </p>
     */
    private EfsFileLocation efsFileLocation;

    /**
     * <p>
     * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     * </p>
     * 
     * @param s3FileLocation
     *        Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     */

    public void setS3FileLocation(S3FileLocation s3FileLocation) {
        this.s3FileLocation = s3FileLocation;
    }

    /**
     * <p>
     * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     * </p>
     * 
     * @return Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     */

    public S3FileLocation getS3FileLocation() {
        return this.s3FileLocation;
    }

    /**
     * <p>
     * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     * </p>
     * 
     * @param s3FileLocation
     *        Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation withS3FileLocation(S3FileLocation s3FileLocation) {
        setS3FileLocation(s3FileLocation);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon EFS identifier and the path for the file being used.
     * </p>
     * 
     * @param efsFileLocation
     *        Specifies the Amazon EFS identifier and the path for the file being used.
     */

    public void setEfsFileLocation(EfsFileLocation efsFileLocation) {
        this.efsFileLocation = efsFileLocation;
    }

    /**
     * <p>
     * Specifies the Amazon EFS identifier and the path for the file being used.
     * </p>
     * 
     * @return Specifies the Amazon EFS identifier and the path for the file being used.
     */

    public EfsFileLocation getEfsFileLocation() {
        return this.efsFileLocation;
    }

    /**
     * <p>
     * Specifies the Amazon EFS identifier and the path for the file being used.
     * </p>
     * 
     * @param efsFileLocation
     *        Specifies the Amazon EFS identifier and the path for the file being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation withEfsFileLocation(EfsFileLocation efsFileLocation) {
        setEfsFileLocation(efsFileLocation);
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
        if (getS3FileLocation() != null)
            sb.append("S3FileLocation: ").append(getS3FileLocation()).append(",");
        if (getEfsFileLocation() != null)
            sb.append("EfsFileLocation: ").append(getEfsFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileLocation == false)
            return false;
        FileLocation other = (FileLocation) obj;
        if (other.getS3FileLocation() == null ^ this.getS3FileLocation() == null)
            return false;
        if (other.getS3FileLocation() != null && other.getS3FileLocation().equals(this.getS3FileLocation()) == false)
            return false;
        if (other.getEfsFileLocation() == null ^ this.getEfsFileLocation() == null)
            return false;
        if (other.getEfsFileLocation() != null && other.getEfsFileLocation().equals(this.getEfsFileLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3FileLocation() == null) ? 0 : getS3FileLocation().hashCode());
        hashCode = prime * hashCode + ((getEfsFileLocation() == null) ? 0 : getEfsFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public FileLocation clone() {
        try {
            return (FileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.FileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
