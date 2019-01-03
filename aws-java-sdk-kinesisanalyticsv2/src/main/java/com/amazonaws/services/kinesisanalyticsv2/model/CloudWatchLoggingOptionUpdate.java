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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon CloudWatch logging option updates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CloudWatchLoggingOptionUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLoggingOptionUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the CloudWatch logging option to update
     * </p>
     */
    private String cloudWatchLoggingOptionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     * </p>
     */
    private String logStreamARNUpdate;

    /**
     * <p>
     * The ID of the CloudWatch logging option to update
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        The ID of the CloudWatch logging option to update
     */

    public void setCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        this.cloudWatchLoggingOptionId = cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * The ID of the CloudWatch logging option to update
     * </p>
     * 
     * @return The ID of the CloudWatch logging option to update
     */

    public String getCloudWatchLoggingOptionId() {
        return this.cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * The ID of the CloudWatch logging option to update
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        The ID of the CloudWatch logging option to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptionUpdate withCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        setCloudWatchLoggingOptionId(cloudWatchLoggingOptionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARNUpdate
     *        The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     */

    public void setLogStreamARNUpdate(String logStreamARNUpdate) {
        this.logStreamARNUpdate = logStreamARNUpdate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     */

    public String getLogStreamARNUpdate() {
        return this.logStreamARNUpdate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARNUpdate
     *        The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOptionUpdate withLogStreamARNUpdate(String logStreamARNUpdate) {
        setLogStreamARNUpdate(logStreamARNUpdate);
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
        if (getCloudWatchLoggingOptionId() != null)
            sb.append("CloudWatchLoggingOptionId: ").append(getCloudWatchLoggingOptionId()).append(",");
        if (getLogStreamARNUpdate() != null)
            sb.append("LogStreamARNUpdate: ").append(getLogStreamARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLoggingOptionUpdate == false)
            return false;
        CloudWatchLoggingOptionUpdate other = (CloudWatchLoggingOptionUpdate) obj;
        if (other.getCloudWatchLoggingOptionId() == null ^ this.getCloudWatchLoggingOptionId() == null)
            return false;
        if (other.getCloudWatchLoggingOptionId() != null && other.getCloudWatchLoggingOptionId().equals(this.getCloudWatchLoggingOptionId()) == false)
            return false;
        if (other.getLogStreamARNUpdate() == null ^ this.getLogStreamARNUpdate() == null)
            return false;
        if (other.getLogStreamARNUpdate() != null && other.getLogStreamARNUpdate().equals(this.getLogStreamARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionId() == null) ? 0 : getCloudWatchLoggingOptionId().hashCode());
        hashCode = prime * hashCode + ((getLogStreamARNUpdate() == null) ? 0 : getLogStreamARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLoggingOptionUpdate clone() {
        try {
            return (CloudWatchLoggingOptionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CloudWatchLoggingOptionUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
