/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Specifies constants defining a canned access control list.
 * <p>
 * Canned access control lists are commonly used access control lists (ACL) that can be
 * used as a shortcut when applying an access control list to Amazon S3 buckets
 * and objects. Only a few commonly used configurations are available, but they
 * offer an alternative to manually creating a custom ACL. If more specific
 * access control is desired, users can create a custom {@link AccessControlList}.
 * </p>
 *
 * @see AccessControlList
 */
public enum CannedAccessControlList {
    /**
     * Specifies the owner is granted {@link Permission#FullControl}. No one else has access rights.
     * <p>
     * This is the default access control policy for any new buckets or objects.
     * </p>
     */
    Private("private"),

    /**
     * Specifies the owner is granted {@link Permission#FullControl} and the
     * {@link GroupGrantee#AllUsers} group grantee is granted
     * {@link Permission#Read} access.
     * <p>
     * If this policy is used on an object, it can be read from a browser without
     * authentication.
     * </p>
     */
    PublicRead("public-read"),

    /**
     * Specifies the owner is granted {@link Permission#FullControl} and the
     * {@link GroupGrantee#AllUsers} group grantee is granted
     * {@link Permission#Read} and {@link Permission#Write} access.
     * <p>
     * This access policy is not recommended for general use.
     * </p>
     */
    PublicReadWrite("public-read-write"),

    /**
     * Specifies the owner is granted {@link Permission#FullControl} and the
     * {@link GroupGrantee#AuthenticatedUsers} group grantee is granted
     * {@link Permission#Read} access.
     */
    AuthenticatedRead("authenticated-read"),

    /**
     * Specifies the owner is granted {@link Permission#FullControl} and the
     * {@link GroupGrantee#LogDelivery} group grantee is granted
     * {@link Permission#Write} access so that access logs can be delivered.
     * <p>
     * Use this access policy to enable Amazon S3 bucket logging for a bucket.
     * The destination bucket requires these permissions so that access logs can
     * be delivered.
     * </p>
     */
    LogDeliveryWrite("log-delivery-write"),

    /**
     * Specifies the owner of the bucket, but not necessarily the same as the owner of the
     * object, is granted {@link Permission#Read}.
     * <p>
     * Use this access policy when uploading objects to another owner's bucket.
     * This access policy grants the bucket owner read access to the object,
     * but does not give read access for all users.
     * </p>
     */
    BucketOwnerRead("bucket-owner-read"),

    /**
     * Specifies the owner of the bucket, but not necessarily the same as the owner of the
     * object, is granted {@link Permission#FullControl}.
     * <p>
     * Use this access policy to upload objects to another owner's bucket.  This
     * access policy grants the bucket owner full access to the object, but does
     * not give full access to all users.
     * </p>
     */
    BucketOwnerFullControl("bucket-owner-full-control"),

    /**
     * Specifies the owner is granted {@link Permission#FullControl}. Amazon EC2
     * is granted {@link Permission#Read} access to GET an Amazon Machine Image
     * (AMI) bundle from Amazon S3.
     */
    AwsExecRead("aws-exec-read");

    /** The Amazon S3 x-amz-acl header value representing the canned acl */
    private final String cannedAclHeader;

    private CannedAccessControlList(String cannedAclHeader) {
        this.cannedAclHeader = cannedAclHeader;
    }

    /**
     * Returns the Amazon S3 x-amz-acl header value for this canned acl.
     */
    public String toString() {
        return cannedAclHeader;
    }

}
