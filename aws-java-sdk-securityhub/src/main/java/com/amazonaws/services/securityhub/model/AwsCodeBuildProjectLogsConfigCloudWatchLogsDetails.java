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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about CloudWatch Logs for the build project.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group name of the logs in CloudWatch Logs.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The current status of the logs in CloudWatch Logs for a build project.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The prefix of the stream name of the CloudWatch Logs.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The group name of the logs in CloudWatch Logs.
     * </p>
     * 
     * @param groupName
     *        The group name of the logs in CloudWatch Logs.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group name of the logs in CloudWatch Logs.
     * </p>
     * 
     * @return The group name of the logs in CloudWatch Logs.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The group name of the logs in CloudWatch Logs.
     * </p>
     * 
     * @param groupName
     *        The group name of the logs in CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The current status of the logs in CloudWatch Logs for a build project.
     * </p>
     * 
     * @param status
     *        The current status of the logs in CloudWatch Logs for a build project.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the logs in CloudWatch Logs for a build project.
     * </p>
     * 
     * @return The current status of the logs in CloudWatch Logs for a build project.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the logs in CloudWatch Logs for a build project.
     * </p>
     * 
     * @param status
     *        The current status of the logs in CloudWatch Logs for a build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The prefix of the stream name of the CloudWatch Logs.
     * </p>
     * 
     * @param streamName
     *        The prefix of the stream name of the CloudWatch Logs.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The prefix of the stream name of the CloudWatch Logs.
     * </p>
     * 
     * @return The prefix of the stream name of the CloudWatch Logs.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The prefix of the stream name of the CloudWatch Logs.
     * </p>
     * 
     * @param streamName
     *        The prefix of the stream name of the CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails == false)
            return false;
        AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails other = (AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails clone() {
        try {
            return (AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectLogsConfigCloudWatchLogsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
