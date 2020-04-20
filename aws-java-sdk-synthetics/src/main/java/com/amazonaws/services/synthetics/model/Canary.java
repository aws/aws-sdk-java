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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains all information about one canary in your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/Canary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Canary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the canary.
     * </p>
     */
    private String name;

    private CanaryCodeOutput code;
    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A structure that contains information about how often the canary is to run, and when these runs are to stop.
     * </p>
     */
    private CanaryScheduleOutput schedule;

    private CanaryRunConfigOutput runConfig;
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
     * A structure that contains information about the canary's status.
     * </p>
     */
    private CanaryStatus status;
    /**
     * <p>
     * A structure that contains information about when the canary was created, modified, and most recently run.
     * </p>
     */
    private CanaryTimeline timeline;
    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the
     * log file, screenshots, and HAR files.
     * </p>
     */
    private String artifactS3Location;
    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     * format, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     * Conditions for Lambda Actions</a>.
     * </p>
     */
    private String engineArn;
    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only valid value is <code>syn-1.0</code>. For
     * more information about runtime versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     */
    private String runtimeVersion;

    private VpcConfigOutput vpcConfig;
    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * 
     * @param id
     *        The unique ID of this canary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * 
     * @return The unique ID of this canary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * 
     * @param id
     *        The unique ID of this canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param name
     *        The name of the canary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @return The name of the canary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param name
     *        The name of the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param code
     */

    public void setCode(CanaryCodeOutput code) {
        this.code = code;
    }

    /**
     * @return
     */

    public CanaryCodeOutput getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withCode(CanaryCodeOutput code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code>
     *        as a principal in the trust policy.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy.
     * </p>
     * 
     * @return The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code>
     *         as a principal in the trust policy.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the IAM role used to run the canary. This role must include <code>lambda.amazonaws.com</code>
     *        as a principal in the trust policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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

    public void setSchedule(CanaryScheduleOutput schedule) {
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

    public CanaryScheduleOutput getSchedule() {
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

    public Canary withSchedule(CanaryScheduleOutput schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * @param runConfig
     */

    public void setRunConfig(CanaryRunConfigOutput runConfig) {
        this.runConfig = runConfig;
    }

    /**
     * @return
     */

    public CanaryRunConfigOutput getRunConfig() {
        return this.runConfig;
    }

    /**
     * @param runConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withRunConfig(CanaryRunConfigOutput runConfig) {
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

    public Canary withSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
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

    public Canary withFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        setFailureRetentionPeriodInDays(failureRetentionPeriodInDays);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     * 
     * @param status
     *        A structure that contains information about the canary's status.
     */

    public void setStatus(CanaryStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     * 
     * @return A structure that contains information about the canary's status.
     */

    public CanaryStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     * 
     * @param status
     *        A structure that contains information about the canary's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withStatus(CanaryStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created, modified, and most recently run.
     * </p>
     * 
     * @param timeline
     *        A structure that contains information about when the canary was created, modified, and most recently run.
     */

    public void setTimeline(CanaryTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created, modified, and most recently run.
     * </p>
     * 
     * @return A structure that contains information about when the canary was created, modified, and most recently run.
     */

    public CanaryTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created, modified, and most recently run.
     * </p>
     * 
     * @param timeline
     *        A structure that contains information about when the canary was created, modified, and most recently run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withTimeline(CanaryTimeline timeline) {
        setTimeline(timeline);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the
     * log file, screenshots, and HAR files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts
     *        include the log file, screenshots, and HAR files.
     */

    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the
     * log file, screenshots, and HAR files.
     * </p>
     * 
     * @return The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts
     *         include the log file, screenshots, and HAR files.
     */

    public String getArtifactS3Location() {
        return this.artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the
     * log file, screenshots, and HAR files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts
     *        include the log file, screenshots, and HAR files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withArtifactS3Location(String artifactS3Location) {
        setArtifactS3Location(artifactS3Location);
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     * format, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     * Conditions for Lambda Actions</a>.
     * </p>
     * 
     * @param engineArn
     *        The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     *        format, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     *        Conditions for Lambda Actions</a>.
     */

    public void setEngineArn(String engineArn) {
        this.engineArn = engineArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     * format, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     * Conditions for Lambda Actions</a>.
     * </p>
     * 
     * @return The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda
     *         ARN format, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     *         Conditions for Lambda Actions</a>.
     */

    public String getEngineArn() {
        return this.engineArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     * format, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     * Conditions for Lambda Actions</a>.
     * </p>
     * 
     * @param engineArn
     *        The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN
     *        format, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html">Resources and
     *        Conditions for Lambda Actions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withEngineArn(String engineArn) {
        setEngineArn(engineArn);
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

    public Canary withRuntimeVersion(String runtimeVersion) {
        setRuntimeVersion(runtimeVersion);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfigOutput vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfigOutput getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withVpcConfig(VpcConfigOutput vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @return The list of key-value pairs that are associated with the canary.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs that are associated with the canary.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs that are associated with the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Canary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Canary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Canary addTagsEntry(String key, String value) {
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

    public Canary clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTimeline() != null)
            sb.append("Timeline: ").append(getTimeline()).append(",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: ").append(getArtifactS3Location()).append(",");
        if (getEngineArn() != null)
            sb.append("EngineArn: ").append(getEngineArn()).append(",");
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

        if (obj instanceof Canary == false)
            return false;
        Canary other = (Canary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
            return false;
        if (other.getEngineArn() == null ^ this.getEngineArn() == null)
            return false;
        if (other.getEngineArn() != null && other.getEngineArn().equals(this.getEngineArn()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRunConfig() == null) ? 0 : getRunConfig().hashCode());
        hashCode = prime * hashCode + ((getSuccessRetentionPeriodInDays() == null) ? 0 : getSuccessRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getFailureRetentionPeriodInDays() == null) ? 0 : getFailureRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        hashCode = prime * hashCode + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
        hashCode = prime * hashCode + ((getEngineArn() == null) ? 0 : getEngineArn().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersion() == null) ? 0 : getRuntimeVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Canary clone() {
        try {
            return (Canary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
