/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

/**
 * Specifies a grant, consisting of one grantee and one permission.
 * 
 * @see Grant#Grant(Grantee, Permission)
 */
public class Grant implements Serializable {
    private Grantee grantee = null;
    private Permission permission = null;

    /**
     * Constructs a new {@link Grant} object using the specified grantee and permission
     * objects.
     *
     * @param grantee
     *            The grantee being granted a permission by this grant.
     * @param permission
     *            The permission being granted to the grantee by this grant.
     */
    public Grant(Grantee grantee, Permission permission) {
        this.grantee = grantee;
        this.permission = permission;
    }

    /**
     * Gets the grantee being granted a permission by this grant.
     *
     * @return The grantee being granted a permission by this grant.
     * 
     * @see Grant#getPermission()
     */
    public Grantee getGrantee() {
        return grantee;
    }

    /**
     * Gets the permission being granted to the grantee by this grant.
     *
     * @return The permission being granted to the grantee by this grant.
     * 
     * @see Grant#getGrantee()
     */
    public Permission getPermission() {
        return permission;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((grantee == null) ? 0 : grantee.hashCode());
        result = prime * result + ((permission == null) ? 0 : permission.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Grant other = (Grant) obj;
        if ( grantee == null ) {
            if ( other.grantee != null )
                return false;
        } else if ( !grantee.equals(other.grantee) )
            return false;
        if ( permission != other.permission )
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Grant [grantee=" + grantee + ", permission=" + permission + "]";
    }
}
