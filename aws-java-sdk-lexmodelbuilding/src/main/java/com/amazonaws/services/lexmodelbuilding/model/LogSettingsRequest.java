/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings used to configure delivery mode and destination for conversation logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/LogSettingsRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogSettingsRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered
     * to an S3 bucket.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     * delivered to an S3 bucket.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3
     * bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered
     * to an S3 bucket.
     * </p>
     * 
     * @param logType
     *        The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered
     * to an S3 bucket.
     * </p>
     * 
     * @return The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *         delivered to an S3 bucket.
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered
     * to an S3 bucket.
     * </p>
     * 
     * @param logType
     *        The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogSettingsRequest withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered
     * to an S3 bucket.
     * </p>
     * 
     * @param logType
     *        The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogSettingsRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     * delivered to an S3 bucket.
     * </p>
     * 
     * @param destination
     *        Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @see Destination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     * delivered to an S3 bucket.
     * </p>
     * 
     * @return Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *         delivered to an S3 bucket.
     * @see Destination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     * delivered to an S3 bucket.
     * </p>
     * 
     * @param destination
     *        Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Destination
     */

    public LogSettingsRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     * delivered to an S3 bucket.
     * </p>
     * 
     * @param destination
     *        Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are
     *        delivered to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Destination
     */

    public LogSettingsRequest withDestination(Destination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3
     * bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to
     *        an S3 bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3
     * bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to
     *         an S3 bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3
     * bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to
     *        an S3 bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSettingsRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be
     *        delivered.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be
     *         delivered.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be
     *        delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSettingsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSettingsRequest == false)
            return false;
        LogSettingsRequest other = (LogSettingsRequest) obj;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public LogSettingsRequest clone() {
        try {
            return (LogSettingsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.LogSettingsRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
