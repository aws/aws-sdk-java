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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Amazon S3 bucket where DataSync uploads your <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ReportDestinationS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDestinationS3 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a bucket prefix for your report.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the ARN of the S3 bucket where DataSync uploads your report.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to your
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload a task
     * report to an Amazon S3 bucket</a>.
     * </p>
     */
    private String bucketAccessRoleArn;

    /**
     * <p>
     * Specifies a bucket prefix for your report.
     * </p>
     * 
     * @param subdirectory
     *        Specifies a bucket prefix for your report.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies a bucket prefix for your report.
     * </p>
     * 
     * @return Specifies a bucket prefix for your report.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies a bucket prefix for your report.
     * </p>
     * 
     * @param subdirectory
     *        Specifies a bucket prefix for your report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestinationS3 withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket where DataSync uploads your report.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the ARN of the S3 bucket where DataSync uploads your report.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket where DataSync uploads your report.
     * </p>
     * 
     * @return Specifies the ARN of the S3 bucket where DataSync uploads your report.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket where DataSync uploads your report.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the ARN of the S3 bucket where DataSync uploads your report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestinationS3 withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to your
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload a task
     * report to an Amazon S3 bucket</a>.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to
     *        your S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload
     *        a task report to an Amazon S3 bucket</a>.
     */

    public void setBucketAccessRoleArn(String bucketAccessRoleArn) {
        this.bucketAccessRoleArn = bucketAccessRoleArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to your
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload a task
     * report to an Amazon S3 bucket</a>.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report
     *         to your S3 bucket. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to
     *         upload a task report to an Amazon S3 bucket</a>.
     */

    public String getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to your
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload a task
     * report to an Amazon S3 bucket</a>.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        Specifies the Amazon Resource Name (ARN) of the IAM policy that allows DataSync to upload a task report to
     *        your S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Allowing DataSync to upload
     *        a task report to an Amazon S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDestinationS3 withBucketAccessRoleArn(String bucketAccessRoleArn) {
        setBucketAccessRoleArn(bucketAccessRoleArn);
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getBucketAccessRoleArn() != null)
            sb.append("BucketAccessRoleArn: ").append(getBucketAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportDestinationS3 == false)
            return false;
        ReportDestinationS3 other = (ReportDestinationS3) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getBucketAccessRoleArn() == null ^ this.getBucketAccessRoleArn() == null)
            return false;
        if (other.getBucketAccessRoleArn() != null && other.getBucketAccessRoleArn().equals(this.getBucketAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getBucketAccessRoleArn() == null) ? 0 : getBucketAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ReportDestinationS3 clone() {
        try {
            return (ReportDestinationS3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ReportDestinationS3Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
