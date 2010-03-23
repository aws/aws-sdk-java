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
 * Represents an access permission, as granted to grantees in an
 * {@link AccessControlList}. Only a limited set of permission are available,
 * and each one is represented as a member of this enum.
 */
public enum Permission {

    /**
     * Provides READ, WRITE, READ_ACP, and WRITE_ACP permissions.
     * <p>
     * It does not convey additional rights and is provided only for
     * convenience.
     */
    FullControl("FULL_CONTROL"),

    /**
     * When applied to a bucket, grants permission to list the bucket.
     * <p>
     * When applied to an object, grants permission to read the object data
     * and/or metadata.
     */
    Read("READ"),

    /**
     * When applied to a bucket, grants permission to create, overwrite, and
     * delete any object in the bucket.
     * <p>
     * This permission is not supported for objects.
     */
    Write("WRITE"),

    /**
     * Grants permission to read the ACL for the applicable bucket or object.
     * <p>
     * The owner of a bucket or object always has this permission implicitly.
     */
    ReadAcp("READ_ACP"),

    /**
     * Gives permission to overwrite the ACP for the applicable bucket or
     * object.
     * <p>
     * The owner of a bucket or object always has this permission implicitly.
     * <p>
     * Granting this permission is equivalent to granting FULL_CONTROL because
     * the grant recipient can make any changes to the ACP.
     */
    WriteAcp("WRITE_ACP");
    
    private String permissionString;
    
    private Permission(String permissionString) {
        this.permissionString = permissionString;
    }

    /**
     * Returns the string representation of this permission object as defined by
     * Amazon S3, eg <tt>FULL_CONTROL</tt>
     * 
     * @return the string representation of this permission object as defined by
     *         Amazon S3, eg <tt>FULL_CONTROL</tt>
     */
    public String toString() {
        return permissionString;
    }

    /**
     * @param str
     *            a string representation of an S3 permission, eg
     *            <tt>FULL_CONTROL</tt>
     * 
     * @return the Permission object represented by the given permission string,
     *         or null if the string isn't a valid representation of an S3
     *         permission.
     */
    public static Permission parsePermission(String str) {
        for (Permission permission : Permission.values()) {
            if (permission.permissionString.equals(str)) {
                return permission;
            }
        }
     
        return null;
    }
    
}
