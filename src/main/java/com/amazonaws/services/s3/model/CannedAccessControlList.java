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
package com.amazonaws.services.s3.model;

/**
 * CannedAccessControlLists are commonly used AccessControlLists that can be
 * used as a shortcut when applying an AccessControlList to Amazon S3 buckets
 * and objects. Only a few commonly used configurations are available, but they
 * offer an alternative to manually creating a custom ACL. If more specific
 * access control is desired, you can create a custom {@link AccessControlList}.
 * 
 * @see AccessControlList
 */
public enum CannedAccessControlList {
    /**
     * Owner gets {@link Permission#FullControl}. No one else has access rights.
     * <p>
     * This is the default access control policy for any new buckets or objects.
     */
    Private("private"),

    /**
     * Owner gets {@link Permission#FullControl} and the
     * {@link GroupGrantee#AllUsers} group grantee is granted
     * {@link Permission#Read} access.
     * <p>
     * If this policy is used on an object, it can be read from a browser with
     * no authentication.
     */
    PublicRead("public-read"),

    /**
     * Owner gets {@link Permission#FullControl} and the
     * {@link GroupGrantee#AllUsers} group grantee is granted
     * {@link Permission#Read} and {@link Permission#Write} access.
     * <p>
     * This can be a useful policy to apply to a bucket, but is generally not
     * recommended.
     */
    PublicReadWrite("public-read-write"),

    /**
     * Owner gets {@link Permission#FullControl} and the
     * {@link GroupGrantee#AuthenticatedUsers} group grantee is granted
     * {@link Permission#Read} access.
     */
    AuthenticatedRead("authenticated-read"),

    /**
     * Owner gets {@link Permission#FullControl} and the
     * {@link GroupGrantee#LogDelivery} group grantee is granted
     * {@link Permission#Write} access so that access logs can be delivered.
     * <p>
     * This is a useful access policy to use if you want to enable Amazon S3
     * bucket logging for one of your buckets, since it requires a destination
     * bucket with these permissions.
     */
    LogDeliveryWrite("log-delivery-write"),

    /**
     * The owner of the bucket (not necessarily the same as the owner of the
     * object) gets {@link Permission#Read}.
     * <p>
     * This is a useful access policy if you need to upload objects to someone
     * else's bucket and need to grant the bucket owner access to read the
     * object, but don't want to give public read access for the object.
     */
    BucketOwnerRead("bucket-owner-read"),

    /**
     * The owner of the bucket (not necessarily the same as the owner of the
     * object) gets {@link Permission#FullControl}.
     * <p>
     * This is a useful access policy if you need to upload objects to someone
     * else's bucket and need to grant the bucket owner full access to the
     * object, but don't want to give full access to all users.
     */
    BucketOwnerFullControl("bucket-owner-full-control");
    
    
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
