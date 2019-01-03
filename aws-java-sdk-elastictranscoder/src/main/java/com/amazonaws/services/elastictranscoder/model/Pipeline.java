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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The pipeline (queue) that is used to manage jobs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a
     * variety of operations, such as creating a job or a preset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pipeline.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if
     * any, that you want to use for watermarks.
     * </p>
     */
    private String inputBucket;
    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists.
     * Either you specify this value, or you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>.
     * </p>
     */
    private String outputBucket;
    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * </p>
     * <p>
     * If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you don't need
     * to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically.
     * You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>, or <code>aes-gcm</code>.
     * </p>
     */
    private String awsKmsKeyArn;
    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished
     * processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a
     * warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error
     * condition.
     * </p>
     * </li>
     * </ul>
     */
    private Notifications notifications;
    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     * playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded
     * files and playlists, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the <code>Grantee</code> object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Access</code>: The permission that you want to give to the AWS user that is listed in <code>Grantee</code>.
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder
     * to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     */
    private PipelineOutputConfig contentConfig;
    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you
     * specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the Grantee object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * <important>
     * <p>
     * A canonical user ID is not the same as an AWS account number.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that
     * Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>,
     * that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     */
    private PipelineOutputConfig thumbnailConfig;

    /**
     * <p>
     * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a
     * variety of operations, such as creating a job or a preset.
     * </p>
     * 
     * @param id
     *        The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform
     *        a variety of operations, such as creating a job or a preset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a
     * variety of operations, such as creating a job or a preset.
     * </p>
     * 
     * @return The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform
     *         a variety of operations, such as creating a job or a preset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a
     * variety of operations, such as creating a job or a preset.
     * </p>
     * 
     * @param id
     *        The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform
     *        a variety of operations, such as creating a job or a preset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pipeline.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the pipeline.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the pipeline.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pipeline.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @param name
     *        The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is
     *        not enforced.</p>
     *        <p>
     *        Constraints: Maximum 40 characters
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @return The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is
     *         not enforced.</p>
     *         <p>
     *         Constraints: Maximum 40 characters
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @param name
     *        The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is
     *        not enforced.</p>
     *        <p>
     *        Constraints: Maximum 40 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the pipeline:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The pipeline is processing jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Paused</code>: The pipeline is not currently processing jobs.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the pipeline:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>: The pipeline is processing jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Paused</code>: The pipeline is not currently processing jobs.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the pipeline:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The pipeline is processing jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Paused</code>: The pipeline is not currently processing jobs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if
     * any, that you want to use for watermarks.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics
     *        files, if any, that you want to use for watermarks.
     */

    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if
     * any, that you want to use for watermarks.
     * </p>
     * 
     * @return The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics
     *         files, if any, that you want to use for watermarks.
     */

    public String getInputBucket() {
        return this.inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if
     * any, that you want to use for watermarks.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics
     *        files, if any, that you want to use for watermarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withInputBucket(String inputBucket) {
        setInputBucket(inputBucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists.
     * Either you specify this value, or you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>.
     * </p>
     * 
     * @param outputBucket
     *        The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and
     *        playlists. Either you specify this value, or you specify both <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>.
     */

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists.
     * Either you specify this value, or you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>.
     * </p>
     * 
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and
     *         playlists. Either you specify this value, or you specify both <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>.
     */

    public String getOutputBucket() {
        return this.outputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists.
     * Either you specify this value, or you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>.
     * </p>
     * 
     * @param outputBucket
     *        The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and
     *        playlists. Either you specify this value, or you specify both <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withOutputBucket(String outputBucket) {
        setOutputBucket(outputBucket);
        return this;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this
     *        pipeline.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
     * </p>
     * 
     * @return The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this
     *         pipeline.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this
     *        pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * </p>
     * <p>
     * If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you don't need
     * to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically.
     * You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>, or <code>aes-gcm</code>.
     * </p>
     * 
     * @param awsKmsKeyArn
     *        The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.</p>
     *        <p>
     *        If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you
     *        don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for
     *        you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key,
     *        or if you are using an <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>,
     *        or <code>aes-gcm</code>.
     */

    public void setAwsKmsKeyArn(String awsKmsKeyArn) {
        this.awsKmsKeyArn = awsKmsKeyArn;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * </p>
     * <p>
     * If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you don't need
     * to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically.
     * You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>, or <code>aes-gcm</code>.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.</p>
     *         <p>
     *         If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you
     *         don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for
     *         you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key,
     *         or if you are using an <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>,
     *         or <code>aes-gcm</code>.
     */

    public String getAwsKmsKeyArn() {
        return this.awsKmsKeyArn;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * </p>
     * <p>
     * If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you don't need
     * to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically.
     * You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>, or <code>aes-gcm</code>.
     * </p>
     * 
     * @param awsKmsKeyArn
     *        The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.</p>
     *        <p>
     *        If you use either <code>s3</code> or <code>s3-aws-kms</code> as your <code>Encryption:Mode</code>, you
     *        don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for
     *        you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key,
     *        or if you are using an <code>Encryption:Mode</code> of <code>aes-cbc-pkcs7</code>, <code>aes-ctr</code>,
     *        or <code>aes-gcm</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withAwsKmsKeyArn(String awsKmsKeyArn) {
        setAwsKmsKeyArn(awsKmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished
     * processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a
     * warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error
     * condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifications
     *        The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     *        status.</p> <important>
     *        <p>
     *        To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *        notify when Elastic Transcoder has started to process the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has
     *        finished processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     *        a warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     *        an error condition.
     *        </p>
     *        </li>
     */

    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished
     * processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a
     * warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error
     * condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     *         status.</p> <important>
     *         <p>
     *         To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *         </p>
     *         </important>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *         notify when Elastic Transcoder has started to process the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has
     *         finished processing the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters a warning condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     *         an error condition.
     *         </p>
     *         </li>
     */

    public Notifications getNotifications() {
        return this.notifications;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify
     * when Elastic Transcoder has started to process the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished
     * processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a
     * warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error
     * condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifications
     *        The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     *        status.</p> <important>
     *        <p>
     *        To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Progressing</b> (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *        notify when Elastic Transcoder has started to process the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Complete</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has
     *        finished processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Warning</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     *        a warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error</b> (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     *        an error condition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withNotifications(Notifications notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     * playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded
     * files and playlists, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the <code>Grantee</code> object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Access</code>: The permission that you want to give to the AWS user that is listed in <code>Grantee</code>.
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder
     * to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentConfig
     *        Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *        playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *        specify <code>OutputBucket</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     *        transcoded files and playlists, and the type of access that you want them to have.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GranteeType: The type of value that appears in the <code>Grantee</code> object:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *        an Amazon CloudFront distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Email</code>: The registered email address of an AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *        <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Access</code>: The permission that you want to give to the AWS user that is listed in
     *        <code>Grantee</code>. Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds
     *        to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the
     *        Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the
     *        Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and
     *        <code>WRITE_ACP</code> permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic
     *        Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     *        </p>
     *        </li>
     */

    public void setContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     * playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded
     * files and playlists, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the <code>Grantee</code> object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Access</code>: The permission that you want to give to the AWS user that is listed in <code>Grantee</code>.
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder
     * to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *         playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *         specify <code>OutputBucket</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *         playlists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     *         transcoded files and playlists, and the type of access that you want them to have.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         GranteeType: The type of value that appears in the <code>Grantee</code> object:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *         an Amazon CloudFront distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Email</code>: The registered email address of an AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and
     *         playlists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Access</code>: The permission that you want to give to the AWS user that is listed in
     *         <code>Grantee</code>. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds
     *         to the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to
     *         the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the
     *         Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and
     *         <code>WRITE_ACP</code> permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic
     *         Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     *         </p>
     *         </li>
     */

    public PipelineOutputConfig getContentConfig() {
        return this.contentConfig;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     * playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded
     * files and playlists, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the <code>Grantee</code> object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Access</code>: The permission that you want to give to the AWS user that is listed in <code>Grantee</code>.
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder
     * to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentConfig
     *        Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *        playlists. Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *        specify <code>OutputBucket</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Bucket</b>: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Permissions</b>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     *        transcoded files and playlists, and the type of access that you want them to have.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GranteeType: The type of value that appears in the <code>Grantee</code> object:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *        an Amazon CloudFront distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Email</code>: The registered email address of an AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *        <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Grantee</code>: The AWS user or group that you want to have access to transcoded files and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Access</code>: The permission that you want to give to the AWS user that is listed in
     *        <code>Grantee</code>. Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code>: The grantee can read the objects and metadata for objects that Elastic Transcoder adds
     *        to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READ_ACP</code>: The grantee can read the object ACL for objects that Elastic Transcoder adds to the
     *        Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE_ACP</code>: The grantee can write the ACL for the objects that Elastic Transcoder adds to the
     *        Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_CONTROL</code>: The grantee has <code>READ</code>, <code>READ_ACP</code>, and
     *        <code>WRITE_ACP</code> permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>StorageClass</b>: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic
     *        Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withContentConfig(PipelineOutputConfig contentConfig) {
        setContentConfig(contentConfig);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you
     * specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the Grantee object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * <important>
     * <p>
     * A canonical user ID is not the same as an AWS account number.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that
     * Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>,
     * that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thumbnailConfig
     *        Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *        Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     *        <code>OutputBucket</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access
     *        to thumbnail files, and the type of access that you want them to have.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GranteeType: The type of value that appears in the Grantee object:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *        an Amazon CloudFront distribution.
     *        </p>
     *        <important>
     *        <p>
     *        A canonical user ID is not the same as an AWS account number.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>Email</code>: The registered email address of an AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *        <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values
     *        include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder
     *        adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to
     *        the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to
     *        the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails
     *        that Elastic Transcoder adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or
     *        <code>ReducedRedundancy</code>, that you want Elastic Transcoder to assign to the thumbnails that it
     *        stores in your Amazon S3 bucket.
     *        </p>
     *        </li>
     */

    public void setThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you
     * specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the Grantee object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * <important>
     * <p>
     * A canonical user ID is not the same as an AWS account number.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that
     * Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>,
     * that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *         Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     *         <code>OutputBucket</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access
     *         to thumbnail files, and the type of access that you want them to have.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         GranteeType: The type of value that appears in the Grantee object:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *         an Amazon CloudFront distribution.
     *         </p>
     *         <important>
     *         <p>
     *         A canonical user ID is not the same as an AWS account number.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>Email</code>: The registered email address of an AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to
     *         the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to
     *         the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails
     *         that Elastic Transcoder adds to the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to assign to the thumbnails that it
     *         stores in your Amazon S3 bucket.
     *         </p>
     *         </li>
     */

    public PipelineOutputConfig getThumbnailConfig() {
        return this.thumbnailConfig;
    }

    /**
     * <p>
     * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you
     * specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     * <code>OutputBucket</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * </p>
     * <ul>
     * <li>
     * <p>
     * GranteeType: The type of value that appears in the Grantee object:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for an
     * Amazon CloudFront distribution.
     * </p>
     * <important>
     * <p>
     * A canonical user ID is not the same as an AWS account number.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>Email</code>: The registered email address of an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that
     * Elastic Transcoder adds to the Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>,
     * that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thumbnailConfig
     *        Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *        Either you specify both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you specify
     *        <code>OutputBucket</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Bucket</code>: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Permissions</code>: A list of the users and/or predefined Amazon S3 groups you want to have access
     *        to thumbnail files, and the type of access that you want them to have.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GranteeType: The type of value that appears in the Grantee object:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Canonical</code>: Either the canonical user ID for an AWS account or an origin access identity for
     *        an Amazon CloudFront distribution.
     *        </p>
     *        <important>
     *        <p>
     *        A canonical user ID is not the same as an AWS account number.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>Email</code>: The registered email address of an AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Group</code>: One of the following predefined Amazon S3 groups: <code>AllUsers</code>,
     *        <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Grantee</code>: The AWS user or group that you want to have access to thumbnail files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values
     *        include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code>: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder
     *        adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READ_ACP</code>: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to
     *        the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE_ACP</code>: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to
     *        the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails
     *        that Elastic Transcoder adds to the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StorageClass</code>: The Amazon S3 storage class, <code>Standard</code> or
     *        <code>ReducedRedundancy</code>, that you want Elastic Transcoder to assign to the thumbnails that it
     *        stores in your Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        setThumbnailConfig(thumbnailConfig);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInputBucket() != null)
            sb.append("InputBucket: ").append(getInputBucket()).append(",");
        if (getOutputBucket() != null)
            sb.append("OutputBucket: ").append(getOutputBucket()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getAwsKmsKeyArn() != null)
            sb.append("AwsKmsKeyArn: ").append(getAwsKmsKeyArn()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
        if (getContentConfig() != null)
            sb.append("ContentConfig: ").append(getContentConfig()).append(",");
        if (getThumbnailConfig() != null)
            sb.append("ThumbnailConfig: ").append(getThumbnailConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pipeline == false)
            return false;
        Pipeline other = (Pipeline) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInputBucket() == null ^ this.getInputBucket() == null)
            return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false)
            return false;
        if (other.getOutputBucket() == null ^ this.getOutputBucket() == null)
            return false;
        if (other.getOutputBucket() != null && other.getOutputBucket().equals(this.getOutputBucket()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getAwsKmsKeyArn() == null ^ this.getAwsKmsKeyArn() == null)
            return false;
        if (other.getAwsKmsKeyArn() != null && other.getAwsKmsKeyArn().equals(this.getAwsKmsKeyArn()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getContentConfig() == null ^ this.getContentConfig() == null)
            return false;
        if (other.getContentConfig() != null && other.getContentConfig().equals(this.getContentConfig()) == false)
            return false;
        if (other.getThumbnailConfig() == null ^ this.getThumbnailConfig() == null)
            return false;
        if (other.getThumbnailConfig() != null && other.getThumbnailConfig().equals(this.getThumbnailConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode());
        hashCode = prime * hashCode + ((getOutputBucket() == null) ? 0 : getOutputBucket().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getAwsKmsKeyArn() == null) ? 0 : getAwsKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getContentConfig() == null) ? 0 : getContentConfig().hashCode());
        hashCode = prime * hashCode + ((getThumbnailConfig() == null) ? 0 : getThumbnailConfig().hashCode());
        return hashCode;
    }

    @Override
    public Pipeline clone() {
        try {
            return (Pipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.PipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
