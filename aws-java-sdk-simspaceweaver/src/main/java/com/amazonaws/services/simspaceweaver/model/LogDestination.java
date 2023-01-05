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
 * The location where SimSpace Weaver sends simulation log data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/LogDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log groups, see
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">
     * Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     */
    private CloudWatchLogsLogGroup cloudWatchLogsLogGroup;

    /**
     * <p>
     * An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log groups, see
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">
     * Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param cloudWatchLogsLogGroup
     *        An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log
     *        groups, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     */

    public void setCloudWatchLogsLogGroup(CloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    /**
     * <p>
     * An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log groups, see
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">
     * Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @return An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log
     *         groups, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *         >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     */

    public CloudWatchLogsLogGroup getCloudWatchLogsLogGroup() {
        return this.cloudWatchLogsLogGroup;
    }

    /**
     * <p>
     * An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log groups, see
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">
     * Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param cloudWatchLogsLogGroup
     *        An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log
     *        groups, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with log groups and log streams</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDestination withCloudWatchLogsLogGroup(CloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
        setCloudWatchLogsLogGroup(cloudWatchLogsLogGroup);
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
        if (getCloudWatchLogsLogGroup() != null)
            sb.append("CloudWatchLogsLogGroup: ").append(getCloudWatchLogsLogGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDestination == false)
            return false;
        LogDestination other = (LogDestination) obj;
        if (other.getCloudWatchLogsLogGroup() == null ^ this.getCloudWatchLogsLogGroup() == null)
            return false;
        if (other.getCloudWatchLogsLogGroup() != null && other.getCloudWatchLogsLogGroup().equals(this.getCloudWatchLogsLogGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroup() == null) ? 0 : getCloudWatchLogsLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public LogDestination clone() {
        try {
            return (LogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.LogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
