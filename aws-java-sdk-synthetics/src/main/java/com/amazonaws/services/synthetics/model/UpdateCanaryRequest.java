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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UpdateCanary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCanaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the canary that you want to update. To find the names of your canaries, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * <p>
     * You cannot change the name of a canary that has already been created.
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
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * </ul>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid value is <code>syn-1.0</code>. For
     * more information about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     */
    private String runtimeVersion;
    /**
     * <p>
     * A structure that contains information about how often the canary is to run, and when these runs are to stop.
     * </p>
     */
    private CanaryScheduleInput schedule;
    /**
     * <p>
     * A structure that contains the timeout value that is used for each individual run of the canary.
     * </p>
     */
    private CanaryRunConfigInput runConfig;
    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     */
    private Integer successRetentionPeriodInDays;
    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     */
    private Integer failureRetentionPeriodInDays;
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
     * The name of the canary that you want to update. To find the names of your canaries, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * <p>
     * You cannot change the name of a canary that has already been created.
     * </p>
     * 
     * @param name
     *        The name of the canary that you want to update. To find the names of your canaries, use <a
     *        href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     *        >DescribeCanaries</a>.</p>
     *        <p>
     *        You cannot change the name of a canary that has already been created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary that you want to update. To find the names of your canaries, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * <p>
     * You cannot change the name of a canary that has already been created.
     * </p>
     * 
     * @return The name of the canary that you want to update. To find the names of your canaries, use <a
     *         href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     *         >DescribeCanaries</a>.</p>
     *         <p>
     *         You cannot change the name of a canary that has already been created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the canary that you want to update. To find the names of your canaries, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * <p>
     * You cannot change the name of a canary that has already been created.
     * </p>
     * 
     * @param name
     *        The name of the canary that you want to update. To find the names of your canaries, use <a
     *        href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     *        >DescribeCanaries</a>.</p>
     *        <p>
     *        You cannot change the name of a canary that has already been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withName(String name) {
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

    public UpdateCanaryRequest withCode(CanaryCodeInput code) {
        setCode(code);
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
     * <code>logs:CreateLogStream</code>
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
     *        <code>logs:CreateLogStream</code>
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
     * <code>logs:CreateLogStream</code>
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
     *         <code>logs:CreateLogStream</code>
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
     * <code>logs:CreateLogStream</code>
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
     *        <code>logs:CreateLogStream</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid value is <code>syn-1.0</code>. For
     * more information about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param runtimeVersion
     *        Specifies the runtime version to use for the canary. Currently, the only valid value is
     *        <code>syn-1.0</code>. For more information about runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     */

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid value is <code>syn-1.0</code>. For
     * more information about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @return Specifies the runtime version to use for the canary. Currently, the only valid value is
     *         <code>syn-1.0</code>. For more information about runtime versions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *         > Canary Runtime Versions</a>.
     */

    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid value is <code>syn-1.0</code>. For
     * more information about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param runtimeVersion
     *        Specifies the runtime version to use for the canary. Currently, the only valid value is
     *        <code>syn-1.0</code>. For more information about runtime versions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *        > Canary Runtime Versions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withRuntimeVersion(String runtimeVersion) {
        setRuntimeVersion(runtimeVersion);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run, and when these runs are to stop.
     * </p>
     * 
     * @param schedule
     *        A structure that contains information about how often the canary is to run, and when these runs are to
     *        stop.
     */

    public void setSchedule(CanaryScheduleInput schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run, and when these runs are to stop.
     * </p>
     * 
     * @return A structure that contains information about how often the canary is to run, and when these runs are to
     *         stop.
     */

    public CanaryScheduleInput getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to run, and when these runs are to stop.
     * </p>
     * 
     * @param schedule
     *        A structure that contains information about how often the canary is to run, and when these runs are to
     *        stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withSchedule(CanaryScheduleInput schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A structure that contains the timeout value that is used for each individual run of the canary.
     * </p>
     * 
     * @param runConfig
     *        A structure that contains the timeout value that is used for each individual run of the canary.
     */

    public void setRunConfig(CanaryRunConfigInput runConfig) {
        this.runConfig = runConfig;
    }

    /**
     * <p>
     * A structure that contains the timeout value that is used for each individual run of the canary.
     * </p>
     * 
     * @return A structure that contains the timeout value that is used for each individual run of the canary.
     */

    public CanaryRunConfigInput getRunConfig() {
        return this.runConfig;
    }

    /**
     * <p>
     * A structure that contains the timeout value that is used for each individual run of the canary.
     * </p>
     * 
     * @param runConfig
     *        A structure that contains the timeout value that is used for each individual run of the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withRunConfig(CanaryRunConfigInput runConfig) {
        setRunConfig(runConfig);
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * 
     * @param successRetentionPeriodInDays
     *        The number of days to retain data about successful runs of this canary.
     */

    public void setSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * 
     * @return The number of days to retain data about successful runs of this canary.
     */

    public Integer getSuccessRetentionPeriodInDays() {
        return this.successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * 
     * @param successRetentionPeriodInDays
     *        The number of days to retain data about successful runs of this canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        setSuccessRetentionPeriodInDays(successRetentionPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * 
     * @param failureRetentionPeriodInDays
     *        The number of days to retain data about failed runs of this canary.
     */

    public void setFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * 
     * @return The number of days to retain data about failed runs of this canary.
     */

    public Integer getFailureRetentionPeriodInDays() {
        return this.failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * 
     * @param failureRetentionPeriodInDays
     *        The number of days to retain data about failed runs of this canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCanaryRequest withFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        setFailureRetentionPeriodInDays(failureRetentionPeriodInDays);
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

    public UpdateCanaryRequest withVpcConfig(VpcConfigInput vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getRuntimeVersion() != null)
            sb.append("RuntimeVersion: ").append(getRuntimeVersion()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getRunConfig() != null)
            sb.append("RunConfig: ").append(getRunConfig()).append(",");
        if (getSuccessRetentionPeriodInDays() != null)
            sb.append("SuccessRetentionPeriodInDays: ").append(getSuccessRetentionPeriodInDays()).append(",");
        if (getFailureRetentionPeriodInDays() != null)
            sb.append("FailureRetentionPeriodInDays: ").append(getFailureRetentionPeriodInDays()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCanaryRequest == false)
            return false;
        UpdateCanaryRequest other = (UpdateCanaryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getRuntimeVersion() == null ^ this.getRuntimeVersion() == null)
            return false;
        if (other.getRuntimeVersion() != null && other.getRuntimeVersion().equals(this.getRuntimeVersion()) == false)
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
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersion() == null) ? 0 : getRuntimeVersion().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRunConfig() == null) ? 0 : getRunConfig().hashCode());
        hashCode = prime * hashCode + ((getSuccessRetentionPeriodInDays() == null) ? 0 : getSuccessRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getFailureRetentionPeriodInDays() == null) ? 0 : getFailureRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCanaryRequest clone() {
        return (UpdateCanaryRequest) super.clone();
    }

}
