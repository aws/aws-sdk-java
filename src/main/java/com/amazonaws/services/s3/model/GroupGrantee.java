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
 * Represents a group of Amazon S3 users who can be granted permissions to
 * Amazon S3 buckets and objects. This enum contains all the valid Amazon S3
 * group grantees.
 */
public enum GroupGrantee implements Grantee {

    /**
     * Grants anonymous access to any Amazon S3 object or bucket. Any user will
     * be able to access the object by omitting the AWS Key ID and Signature
     * from a request.
     * <p>
     * We highly recommend that you do not grant the AllUsers group write
     * access to your buckets as you will have no control over the objects
     * others can store and their associated charges.
     */
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),

    /**
     * Grants access to buckets or objects to anyone with an Amazon AWS account.
     * Although this is inherently insecure as any AWS user who is aware of the
     * bucket or object will be able to access it, you might find this
     * authentication method useful.
     */
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),

    /**
     * Grants access to Amazon S3 log delivery so that an S3 bucket can receive
     * server access logs. Turning on server access logging for an Amazon S3
     * bucket requires that the bucket receiving the logs is granted permission
     * for the log delivery group to deliver logs.
     */
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");


    private String groupUri;
    
    private GroupGrantee(String groupUri) {
        this.groupUri = groupUri;
    }
    
    /**
     * Returns the group grantee's URI.
     */
    public String getIdentifier() {
        return groupUri;
    }

    /**
     * Unsupported operation. Group grantees have preset identifiers that cannot
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
     * Returns the GroupGrantee with the specified Amazon S3 group URI (eg
     * http://acs.amazonaws.com/groups/global/AllUsers) or null if an invalid
     * Amazon S3 group URI is specified.
     * 
     * @param groupUri
     *            a string representation of an Amazon S3 group URI, eg
     *            <tt>http://acs.amazonaws.com/groups/global/AllUsers</tt>
     * 
     * @return the GroupGrantee object represented by the given Amazon S3 group
     *         URI string, or null if the string isn't a valid Amazon S3 group
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
