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

import java.io.Serializable;

public class Owner implements Serializable {
    private static final long serialVersionUID = -8916731456944569115L;

    private String displayName;
    private String id;

    public Owner() {
    }

    public Owner(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String toString() {
        return "S3Owner [name=" + getDisplayName() + ",id=" + getId() + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

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
