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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information from your report job about your report destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the Amazon S3 bucket that receives your reports.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The object key that uniquely identifies your reports in your S3 bucket.
     * </p>
     */
    private java.util.List<String> s3Keys;

    /**
     * <p>
     * The unique name of the Amazon S3 bucket that receives your reports.
     * </p>
     * 
     * @param s3BucketName
     *        The unique name of the Amazon S3 bucket that receives your reports.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The unique name of the Amazon S3 bucket that receives your reports.
     * </p>
     * 
     * @return The unique name of the Amazon S3 bucket that receives your reports.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The unique name of the Amazon S3 bucket that receives your reports.
     * </p>
     * 
     * @param s3BucketName
     *        The unique name of the Amazon S3 bucket that receives your reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestination withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The object key that uniquely identifies your reports in your S3 bucket.
     * </p>
     * 
     * @return The object key that uniquely identifies your reports in your S3 bucket.
     */

    public java.util.List<String> getS3Keys() {
        return s3Keys;
    }

    /**
     * <p>
     * The object key that uniquely identifies your reports in your S3 bucket.
     * </p>
     * 
     * @param s3Keys
     *        The object key that uniquely identifies your reports in your S3 bucket.
     */

    public void setS3Keys(java.util.Collection<String> s3Keys) {
        if (s3Keys == null) {
            this.s3Keys = null;
            return;
        }

        this.s3Keys = new java.util.ArrayList<String>(s3Keys);
    }

    /**
     * <p>
     * The object key that uniquely identifies your reports in your S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Keys(java.util.Collection)} or {@link #withS3Keys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param s3Keys
     *        The object key that uniquely identifies your reports in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestination withS3Keys(String... s3Keys) {
        if (this.s3Keys == null) {
            setS3Keys(new java.util.ArrayList<String>(s3Keys.length));
        }
        for (String ele : s3Keys) {
            this.s3Keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The object key that uniquely identifies your reports in your S3 bucket.
     * </p>
     * 
     * @param s3Keys
     *        The object key that uniquely identifies your reports in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestination withS3Keys(java.util.Collection<String> s3Keys) {
        setS3Keys(s3Keys);
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
        if (getS3Keys() != null)
            sb.append("S3Keys: ").append(getS3Keys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportDestination == false)
            return false;
        ReportDestination other = (ReportDestination) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Keys() == null ^ this.getS3Keys() == null)
            return false;
        if (other.getS3Keys() != null && other.getS3Keys().equals(this.getS3Keys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Keys() == null) ? 0 : getS3Keys().hashCode());
        return hashCode;
    }

    @Override
    public ReportDestination clone() {
        try {
            return (ReportDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
