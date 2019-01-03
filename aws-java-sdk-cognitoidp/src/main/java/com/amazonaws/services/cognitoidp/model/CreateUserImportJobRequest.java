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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to create the user import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job.
     * </p>
     */
    private String cloudWatchLogsRoleArn;

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @param jobName
     *        The job name for the user import job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @return The job name for the user import job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @param jobName
     *        The job name for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserImportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @return The user pool ID for the user pool that the users are being imported into.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserImportJobRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The role ARN for the Amazon CloudWatch Logging role for the user import job.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job.
     * </p>
     * 
     * @return The role ARN for the Amazon CloudWatch Logging role for the user import job.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The role ARN for the Amazon CloudWatch Logging role for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserImportJobRequest withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserImportJobRequest == false)
            return false;
        CreateUserImportJobRequest other = (CreateUserImportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserImportJobRequest clone() {
        return (CreateUserImportJobRequest) super.clone();
    }

}
