/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the configuration of a destination in Amazon Redshift.
 * </p>
 */
public class RedshiftDestinationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The database connection string.
     * </p>
     */
    private String clusterJDBCURL;
    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     */
    private CopyCommand copyCommand;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The user password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift. Default
     * value is 3600 (60 minutes).
     * </p>
     */
    private RedshiftRetryOptions retryOptions;
    /**
     * <p>
     * The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions are
     * described in the topic for <a>CreateDeliveryStream</a>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     */
    private S3DestinationConfiguration s3Configuration;
    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     */

    public void setClusterJDBCURL(String clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @return The database connection string.
     */

    public String getClusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withClusterJDBCURL(String clusterJDBCURL) {
        setClusterJDBCURL(clusterJDBCURL);
        return this;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     */

    public void setCopyCommand(CopyCommand copyCommand) {
        this.copyCommand = copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @return The <code>COPY</code> command.
     */

    public CopyCommand getCopyCommand() {
        return this.copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withCopyCommand(CopyCommand copyCommand) {
        setCopyCommand(copyCommand);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @param password
     *        The user password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @return The user password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @param password
     *        The user password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift. Default
     * value is 3600 (60 minutes).
     * </p>
     * 
     * @param retryOptions
     *        Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift.
     *        Default value is 3600 (60 minutes).
     */

    public void setRetryOptions(RedshiftRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift. Default
     * value is 3600 (60 minutes).
     * </p>
     * 
     * @return Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift.
     *         Default value is 3600 (60 minutes).
     */

    public RedshiftRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift. Default
     * value is 3600 (60 minutes).
     * </p>
     * 
     * @param retryOptions
     *        Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon Redshift.
     *        Default value is 3600 (60 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withRetryOptions(RedshiftRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions are
     * described in the topic for <a>CreateDeliveryStream</a>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @param s3Configuration
     *        The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions
     *        are described in the topic for <a>CreateDeliveryStream</a>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *        <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket doesn't support these compression formats.
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions are
     * described in the topic for <a>CreateDeliveryStream</a>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @return The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions
     *         are described in the topic for <a>CreateDeliveryStream</a>.</p>
     *         <p>
     *         The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *         <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code>
     *         operation that reads from the S3 bucket doesn't support these compression formats.
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions are
     * described in the topic for <a>CreateDeliveryStream</a>.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @param s3Configuration
     *        The S3 configuration for the intermediate location from which Amazon Redshift obtains data. Restrictions
     *        are described in the topic for <a>CreateDeliveryStream</a>.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *        <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code>
     *        operation that reads from the S3 bucket doesn't support these compression formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Describes CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return Describes CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Describes CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getClusterJDBCURL() != null)
            sb.append("ClusterJDBCURL: " + getClusterJDBCURL() + ",");
        if (getCopyCommand() != null)
            sb.append("CopyCommand: " + getCopyCommand() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: " + getRetryOptions() + ",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: " + getS3Configuration() + ",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: " + getCloudWatchLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDestinationConfiguration == false)
            return false;
        RedshiftDestinationConfiguration other = (RedshiftDestinationConfiguration) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClusterJDBCURL() == null ^ this.getClusterJDBCURL() == null)
            return false;
        if (other.getClusterJDBCURL() != null && other.getClusterJDBCURL().equals(this.getClusterJDBCURL()) == false)
            return false;
        if (other.getCopyCommand() == null ^ this.getCopyCommand() == null)
            return false;
        if (other.getCopyCommand() != null && other.getCopyCommand().equals(this.getCopyCommand()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getClusterJDBCURL() == null) ? 0 : getClusterJDBCURL().hashCode());
        hashCode = prime * hashCode + ((getCopyCommand() == null) ? 0 : getCopyCommand().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDestinationConfiguration clone() {
        try {
            return (RedshiftDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
