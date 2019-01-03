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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Specifies settings to update for the trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateTrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Name</code> is a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3 Bucket
     * Naming Requirements</a>.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     */
    private String snsTopicName;
    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     */
    private Boolean includeGlobalServiceEvents;
    /**
     * <p>
     * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the
     * trail exists only in the current region and this value is set to true, shadow trails (replications of the trail)
     * will be created in the other regions. If the trail exists in all regions and this value is set to false, the
     * trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
     * </p>
     */
    private Boolean isMultiRegionTrail;
    /**
     * <p>
     * Specifies whether log file validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     */
    private Boolean enableLogFileValidation;
    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations. If the trail is not an organization trail
     * and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the
     * trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be
     * deleted from all member accounts in the organization.
     * </p>
     */
    private Boolean isOrganizationTrail;

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Name</code> is a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet
     *        the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Name</code> is a trail ARN, it must be in the format:
     *        </p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Name</code> is a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @return Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet
     *         the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>Name</code> is a trail ARN, it must be in the format:
     *         </p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Name</code> is a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name of the trail or trail ARN. If <code>Name</code> is a trail name, the string must meet
     *        the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Name</code> is a trail ARN, it must be in the format:
     *        </p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3 Bucket
     * Naming Requirements</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     *        Bucket Naming Requirements</a>.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3 Bucket
     * Naming Requirements</a>.
     * </p>
     * 
     * @return Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *         S3 Bucket Naming Requirements</a>.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3 Bucket
     * Naming Requirements</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     *        Bucket Naming Requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *        file delivery. For more information, see <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *        Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @return Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *         file delivery. For more information, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *         Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *        file delivery. For more information, see <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *        Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *        length is 256 characters.
     */

    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @return Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *         length is 256 characters.
     */

    public String getSnsTopicName() {
        return this.snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *        length is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withSnsTopicName(String snsTopicName) {
        setSnsTopicName(snsTopicName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public Boolean getIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        setIncludeGlobalServiceEvents(includeGlobalServiceEvents);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public Boolean isIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the
     * trail exists only in the current region and this value is set to true, shadow trails (replications of the trail)
     * will be created in the other regions. If the trail exists in all regions and this value is set to false, the
     * trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail applies only to the current region or to all regions. The default is false. If
     *        the trail exists only in the current region and this value is set to true, shadow trails (replications of
     *        the trail) will be created in the other regions. If the trail exists in all regions and this value is set
     *        to false, the trail will remain in the region where it was created, and its shadow trails in other regions
     *        will be deleted.
     */

    public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the
     * trail exists only in the current region and this value is set to true, shadow trails (replications of the trail)
     * will be created in the other regions. If the trail exists in all regions and this value is set to false, the
     * trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
     * </p>
     * 
     * @return Specifies whether the trail applies only to the current region or to all regions. The default is false.
     *         If the trail exists only in the current region and this value is set to true, shadow trails (replications
     *         of the trail) will be created in the other regions. If the trail exists in all regions and this value is
     *         set to false, the trail will remain in the region where it was created, and its shadow trails in other
     *         regions will be deleted.
     */

    public Boolean getIsMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the
     * trail exists only in the current region and this value is set to true, shadow trails (replications of the trail)
     * will be created in the other regions. If the trail exists in all regions and this value is set to false, the
     * trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail applies only to the current region or to all regions. The default is false. If
     *        the trail exists only in the current region and this value is set to true, shadow trails (replications of
     *        the trail) will be created in the other regions. If the trail exists in all regions and this value is set
     *        to false, the trail will remain in the region where it was created, and its shadow trails in other regions
     *        will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        setIsMultiRegionTrail(isMultiRegionTrail);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the
     * trail exists only in the current region and this value is set to true, shadow trails (replications of the trail)
     * will be created in the other regions. If the trail exists in all regions and this value is set to false, the
     * trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
     * </p>
     * 
     * @return Specifies whether the trail applies only to the current region or to all regions. The default is false.
     *         If the trail exists only in the current region and this value is set to true, shadow trails (replications
     *         of the trail) will be created in the other regions. If the trail exists in all regions and this value is
     *         set to false, the trail will remain in the region where it was created, and its shadow trails in other
     *         regions will be deleted.
     */

    public Boolean isMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether log file validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @param enableLogFileValidation
     *        Specifies whether log file validation is enabled. The default is false.</p> <note>
     *        <p>
     *        When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *        CloudTrail will not create digest files for log files that were delivered during a period in which log
     *        file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *        on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *        not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *        whenever you stop CloudTrail logging or delete a trail.
     *        </p>
     */

    public void setEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies whether log file validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @return Specifies whether log file validation is enabled. The default is false.</p> <note>
     *         <p>
     *         When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were delivered during a period in which log
     *         file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *         on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *         not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *         whenever you stop CloudTrail logging or delete a trail.
     *         </p>
     */

    public Boolean getEnableLogFileValidation() {
        return this.enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies whether log file validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @param enableLogFileValidation
     *        Specifies whether log file validation is enabled. The default is false.</p> <note>
     *        <p>
     *        When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *        CloudTrail will not create digest files for log files that were delivered during a period in which log
     *        file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *        on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *        not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *        whenever you stop CloudTrail logging or delete a trail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withEnableLogFileValidation(Boolean enableLogFileValidation) {
        setEnableLogFileValidation(enableLogFileValidation);
        return this;
    }

    /**
     * <p>
     * Specifies whether log file validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @return Specifies whether log file validation is enabled. The default is false.</p> <note>
     *         <p>
     *         When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were delivered during a period in which log
     *         file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *         on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *         not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *         whenever you stop CloudTrail logging or delete a trail.
     *         </p>
     */

    public Boolean isEnableLogFileValidation() {
        return this.enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *        log group to which CloudTrail logs will be delivered. Not required unless you specify
     *        CloudWatchLogsRoleArn.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @return Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *         log group to which CloudTrail logs will be delivered. Not required unless you specify
     *         CloudWatchLogsRoleArn.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *        log group to which CloudTrail logs will be delivered. Not required unless you specify
     *        CloudWatchLogsRoleArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @return Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *        name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *        globally unique identifier.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *         name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *         globally unique identifier.</p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *        name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *        globally unique identifier.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations. If the trail is not an organization trail
     * and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the
     * trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be
     * deleted from all member accounts in the organization.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only
     *        for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of
     *        an AWS account that is the master account for an organization in AWS Organizations. If the trail is not an
     *        organization trail and this is set to true, the trail will be created in all AWS accounts that belong to
     *        the organization. If the trail is an organization trail and this is set to false, the trail will remain in
     *        the current AWS account but be deleted from all member accounts in the organization.
     */

    public void setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations. If the trail is not an organization trail
     * and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the
     * trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be
     * deleted from all member accounts in the organization.
     * </p>
     * 
     * @return Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only
     *         for the current AWS account. The default is false, and cannot be true unless the call is made on behalf
     *         of an AWS account that is the master account for an organization in AWS Organizations. If the trail is
     *         not an organization trail and this is set to true, the trail will be created in all AWS accounts that
     *         belong to the organization. If the trail is an organization trail and this is set to false, the trail
     *         will remain in the current AWS account but be deleted from all member accounts in the organization.
     */

    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations. If the trail is not an organization trail
     * and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the
     * trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be
     * deleted from all member accounts in the organization.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only
     *        for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of
     *        an AWS account that is the master account for an organization in AWS Organizations. If the trail is not an
     *        organization trail and this is set to true, the trail will be created in all AWS accounts that belong to
     *        the organization. If the trail is an organization trail and this is set to false, the trail will remain in
     *        the current AWS account but be deleted from all member accounts in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrailRequest withIsOrganizationTrail(Boolean isOrganizationTrail) {
        setIsOrganizationTrail(isOrganizationTrail);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations. If the trail is not an organization trail
     * and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the
     * trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be
     * deleted from all member accounts in the organization.
     * </p>
     * 
     * @return Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only
     *         for the current AWS account. The default is false, and cannot be true unless the call is made on behalf
     *         of an AWS account that is the master account for an organization in AWS Organizations. If the trail is
     *         not an organization trail and this is set to true, the trail will be created in all AWS accounts that
     *         belong to the organization. If the trail is an organization trail and this is set to false, the trail
     *         will remain in the current AWS account but be deleted from all member accounts in the organization.
     */

    public Boolean isOrganizationTrail() {
        return this.isOrganizationTrail;
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getSnsTopicName() != null)
            sb.append("SnsTopicName: ").append(getSnsTopicName()).append(",");
        if (getIncludeGlobalServiceEvents() != null)
            sb.append("IncludeGlobalServiceEvents: ").append(getIncludeGlobalServiceEvents()).append(",");
        if (getIsMultiRegionTrail() != null)
            sb.append("IsMultiRegionTrail: ").append(getIsMultiRegionTrail()).append(",");
        if (getEnableLogFileValidation() != null)
            sb.append("EnableLogFileValidation: ").append(getEnableLogFileValidation()).append(",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getIsOrganizationTrail() != null)
            sb.append("IsOrganizationTrail: ").append(getIsOrganizationTrail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrailRequest == false)
            return false;
        UpdateTrailRequest other = (UpdateTrailRequest) obj;
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
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null)
            return false;
        if (other.getSnsTopicName() != null && other.getSnsTopicName().equals(this.getSnsTopicName()) == false)
            return false;
        if (other.getIncludeGlobalServiceEvents() == null ^ this.getIncludeGlobalServiceEvents() == null)
            return false;
        if (other.getIncludeGlobalServiceEvents() != null && other.getIncludeGlobalServiceEvents().equals(this.getIncludeGlobalServiceEvents()) == false)
            return false;
        if (other.getIsMultiRegionTrail() == null ^ this.getIsMultiRegionTrail() == null)
            return false;
        if (other.getIsMultiRegionTrail() != null && other.getIsMultiRegionTrail().equals(this.getIsMultiRegionTrail()) == false)
            return false;
        if (other.getEnableLogFileValidation() == null ^ this.getEnableLogFileValidation() == null)
            return false;
        if (other.getEnableLogFileValidation() != null && other.getEnableLogFileValidation().equals(this.getEnableLogFileValidation()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getIsOrganizationTrail() == null ^ this.getIsOrganizationTrail() == null)
            return false;
        if (other.getIsOrganizationTrail() != null && other.getIsOrganizationTrail().equals(this.getIsOrganizationTrail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicName() == null) ? 0 : getSnsTopicName().hashCode());
        hashCode = prime * hashCode + ((getIncludeGlobalServiceEvents() == null) ? 0 : getIncludeGlobalServiceEvents().hashCode());
        hashCode = prime * hashCode + ((getIsMultiRegionTrail() == null) ? 0 : getIsMultiRegionTrail().hashCode());
        hashCode = prime * hashCode + ((getEnableLogFileValidation() == null) ? 0 : getEnableLogFileValidation().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getIsOrganizationTrail() == null) ? 0 : getIsOrganizationTrail().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrailRequest clone() {
        return (UpdateTrailRequest) super.clone();
    }

}
