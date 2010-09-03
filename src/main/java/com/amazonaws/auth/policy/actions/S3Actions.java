/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.auth.policy.resources.S3BucketResource;
import com.amazonaws.auth.policy.resources.S3ObjectResource;
import com.amazonaws.services.s3.AmazonS3;

/**
 * The available AWS access control policy actions for Amazon S3.
 *
 * @see Statement#setActions(java.util.Collection)
 */
public enum S3Actions implements Action {

    /** Represents any action being taken on Amazon S3. */
    AllS3Actions("s3:*"),

    /**
     * Action for retrieving an object (GET), object metadata (HEAD) or an object
     * torrent.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest)
     * @see AmazonS3#getObjectMetadata(com.amazonaws.services.s3.model.GetObjectMetadataRequest)
     */
    GetObject("s3:GetObject"),

    /**
     * Action for retrieving a object version (GET), object metadata for an
     * object version (HEAD) or a torrent for an object version.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest)
     * @see AmazonS3#getObjectMetadata(com.amazonaws.services.s3.model.GetObjectMetadataRequest)
     */
    GetObjectVersion("s3:GetObjectVersion"),

    /**
     * Action for uploading an object (PUT or POST).
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#putObject(com.amazonaws.services.s3.model.PutObjectRequest)
     */
    PutObject("s3:PutObject"),

    /**
     * Action for retrieving an object's ACL.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#getObjectAcl(String, String)
     */
    GetObjectAcl("s3:GetObjectAcl"),

    /**
     * Action for retrieving an object version's ACL.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#getObjectAcl(String, String, String)
     */
    GetObjectVersionAcl("s3:GetObjectVersionAcl"),

    /**
     * Action for setting an object's ACL.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#setObjectAcl(String, String, com.amazonaws.services.s3.model.AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    SetObjectAcl("s3:PutObjectAcl"),

    /**
     * Action for setting an object version's ACL.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#setObjectAcl(String, String, String, com.amazonaws.services.s3.model.AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    SetObjectVersionAcl("s3:PutObjectAclVersion"),

    /**
     * Action for deleting an object.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#deleteObject(com.amazonaws.services.s3.model.DeleteObjectRequest)
     */
    DeleteObject("s3:DeleteObject"),

    /**
     * Action for deleting an object version.
     * <p>
     * Valid for use with {@link S3ObjectResource} resources.
     *
     * @see AmazonS3#deleteVersion(com.amazonaws.services.s3.model.DeleteVersionRequest)
     */
    DeleteObjectVersion("s3:DeleteObjectVersion"),

    /**
     * Action for creating a new Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#createBucket(com.amazonaws.services.s3.model.CreateBucketRequest)
     */
    CreateBucket("s3:CreateBucket"),

    /**
     * Action for deleting an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#deleteBucket(com.amazonaws.services.s3.model.DeleteBucketRequest)
     */
    DeleteBucket("s3:DeleteBucket"),

    /**
     * Action for listing the objects in an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#listObjects(com.amazonaws.services.s3.model.ListObjectsRequest)
     */
    ListObjects("s3:ListBucket"),

    /**
     * Action for listing the object versions in an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#listVersions(com.amazonaws.services.s3.model.ListVersionsRequest)
     */
    ListObjectVersions("s3:ListBucketVersions"),

    /**
     * Action for listing the Amazon S3 buckets in an account.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#listBuckets()
     */
    ListBuckets("s3:ListAllMyBuckets"),

    /**
     * Action for retrieving the ACL of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#getBucketAcl(String)
     */
    GetBucketAcl("s3:GetBucketAcl"),

    /**
     * Action for setting the ACL of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#setBucketAcl(String, com.amazonaws.services.s3.model.AccessControlList)
     * @see AmazonS3#setBucketAcl(String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    SetBucketAcl("s3:PutBucketAcl"),

    /**
     * Action for retrieving the versioning configuration of an Amazon S3
     * bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#getBucketVersioningConfiguration(String)
     */
    GetBucketVersioningConfiguration("s3:GetBucketVersioning"),

    /**
     * Action for setting the versioning configuration of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#setBucketVersioningConfiguration(com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest)
     */
    SetBucketVersioningConfiguration("s3:PutBucketVersioning"),

    /**
     * Action for retrieving the requester pays status of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     */
    GetBucketRequesterPays("s3:GetBucketRequesterPays"),

    /**
     * Action for setting the requester pays status of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     */
    SetBucketRequesterPays("s3:PutBucketRequesterPays"),

    /**
     * Action for retrieving the bucket location of an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#getBucketLocation(String)
     */
    GetBucketLocation("s3:GetBucketLocation"),

    /**
     * Action for retrieving the access control policy for an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#getBucketPolicy(String)
     */
    GetBucketPolicy("s3:GetBucketPolicy"),

    /**
     * Action for setting the access control policy for an Amazon S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#setBucketPolicy(String, String)
     */
    SetBucketPolicy("s3:PutBucketPolicy"),

    /**
     * Action for retrieving the bucket notification configuration for an Amazon
     * S3 bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#getBucketNotificationConfiguration(String)
     */
    GetBucketNotificationConfiguration("s3:GetBucketNotification"),

    /**
     * Action for setting the bucket notification configuration for an Amazon S3
     * bucket.
     * <p>
     * Valid for use with {@link S3BucketResource} resources.
     *
     * @see AmazonS3#setBucketNotificationConfiguration(String,
     *      com.amazonaws.services.s3.model.BucketNotificationConfiguration)
     */
    SetBucketNotificationConfiguration("s3:PutBucketNotification");


    private final String action;

    private S3Actions(String action) {
        this.action = action;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.policy.Action#getId()
     */
    public String getActionName() {
        return this.action;
    }

}