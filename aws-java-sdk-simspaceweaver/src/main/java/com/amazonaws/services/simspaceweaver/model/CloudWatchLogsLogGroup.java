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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon CloudWatch Logs log group for the simulation. For more information about log groups, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working with
 * log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/CloudWatchLogsLogGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsLogGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log
     * groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     */
    private String logGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log
     * groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log groups, see
     *        <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log
     * groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log groups,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *         >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log
     * groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about log groups, see
     *        <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsLogGroup withLogGroupArn(String logGroupArn) {
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

        if (obj instanceof CloudWatchLogsLogGroup == false)
            return false;
        CloudWatchLogsLogGroup other = (CloudWatchLogsLogGroup) obj;
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
    public CloudWatchLogsLogGroup clone() {
        try {
            return (CloudWatchLogsLogGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.CloudWatchLogsLogGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
