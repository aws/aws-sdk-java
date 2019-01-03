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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an update for a destination in Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/RedshiftDestinationUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDestinationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
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
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value
     * is 3600 (60 minutes).
     * </p>
     */
    private RedshiftRetryOptions retryOptions;
    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation that
     * reads from the S3 bucket doesn't support these compression formats.
     * </p>
     */
    private S3DestinationUpdate s3Update;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     */
    private String s3BackupMode;
    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     */
    private S3DestinationUpdate s3BackupUpdate;
    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withRoleARN(String roleARN) {
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

    public RedshiftDestinationUpdate withClusterJDBCURL(String clusterJDBCURL) {
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

    public RedshiftDestinationUpdate withCopyCommand(CopyCommand copyCommand) {
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

    public RedshiftDestinationUpdate withUsername(String username) {
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

    public RedshiftDestinationUpdate withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value
     * is 3600 (60 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.
     *        Default value is 3600 (60 minutes).
     */

    public void setRetryOptions(RedshiftRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value
     * is 3600 (60 minutes).
     * </p>
     * 
     * @return The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.
     *         Default value is 3600 (60 minutes).
     */

    public RedshiftRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value
     * is 3600 (60 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.
     *        Default value is 3600 (60 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withRetryOptions(RedshiftRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation that
     * reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *        <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation
     *        that reads from the S3 bucket doesn't support these compression formats.
     */

    public void setS3Update(S3DestinationUpdate s3Update) {
        this.s3Update = s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation that
     * reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @return The Amazon S3 destination.</p>
     *         <p>
     *         The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *         <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation
     *         that reads from the S3 bucket doesn't support these compression formats.
     */

    public S3DestinationUpdate getS3Update() {
        return this.s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation that
     * reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     *        <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon Redshift <code>COPY</code> operation
     *        that reads from the S3 bucket doesn't support these compression formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
        return this;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @return The data processing configuration.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @see RedshiftS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @return The Amazon S3 backup mode.
     * @see RedshiftS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftS3BackupMode
     */

    public RedshiftDestinationUpdate withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @see RedshiftS3BackupMode
     */

    public void setS3BackupMode(RedshiftS3BackupMode s3BackupMode) {
        withS3BackupMode(s3BackupMode);
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftS3BackupMode
     */

    public RedshiftDestinationUpdate withS3BackupMode(RedshiftS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @param s3BackupUpdate
     *        The Amazon S3 destination for backup.
     */

    public void setS3BackupUpdate(S3DestinationUpdate s3BackupUpdate) {
        this.s3BackupUpdate = s3BackupUpdate;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @return The Amazon S3 destination for backup.
     */

    public S3DestinationUpdate getS3BackupUpdate() {
        return this.s3BackupUpdate;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @param s3BackupUpdate
     *        The Amazon S3 destination for backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withS3BackupUpdate(S3DestinationUpdate s3BackupUpdate) {
        setS3BackupUpdate(s3BackupUpdate);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The Amazon CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getClusterJDBCURL() != null)
            sb.append("ClusterJDBCURL: ").append(getClusterJDBCURL()).append(",");
        if (getCopyCommand() != null)
            sb.append("CopyCommand: ").append(getCopyCommand()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3Update() != null)
            sb.append("S3Update: ").append(getS3Update()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3BackupUpdate() != null)
            sb.append("S3BackupUpdate: ").append(getS3BackupUpdate()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDestinationUpdate == false)
            return false;
        RedshiftDestinationUpdate other = (RedshiftDestinationUpdate) obj;
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
        if (other.getS3Update() == null ^ this.getS3Update() == null)
            return false;
        if (other.getS3Update() != null && other.getS3Update().equals(this.getS3Update()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3BackupUpdate() == null ^ this.getS3BackupUpdate() == null)
            return false;
        if (other.getS3BackupUpdate() != null && other.getS3BackupUpdate().equals(this.getS3BackupUpdate()) == false)
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
        hashCode = prime * hashCode + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3BackupUpdate() == null) ? 0 : getS3BackupUpdate().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDestinationUpdate clone() {
        try {
            return (RedshiftDestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.RedshiftDestinationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
