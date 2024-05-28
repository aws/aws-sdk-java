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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a specified Amazon Route 53 configuration for DNS query logging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRoute53QueryLoggingConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53QueryLoggingConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     */
    private CloudWatchLogsLogGroupArnConfigDetails cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs
     *        to.
     */

    public void setCloudWatchLogsLogGroupArn(CloudWatchLogsLogGroupArnConfigDetails cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs
     *         to.
     */

    public CloudWatchLogsLogGroupArnConfigDetails getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group that Route 53 is publishing logs
     *        to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53QueryLoggingConfigDetails withCloudWatchLogsLogGroupArn(CloudWatchLogsLogGroupArnConfigDetails cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
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
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRoute53QueryLoggingConfigDetails == false)
            return false;
        AwsRoute53QueryLoggingConfigDetails other = (AwsRoute53QueryLoggingConfigDetails) obj;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsRoute53QueryLoggingConfigDetails clone() {
        try {
            return (AwsRoute53QueryLoggingConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRoute53QueryLoggingConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
