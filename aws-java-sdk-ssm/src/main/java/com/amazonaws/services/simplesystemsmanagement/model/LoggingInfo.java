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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon S3 bucket to write instance-level logs to.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
 * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for
 * the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LoggingInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Amazon S3 bucket where execution logs are stored .
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * (Optional) The Amazon S3 bucket subfolder.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The region where the Amazon S3 bucket is located.
     * </p>
     */
    private String s3Region;

    /**
     * <p>
     * The name of an Amazon S3 bucket where execution logs are stored .
     * </p>
     * 
     * @param s3BucketName
     *        The name of an Amazon S3 bucket where execution logs are stored .
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket where execution logs are stored .
     * </p>
     * 
     * @return The name of an Amazon S3 bucket where execution logs are stored .
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of an Amazon S3 bucket where execution logs are stored .
     * </p>
     * 
     * @param s3BucketName
     *        The name of an Amazon S3 bucket where execution logs are stored .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingInfo withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * (Optional) The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @param s3KeyPrefix
     *        (Optional) The Amazon S3 bucket subfolder.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * (Optional) The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @return (Optional) The Amazon S3 bucket subfolder.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * (Optional) The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @param s3KeyPrefix
     *        (Optional) The Amazon S3 bucket subfolder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingInfo withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The region where the Amazon S3 bucket is located.
     * </p>
     * 
     * @param s3Region
     *        The region where the Amazon S3 bucket is located.
     */

    public void setS3Region(String s3Region) {
        this.s3Region = s3Region;
    }

    /**
     * <p>
     * The region where the Amazon S3 bucket is located.
     * </p>
     * 
     * @return The region where the Amazon S3 bucket is located.
     */

    public String getS3Region() {
        return this.s3Region;
    }

    /**
     * <p>
     * The region where the Amazon S3 bucket is located.
     * </p>
     * 
     * @param s3Region
     *        The region where the Amazon S3 bucket is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingInfo withS3Region(String s3Region) {
        setS3Region(s3Region);
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
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getS3Region() != null)
            sb.append("S3Region: ").append(getS3Region());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingInfo == false)
            return false;
        LoggingInfo other = (LoggingInfo) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getS3Region() == null ^ this.getS3Region() == null)
            return false;
        if (other.getS3Region() != null && other.getS3Region().equals(this.getS3Region()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getS3Region() == null) ? 0 : getS3Region().hashCode());
        return hashCode;
    }

    @Override
    public LoggingInfo clone() {
        try {
            return (LoggingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.LoggingInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
