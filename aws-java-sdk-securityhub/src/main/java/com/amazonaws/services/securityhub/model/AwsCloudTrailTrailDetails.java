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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a CloudTrail trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudTrailTrailDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudTrailTrailDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the log group that CloudTrail logs are delivered to.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * Indicates whether the trail has custom event selectors.
     * </p>
     */
    private Boolean hasCustomEventSelectors;
    /**
     * <p>
     * The Region where the trail was created.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * Indicates whether the trail publishes events from global services such as IAM to the log files.
     * </p>
     */
    private Boolean includeGlobalServiceEvents;
    /**
     * <p>
     * Indicates whether the trail applies only to the current Region or to all Regions.
     * </p>
     */
    private Boolean isMultiRegionTrail;
    /**
     * <p>
     * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current
     * AWS account.
     * </p>
     */
    private Boolean isOrganizationTrail;
    /**
     * <p>
     * The AWS KMS key ID to use to encrypt the logs.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Indicates whether CloudTrail log file validation is enabled.
     * </p>
     */
    private Boolean logFileValidationEnabled;
    /**
     * <p>
     * The name of the trail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the S3 bucket where the log files are published.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The ARN of the SNS topic that is used for notifications of log file delivery.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The name of the SNS topic that is used for notifications of log file delivery.
     * </p>
     */
    private String snsTopicName;
    /**
     * <p>
     * The ARN of the trail.
     * </p>
     */
    private String trailArn;

    /**
     * <p>
     * The ARN of the log group that CloudTrail logs are delivered to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the log group that CloudTrail logs are delivered to.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the log group that CloudTrail logs are delivered to.
     * </p>
     * 
     * @return The ARN of the log group that CloudTrail logs are delivered to.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the log group that CloudTrail logs are delivered to.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        The ARN of the log group that CloudTrail logs are delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     * </p>
     * 
     * @return The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trail has custom event selectors.
     * </p>
     * 
     * @param hasCustomEventSelectors
     *        Indicates whether the trail has custom event selectors.
     */

    public void setHasCustomEventSelectors(Boolean hasCustomEventSelectors) {
        this.hasCustomEventSelectors = hasCustomEventSelectors;
    }

    /**
     * <p>
     * Indicates whether the trail has custom event selectors.
     * </p>
     * 
     * @return Indicates whether the trail has custom event selectors.
     */

    public Boolean getHasCustomEventSelectors() {
        return this.hasCustomEventSelectors;
    }

    /**
     * <p>
     * Indicates whether the trail has custom event selectors.
     * </p>
     * 
     * @param hasCustomEventSelectors
     *        Indicates whether the trail has custom event selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withHasCustomEventSelectors(Boolean hasCustomEventSelectors) {
        setHasCustomEventSelectors(hasCustomEventSelectors);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trail has custom event selectors.
     * </p>
     * 
     * @return Indicates whether the trail has custom event selectors.
     */

    public Boolean isHasCustomEventSelectors() {
        return this.hasCustomEventSelectors;
    }

    /**
     * <p>
     * The Region where the trail was created.
     * </p>
     * 
     * @param homeRegion
     *        The Region where the trail was created.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The Region where the trail was created.
     * </p>
     * 
     * @return The Region where the trail was created.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The Region where the trail was created.
     * </p>
     * 
     * @param homeRegion
     *        The Region where the trail was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trail publishes events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Indicates whether the trail publishes events from global services such as IAM to the log files.
     */

    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Indicates whether the trail publishes events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Indicates whether the trail publishes events from global services such as IAM to the log files.
     */

    public Boolean getIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Indicates whether the trail publishes events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Indicates whether the trail publishes events from global services such as IAM to the log files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        setIncludeGlobalServiceEvents(includeGlobalServiceEvents);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trail publishes events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Indicates whether the trail publishes events from global services such as IAM to the log files.
     */

    public Boolean isIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Indicates whether the trail applies only to the current Region or to all Regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Indicates whether the trail applies only to the current Region or to all Regions.
     */

    public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    /**
     * <p>
     * Indicates whether the trail applies only to the current Region or to all Regions.
     * </p>
     * 
     * @return Indicates whether the trail applies only to the current Region or to all Regions.
     */

    public Boolean getIsMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Indicates whether the trail applies only to the current Region or to all Regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Indicates whether the trail applies only to the current Region or to all Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        setIsMultiRegionTrail(isMultiRegionTrail);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trail applies only to the current Region or to all Regions.
     * </p>
     * 
     * @return Indicates whether the trail applies only to the current Region or to all Regions.
     */

    public Boolean isMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current
     * AWS account.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     *        current AWS account.
     */

    public void setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
    }

    /**
     * <p>
     * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current
     * AWS account.
     * </p>
     * 
     * @return Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     *         current AWS account.
     */

    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * <p>
     * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current
     * AWS account.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withIsOrganizationTrail(Boolean isOrganizationTrail) {
        setIsOrganizationTrail(isOrganizationTrail);
        return this;
    }

    /**
     * <p>
     * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current
     * AWS account.
     * </p>
     * 
     * @return Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     *         current AWS account.
     */

    public Boolean isOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * <p>
     * The AWS KMS key ID to use to encrypt the logs.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID to use to encrypt the logs.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID to use to encrypt the logs.
     * </p>
     * 
     * @return The AWS KMS key ID to use to encrypt the logs.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID to use to encrypt the logs.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID to use to encrypt the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Indicates whether CloudTrail log file validation is enabled.
     * </p>
     * 
     * @param logFileValidationEnabled
     *        Indicates whether CloudTrail log file validation is enabled.
     */

    public void setLogFileValidationEnabled(Boolean logFileValidationEnabled) {
        this.logFileValidationEnabled = logFileValidationEnabled;
    }

    /**
     * <p>
     * Indicates whether CloudTrail log file validation is enabled.
     * </p>
     * 
     * @return Indicates whether CloudTrail log file validation is enabled.
     */

    public Boolean getLogFileValidationEnabled() {
        return this.logFileValidationEnabled;
    }

    /**
     * <p>
     * Indicates whether CloudTrail log file validation is enabled.
     * </p>
     * 
     * @param logFileValidationEnabled
     *        Indicates whether CloudTrail log file validation is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withLogFileValidationEnabled(Boolean logFileValidationEnabled) {
        setLogFileValidationEnabled(logFileValidationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether CloudTrail log file validation is enabled.
     * </p>
     * 
     * @return Indicates whether CloudTrail log file validation is enabled.
     */

    public Boolean isLogFileValidationEnabled() {
        return this.logFileValidationEnabled;
    }

    /**
     * <p>
     * The name of the trail.
     * </p>
     * 
     * @param name
     *        The name of the trail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trail.
     * </p>
     * 
     * @return The name of the trail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trail.
     * </p>
     * 
     * @param name
     *        The name of the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket where the log files are published.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @return The name of the S3 bucket where the log files are published.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket where the log files are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are
     *        published.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @return The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are
     *         published.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are
     *        published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the SNS topic that is used for notifications of log file delivery.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @return The ARN of the SNS topic that is used for notifications of log file delivery.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the SNS topic that is used for notifications of log file delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The name of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @param snsTopicName
     *        The name of the SNS topic that is used for notifications of log file delivery.
     */

    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    /**
     * <p>
     * The name of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @return The name of the SNS topic that is used for notifications of log file delivery.
     */

    public String getSnsTopicName() {
        return this.snsTopicName;
    }

    /**
     * <p>
     * The name of the SNS topic that is used for notifications of log file delivery.
     * </p>
     * 
     * @param snsTopicName
     *        The name of the SNS topic that is used for notifications of log file delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withSnsTopicName(String snsTopicName) {
        setSnsTopicName(snsTopicName);
        return this;
    }

    /**
     * <p>
     * The ARN of the trail.
     * </p>
     * 
     * @param trailArn
     *        The ARN of the trail.
     */

    public void setTrailArn(String trailArn) {
        this.trailArn = trailArn;
    }

    /**
     * <p>
     * The ARN of the trail.
     * </p>
     * 
     * @return The ARN of the trail.
     */

    public String getTrailArn() {
        return this.trailArn;
    }

    /**
     * <p>
     * The ARN of the trail.
     * </p>
     * 
     * @param trailArn
     *        The ARN of the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudTrailTrailDetails withTrailArn(String trailArn) {
        setTrailArn(trailArn);
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
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn()).append(",");
        if (getHasCustomEventSelectors() != null)
            sb.append("HasCustomEventSelectors: ").append(getHasCustomEventSelectors()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getIncludeGlobalServiceEvents() != null)
            sb.append("IncludeGlobalServiceEvents: ").append(getIncludeGlobalServiceEvents()).append(",");
        if (getIsMultiRegionTrail() != null)
            sb.append("IsMultiRegionTrail: ").append(getIsMultiRegionTrail()).append(",");
        if (getIsOrganizationTrail() != null)
            sb.append("IsOrganizationTrail: ").append(getIsOrganizationTrail()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLogFileValidationEnabled() != null)
            sb.append("LogFileValidationEnabled: ").append(getLogFileValidationEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsTopicName() != null)
            sb.append("SnsTopicName: ").append(getSnsTopicName()).append(",");
        if (getTrailArn() != null)
            sb.append("TrailArn: ").append(getTrailArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudTrailTrailDetails == false)
            return false;
        AwsCloudTrailTrailDetails other = (AwsCloudTrailTrailDetails) obj;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getHasCustomEventSelectors() == null ^ this.getHasCustomEventSelectors() == null)
            return false;
        if (other.getHasCustomEventSelectors() != null && other.getHasCustomEventSelectors().equals(this.getHasCustomEventSelectors()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getIncludeGlobalServiceEvents() == null ^ this.getIncludeGlobalServiceEvents() == null)
            return false;
        if (other.getIncludeGlobalServiceEvents() != null && other.getIncludeGlobalServiceEvents().equals(this.getIncludeGlobalServiceEvents()) == false)
            return false;
        if (other.getIsMultiRegionTrail() == null ^ this.getIsMultiRegionTrail() == null)
            return false;
        if (other.getIsMultiRegionTrail() != null && other.getIsMultiRegionTrail().equals(this.getIsMultiRegionTrail()) == false)
            return false;
        if (other.getIsOrganizationTrail() == null ^ this.getIsOrganizationTrail() == null)
            return false;
        if (other.getIsOrganizationTrail() != null && other.getIsOrganizationTrail().equals(this.getIsOrganizationTrail()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLogFileValidationEnabled() == null ^ this.getLogFileValidationEnabled() == null)
            return false;
        if (other.getLogFileValidationEnabled() != null && other.getLogFileValidationEnabled().equals(this.getLogFileValidationEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null)
            return false;
        if (other.getSnsTopicName() != null && other.getSnsTopicName().equals(this.getSnsTopicName()) == false)
            return false;
        if (other.getTrailArn() == null ^ this.getTrailArn() == null)
            return false;
        if (other.getTrailArn() != null && other.getTrailArn().equals(this.getTrailArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode + ((getHasCustomEventSelectors() == null) ? 0 : getHasCustomEventSelectors().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getIncludeGlobalServiceEvents() == null) ? 0 : getIncludeGlobalServiceEvents().hashCode());
        hashCode = prime * hashCode + ((getIsMultiRegionTrail() == null) ? 0 : getIsMultiRegionTrail().hashCode());
        hashCode = prime * hashCode + ((getIsOrganizationTrail() == null) ? 0 : getIsOrganizationTrail().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLogFileValidationEnabled() == null) ? 0 : getLogFileValidationEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicName() == null) ? 0 : getSnsTopicName().hashCode());
        hashCode = prime * hashCode + ((getTrailArn() == null) ? 0 : getTrailArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudTrailTrailDetails clone() {
        try {
            return (AwsCloudTrailTrailDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudTrailTrailDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
