/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The pipeline (queue) that is used to manage jobs.
 * </p>
 */
public class Pipeline implements Serializable {

    /**
     * The identifier for the pipeline. You use this value to identify the
     * pipeline in which you want to perform a variety of operations, such as
     * creating a job or a preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * The Amazon Resource Name (ARN) for the pipeline.
     */
    private String arn;

    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String name;

    /**
     * The current status of the pipeline: <ul> <li><code>Active</code>: The
     * pipeline is processing jobs.</li> <li><code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     */
    private String status;

    /**
     * The Amazon S3 bucket from which Elastic Transcoder gets media files
     * for transcoding and the graphics files, if any, that you want to use
     * for watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String inputBucket;

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files, thumbnails, and playlists. Either you specify this
     * value, or you specify both <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String outputBucket;

    /**
     * The IAM Amazon Resource Name (ARN) for the role that Elastic
     * Transcoder uses to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     */
    private String role;

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     * Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters an error condition.</li>
     * </ul>
     */
    private Notifications notifications;

    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists. Either you specify
     * both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     * you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     * the users and/or predefined Amazon S3 groups you want to have access
     * to transcoded files and playlists, and the type of access that you
     * want them to have. <ul> <li>GranteeType: The type of value that
     * appears in the <code>Grantee</code> object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution.</li> <li><code>Email</code>: The registered email
     * address of an AWS account.</li> <li><code>Group</code>: One of the
     * following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to transcoded files and playlists.</li>
     * <li><code>Access</code>: The permission that you want to give to the
     * AWS user that is listed in <code>Grantee</code>. Valid values include:
     * <ul> <li><code>READ</code>: The grantee can read the objects and
     * metadata for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     * object ACL for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     * for the objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     * Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket. </li> </ul>
     */
    private PipelineOutputConfig contentConfig;

    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files. Either you specify both
     * <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     * specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * thumbnail files. </li> <li><code>Permissions</code>: A list of the
     * users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * <ul> <li>GranteeType: The type of value that appears in the Grantee
     * object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     * for an AWS account or an origin access identity for an Amazon
     * CloudFront distribution. <important>A canonical user ID is not the
     * same as an AWS account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS
     * account.</li> <li><code>Group</code>: One of the following predefined
     * Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to thumbnail files.</li> <li>Access: The
     * permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     * <li><code>StorageClass</code>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li> </ul>
     */
    private PipelineOutputConfig thumbnailConfig;

    /**
     * The identifier for the pipeline. You use this value to identify the
     * pipeline in which you want to perform a variety of operations, such as
     * creating a job or a preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The identifier for the pipeline. You use this value to identify the
     *         pipeline in which you want to perform a variety of operations, such as
     *         creating a job or a preset.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier for the pipeline. You use this value to identify the
     * pipeline in which you want to perform a variety of operations, such as
     * creating a job or a preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier for the pipeline. You use this value to identify the
     *         pipeline in which you want to perform a variety of operations, such as
     *         creating a job or a preset.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier for the pipeline. You use this value to identify the
     * pipeline in which you want to perform a variety of operations, such as
     * creating a job or a preset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier for the pipeline. You use this value to identify the
     *         pipeline in which you want to perform a variety of operations, such as
     *         creating a job or a preset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for the pipeline.
     *
     * @return The Amazon Resource Name (ARN) for the pipeline.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the pipeline.
     *
     * @param arn The Amazon Resource Name (ARN) for the pipeline.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The Amazon Resource Name (ARN) for the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the pipeline. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced. <p>Constraints:
     * Maximum 40 characters
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the pipeline. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced. <p>Constraints:
     *         Maximum 40 characters
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current status of the pipeline: <ul> <li><code>Active</code>: The
     * pipeline is processing jobs.</li> <li><code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @return The current status of the pipeline: <ul> <li><code>Active</code>: The
     *         pipeline is processing jobs.</li> <li><code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of the pipeline: <ul> <li><code>Active</code>: The
     * pipeline is processing jobs.</li> <li><code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @param status The current status of the pipeline: <ul> <li><code>Active</code>: The
     *         pipeline is processing jobs.</li> <li><code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of the pipeline: <ul> <li><code>Active</code>: The
     * pipeline is processing jobs.</li> <li><code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @param status The current status of the pipeline: <ul> <li><code>Active</code>: The
     *         pipeline is processing jobs.</li> <li><code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The Amazon S3 bucket from which Elastic Transcoder gets media files
     * for transcoding and the graphics files, if any, that you want to use
     * for watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket from which Elastic Transcoder gets media files
     *         for transcoding and the graphics files, if any, that you want to use
     *         for watermarks.
     */
    public String getInputBucket() {
        return inputBucket;
    }
    
