/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateCanary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCanaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that includes the entry point from which the canary should start running your script. If the script
     * is stored in an S3 bucket, the bucket name, key, and version are also included.
     * </p>
     */
    private CanaryCodeInput code;
    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include
     * the log file, screenshots, and HAR files.
     * </p>
     */
    private String artifactS3Location;
    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:PutLogEvents</code>
     * </p>
     * </li>
     * </ul>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A structure that contains information about how often the canary is to run and when these test runs are to stop.
     * </p>
     */
    private CanaryScheduleInput schedule;
    /**
     * <p>
     * A structure that contains the configuration for individual canary runs, such as timeout value.
     * </p>
     */
    private CanaryRunConfigInput runConfig;
    /**
     * <p>
     * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     */
    private Integer successRetentionPeriodInDays;
    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     */
    private Integer failureRetentionPeriodInDays;
    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid values are
     * <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more information
     * about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     */
    private String runtimeVersion;
    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security
     * groups of the VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     * Running a Canary in a VPC</a>.
     * </p>
     */
    private VpcConfigInput vpcConfig;
    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param name
     *        The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries
     *        in your account.</p>
     *        <p>
     *        Do not include secrets or proprietary information in your canary names. The canary name makes up part of
     *        the canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">
     *        Security Considerations for Synthetics Canaries</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @return The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries
     *         in your account.</p>
     *         <p>
     *         Do not include secrets or proprietary information in your canary names. The canary name makes up part of
     *         the canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">
     *         Security Considerations for Synthetics Canaries</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param name
     *        The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries
     *        in your account.</p>
     *        <p>
     *        Do not include secrets or proprietary information in your canary names. The canary name makes up part of
     *        the canary ARN, and the ARN is included in outbound calls over the internet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">
     *        Security Considerations for Synthetics Canaries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should start running your script. If the script
     * is stored in an S3 bucket, the bucket name, key, and version are also included.
     * </p>
     * 
     * @param code
     *        A structure that includes the entry point from which the canary should start running your script. If the
     *        script is stored in an S3 bucket, the bucket name, key, and version are also included.
     */

    public void setCode(CanaryCodeInput code) {
        this.code = code;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should start running your script. If the script
     * is stored in an S3 bucket, the bucket name, key, and version are also included.
     * </p>
     * 
     * @return A structure that includes the entry point from which the canary should start running your script. If the
     *         script is stored in an S3 bucket, the bucket name, key, and version are also included.
     */

    public CanaryCodeInput getCode() {
        return this.code;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should start running your script. If the script
     * is stored in an S3 bucket, the bucket name, key, and version are also included.
     * </p>
     * 
     * @param code
     *        A structure that includes the entry point from which the canary should start running your script. If the
     *        script is stored in an S3 bucket, the bucket name, key, and version are also included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withCode(CanaryCodeInput code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include
     * the log file, screenshots, and HAR files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts
     *        include the log file, screenshots, and HAR files.
     */

    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include
     * the log file, screenshots, and HAR files.
     * </p>
     * 
     * @return The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts
     *         include the log file, screenshots, and HAR files.
     */

    public String getArtifactS3Location() {
        return this.artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include
     * the log file, screenshots, and HAR files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts
     *        include the log file, screenshots, and HAR files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withArtifactS3Location(String artifactS3Location) {
        setArtifactS3Location(artifactS3Location);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:PutLogEvents</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param executionRoleArn
     *        The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     *        <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the
     *        following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListAllMyBuckets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cloudwatch:PutMetricData</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:CreateLogGroup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:CreateLogStream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:PutLogEvents</code>
     *        </p>
     *        </li>
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:PutLogEvents</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     *         <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the
     *         following permissions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3:PutObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketLocation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:ListAllMyBuckets</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cloudwatch:PutMetricData</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:CreateLogGroup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:CreateLogStream</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:PutLogEvents</code>
     *         </p>
     *         </li>
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:PutLogEvents</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param executionRoleArn
     *        The ARN of the IAM role to be used to run the canary. This role must already exist, and must include
     *        <code>lambda.amazonaws.com</code> as a principal in the trust policy. The role must also have the
     *        following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListAllMyBuckets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cloudwatch:PutMetricData</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:CreateLogGroup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:CreateLogStream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logs:PutLogEvents</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run and when these test runs are to stop.
     * </p>
     * 
     * @param schedule
     *        A structure that contains information about how often the canary is to run and when these test runs are to
     *        stop.
     */

    public void setSchedule(CanaryScheduleInput schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run and when these test runs are to stop.
     * </p>
     * 
     * @return A structure that contains information about how often the canary is to run and when these test runs are
     *         to stop.
     */

    public CanaryScheduleInput getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run and when these test runs are to stop.
     * </p>
     * 
     * @param schedule
     *        A structure that contains information about how often the canary is to run and when these test runs are to
     *        stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withSchedule(CanaryScheduleInput schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs, such as timeout value.
     * </p>
     * 
     * @param runConfig
     *        A structure that contains the configuration for individual canary runs, such as timeout value.
     */

    public void setRunConfig(CanaryRunConfigInput runConfig) {
        this.runConfig = runConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs, such as timeout value.
     * </p>
     * 
     * @return A structure that contains the configuration for individual canary runs, such as timeout value.
     */

    public CanaryRunConfigInput getRunConfig() {
        return this.runConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs, such as timeout value.
     * </p>
     * 
     * @param runConfig
     *        A structure that contains the configuration for individual canary runs, such as timeout value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withRunConfig(CanaryRunConfigInput runConfig) {
        setRunConfig(runConfig);
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @param successRetentionPeriodInDays
     *        The number of days to retain data about successful runs of this canary. If you omit this field, the
     *        default of 31 days is used. The valid range is 1 to 455 days.
     */

    public void setSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @return The number of days to retain data about successful runs of this canary. If you omit this field, the
     *         default of 31 days is used. The valid range is 1 to 455 days.
     */

    public Integer getSuccessRetentionPeriodInDays() {
        return this.successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @param successRetentionPeriodInDays
     *        The number of days to retain data about successful runs of this canary. If you omit this field, the
     *        default of 31 days is used. The valid range is 1 to 455 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        setSuccessRetentionPeriodInDays(successRetentionPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @param failureRetentionPeriodInDays
     *        The number of days to retain data about failed runs of this canary. If you omit this field, the default of
     *        31 days is used. The valid range is 1 to 455 days.
     */

    public void setFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @return The number of days to retain data about failed runs of this canary. If you omit this field, the default
     *         of 31 days is used. The valid range is 1 to 455 days.
     */

    public Integer getFailureRetentionPeriodInDays() {
        return this.failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31
     * days is used. The valid range is 1 to 455 days.
     * </p>
     * 
     * @param failureRetentionPeriodInDays
     *        The number of days to retain data about failed runs of this canary. If you omit this field, the default of
     *        31 days is used. The valid range is 1 to 455 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        setFailureRetentionPeriodInDays(failureRetentionPeriodInDays);
        return this;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid values are
     * <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more information
     * about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param runtimeVersion
     *        Specifies the runtime version to use for the canary. Currently, the only valid values are
     *        <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more
     *        information about runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     */

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid values are
     * <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more information
     * about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @return Specifies the runtime version to use for the canary. Currently, the only valid values are
     *         <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more
     *         information about runtime versions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *         > Canary Runtime Versions</a>.
     */

    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid values are
     * <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more information
     * about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param runtimeVersion
     *        Specifies the runtime version to use for the canary. Currently, the only valid values are
     *        <code>syn-nodejs-2.0</code>, <code>syn-nodejs-2.0-beta</code>, and <code>syn-1.0</code>. For more
     *        information about runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withRuntimeVersion(String runtimeVersion) {
        setRuntimeVersion(runtimeVersion);
        return this;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security
     * groups of the VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     * Running a Canary in a VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and
     *        security groups of the VPC endpoint. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     *        Running a Canary in a VPC</a>.
     */

    public void setVpcConfig(VpcConfigInput vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security
     * groups of the VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     * Running a Canary in a VPC</a>.
     * </p>
     * 
     * @return If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and
     *         security groups of the VPC endpoint. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     *         Running a Canary in a VPC</a>.
     */

    public VpcConfigInput getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security
     * groups of the VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     * Running a Canary in a VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and
     *        security groups of the VPC endpoint. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html">
     *        Running a Canary in a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withVpcConfig(VpcConfigInput vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a
     *         canary.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user
     *         permissions, by granting a user permission to access or change only the resources that have certain tag
     *         values.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a
     *        canary.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only the resources that have certain tag values.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a
     *        canary.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only the resources that have certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCanaryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCanaryRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: ").append(getArtifactS3Location()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getRunConfig() != null)
            sb.append("RunConfig: ").append(getRunConfig()).append(",");
        if (getSuccessRetentionPeriodInDays() != null)
            sb.append("SuccessRetentionPeriodInDays: ").append(getSuccessRetentionPeriodInDays()).append(",");
        if (getFailureRetentionPeriodInDays() != null)
            sb.append("FailureRetentionPeriodInDays: ").append(getFailureRetentionPeriodInDays()).append(",");
        if (getRuntimeVersion() != null)
            sb.append("RuntimeVersion: ").append(getRuntimeVersion()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCanaryRequest == false)
            return false;
        CreateCanaryRequest other = (CreateCanaryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRunConfig() == null ^ this.getRunConfig() == null)
            return false;
        if (other.getRunConfig() != null && other.getRunConfig().equals(this.getRunConfig()) == false)
            return false;
        if (other.getSuccessRetentionPeriodInDays() == null ^ this.getSuccessRetentionPeriodInDays() == null)
            return false;
        if (other.getSuccessRetentionPeriodInDays() != null && other.getSuccessRetentionPeriodInDays().equals(this.getSuccessRetentionPeriodInDays()) == false)
            return false;
        if (other.getFailureRetentionPeriodInDays() == null ^ this.getFailureRetentionPeriodInDays() == null)
            return false;
        if (other.getFailureRetentionPeriodInDays() != null && other.getFailureRetentionPeriodInDays().equals(this.getFailureRetentionPeriodInDays()) == false)
            return false;
        if (other.getRuntimeVersion() == null ^ this.getRuntimeVersion() == null)
            return false;
        if (other.getRuntimeVersion() != null && other.getRuntimeVersion().equals(this.getRuntimeVersion()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRunConfig() == null) ? 0 : getRunConfig().hashCode());
        hashCode = prime * hashCode + ((getSuccessRetentionPeriodInDays() == null) ? 0 : getSuccessRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getFailureRetentionPeriodInDays() == null) ? 0 : getFailureRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersion() == null) ? 0 : getRuntimeVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCanaryRequest clone() {
        return (CreateCanaryRequest) super.clone();
    }

}
