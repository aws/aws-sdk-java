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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribeUserProfiles</code> request.
 * </p>
 */
public class DescribeUserProfilesResult implements Serializable {

    /**
     * A <code>Users</code> object that describes the specified users.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile> userProfiles;

    /**
     * A <code>Users</code> object that describes the specified users.
     *
     * @return A <code>Users</code> object that describes the specified users.
     */
    public java.util.List<UserProfile> getUserProfiles() {
        if (userProfiles == null) {
              userProfiles = new com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile>();
              userProfiles.setAutoConstruct(true);
        }
        return userProfiles;
    }
    
    /**
     * A <code>Users</code> object that describes the specified users.
     *
     * @param userProfiles A <code>Users</code> object that describes the specified users.
     */
    public void setUserProfiles(java.util.Collection<UserProfile> userProfiles) {
        if (userProfiles == null) {
            this.userProfiles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile> userProfilesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile>(userProfiles.size());
        userProfilesCopy.addAll(userProfiles);
        this.userProfiles = userProfilesCopy;
    }
    
    /**
     * A <code>Users</code> object that describes the specified users.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userProfiles A <code>Users</code> object that describes the specified users.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUserProfilesResult withUserProfiles(UserProfile... userProfiles) {
        if (getUserProfiles() == null) setUserProfiles(new java.util.ArrayList<UserProfile>(userProfiles.length));
        for (UserProfile value : userProfiles) {
            getUserProfiles().add(value);
        }
        return this;
    }
    
    /**
     * A <code>Users</code> object that describes the specified users.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userProfiles A <code>Users</code> object that describes the specified users.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUserProfilesResult withUserProfiles(java.util.Collection<UserProfile> userProfiles) {
        if (userProfiles == null) {
            this.userProfiles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile> userProfilesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserProfile>(userProfiles.size());
            userProfilesCopy.addAll(userProfiles);
            this.userProfiles = userProfilesCopy;
        }

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
        if (getUserProfiles() != null) sb.append("UserProfiles: " + getUserProfiles() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserProfiles() == null) ? 0 : getUserProfiles().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeUserProfilesResult == false) return false;
        DescribeUserProfilesResult other = (DescribeUserProfilesResult)obj;
        
        if (other.getUserProfiles() == null ^ this.getUserProfiles() == null) return false;
        if (other.getUserProfiles() != null && other.getUserProfiles().equals(this.getUserProfiles()) == false) return false; 
        return true;
    }
    
}
    