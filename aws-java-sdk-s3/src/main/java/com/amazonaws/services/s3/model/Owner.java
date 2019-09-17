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
 * Represents the owner of an Amazon S3 bucket.
 */
public class Owner implements Serializable {
    private static final long serialVersionUID = -8916731456944569115L;

    private String displayName;
    private String id;

    /**
     * <p>
     * Constructs a new {@link Owner} without specifying
     * an ID or display name.
     * </p>
     * 
     * @see Owner#Owner(String, String)
     */
    public Owner() {
    }

    /**
     * <p>
     * Constructs a new {@link Owner} with the specified
     * ID and display name. 
     * </p>
     * 
     * @param id 
     *      The ID for the owner.
     * @param displayName 
     *      The display name for the owner.
     * @see Owner#Owner()
     */
    public Owner(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "S3Owner [name=" + getDisplayName() + ",id=" + getId() + "]";
    }

    /**
     * <p>
     * Gets the ID of the owner.
     * </p>
     * 
     * @return The ID of the owner.
     * 
     * @see Owner#setId(String)
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Sets the ID of the owner.
     * </p>
     * 
     * @param id
     *      The ID of the owner.
     *      
     * @see Owner#getId()
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Gets the display name of the owner.
     * </p>
     * 
     * @return
     *      The display name of the owner.
     *      
     * @see Owner#setDisplayName(String)     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Sets the display name of the owner.
     * </p>
     * 
     * @param name
     *      The display name of the owner.
     *      
     * @see Owner#getDisplayName()
     */
    public void setDisplayName(String name) {
        this.displayName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }

        Owner otherOwner = (Owner)obj;

        String otherOwnerId = otherOwner.getId();
        String otherOwnerName = otherOwner.getDisplayName();
        String thisOwnerId = this.getId();
        String thisOwnerName = this.getDisplayName();

        if (otherOwnerId == null) otherOwnerId = "";
        if (otherOwnerName == null) otherOwnerName = "";
        if (thisOwnerId == null) thisOwnerId = "";
        if (thisOwnerName == null) thisOwnerName = "";

        return (otherOwnerId.equals(thisOwnerId) &&
                otherOwnerName.equals(thisOwnerName));
    }

    @Override
    public int hashCode() {
        if (id != null) {
            return id.hashCode();
        } else {
            return 0;
        }
    }

}
