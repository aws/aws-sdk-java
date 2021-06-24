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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log configuration for the results of the run command actions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to enable encryption on the CloudWatch logs.
     * </p>
     */
    private Boolean cloudWatchEncryptionEnabled;
    /**
     * <p>
     * The name of the CloudWatch log group to send the logs to.
     * </p>
     */
    private String cloudWatchLogGroupName;
    /**
     * <p>
     * The name of the S3 bucket to send logs to.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * Whether to encrypt the logs that are sent to the S3 bucket.
     * </p>
     */
    private Boolean s3EncryptionEnabled;
    /**
     * <p>
     * Identifies the folder in the S3 bucket to send the logs to.
     * </p>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * Whether to enable encryption on the CloudWatch logs.
     * </p>
     * 
     * @param cloudWatchEncryptionEnabled
     *        Whether to enable encryption on the CloudWatch logs.
     */

    public void setCloudWatchEncryptionEnabled(Boolean cloudWatchEncryptionEnabled) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
    }

    /**
     * <p>
     * Whether to enable encryption on the CloudWatch logs.
     * </p>
     * 
     * @return Whether to enable encryption on the CloudWatch logs.
     */

    public Boolean getCloudWatchEncryptionEnabled() {
        return this.cloudWatchEncryptionEnabled;
    }

    /**
     * <p>
     * Whether to enable encryption on the CloudWatch logs.
     * </p>
     * 
     * @param cloudWatchEncryptionEnabled
     *        Whether to enable encryption on the CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails withCloudWatchEncryptionEnabled(Boolean cloudWatchEncryptionEnabled) {
        setCloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable encryption on the CloudWatch logs.
     * </p>
     * 
     * @return Whether to enable encryption on the CloudWatch logs.
     */

    public Boolean isCloudWatchEncryptionEnabled() {
        return this.cloudWatchEncryptionEnabled;
    }

    /**
     * <p>
     * The name of the CloudWatch log group to send the logs to.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        The name of the CloudWatch log group to send the logs to.
     */

    public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group to send the logs to.
     * </p>
     * 
     * @return The name of the CloudWatch log group to send the logs to.
     */

    public String getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group to send the logs to.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        The name of the CloudWatch log group to send the logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails withCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        setCloudWatchLogGroupName(cloudWatchLogGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket to send logs to.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket to send logs to.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to send logs to.
     * </p>
     * 
     * @return The name of the S3 bucket to send logs to.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to send logs to.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket to send logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * Whether to encrypt the logs that are sent to the S3 bucket.
     * </p>
     * 
     * @param s3EncryptionEnabled
     *        Whether to encrypt the logs that are sent to the S3 bucket.
     */

    public void setS3EncryptionEnabled(Boolean s3EncryptionEnabled) {
        this.s3EncryptionEnabled = s3EncryptionEnabled;
    }

    /**
     * <p>
     * Whether to encrypt the logs that are sent to the S3 bucket.
     * </p>
     * 
     * @return Whether to encrypt the logs that are sent to the S3 bucket.
     */

    public Boolean getS3EncryptionEnabled() {
        return this.s3EncryptionEnabled;
    }

    /**
     * <p>
     * Whether to encrypt the logs that are sent to the S3 bucket.
     * </p>
     * 
     * @param s3EncryptionEnabled
     *        Whether to encrypt the logs that are sent to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails withS3EncryptionEnabled(Boolean s3EncryptionEnabled) {
        setS3EncryptionEnabled(s3EncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to encrypt the logs that are sent to the S3 bucket.
     * </p>
     * 
     * @return Whether to encrypt the logs that are sent to the S3 bucket.
     */

    public Boolean isS3EncryptionEnabled() {
        return this.s3EncryptionEnabled;
    }

    /**
     * <p>
     * Identifies the folder in the S3 bucket to send the logs to.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Identifies the folder in the S3 bucket to send the logs to.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Identifies the folder in the S3 bucket to send the logs to.
     * </p>
     * 
     * @return Identifies the folder in the S3 bucket to send the logs to.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * Identifies the folder in the S3 bucket to send the logs to.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Identifies the folder in the S3 bucket to send the logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
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
        if (getCloudWatchEncryptionEnabled() != null)
            sb.append("CloudWatchEncryptionEnabled: ").append(getCloudWatchEncryptionEnabled()).append(",");
        if (getCloudWatchLogGroupName() != null)
            sb.append("CloudWatchLogGroupName: ").append(getCloudWatchLogGroupName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3EncryptionEnabled() != null)
            sb.append("S3EncryptionEnabled: ").append(getS3EncryptionEnabled()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails == false)
            return false;
        AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails other = (AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails) obj;
        if (other.getCloudWatchEncryptionEnabled() == null ^ this.getCloudWatchEncryptionEnabled() == null)
            return false;
        if (other.getCloudWatchEncryptionEnabled() != null && other.getCloudWatchEncryptionEnabled().equals(this.getCloudWatchEncryptionEnabled()) == false)
            return false;
        if (other.getCloudWatchLogGroupName() == null ^ this.getCloudWatchLogGroupName() == null)
            return false;
        if (other.getCloudWatchLogGroupName() != null && other.getCloudWatchLogGroupName().equals(this.getCloudWatchLogGroupName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3EncryptionEnabled() == null ^ this.getS3EncryptionEnabled() == null)
            return false;
        if (other.getS3EncryptionEnabled() != null && other.getS3EncryptionEnabled().equals(this.getS3EncryptionEnabled()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchEncryptionEnabled() == null) ? 0 : getCloudWatchEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupName() == null) ? 0 : getCloudWatchLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3EncryptionEnabled() == null) ? 0 : getS3EncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails clone() {
        try {
            return (AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
