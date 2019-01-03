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
 * Specifies constants defining a group of Amazon S3 users 
 * who can be granted permissions to
 * Amazon S3 buckets and objects. This enumeration contains all the valid Amazon S3
 * group grantees.
 */
public enum GroupGrantee implements Grantee {

    /**
     * Grants anonymous access to any Amazon S3 object or bucket. Any user will
     * be able to access the object by omitting the AWS Key ID and Signature
     * from a request.
     * <p>
     * Amazon highly recommends that users do not grant the 
     * <code>AllUsers</code> group write
     * access to their buckets. If granted, users will have no control over the objects
     * others can store and their associated charges.
     * </p>
     */
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),

    /**
     * Grants access to buckets or objects to anyone with an Amazon AWS account.
     * Although this is inherently insecure as any AWS user who is aware of the
     * bucket or object will be able to access it, users may find this authentication
     * method useful.
     */
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),

    /**
     * Grants access to Amazon S3 log delivery so that an S3 bucket can receive
     * server access logs. Turning on server access logging for an Amazon S3
     * bucket requires that the bucket receiving the logs is granted permission
     * for the log delivery group to deliver logs.
     */
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.model.Grantee#getTypeIdentifier()
     */
    @Override
    public String getTypeIdentifier() {
        return "uri";
    }

    private String groupUri;
    
    private GroupGrantee(String groupUri) {
        this.groupUri = groupUri;
    }
    
    /**
     * Gets the group grantee's URI.
     * 
     * @return The group grantee's URI. 
     */
    public String getIdentifier() {
        return groupUri;
    }

    /**
     * For internal use only. Group grantees have preset identifiers that cannot
     * be modified.
     */
    public void setIdentifier(String id) {
        throw new UnsupportedOperationException(
                "Group grantees have preset identifiers that cannot be modified.");
    }
    
    /**
     * @see java.lang.Enum#toString()
     */
    public String toString() {
        return "GroupGrantee [" + groupUri + "]";
    }

    /**
     * Gets the {@link GroupGrantee} enumeration value
     * with the specified Amazon S3 group URI (eg.
     * http://acs.amazonaws.com/groups/global/AllUsers).
     * Returns <code>null</code> if an invalid
     * Amazon S3 group URI is specified.
     * 
     * @param groupUri
     *            A string representation of an Amazon S3 group URI (eg.
     *            http://acs.amazonaws.com/groups/global/AllUsers)
     * 
     * @return The {@link GroupGrantee} object represented by the given Amazon S3 group
     *         URI string. Returns <code>null</code>
     *         if the string isn't a valid Amazon S3 group
     *         URI.
     */
    public static GroupGrantee parseGroupGrantee(String groupUri) {
        for (GroupGrantee grantee : GroupGrantee.values()) {
            if (grantee.groupUri.equals(groupUri)) {
                return grantee;
            }
        }
     
        return null;
    }

}
