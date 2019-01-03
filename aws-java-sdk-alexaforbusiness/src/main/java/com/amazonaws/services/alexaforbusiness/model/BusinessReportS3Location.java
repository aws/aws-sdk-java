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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 location of the output reports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/BusinessReportS3Location"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessReportS3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the business report.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The path of the business report.
     * </p>
     * 
     * @param path
     *        The path of the business report.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the business report.
     * </p>
     * 
     * @return The path of the business report.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the business report.
     * </p>
     * 
     * @param path
     *        The path of the business report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessReportS3Location withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * 
     * @param bucketName
     *        The S3 bucket name of the output reports.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * 
     * @return The S3 bucket name of the output reports.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * 
     * @param bucketName
     *        The S3 bucket name of the output reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessReportS3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportS3Location == false)
            return false;
        BusinessReportS3Location other = (BusinessReportS3Location) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public BusinessReportS3Location clone() {
        try {
            return (BusinessReportS3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.BusinessReportS3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
