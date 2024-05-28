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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CloudWatch logging destination of a user pool detailed activity logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CloudWatchLogsConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log group must
     * not be encrypted with Key Management Service and must be in the same Amazon Web Services account as your user
     * pool.
     * </p>
     * <p>
     * To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log group
     * with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from certain Amazon Web Services services</a>.
     * </p>
     */
    private String logGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log group must
     * not be encrypted with Key Management Service and must be in the same Amazon Web Services account as your user
     * pool.
     * </p>
     * <p>
     * To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log group
     * with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from certain Amazon Web Services services</a>.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log
     *        group must not be encrypted with Key Management Service and must be in the same Amazon Web Services
     *        account as your user pool.</p>
     *        <p>
     *        To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log
     *        group with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     *        logging from certain Amazon Web Services services</a>.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log group must
     * not be encrypted with Key Management Service and must be in the same Amazon Web Services account as your user
     * pool.
     * </p>
     * <p>
     * To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log group
     * with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from certain Amazon Web Services services</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log
     *         group must not be encrypted with Key Management Service and must be in the same Amazon Web Services
     *         account as your user pool.</p>
     *         <p>
     *         To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log
     *         group with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html"
     *         >Enabling logging from certain Amazon Web Services services</a>.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log group must
     * not be encrypted with Key Management Service and must be in the same Amazon Web Services account as your user
     * pool.
     * </p>
     * <p>
     * To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log group
     * with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from certain Amazon Web Services services</a>.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends logs. The log
     *        group must not be encrypted with Key Management Service and must be in the same Amazon Web Services
     *        account as your user pool.</p>
     *        <p>
     *        To send logs to log groups with a resource policy of a size greater than 5120 characters, configure a log
     *        group with a path that starts with <code>/aws/vendedlogs</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     *        logging from certain Amazon Web Services services</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsConfigurationType withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
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
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsConfigurationType == false)
            return false;
        CloudWatchLogsConfigurationType other = (CloudWatchLogsConfigurationType) obj;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsConfigurationType clone() {
        try {
            return (CloudWatchLogsConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CloudWatchLogsConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
