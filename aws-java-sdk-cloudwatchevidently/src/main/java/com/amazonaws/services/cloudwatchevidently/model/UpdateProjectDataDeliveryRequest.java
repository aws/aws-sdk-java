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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProjectDataDelivery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectDataDeliveryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     * </p>
     */
    private CloudWatchLogsDestinationConfig cloudWatchLogs;
    /**
     * <p>
     * The name or ARN of the project that you want to modify the data storage options for.
     * </p>
     */
    private String project;
    /**
     * <p>
     * A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     * </p>
     */
    private S3DestinationConfig s3Destination;

    /**
     * <p>
     * A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     * </p>
     * 
     * @param cloudWatchLogs
     *        A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     */

    public void setCloudWatchLogs(CloudWatchLogsDestinationConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     * </p>
     * 
     * @return A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     */

    public CloudWatchLogsDestinationConfig getCloudWatchLogs() {
        return this.cloudWatchLogs;
    }

    /**
     * <p>
     * A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     * </p>
     * 
     * @param cloudWatchLogs
     *        A structure containing the CloudWatch Logs log group where you want to store evaluation events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectDataDeliveryRequest withCloudWatchLogs(CloudWatchLogsDestinationConfig cloudWatchLogs) {
        setCloudWatchLogs(cloudWatchLogs);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to modify the data storage options for.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to modify the data storage options for.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to modify the data storage options for.
     * </p>
     * 
     * @return The name or ARN of the project that you want to modify the data storage options for.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that you want to modify the data storage options for.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that you want to modify the data storage options for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectDataDeliveryRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     * </p>
     * 
     * @param s3Destination
     *        A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     */

    public void setS3Destination(S3DestinationConfig s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     * </p>
     * 
     * @return A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     */

    public S3DestinationConfig getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     * </p>
     * 
     * @param s3Destination
     *        A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectDataDeliveryRequest withS3Destination(S3DestinationConfig s3Destination) {
        setS3Destination(s3Destination);
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
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectDataDeliveryRequest == false)
            return false;
        UpdateProjectDataDeliveryRequest other = (UpdateProjectDataDeliveryRequest) obj;
        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectDataDeliveryRequest clone() {
        return (UpdateProjectDataDeliveryRequest) super.clone();
    }

}
