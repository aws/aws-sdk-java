/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workdocs.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ActivityType {

    DOCUMENT_CHECKED_IN("DOCUMENT_CHECKED_IN"),
    DOCUMENT_CHECKED_OUT("DOCUMENT_CHECKED_OUT"),
    DOCUMENT_RENAMED("DOCUMENT_RENAMED"),
    DOCUMENT_VERSION_UPLOADED("DOCUMENT_VERSION_UPLOADED"),
    DOCUMENT_VERSION_DELETED("DOCUMENT_VERSION_DELETED"),
    DOCUMENT_VERSION_VIEWED("DOCUMENT_VERSION_VIEWED"),
    DOCUMENT_VERSION_DOWNLOADED("DOCUMENT_VERSION_DOWNLOADED"),
    DOCUMENT_RECYCLED("DOCUMENT_RECYCLED"),
    DOCUMENT_RESTORED("DOCUMENT_RESTORED"),
    DOCUMENT_REVERTED("DOCUMENT_REVERTED"),
    DOCUMENT_SHARED("DOCUMENT_SHARED"),
    DOCUMENT_UNSHARED("DOCUMENT_UNSHARED"),
    DOCUMENT_SHARE_PERMISSION_CHANGED("DOCUMENT_SHARE_PERMISSION_CHANGED"),
    DOCUMENT_SHAREABLE_LINK_CREATED("DOCUMENT_SHAREABLE_LINK_CREATED"),
    DOCUMENT_SHAREABLE_LINK_REMOVED("DOCUMENT_SHAREABLE_LINK_REMOVED"),
    DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED("DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED"),
    DOCUMENT_MOVED("DOCUMENT_MOVED"),
    DOCUMENT_COMMENT_ADDED("DOCUMENT_COMMENT_ADDED"),
    DOCUMENT_COMMENT_DELETED("DOCUMENT_COMMENT_DELETED"),
    DOCUMENT_ANNOTATION_ADDED("DOCUMENT_ANNOTATION_ADDED"),
    DOCUMENT_ANNOTATION_DELETED("DOCUMENT_ANNOTATION_DELETED"),
    FOLDER_CREATED("FOLDER_CREATED"),
    FOLDER_DELETED("FOLDER_DELETED"),
    FOLDER_RENAMED("FOLDER_RENAMED"),
    FOLDER_RECYCLED("FOLDER_RECYCLED"),
    FOLDER_RESTORED("FOLDER_RESTORED"),
    FOLDER_SHARED("FOLDER_SHARED"),
    FOLDER_UNSHARED("FOLDER_UNSHARED"),
    FOLDER_SHARE_PERMISSION_CHANGED("FOLDER_SHARE_PERMISSION_CHANGED"),
    FOLDER_SHAREABLE_LINK_CREATED("FOLDER_SHAREABLE_LINK_CREATED"),
    FOLDER_SHAREABLE_LINK_REMOVED("FOLDER_SHAREABLE_LINK_REMOVED"),
    FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED("FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED"),
    FOLDER_MOVED("FOLDER_MOVED");

    private String value;

    private ActivityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ActivityType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ActivityType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ActivityType enumEntry : ActivityType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
