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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KinesisStreamConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to send
     * real-time log data to your Kinesis data stream.
     * </p>
     * <p>
     * For more information the IAM role, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     * >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     * </p>
     */
    private String streamARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to send
     * real-time log data to your Kinesis data stream.
     * </p>
     * <p>
     * For more information the IAM role, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     * >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to
     *        send real-time log data to your Kinesis data stream.</p>
     *        <p>
     *        For more information the IAM role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     *        >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to send
     * real-time log data to your Kinesis data stream.
     * </p>
     * <p>
     * For more information the IAM role, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     * >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to
     *         send real-time log data to your Kinesis data stream.</p>
     *         <p>
     *         For more information the IAM role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     *         >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to send
     * real-time log data to your Kinesis data stream.
     * </p>
     * <p>
     * For more information the IAM role, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     * >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFront can use to
     *        send real-time log data to your Kinesis data stream.</p>
     *        <p>
     *        For more information the IAM role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role"
     *        >Real-time log configuration IAM role</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamConfig withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamConfig withStreamARN(String streamARN) {
        setStreamARN(streamARN);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamConfig == false)
            return false;
        KinesisStreamConfig other = (KinesisStreamConfig) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamConfig clone() {
        try {
            return (KinesisStreamConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