    /**
     * The Amazon S3 bucket from which Elastic Transcoder gets media files
     * for transcoding and the graphics files, if any, that you want to use
     * for watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket from which Elastic Transcoder gets media files
     *         for transcoding and the graphics files, if any, that you want to use
     *         for watermarks.
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }
    
    /**
     * The Amazon S3 bucket from which Elastic Transcoder gets media files
     * for transcoding and the graphics files, if any, that you want to use
     * for watermarks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket from which Elastic Transcoder gets media files
     *         for transcoding and the graphics files, if any, that you want to use
     *         for watermarks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
        return this;
    }

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files, thumbnails, and playlists. Either you specify this
     * value, or you specify both <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files, thumbnails, and playlists. Either you specify this
     *         value, or you specify both <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>.
     */
    public String getOutputBucket() {
        return outputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files, thumbnails, and playlists. Either you specify this
     * value, or you specify both <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param outputBucket The Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files, thumbnails, and playlists. Either you specify this
     *         value, or you specify both <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>.
     */
    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files, thumbnails, and playlists. Either you specify this
     * value, or you specify both <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param outputBucket The Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files, thumbnails, and playlists. Either you specify this
     *         value, or you specify both <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    /**
     * The IAM Amazon Resource Name (ARN) for the role that Elastic
     * Transcoder uses to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @return The IAM Amazon Resource Name (ARN) for the role that Elastic
     *         Transcoder uses to transcode jobs for this pipeline.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that Elastic
     * Transcoder uses to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that Elastic
     *         Transcoder uses to transcode jobs for this pipeline.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that Elastic
     * Transcoder uses to transcode jobs for this pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that Elastic
     *         Transcoder uses to transcode jobs for this pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     * Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters an error condition.</li>
     * </ul>
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     *         Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *         notify when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters an error condition.</li>
     *         </ul>
     */
    public Notifications getNotifications() {
        return notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     * Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters an error condition.</li>
     * </ul>
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     *         Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *         notify when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters an error condition.</li>
     *         </ul>
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     * Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process the job.</li>
     * <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder has finished processing the job.</li>
     * <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters a warning condition.</li>
     * <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     * notify when Elastic Transcoder encounters an error condition.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important> <ul> <li><b>Progressing</b> (optional): The
     *         Amazon Simple Notification Service (Amazon SNS) topic that you want to
     *         notify when Elastic Transcoder has started to process the job.</li>
     *         <li><b>Completed</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder has finished processing the job.</li>
     *         <li><b>Warning</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters a warning condition.</li>
     *         <li><b>Error</b> (optional): The Amazon SNS topic that you want to
     *         notify when Elastic Transcoder encounters an error condition.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withNotifications(Notifications notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists. Either you specify
     * both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     * you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     * the users and/or predefined Amazon S3 groups you want to have access
     * to transcoded files and playlists, and the type of access that you
     * want them to have. <ul> <li>GranteeType: The type of value that
     * appears in the <code>Grantee</code> object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution.</li> <li><code>Email</code>: The registered email
     * address of an AWS account.</li> <li><code>Group</code>: One of the
     * following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to transcoded files and playlists.</li>
     * <li><code>Access</code>: The permission that you want to give to the
     * AWS user that is listed in <code>Grantee</code>. Valid values include:
     * <ul> <li><code>READ</code>: The grantee can read the objects and
     * metadata for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     * object ACL for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     * for the objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     * Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket. </li> </ul>
     *
     * @return Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save transcoded files and playlists. Either you specify
     *         both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     *         you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     *         the users and/or predefined Amazon S3 groups you want to have access
     *         to transcoded files and playlists, and the type of access that you
     *         want them to have. <ul> <li>GranteeType: The type of value that
     *         appears in the <code>Grantee</code> object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution.</li> <li><code>Email</code>: The registered email
     *         address of an AWS account.</li> <li><code>Group</code>: One of the
     *         following predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to transcoded files and playlists.</li>
     *         <li><code>Access</code>: The permission that you want to give to the
     *         AWS user that is listed in <code>Grantee</code>. Valid values include:
     *         <ul> <li><code>READ</code>: The grantee can read the objects and
     *         metadata for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     *         object ACL for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     *         for the objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the objects that Elastic Transcoder adds to the Amazon
     *         S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     *         Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket. </li> </ul>
     */
    public PipelineOutputConfig getContentConfig() {
        return contentConfig;
    }
    
    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists. Either you specify
     * both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     * you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     * the users and/or predefined Amazon S3 groups you want to have access
     * to transcoded files and playlists, and the type of access that you
     * want them to have. <ul> <li>GranteeType: The type of value that
     * appears in the <code>Grantee</code> object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution.</li> <li><code>Email</code>: The registered email
     * address of an AWS account.</li> <li><code>Group</code>: One of the
     * following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to transcoded files and playlists.</li>
     * <li><code>Access</code>: The permission that you want to give to the
     * AWS user that is listed in <code>Grantee</code>. Valid values include:
     * <ul> <li><code>READ</code>: The grantee can read the objects and
     * metadata for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     * object ACL for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     * for the objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     * Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket. </li> </ul>
     *
     * @param contentConfig Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save transcoded files and playlists. Either you specify
     *         both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     *         you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     *         the users and/or predefined Amazon S3 groups you want to have access
     *         to transcoded files and playlists, and the type of access that you
     *         want them to have. <ul> <li>GranteeType: The type of value that
     *         appears in the <code>Grantee</code> object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution.</li> <li><code>Email</code>: The registered email
     *         address of an AWS account.</li> <li><code>Group</code>: One of the
     *         following predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to transcoded files and playlists.</li>
     *         <li><code>Access</code>: The permission that you want to give to the
     *         AWS user that is listed in <code>Grantee</code>. Valid values include:
     *         <ul> <li><code>READ</code>: The grantee can read the objects and
     *         metadata for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     *         object ACL for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     *         for the objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the objects that Elastic Transcoder adds to the Amazon
     *         S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     *         Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket. </li> </ul>
     */
    public void setContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
    }
    
    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists. Either you specify
     * both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     * you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     * the users and/or predefined Amazon S3 groups you want to have access
     * to transcoded files and playlists, and the type of access that you
     * want them to have. <ul> <li>GranteeType: The type of value that
     * appears in the <code>Grantee</code> object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution.</li> <li><code>Email</code>: The registered email
     * address of an AWS account.</li> <li><code>Group</code>: One of the
     * following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to transcoded files and playlists.</li>
     * <li><code>Access</code>: The permission that you want to give to the
     * AWS user that is listed in <code>Grantee</code>. Valid values include:
     * <ul> <li><code>READ</code>: The grantee can read the objects and
     * metadata for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     * object ACL for objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     * for the objects that Elastic Transcoder adds to the Amazon S3
     * bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the objects that Elastic Transcoder adds to the Amazon
     * S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     * Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentConfig Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save transcoded files and playlists. Either you specify
     *         both <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or
     *         you specify <code>OutputBucket</code>. <ul> <li><b>Bucket</b>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         transcoded files and playlists.</li> <li><b>Permissions</b>: A list of
     *         the users and/or predefined Amazon S3 groups you want to have access
     *         to transcoded files and playlists, and the type of access that you
     *         want them to have. <ul> <li>GranteeType: The type of value that
     *         appears in the <code>Grantee</code> object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution.</li> <li><code>Email</code>: The registered email
     *         address of an AWS account.</li> <li><code>Group</code>: One of the
     *         following predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to transcoded files and playlists.</li>
     *         <li><code>Access</code>: The permission that you want to give to the
     *         AWS user that is listed in <code>Grantee</code>. Valid values include:
     *         <ul> <li><code>READ</code>: The grantee can read the objects and
     *         metadata for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>READ_ACP</code>: The grantee can read the
     *         object ACL for objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>WRITE_ACP</code>: The grantee can write the ACL
     *         for the objects that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the objects that Elastic Transcoder adds to the Amazon
     *         S3 bucket.</li> </ul> </li> </ul> </li> <li><b>StorageClass</b>: The
     *         Amazon S3 storage class, Standard or ReducedRedundancy, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
        return this;
    }

    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files. Either you specify both
     * <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     * specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * thumbnail files. </li> <li><code>Permissions</code>: A list of the
     * users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * <ul> <li>GranteeType: The type of value that appears in the Grantee
     * object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     * for an AWS account or an origin access identity for an Amazon
     * CloudFront distribution. <important>A canonical user ID is not the
     * same as an AWS account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS
     * account.</li> <li><code>Group</code>: One of the following predefined
     * Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to thumbnail files.</li> <li>Access: The
     * permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     * <li><code>StorageClass</code>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li> </ul>
     *
     * @return Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save thumbnail files. Either you specify both
     *         <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *         specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         thumbnail files. </li> <li><code>Permissions</code>: A list of the
     *         users and/or predefined Amazon S3 groups you want to have access to
     *         thumbnail files, and the type of access that you want them to have.
     *         <ul> <li>GranteeType: The type of value that appears in the Grantee
     *         object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     *         for an AWS account or an origin access identity for an Amazon
     *         CloudFront distribution. <important>A canonical user ID is not the
     *         same as an AWS account number.</important></li>
     *         <li><code>Email</code>: The registered email address of an AWS
     *         account.</li> <li><code>Group</code>: One of the following predefined
     *         Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to thumbnail files.</li> <li>Access: The
     *         permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     *         <li><code>StorageClass</code>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the thumbnails that it stores in your
     *         Amazon S3 bucket.</li> </ul>
     */
    public PipelineOutputConfig getThumbnailConfig() {
        return thumbnailConfig;
    }
    
    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files. Either you specify both
     * <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     * specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * thumbnail files. </li> <li><code>Permissions</code>: A list of the
     * users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * <ul> <li>GranteeType: The type of value that appears in the Grantee
     * object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     * for an AWS account or an origin access identity for an Amazon
     * CloudFront distribution. <important>A canonical user ID is not the
     * same as an AWS account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS
     * account.</li> <li><code>Group</code>: One of the following predefined
     * Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to thumbnail files.</li> <li>Access: The
     * permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     * <li><code>StorageClass</code>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li> </ul>
     *
     * @param thumbnailConfig Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save thumbnail files. Either you specify both
     *         <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *         specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         thumbnail files. </li> <li><code>Permissions</code>: A list of the
     *         users and/or predefined Amazon S3 groups you want to have access to
     *         thumbnail files, and the type of access that you want them to have.
     *         <ul> <li>GranteeType: The type of value that appears in the Grantee
     *         object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     *         for an AWS account or an origin access identity for an Amazon
     *         CloudFront distribution. <important>A canonical user ID is not the
     *         same as an AWS account number.</important></li>
     *         <li><code>Email</code>: The registered email address of an AWS
     *         account.</li> <li><code>Group</code>: One of the following predefined
     *         Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to thumbnail files.</li> <li>Access: The
     *         permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     *         <li><code>StorageClass</code>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the thumbnails that it stores in your
     *         Amazon S3 bucket.</li> </ul>
     */
    public void setThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
    }
    
