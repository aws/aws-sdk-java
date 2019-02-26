/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request object containing all the options for setting a object's Access
 * Control List (ACL).
 */
public class SetObjectAclRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the bucket containing the object whose ACL is being set. */
    private final String bucketName;

    /** The name of the object whose ACL is being set. */
    private final String key;

    /** The version ID of the object version whose ACL is being set. */
    private final String versionId;

    /** The custom ACL to apply to the specified object. */
    private final AccessControlList acl;

    /** The canned ACL to apply to the specified object. */
    private final CannedAccessControlList cannedAcl;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Constructs a new SetObjectAclRequest object, ready to set the specified
     * ACL on the specified object when this request is executed.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The name of the object whose ACL is being set.
     * @param acl
     *            The custom Access Control List containing the access rules to
     *            apply to the specified bucket when this request is executed.
     */
    public SetObjectAclRequest(String bucketName, String key,
            AccessControlList acl) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = null;

        this.acl = acl;
        this.cannedAcl = null;
    }

    /**
     * Constructs a new SetObjectAclRequest object, ready to set the specified
     * ACL on the specified object when this request is executed.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The name of the object whose ACL is being set.
     * @param acl
     *            The Canned Access Control List to apply to the specified
     *            bucket when this request is executed.
     */
    public SetObjectAclRequest(String bucketName, String key,
            CannedAccessControlList acl) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = null;

        this.acl = null;
        this.cannedAcl = acl;
    }

    /**
     * Constructs a new SetObjectAclRequest object, ready to set the specified
     * ACL on the specified object when this request is executed.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The name of the object whose ACL is being set.
     * @param versionId
     *            The version ID of the object version whose ACL is being set.
     * @param acl
     *            The custom Access Control List containing the access rules to
     *            apply to the specified bucket when this request is executed.
     */
    public SetObjectAclRequest(String bucketName, String key, String versionId,
            AccessControlList acl) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;

        this.acl = acl;
        this.cannedAcl = null;
    }

    /**
     * Constructs a new SetObjectAclRequest object, ready to set the specified
     * ACL on the specified object when this request is executed.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The name of the object whose ACL is being set.
     * @param versionId
     *            The version ID of the object version whose ACL is being set.
     * @param acl
     *            The Canned Access Control List to apply to the specified
     *            bucket when this request is executed.
     */
    public SetObjectAclRequest(String bucketName, String key, String versionId,
            CannedAccessControlList acl) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;

        this.acl = null;
        this.cannedAcl = acl;
    }

    /**
     * Returns the name of the bucket containing the object whose ACL is being
     * set.
     *
     * @return The name of the bucket containing the object whose ACL is being
     *         set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Returns the name of the object whose ACL is being set.
     *
     * @return The name of the object whose ACL is being set.
     */
    public String getKey() {
        return key;
    }

    /**
     * Returns the version ID of the object version whose ACL is being set.
     *
     * @return The version ID of the object version whose ACL is being set.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Returns the custom ACL to be applied to the specified object when this
     * request is executed. A request can use either a custom ACL or a canned
     * ACL, but not both.
     *
     * @return The custom ACL to be applied to the specified bucket when this
     *         request is executed, or null if the request is to be executed
     *         with a canned ACL.
     */
    public AccessControlList getAcl() {
        return acl;
    }

    /**
     * Returns the canned ACL to be applied to the specified object when this
     * request is executed. A request can use either a custom ACL or a canned
     * ACL, but not both.
     *
     * @return The canned ACL to be applied to the specified bucket when this
     *         request is executed, or null if the request is to be executed
     *         with a custom ACL.
     */
    public CannedAccessControlList getCannedAcl() {
        return cannedAcl;
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated SetObjectAclRequest object so that additional method calls can be
     * chained together.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     *
     * @return The updated SetObjectAclRequest object.
     */
    public SetObjectAclRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }
}
