/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#createTrail(CreateTrailRequest) CreateTrail operation}.
 * <p>
 * Creates a trail that specifies the settings for delivery of log data
 * to an Amazon S3 bucket.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#createTrail(CreateTrailRequest)
 */
public class CreateTrailRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specifies the name of the trail. The name must meet the following
     * requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     * (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     * a letter or number, and end with a letter or number</li> <li>Be
     * between 3 and 128 characters</li> <li>Have no adjacent periods,
     * underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     * format (for example, 192.168.5.4)</li> </ul>
     */
    private String name;

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing
     * log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     * S3 Bucket Naming Requirements</a>.
     */
    private String s3BucketName;

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     * Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */
    private String s3KeyPrefix;

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. The maximum length is 256 characters.
     */
    private String snsTopicName;

    /**
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     */
    private Boolean includeGlobalServiceEvents;

    /**
     * Specifies whether log file integrity validation is enabled. The
     * default is false. <note>When you disable log file integrity
     * validation, the chain of digest files is broken after one hour.
     * CloudTrail will not create digest files for log files that were
     * delivered during a period in which log file integrity validation was
     * disabled. For example, if you enable log file integrity validation at
     * noon on January 1, disable it at noon on January 2, and re-enable it
     * at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same
     * applies whenever you stop CloudTrail logging or delete a trail.</note>
     */
    private Boolean enableLogFileValidation;

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a
     * unique identifier that represents the log group to which CloudTrail
     * logs will be delivered. Not required unless you specify
     * CloudWatchLogsRoleArn.
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write
     * to a user's log group.
     */
    private String cloudWatchLogsRoleArn;

    /**
     * Specifies the KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. The value can be a an alias name prefixed by "alias/", a
     * fully specified ARN to an alias, a fully specified ARN to a key, or a
     * globally unique identifier. <p>Examples: <ul>
     * <li>alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>12345678-1234-1234-1234-123456789012</li> </ul>
     */
    private String kmsKeyId;

    /**
     * Specifies the name of the trail. The name must meet the following
     * requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     * (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     * a letter or number, and end with a letter or number</li> <li>Be
     * between 3 and 128 characters</li> <li>Have no adjacent periods,
     * underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     * format (for example, 192.168.5.4)</li> </ul>
     *
     * @return Specifies the name of the trail. The name must meet the following
     *         requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     *         (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     *         a letter or number, and end with a letter or number</li> <li>Be
     *         between 3 and 128 characters</li> <li>Have no adjacent periods,
     *         underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     *         format (for example, 192.168.5.4)</li> </ul>
     */
    public String getName() {
        return name;
    }
    
    /**
     * Specifies the name of the trail. The name must meet the following
     * requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     * (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     * a letter or number, and end with a letter or number</li> <li>Be
     * between 3 and 128 characters</li> <li>Have no adjacent periods,
     * underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     * format (for example, 192.168.5.4)</li> </ul>
     *
     * @param name Specifies the name of the trail. The name must meet the following
     *         requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     *         (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     *         a letter or number, and end with a letter or number</li> <li>Be
     *         between 3 and 128 characters</li> <li>Have no adjacent periods,
     *         underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     *         format (for example, 192.168.5.4)</li> </ul>
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Specifies the name of the trail. The name must meet the following
     * requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     * (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     * a letter or number, and end with a letter or number</li> <li>Be
     * between 3 and 128 characters</li> <li>Have no adjacent periods,
     * underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     * format (for example, 192.168.5.4)</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Specifies the name of the trail. The name must meet the following
     *         requirements: <ul> <li>Contain only ASCII letters (a-z, A-Z), numbers
     *         (0-9), periods (.), underscores (_), or dashes (-)</li> <li>Start with
     *         a letter or number, and end with a letter or number</li> <li>Be
     *         between 3 and 128 characters</li> <li>Have no adjacent periods,
     *         underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.</li> <li>Not be in IP address
     *         format (for example, 192.168.5.4)</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing
     * log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     * S3 Bucket Naming Requirements</a>.
     *
     * @return Specifies the name of the Amazon S3 bucket designated for publishing
     *         log files. See <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *         S3 Bucket Naming Requirements</a>.
     */
    public String getS3BucketName() {
        return s3BucketName;
    }
    
    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing
     * log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     * S3 Bucket Naming Requirements</a>.
     *
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing
     *         log files. See <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *         S3 Bucket Naming Requirements</a>.
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }
    
    /**
     * Specifies the name of the Amazon S3 bucket designated for publishing
     * log files. See <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     * S3 Bucket Naming Requirements</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketName Specifies the name of the Amazon S3 bucket designated for publishing
     *         log files. See <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *         S3 Bucket Naming Requirements</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     * Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     *
     * @return Specifies the Amazon S3 key prefix that comes after the name of the
     *         bucket you have designated for log file delivery. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *         Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     * Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     *
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the
     *         bucket you have designated for log file delivery. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *         Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     * Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix Specifies the Amazon S3 key prefix that comes after the name of the
     *         bucket you have designated for log file delivery. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *         Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. The maximum length is 256 characters.
     *
     * @return Specifies the name of the Amazon SNS topic defined for notification of
     *         log file delivery. The maximum length is 256 characters.
     */
    public String getSnsTopicName() {
        return snsTopicName;
    }
    
    /**
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. The maximum length is 256 characters.
     *
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     *         log file delivery. The maximum length is 256 characters.
     */
    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }
    
    /**
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery. The maximum length is 256 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicName Specifies the name of the Amazon SNS topic defined for notification of
     *         log file delivery. The maximum length is 256 characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
        return this;
    }

    /**
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     *
     * @return Specifies whether the trail is publishing events from global services
     *         such as IAM to the log files.
     */
    public Boolean isIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }
    
    /**
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     *
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from global services
     *         such as IAM to the log files.
     */
    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }
    
    /**
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeGlobalServiceEvents Specifies whether the trail is publishing events from global services
     *         such as IAM to the log files.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        return this;
    }

    /**
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     *
     * @return Specifies whether the trail is publishing events from global services
     *         such as IAM to the log files.
     */
    public Boolean getIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }

    /**
     * Specifies whether log file integrity validation is enabled. The
     * default is false. <note>When you disable log file integrity
     * validation, the chain of digest files is broken after one hour.
     * CloudTrail will not create digest files for log files that were
     * delivered during a period in which log file integrity validation was
     * disabled. For example, if you enable log file integrity validation at
     * noon on January 1, disable it at noon on January 2, and re-enable it
     * at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same
     * applies whenever you stop CloudTrail logging or delete a trail.</note>
     *
     * @return Specifies whether log file integrity validation is enabled. The
     *         default is false. <note>When you disable log file integrity
     *         validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were
     *         delivered during a period in which log file integrity validation was
     *         disabled. For example, if you enable log file integrity validation at
     *         noon on January 1, disable it at noon on January 2, and re-enable it
     *         at noon on January 10, digest files will not be created for the log
     *         files delivered from noon on January 2 to noon on January 10. The same
     *         applies whenever you stop CloudTrail logging or delete a trail.</note>
     */
    public Boolean isEnableLogFileValidation() {
        return enableLogFileValidation;
    }
    
    /**
     * Specifies whether log file integrity validation is enabled. The
     * default is false. <note>When you disable log file integrity
     * validation, the chain of digest files is broken after one hour.
     * CloudTrail will not create digest files for log files that were
     * delivered during a period in which log file integrity validation was
     * disabled. For example, if you enable log file integrity validation at
     * noon on January 1, disable it at noon on January 2, and re-enable it
     * at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same
     * applies whenever you stop CloudTrail logging or delete a trail.</note>
     *
     * @param enableLogFileValidation Specifies whether log file integrity validation is enabled. The
     *         default is false. <note>When you disable log file integrity
     *         validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were
     *         delivered during a period in which log file integrity validation was
     *         disabled. For example, if you enable log file integrity validation at
     *         noon on January 1, disable it at noon on January 2, and re-enable it
     *         at noon on January 10, digest files will not be created for the log
     *         files delivered from noon on January 2 to noon on January 10. The same
     *         applies whenever you stop CloudTrail logging or delete a trail.</note>
     */
    public void setEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
    }
    
    /**
     * Specifies whether log file integrity validation is enabled. The
     * default is false. <note>When you disable log file integrity
     * validation, the chain of digest files is broken after one hour.
     * CloudTrail will not create digest files for log files that were
     * delivered during a period in which log file integrity validation was
     * disabled. For example, if you enable log file integrity validation at
     * noon on January 1, disable it at noon on January 2, and re-enable it
     * at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same
     * applies whenever you stop CloudTrail logging or delete a trail.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableLogFileValidation Specifies whether log file integrity validation is enabled. The
     *         default is false. <note>When you disable log file integrity
     *         validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were
     *         delivered during a period in which log file integrity validation was
     *         disabled. For example, if you enable log file integrity validation at
     *         noon on January 1, disable it at noon on January 2, and re-enable it
     *         at noon on January 10, digest files will not be created for the log
     *         files delivered from noon on January 2 to noon on January 10. The same
     *         applies whenever you stop CloudTrail logging or delete a trail.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
        return this;
    }

    /**
     * Specifies whether log file integrity validation is enabled. The
     * default is false. <note>When you disable log file integrity
     * validation, the chain of digest files is broken after one hour.
     * CloudTrail will not create digest files for log files that were
     * delivered during a period in which log file integrity validation was
     * disabled. For example, if you enable log file integrity validation at
     * noon on January 1, disable it at noon on January 2, and re-enable it
     * at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same
     * applies whenever you stop CloudTrail logging or delete a trail.</note>
     *
     * @return Specifies whether log file integrity validation is enabled. The
     *         default is false. <note>When you disable log file integrity
     *         validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were
     *         delivered during a period in which log file integrity validation was
     *         disabled. For example, if you enable log file integrity validation at
     *         noon on January 1, disable it at noon on January 2, and re-enable it
     *         at noon on January 10, digest files will not be created for the log
     *         files delivered from noon on January 2 to noon on January 10. The same
     *         applies whenever you stop CloudTrail logging or delete a trail.</note>
     */
    public Boolean getEnableLogFileValidation() {
        return enableLogFileValidation;
    }

    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a
     * unique identifier that represents the log group to which CloudTrail
     * logs will be delivered. Not required unless you specify
     * CloudWatchLogsRoleArn.
     *
     * @return Specifies a log group name using an Amazon Resource Name (ARN), a
     *         unique identifier that represents the log group to which CloudTrail
     *         logs will be delivered. Not required unless you specify
     *         CloudWatchLogsRoleArn.
     */
    public String getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }
    
    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a
     * unique identifier that represents the log group to which CloudTrail
     * logs will be delivered. Not required unless you specify
     * CloudWatchLogsRoleArn.
     *
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name (ARN), a
     *         unique identifier that represents the log group to which CloudTrail
     *         logs will be delivered. Not required unless you specify
     *         CloudWatchLogsRoleArn.
     */
    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }
    
    /**
     * Specifies a log group name using an Amazon Resource Name (ARN), a
     * unique identifier that represents the log group to which CloudTrail
     * logs will be delivered. Not required unless you specify
     * CloudWatchLogsRoleArn.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudWatchLogsLogGroupArn Specifies a log group name using an Amazon Resource Name (ARN), a
     *         unique identifier that represents the log group to which CloudTrail
     *         logs will be delivered. Not required unless you specify
     *         CloudWatchLogsRoleArn.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
        return this;
    }

    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write
     * to a user's log group.
     *
     * @return Specifies the role for the CloudWatch Logs endpoint to assume to write
     *         to a user's log group.
     */
    public String getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }
    
    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write
     * to a user's log group.
     *
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to write
     *         to a user's log group.
     */
    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }
    
    /**
     * Specifies the role for the CloudWatch Logs endpoint to assume to write
     * to a user's log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudWatchLogsRoleArn Specifies the role for the CloudWatch Logs endpoint to assume to write
     *         to a user's log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * Specifies the KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. The value can be a an alias name prefixed by "alias/", a
     * fully specified ARN to an alias, a fully specified ARN to a key, or a
     * globally unique identifier. <p>Examples: <ul>
     * <li>alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>12345678-1234-1234-1234-123456789012</li> </ul>
     *
     * @return Specifies the KMS key ID to use to encrypt the logs delivered by
     *         CloudTrail. The value can be a an alias name prefixed by "alias/", a
     *         fully specified ARN to an alias, a fully specified ARN to a key, or a
     *         globally unique identifier. <p>Examples: <ul>
     *         <li>alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>12345678-1234-1234-1234-123456789012</li> </ul>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * Specifies the KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. The value can be a an alias name prefixed by "alias/", a
     * fully specified ARN to an alias, a fully specified ARN to a key, or a
     * globally unique identifier. <p>Examples: <ul>
     * <li>alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>12345678-1234-1234-1234-123456789012</li> </ul>
     *
     * @param kmsKeyId Specifies the KMS key ID to use to encrypt the logs delivered by
     *         CloudTrail. The value can be a an alias name prefixed by "alias/", a
     *         fully specified ARN to an alias, a fully specified ARN to a key, or a
     *         globally unique identifier. <p>Examples: <ul>
     *         <li>alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>12345678-1234-1234-1234-123456789012</li> </ul>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * Specifies the KMS key ID to use to encrypt the logs delivered by
     * CloudTrail. The value can be a an alias name prefixed by "alias/", a
     * fully specified ARN to an alias, a fully specified ARN to a key, or a
     * globally unique identifier. <p>Examples: <ul>
     * <li>alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>12345678-1234-1234-1234-123456789012</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId Specifies the KMS key ID to use to encrypt the logs delivered by
     *         CloudTrail. The value can be a an alias name prefixed by "alias/", a
     *         fully specified ARN to an alias, a fully specified ARN to a key, or a
     *         globally unique identifier. <p>Examples: <ul>
     *         <li>alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>12345678-1234-1234-1234-123456789012</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrailRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getS3BucketName() != null) sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3KeyPrefix() != null) sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getSnsTopicName() != null) sb.append("SnsTopicName: " + getSnsTopicName() + ",");
        if (isIncludeGlobalServiceEvents() != null) sb.append("IncludeGlobalServiceEvents: " + isIncludeGlobalServiceEvents() + ",");
        if (isEnableLogFileValidation() != null) sb.append("EnableLogFileValidation: " + isEnableLogFileValidation() + ",");
        if (getCloudWatchLogsLogGroupArn() != null) sb.append("CloudWatchLogsLogGroupArn: " + getCloudWatchLogsLogGroupArn() + ",");
        if (getCloudWatchLogsRoleArn() != null) sb.append("CloudWatchLogsRoleArn: " + getCloudWatchLogsRoleArn() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode()); 
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getSnsTopicName() == null) ? 0 : getSnsTopicName().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeGlobalServiceEvents() == null) ? 0 : isIncludeGlobalServiceEvents().hashCode()); 
        hashCode = prime * hashCode + ((isEnableLogFileValidation() == null) ? 0 : isEnableLogFileValidation().hashCode()); 
        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode()); 
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrailRequest == false) return false;
        CreateTrailRequest other = (CreateTrailRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null) return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null) return false;
        if (other.getSnsTopicName() != null && other.getSnsTopicName().equals(this.getSnsTopicName()) == false) return false; 
        if (other.isIncludeGlobalServiceEvents() == null ^ this.isIncludeGlobalServiceEvents() == null) return false;
        if (other.isIncludeGlobalServiceEvents() != null && other.isIncludeGlobalServiceEvents().equals(this.isIncludeGlobalServiceEvents()) == false) return false; 
        if (other.isEnableLogFileValidation() == null ^ this.isEnableLogFileValidation() == null) return false;
        if (other.isEnableLogFileValidation() != null && other.isEnableLogFileValidation().equals(this.isEnableLogFileValidation()) == false) return false; 
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null) return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false) return false; 
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null) return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTrailRequest clone() {
        
            return (CreateTrailRequest) super.clone();
    }

}
    