    /**
     * Information about the Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files. Either you specify both
     * <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     * specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     * Amazon S3 bucket in which you want Elastic Transcoder to save
     * thumbnail files. </li> <li><code>Permissions</code>: A list of the
     * users and/or predefined Amazon S3 groups you want to have access to
     * thumbnail files, and the type of access that you want them to have.
     * <ul> <li>GranteeType: The type of value that appears in the Grantee
     * object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     * for an AWS account or an origin access identity for an Amazon
     * CloudFront distribution. <important>A canonical user ID is not the
     * same as an AWS account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS
     * account.</li> <li><code>Group</code>: One of the following predefined
     * Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     * want to have access to thumbnail files.</li> <li>Access: The
     * permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     * <li><code>StorageClass</code>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbnailConfig Information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save thumbnail files. Either you specify both
     *         <code>ContentConfig</code> and <code>ThumbnailConfig</code>, or you
     *         specify <code>OutputBucket</code>. <ul> <li><code>Bucket</code>: The
     *         Amazon S3 bucket in which you want Elastic Transcoder to save
     *         thumbnail files. </li> <li><code>Permissions</code>: A list of the
     *         users and/or predefined Amazon S3 groups you want to have access to
     *         thumbnail files, and the type of access that you want them to have.
     *         <ul> <li>GranteeType: The type of value that appears in the Grantee
     *         object: <ul> <li><code>Canonical</code>: Either the canonical user ID
     *         for an AWS account or an origin access identity for an Amazon
     *         CloudFront distribution. <important>A canonical user ID is not the
     *         same as an AWS account number.</important></li>
     *         <li><code>Email</code>: The registered email address of an AWS
     *         account.</li> <li><code>Group</code>: One of the following predefined
     *         Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li><code>Grantee</code>: The AWS user or group that you
     *         want to have access to thumbnail files.</li> <li>Access: The
     *         permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul> </li> </ul> </li>
     *         <li><code>StorageClass</code>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the thumbnails that it stores in your
     *         Amazon S3 bucket.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Pipeline withThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getInputBucket() != null) sb.append("InputBucket: " + getInputBucket() + ",");
        if (getOutputBucket() != null) sb.append("OutputBucket: " + getOutputBucket() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getNotifications() != null) sb.append("Notifications: " + getNotifications() + ",");
        if (getContentConfig() != null) sb.append("ContentConfig: " + getContentConfig() + ",");
        if (getThumbnailConfig() != null) sb.append("ThumbnailConfig: " + getThumbnailConfig() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode()); 
        hashCode = prime * hashCode + ((getContentConfig() == null) ? 0 : getContentConfig().hashCode()); 
        hashCode = prime * hashCode + ((getThumbnailConfig() == null) ? 0 : getThumbnailConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Pipeline == false) return false;
        Pipeline other = (Pipeline)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getInputBucket() == null ^ this.getInputBucket() == null) return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false) return false; 
        if (other.getOutputBucket() == null ^ this.getOutputBucket() == null) return false;
        if (other.getOutputBucket() != null && other.getOutputBucket().equals(this.getOutputBucket()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getNotifications() == null ^ this.getNotifications() == null) return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false) return false; 
        if (other.getContentConfig() == null ^ this.getContentConfig() == null) return false;
        if (other.getContentConfig() != null && other.getContentConfig().equals(this.getContentConfig()) == false) return false; 
        if (other.getThumbnailConfig() == null ^ this.getThumbnailConfig() == null) return false;
        if (other.getThumbnailConfig() != null && other.getThumbnailConfig().equals(this.getThumbnailConfig()) == false) return false; 
        return true;
    }
    
}
    