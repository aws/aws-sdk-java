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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * CloudWatch logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CloudWatchConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log group name.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The role Amazon Resource Name (ARN).
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * S3 configuration for delivering a large amount of data.
     * </p>
     */
    private S3Config largeDataDeliveryS3Config;

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroupName
     *        The log group name.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @return The log group name.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroupName
     *        The log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchConfig withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The role Amazon Resource Name (ARN).
     * </p>
     * 
     * @param roleArn
     *        The role Amazon Resource Name (ARN).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The role Amazon Resource Name (ARN).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role Amazon Resource Name (ARN).
     * </p>
     * 
     * @param roleArn
     *        The role Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * S3 configuration for delivering a large amount of data.
     * </p>
     * 
     * @param largeDataDeliveryS3Config
     *        S3 configuration for delivering a large amount of data.
     */

    public void setLargeDataDeliveryS3Config(S3Config largeDataDeliveryS3Config) {
        this.largeDataDeliveryS3Config = largeDataDeliveryS3Config;
    }

    /**
     * <p>
     * S3 configuration for delivering a large amount of data.
     * </p>
     * 
     * @return S3 configuration for delivering a large amount of data.
     */

    public S3Config getLargeDataDeliveryS3Config() {
        return this.largeDataDeliveryS3Config;
    }

    /**
     * <p>
     * S3 configuration for delivering a large amount of data.
     * </p>
     * 
     * @param largeDataDeliveryS3Config
     *        S3 configuration for delivering a large amount of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchConfig withLargeDataDeliveryS3Config(S3Config largeDataDeliveryS3Config) {
        setLargeDataDeliveryS3Config(largeDataDeliveryS3Config);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLargeDataDeliveryS3Config() != null)
            sb.append("LargeDataDeliveryS3Config: ").append(getLargeDataDeliveryS3Config());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchConfig == false)
            return false;
        CloudWatchConfig other = (CloudWatchConfig) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLargeDataDeliveryS3Config() == null ^ this.getLargeDataDeliveryS3Config() == null)
            return false;
        if (other.getLargeDataDeliveryS3Config() != null && other.getLargeDataDeliveryS3Config().equals(this.getLargeDataDeliveryS3Config()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLargeDataDeliveryS3Config() == null) ? 0 : getLargeDataDeliveryS3Config().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchConfig clone() {
        try {
            return (CloudWatchConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.CloudWatchConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
