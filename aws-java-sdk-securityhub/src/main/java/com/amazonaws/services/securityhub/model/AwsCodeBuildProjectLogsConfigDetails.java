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
 * Information about logs for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectLogsConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectLogsConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about CloudWatch Logs for the build project.
     * </p>
     */
    private AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails cloudWatchLogs;
    /**
     * <p>
     * Information about logs built to an S3 bucket for a build project.
     * </p>
     */
    private AwsCodeBuildProjectLogsConfigS3LogsDetails s3Logs;

    /**
     * <p>
     * Information about CloudWatch Logs for the build project.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Information about CloudWatch Logs for the build project.
     */

    public void setCloudWatchLogs(AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * Information about CloudWatch Logs for the build project.
     * </p>
     * 
     * @return Information about CloudWatch Logs for the build project.
     */

    public AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * Information about CloudWatch Logs for the build project.
     * </p>
     * 
     * @param cloudWatchLogs
     *        Information about CloudWatch Logs for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigDetails withCloudWatchLogs(AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * Information about logs built to an S3 bucket for a build project.
     * </p>
     * 
     * @param s3Logs
     *        Information about logs built to an S3 bucket for a build project.
     */

    public void setS3Logs(AwsCodeBuildProjectLogsConfigS3LogsDetails s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * Information about logs built to an S3 bucket for a build project.
     * </p>
     * 
     * @return Information about logs built to an S3 bucket for a build project.
     */

    public AwsCodeBuildProjectLogsConfigS3LogsDetails getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * Information about logs built to an S3 bucket for a build project.
     * </p>
     * 
     * @param s3Logs
     *        Information about logs built to an S3 bucket for a build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigDetails withS3Logs(AwsCodeBuildProjectLogsConfigS3LogsDetails s3Logs) {
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

        if (obj instanceof AwsCodeBuildProjectLogsConfigDetails == false)
            return false;
        AwsCodeBuildProjectLogsConfigDetails other = (AwsCodeBuildProjectLogsConfigDetails) obj;
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

        hashCode = prime * hashCode + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectLogsConfigDetails clone() {
        try {
            return (AwsCodeBuildProjectLogsConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectLogsConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
