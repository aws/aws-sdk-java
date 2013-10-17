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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipeline(UpdatePipelineRequest) UpdatePipeline operation}.
 * <p>
 * Use the <code>UpdatePipeline</code> operation to update settings for a pipeline. <p>
 * <b>IMPORTANT:</b>When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic
 * Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.
 * </p>
 * 
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipeline(UpdatePipelineRequest)
 */
public class UpdatePipelineRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the pipeline that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

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
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode and the graphics that you want to use as watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String inputBucket;

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     */
    private String role;

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     */
    private Notifications notifications;

    /**
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to
     * save transcoded files and playlists: which bucket to use, which users
     * you want to have access to the files, the type of access you want
     * users to have, and the storage class that you want to assign to the
     * files. <p>If you specify values for <code>ContentConfig</code>, you
     * must also specify values for <code>ThumbnailConfig</code>. <p>If you
     * specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies
     * which users you want to have access to transcoded files and the type
     * of access you want them to have. You can grant permissions to a
     * maximum of 30 users and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     * the <code>Grantee</code> object is either the canonical user ID for an
     * AWS account or an origin access identity for an Amazon CloudFront
     * distribution. For more information about canonical user IDs, see
     * Access Control List (ACL) Overview in the Amazon Simple Storage
     * Service Developer Guide. For more information about using CloudFront
     * origin access identities to require that users use CloudFront URLs
     * instead of Amazon S3 URLs, see Using an Origin Access Identity to
     * Restrict Access to Your Amazon S3 Content. <important>A canonical user
     * ID is not the same as an AWS account number.</important> </li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li> <li><b>Group</b>: The
     * value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to transcoded files and playlists. To identify the user
     * or group, you can specify the canonical user ID for an AWS account, an
     * origin access identity for a CloudFront distribution, the registered
     * email address of an AWS account, or a predefined Amazon S3 group </li>
     * <li> <b>Access</b>: The permission that you want to give to the AWS
     * user that you specified in <code>Grantee</code>. Permissions are
     * granted on the files that Elastic Transcoder adds to the bucket,
     * including playlists and video files. Valid values include: <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li> </ul>
     */
    private PipelineOutputConfig contentConfig;

    /**
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the
     * files, the type of access you want users to have, and the storage
     * class that you want to assign to the files. <p>If you specify values
     * for <code>ContentConfig</code>, you must also specify values for
     * <code>ThumbnailConfig</code> even if you don't want to create
     * thumbnails. <p>If you specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to
     * have access to thumbnail files, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     * type of value that appears in the Grantee object: <ul> <li>
     * <b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account. </li> <li><b>Group</b>:
     * The value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to thumbnail files. To identify the user or group, you
     * can specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address
     * of an AWS account, or a predefined Amazon S3 group. </li> <li>
     * <b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include: <ul> <li><code>READ</code>: The grantee can read the
     * thumbnails and metadata for objects that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     * read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     * write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     * Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     * </ul>
     */
    private PipelineOutputConfig thumbnailConfig;

    /**
     * The ID of the pipeline that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The ID of the pipeline that you want to update.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the pipeline that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The ID of the pipeline that you want to update.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the pipeline that you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The ID of the pipeline that you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withId(String id) {
        this.id = id;
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
    public UpdatePipelineRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode and the graphics that you want to use as watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode and the graphics that you want to use as watermarks.
     */
    public String getInputBucket() {
        return inputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode and the graphics that you want to use as watermarks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode and the graphics that you want to use as watermarks.
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }
    
    /**
     * The Amazon S3 bucket in which you saved the media files that you want
     * to transcode and the graphics that you want to use as watermarks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket in which you saved the media files that you want
     *         to transcode and the graphics that you want to use as watermarks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
        return this;
    }

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @return The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to transcode jobs for this pipeline.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to transcode jobs for this pipeline.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to use to transcode jobs for this pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     */
    public Notifications getNotifications() {
        return notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withNotifications(Notifications notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to
     * save transcoded files and playlists: which bucket to use, which users
     * you want to have access to the files, the type of access you want
     * users to have, and the storage class that you want to assign to the
     * files. <p>If you specify values for <code>ContentConfig</code>, you
     * must also specify values for <code>ThumbnailConfig</code>. <p>If you
     * specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies
     * which users you want to have access to transcoded files and the type
     * of access you want them to have. You can grant permissions to a
     * maximum of 30 users and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     * the <code>Grantee</code> object is either the canonical user ID for an
     * AWS account or an origin access identity for an Amazon CloudFront
     * distribution. For more information about canonical user IDs, see
     * Access Control List (ACL) Overview in the Amazon Simple Storage
     * Service Developer Guide. For more information about using CloudFront
     * origin access identities to require that users use CloudFront URLs
     * instead of Amazon S3 URLs, see Using an Origin Access Identity to
     * Restrict Access to Your Amazon S3 Content. <important>A canonical user
     * ID is not the same as an AWS account number.</important> </li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li> <li><b>Group</b>: The
     * value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to transcoded files and playlists. To identify the user
     * or group, you can specify the canonical user ID for an AWS account, an
     * origin access identity for a CloudFront distribution, the registered
     * email address of an AWS account, or a predefined Amazon S3 group </li>
     * <li> <b>Access</b>: The permission that you want to give to the AWS
     * user that you specified in <code>Grantee</code>. Permissions are
     * granted on the files that Elastic Transcoder adds to the bucket,
     * including playlists and video files. Valid values include: <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li> </ul>
     *
     * @return The optional <code>ContentConfig</code> object specifies information
     *         about the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save transcoded files and playlists: which bucket to use, which users
     *         you want to have access to the files, the type of access you want
     *         users to have, and the storage class that you want to assign to the
     *         files. <p>If you specify values for <code>ContentConfig</code>, you
     *         must also specify values for <code>ThumbnailConfig</code>. <p>If you
     *         specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save transcoded files and playlists.</li>
     *         <li><b>Permissions</b> (Optional): The Permissions object specifies
     *         which users you want to have access to transcoded files and the type
     *         of access you want them to have. You can grant permissions to a
     *         maximum of 30 users and/or predefined Amazon S3 groups.</li>
     *         <li><b>Grantee Type</b>: Specify the type of value that appears in the
     *         <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     *         the <code>Grantee</code> object is either the canonical user ID for an
     *         AWS account or an origin access identity for an Amazon CloudFront
     *         distribution. For more information about canonical user IDs, see
     *         Access Control List (ACL) Overview in the Amazon Simple Storage
     *         Service Developer Guide. For more information about using CloudFront
     *         origin access identities to require that users use CloudFront URLs
     *         instead of Amazon S3 URLs, see Using an Origin Access Identity to
     *         Restrict Access to Your Amazon S3 Content. <important>A canonical user
     *         ID is not the same as an AWS account number.</important> </li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account.</li> <li><b>Group</b>: The
     *         value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to transcoded files and playlists. To identify the user
     *         or group, you can specify the canonical user ID for an AWS account, an
     *         origin access identity for a CloudFront distribution, the registered
     *         email address of an AWS account, or a predefined Amazon S3 group </li>
     *         <li> <b>Access</b>: The permission that you want to give to the AWS
     *         user that you specified in <code>Grantee</code>. Permissions are
     *         granted on the files that Elastic Transcoder adds to the bucket,
     *         including playlists and video files. Valid values include: <ul>
     *         <li><code>READ</code>: The grantee can read the objects and metadata
     *         for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *         <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket.</li> </ul>
     */
    public PipelineOutputConfig getContentConfig() {
        return contentConfig;
    }
    
    /**
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to
     * save transcoded files and playlists: which bucket to use, which users
     * you want to have access to the files, the type of access you want
     * users to have, and the storage class that you want to assign to the
     * files. <p>If you specify values for <code>ContentConfig</code>, you
     * must also specify values for <code>ThumbnailConfig</code>. <p>If you
     * specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies
     * which users you want to have access to transcoded files and the type
     * of access you want them to have. You can grant permissions to a
     * maximum of 30 users and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     * the <code>Grantee</code> object is either the canonical user ID for an
     * AWS account or an origin access identity for an Amazon CloudFront
     * distribution. For more information about canonical user IDs, see
     * Access Control List (ACL) Overview in the Amazon Simple Storage
     * Service Developer Guide. For more information about using CloudFront
     * origin access identities to require that users use CloudFront URLs
     * instead of Amazon S3 URLs, see Using an Origin Access Identity to
     * Restrict Access to Your Amazon S3 Content. <important>A canonical user
     * ID is not the same as an AWS account number.</important> </li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li> <li><b>Group</b>: The
     * value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to transcoded files and playlists. To identify the user
     * or group, you can specify the canonical user ID for an AWS account, an
     * origin access identity for a CloudFront distribution, the registered
     * email address of an AWS account, or a predefined Amazon S3 group </li>
     * <li> <b>Access</b>: The permission that you want to give to the AWS
     * user that you specified in <code>Grantee</code>. Permissions are
     * granted on the files that Elastic Transcoder adds to the bucket,
     * including playlists and video files. Valid values include: <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li> </ul>
     *
     * @param contentConfig The optional <code>ContentConfig</code> object specifies information
     *         about the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save transcoded files and playlists: which bucket to use, which users
     *         you want to have access to the files, the type of access you want
     *         users to have, and the storage class that you want to assign to the
     *         files. <p>If you specify values for <code>ContentConfig</code>, you
     *         must also specify values for <code>ThumbnailConfig</code>. <p>If you
     *         specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save transcoded files and playlists.</li>
     *         <li><b>Permissions</b> (Optional): The Permissions object specifies
     *         which users you want to have access to transcoded files and the type
     *         of access you want them to have. You can grant permissions to a
     *         maximum of 30 users and/or predefined Amazon S3 groups.</li>
     *         <li><b>Grantee Type</b>: Specify the type of value that appears in the
     *         <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     *         the <code>Grantee</code> object is either the canonical user ID for an
     *         AWS account or an origin access identity for an Amazon CloudFront
     *         distribution. For more information about canonical user IDs, see
     *         Access Control List (ACL) Overview in the Amazon Simple Storage
     *         Service Developer Guide. For more information about using CloudFront
     *         origin access identities to require that users use CloudFront URLs
     *         instead of Amazon S3 URLs, see Using an Origin Access Identity to
     *         Restrict Access to Your Amazon S3 Content. <important>A canonical user
     *         ID is not the same as an AWS account number.</important> </li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account.</li> <li><b>Group</b>: The
     *         value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to transcoded files and playlists. To identify the user
     *         or group, you can specify the canonical user ID for an AWS account, an
     *         origin access identity for a CloudFront distribution, the registered
     *         email address of an AWS account, or a predefined Amazon S3 group </li>
     *         <li> <b>Access</b>: The permission that you want to give to the AWS
     *         user that you specified in <code>Grantee</code>. Permissions are
     *         granted on the files that Elastic Transcoder adds to the bucket,
     *         including playlists and video files. Valid values include: <ul>
     *         <li><code>READ</code>: The grantee can read the objects and metadata
     *         for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *         <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket.</li> </ul>
     */
    public void setContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
    }
    
    /**
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to
     * save transcoded files and playlists: which bucket to use, which users
     * you want to have access to the files, the type of access you want
     * users to have, and the storage class that you want to assign to the
     * files. <p>If you specify values for <code>ContentConfig</code>, you
     * must also specify values for <code>ThumbnailConfig</code>. <p>If you
     * specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies
     * which users you want to have access to transcoded files and the type
     * of access you want them to have. You can grant permissions to a
     * maximum of 30 users and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     * the <code>Grantee</code> object is either the canonical user ID for an
     * AWS account or an origin access identity for an Amazon CloudFront
     * distribution. For more information about canonical user IDs, see
     * Access Control List (ACL) Overview in the Amazon Simple Storage
     * Service Developer Guide. For more information about using CloudFront
     * origin access identities to require that users use CloudFront URLs
     * instead of Amazon S3 URLs, see Using an Origin Access Identity to
     * Restrict Access to Your Amazon S3 Content. <important>A canonical user
     * ID is not the same as an AWS account number.</important> </li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li> <li><b>Group</b>: The
     * value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to transcoded files and playlists. To identify the user
     * or group, you can specify the canonical user ID for an AWS account, an
     * origin access identity for a CloudFront distribution, the registered
     * email address of an AWS account, or a predefined Amazon S3 group </li>
     * <li> <b>Access</b>: The permission that you want to give to the AWS
     * user that you specified in <code>Grantee</code>. Permissions are
     * granted on the files that Elastic Transcoder adds to the bucket,
     * including playlists and video files. Valid values include: <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentConfig The optional <code>ContentConfig</code> object specifies information
     *         about the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save transcoded files and playlists: which bucket to use, which users
     *         you want to have access to the files, the type of access you want
     *         users to have, and the storage class that you want to assign to the
     *         files. <p>If you specify values for <code>ContentConfig</code>, you
     *         must also specify values for <code>ThumbnailConfig</code>. <p>If you
     *         specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save transcoded files and playlists.</li>
     *         <li><b>Permissions</b> (Optional): The Permissions object specifies
     *         which users you want to have access to transcoded files and the type
     *         of access you want them to have. You can grant permissions to a
     *         maximum of 30 users and/or predefined Amazon S3 groups.</li>
     *         <li><b>Grantee Type</b>: Specify the type of value that appears in the
     *         <code>Grantee</code> object: <ul> <li><b>Canonical</b>: The value in
     *         the <code>Grantee</code> object is either the canonical user ID for an
     *         AWS account or an origin access identity for an Amazon CloudFront
     *         distribution. For more information about canonical user IDs, see
     *         Access Control List (ACL) Overview in the Amazon Simple Storage
     *         Service Developer Guide. For more information about using CloudFront
     *         origin access identities to require that users use CloudFront URLs
     *         instead of Amazon S3 URLs, see Using an Origin Access Identity to
     *         Restrict Access to Your Amazon S3 Content. <important>A canonical user
     *         ID is not the same as an AWS account number.</important> </li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account.</li> <li><b>Group</b>: The
     *         value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to transcoded files and playlists. To identify the user
     *         or group, you can specify the canonical user ID for an AWS account, an
     *         origin access identity for a CloudFront distribution, the registered
     *         email address of an AWS account, or a predefined Amazon S3 group </li>
     *         <li> <b>Access</b>: The permission that you want to give to the AWS
     *         user that you specified in <code>Grantee</code>. Permissions are
     *         granted on the files that Elastic Transcoder adds to the bucket,
     *         including playlists and video files. Valid values include: <ul>
     *         <li><code>READ</code>: The grantee can read the objects and metadata
     *         for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket. </li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *         <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         </ul> </li> <li> <b>StorageClass</b>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it
     *         stores in your Amazon S3 bucket.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
        return this;
    }

    /**
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the
     * files, the type of access you want users to have, and the storage
     * class that you want to assign to the files. <p>If you specify values
     * for <code>ContentConfig</code>, you must also specify values for
     * <code>ThumbnailConfig</code> even if you don't want to create
     * thumbnails. <p>If you specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to
     * have access to thumbnail files, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     * type of value that appears in the Grantee object: <ul> <li>
     * <b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account. </li> <li><b>Group</b>:
     * The value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to thumbnail files. To identify the user or group, you
     * can specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address
     * of an AWS account, or a predefined Amazon S3 group. </li> <li>
     * <b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include: <ul> <li><code>READ</code>: The grantee can read the
     * thumbnails and metadata for objects that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     * read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     * write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     * Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     * </ul>
     *
     * @return The <code>ThumbnailConfig</code> object specifies several values,
     *         including the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save thumbnail files, which users you want to have access to the
     *         files, the type of access you want users to have, and the storage
     *         class that you want to assign to the files. <p>If you specify values
     *         for <code>ContentConfig</code>, you must also specify values for
     *         <code>ThumbnailConfig</code> even if you don't want to create
     *         thumbnails. <p>If you specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save thumbnail files.</li>
     *         <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     *         specifies which users and/or predefined Amazon S3 groups you want to
     *         have access to thumbnail files, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     *         type of value that appears in the Grantee object: <ul> <li>
     *         <b>Canonical</b>: The value in the <code>Grantee</code> object is
     *         either the canonical user ID for an AWS account or an origin access
     *         identity for an Amazon CloudFront distribution. <important>A canonical
     *         user ID is not the same as an AWS account number.</important></li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account. </li> <li><b>Group</b>:
     *         The value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to thumbnail files. To identify the user or group, you
     *         can specify the canonical user ID for an AWS account, an origin access
     *         identity for a CloudFront distribution, the registered email address
     *         of an AWS account, or a predefined Amazon S3 group. </li> <li>
     *         <b>Access</b>: The permission that you want to give to the AWS user
     *         that you specified in <code>Grantee</code>. Permissions are granted on
     *         the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     *         values include: <ul> <li><code>READ</code>: The grantee can read the
     *         thumbnails and metadata for objects that Elastic Transcoder adds to
     *         the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     *         read the object ACL for thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     *         write the ACL for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     *         Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     *         </ul>
     */
    public PipelineOutputConfig getThumbnailConfig() {
        return thumbnailConfig;
    }
    
    /**
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the
     * files, the type of access you want users to have, and the storage
     * class that you want to assign to the files. <p>If you specify values
     * for <code>ContentConfig</code>, you must also specify values for
     * <code>ThumbnailConfig</code> even if you don't want to create
     * thumbnails. <p>If you specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to
     * have access to thumbnail files, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     * type of value that appears in the Grantee object: <ul> <li>
     * <b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account. </li> <li><b>Group</b>:
     * The value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to thumbnail files. To identify the user or group, you
     * can specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address
     * of an AWS account, or a predefined Amazon S3 group. </li> <li>
     * <b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include: <ul> <li><code>READ</code>: The grantee can read the
     * thumbnails and metadata for objects that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     * read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     * write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     * Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     * </ul>
     *
     * @param thumbnailConfig The <code>ThumbnailConfig</code> object specifies several values,
     *         including the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save thumbnail files, which users you want to have access to the
     *         files, the type of access you want users to have, and the storage
     *         class that you want to assign to the files. <p>If you specify values
     *         for <code>ContentConfig</code>, you must also specify values for
     *         <code>ThumbnailConfig</code> even if you don't want to create
     *         thumbnails. <p>If you specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save thumbnail files.</li>
     *         <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     *         specifies which users and/or predefined Amazon S3 groups you want to
     *         have access to thumbnail files, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     *         type of value that appears in the Grantee object: <ul> <li>
     *         <b>Canonical</b>: The value in the <code>Grantee</code> object is
     *         either the canonical user ID for an AWS account or an origin access
     *         identity for an Amazon CloudFront distribution. <important>A canonical
     *         user ID is not the same as an AWS account number.</important></li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account. </li> <li><b>Group</b>:
     *         The value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to thumbnail files. To identify the user or group, you
     *         can specify the canonical user ID for an AWS account, an origin access
     *         identity for a CloudFront distribution, the registered email address
     *         of an AWS account, or a predefined Amazon S3 group. </li> <li>
     *         <b>Access</b>: The permission that you want to give to the AWS user
     *         that you specified in <code>Grantee</code>. Permissions are granted on
     *         the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     *         values include: <ul> <li><code>READ</code>: The grantee can read the
     *         thumbnails and metadata for objects that Elastic Transcoder adds to
     *         the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     *         read the object ACL for thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     *         write the ACL for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     *         Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     *         </ul>
     */
    public void setThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
    }
    
    /**
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the
     * files, the type of access you want users to have, and the storage
     * class that you want to assign to the files. <p>If you specify values
     * for <code>ContentConfig</code>, you must also specify values for
     * <code>ThumbnailConfig</code> even if you don't want to create
     * thumbnails. <p>If you specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     * object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     * Elastic Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to
     * have access to thumbnail files, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     * type of value that appears in the Grantee object: <ul> <li>
     * <b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account. </li> <li><b>Group</b>:
     * The value in the <code>Grantee</code> object is one of the following
     * predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     * to have access to thumbnail files. To identify the user or group, you
     * can specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address
     * of an AWS account, or a predefined Amazon S3 group. </li> <li>
     * <b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include: <ul> <li><code>READ</code>: The grantee can read the
     * thumbnails and metadata for objects that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     * read the object ACL for thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     * write the ACL for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     * <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     * permissions for the thumbnails that Elastic Transcoder adds to the
     * Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     * Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbnailConfig The <code>ThumbnailConfig</code> object specifies several values,
     *         including the Amazon S3 bucket in which you want Elastic Transcoder to
     *         save thumbnail files, which users you want to have access to the
     *         files, the type of access you want users to have, and the storage
     *         class that you want to assign to the files. <p>If you specify values
     *         for <code>ContentConfig</code>, you must also specify values for
     *         <code>ThumbnailConfig</code> even if you don't want to create
     *         thumbnails. <p>If you specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object. <ul> <li><b>Bucket</b>: The Amazon S3 bucket in which you want
     *         Elastic Transcoder to save thumbnail files.</li>
     *         <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     *         specifies which users and/or predefined Amazon S3 groups you want to
     *         have access to thumbnail files, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups.</li> <li> <b>GranteeType</b>: Specify the
     *         type of value that appears in the Grantee object: <ul> <li>
     *         <b>Canonical</b>: The value in the <code>Grantee</code> object is
     *         either the canonical user ID for an AWS account or an origin access
     *         identity for an Amazon CloudFront distribution. <important>A canonical
     *         user ID is not the same as an AWS account number.</important></li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     *         registered email address of an AWS account. </li> <li><b>Group</b>:
     *         The value in the <code>Grantee</code> object is one of the following
     *         predefined Amazon S3 groups: <code>AllUsers</code>,
     *         <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     *         </ul> </li> <li> <b>Grantee</b>: The AWS user or group that you want
     *         to have access to thumbnail files. To identify the user or group, you
     *         can specify the canonical user ID for an AWS account, an origin access
     *         identity for a CloudFront distribution, the registered email address
     *         of an AWS account, or a predefined Amazon S3 group. </li> <li>
     *         <b>Access</b>: The permission that you want to give to the AWS user
     *         that you specified in <code>Grantee</code>. Permissions are granted on
     *         the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     *         values include: <ul> <li><code>READ</code>: The grantee can read the
     *         thumbnails and metadata for objects that Elastic Transcoder adds to
     *         the Amazon S3 bucket.</li> <li><code>READ_ACP</code>: The grantee can
     *         read the object ACL for thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> <li><code>WRITE_ACP</code>: The grantee can
     *         write the ACL for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket.</li> <li><code>FULL_CONTROL</code>: The grantee has
     *         <code>READ</code>, <code>READ_ACP</code>, and <code>WRITE_ACP</code>
     *         permissions for the thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket. </li> </ul> </li> <li> <b>StorageClass</b>: The
     *         Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the thumbnails that it stores in your Amazon S3 bucket.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineRequest withThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getInputBucket() != null) sb.append("InputBucket: " + getInputBucket() + ",");
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode()); 
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

        if (obj instanceof UpdatePipelineRequest == false) return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getInputBucket() == null ^ this.getInputBucket() == null) return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false) return false; 
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
    