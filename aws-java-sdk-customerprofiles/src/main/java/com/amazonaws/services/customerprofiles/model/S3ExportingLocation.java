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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 location where Identity Resolution Jobs write result files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/S3ExportingLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ExportingLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket name where Identity Resolution Jobs write result files.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 key name of the location where Identity Resolution Jobs write result files.
     * </p>
     */
    private String s3KeyName;

    /**
     * <p>
     * The name of the S3 bucket name where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket name where Identity Resolution Jobs write result files.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket name where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @return The name of the S3 bucket name where Identity Resolution Jobs write result files.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket name where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket name where Identity Resolution Jobs write result files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportingLocation withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 key name of the location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3KeyName
     *        The S3 key name of the location where Identity Resolution Jobs write result files.
     */

    public void setS3KeyName(String s3KeyName) {
        this.s3KeyName = s3KeyName;
    }

    /**
     * <p>
     * The S3 key name of the location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @return The S3 key name of the location where Identity Resolution Jobs write result files.
     */

    public String getS3KeyName() {
        return this.s3KeyName;
    }

    /**
     * <p>
     * The S3 key name of the location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3KeyName
     *        The S3 key name of the location where Identity Resolution Jobs write result files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportingLocation withS3KeyName(String s3KeyName) {
        setS3KeyName(s3KeyName);
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyName() != null)
            sb.append("S3KeyName: ").append(getS3KeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ExportingLocation == false)
            return false;
        S3ExportingLocation other = (S3ExportingLocation) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyName() == null ^ this.getS3KeyName() == null)
            return false;
        if (other.getS3KeyName() != null && other.getS3KeyName().equals(this.getS3KeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyName() == null) ? 0 : getS3KeyName().hashCode());
        return hashCode;
    }

    @Override
    public S3ExportingLocation clone() {
        try {
            return (S3ExportingLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.S3ExportingLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
