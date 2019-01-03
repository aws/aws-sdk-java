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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about build logs in Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/LogsLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     */
    private String deepLink;
    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     */
    private String s3DeepLink;
    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     */
    private CloudWatchLogsConfig cloudWatchLogs;
    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     */
    private S3LogsConfig s3Logs;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @param groupName
     *        The name of the Amazon CloudWatch Logs group for the build logs.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs group for the build logs.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @param groupName
     *        The name of the Amazon CloudWatch Logs group for the build logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon CloudWatch Logs stream for the build logs.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs stream for the build logs.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon CloudWatch Logs stream for the build logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param deepLink
     *        The URL to an individual build log in Amazon CloudWatch Logs.
     */

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The URL to an individual build log in Amazon CloudWatch Logs.
     */

    public String getDeepLink() {
        return this.deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param deepLink
     *        The URL to an individual build log in Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withDeepLink(String deepLink) {
        setDeepLink(deepLink);
        return this;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     * 
     * @param s3DeepLink
     *        The URL to a build log in an S3 bucket.
     */

    public void setS3DeepLink(String s3DeepLink) {
        this.s3DeepLink = s3DeepLink;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     * 
     * @return The URL to a build log in an S3 bucket.
     */

    public String getS3DeepLink() {
        return this.s3DeepLink;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     * 
     * @param s3DeepLink
     *        The URL to a build log in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withS3DeepLink(String s3DeepLink) {
        setS3DeepLink(s3DeepLink);
        return this;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Information about Amazon CloudWatch Logs for a build project.
     */

    public void setCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     * 
     * @return Information about Amazon CloudWatch Logs for a build project.
     */

    public CloudWatchLogsConfig getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Information about Amazon CloudWatch Logs for a build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     * 
     * @param s3Logs
     *        Information about S3 logs for a build project.
     */

    public void setS3Logs(S3LogsConfig s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     * 
     * @return Information about S3 logs for a build project.
     */

    public S3LogsConfig getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     * 
     * @param s3Logs
     *        Information about S3 logs for a build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withS3Logs(S3LogsConfig s3Logs) {
        setS3Logs(s3Logs);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getDeepLink() != null)
            sb.append("DeepLink: ").append(getDeepLink()).append(",");
        if (getS3DeepLink() != null)
            sb.append("S3DeepLink: ").append(getS3DeepLink()).append(",");
        if (getCloudWatchLogs() != null)
            sb.append("CloudWatchLogs: ").append(getCloudWatchLogs()).append(",");
        if (getS3Logs() != null)
            sb.append("S3Logs: ").append(getS3Logs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogsLocation == false)
            return false;
        LogsLocation other = (LogsLocation) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getDeepLink() == null ^ this.getDeepLink() == null)
            return false;
        if (other.getDeepLink() != null && other.getDeepLink().equals(this.getDeepLink()) == false)
            return false;
        if (other.getS3DeepLink() == null ^ this.getS3DeepLink() == null)
            return false;
        if (other.getS3DeepLink() != null && other.getS3DeepLink().equals(this.getS3DeepLink()) == false)
            return false;
        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeepLink() == null) ? 0 : getDeepLink().hashCode());
        hashCode = prime * hashCode + ((getS3DeepLink() == null) ? 0 : getS3DeepLink().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public LogsLocation clone() {
        try {
            return (LogsLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.LogsLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
