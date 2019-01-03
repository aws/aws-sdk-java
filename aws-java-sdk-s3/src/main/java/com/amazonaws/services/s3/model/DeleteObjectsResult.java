/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;

/**
 * Successful response to {@link AmazonS3#deleteObjects(DeleteObjectsRequest)}.
 * If one or more objects couldn't be deleted as instructed, a
 * {@link MultiObjectDeleteException} is thrown instead.
 *
 * @see AmazonS3#deleteObjects(DeleteObjectsRequest)
 */
public class DeleteObjectsResult implements Serializable, S3RequesterChargedResult {

    private final List<DeletedObject> deletedObjects = new ArrayList<DeleteObjectsResult.DeletedObject>();

    /**
     * Indicate if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    public DeleteObjectsResult(List<DeletedObject> deletedObjects) {
        this(deletedObjects, false);
    }

    public DeleteObjectsResult(List<DeletedObject> deletedObjects, boolean isRequesterCharged) {
        this.deletedObjects.addAll(deletedObjects);
        this.setRequesterCharged(isRequesterCharged);
    }

    /**
     * Returns the list of successfully deleted objects from this request. If
     * {@link DeleteObjectsRequest#getQuiet()} is true, only error responses
     * will be returned from s3, so this list will be empty.
     */
    public List<DeletedObject> getDeletedObjects() {
        return deletedObjects;
    }

    @Override
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }

    /**
     * A successfully deleted object.
     */
    static public class DeletedObject implements Serializable {

        private String key;
        private String versionId;
        private boolean deleteMarker;
        private String deleteMarkerVersionId;

        /**
         * Returns the key that was successfully deleted.
         */
        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        /**
         * Returns the version deleted, or null for unversioned objects.
         */
        public String getVersionId() {
            return versionId;
        }

        public void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        /**
         * Returns whether the object deleted was a delete marker.
         */
        public boolean isDeleteMarker() {
            return deleteMarker;
        }

        public void setDeleteMarker(boolean deleteMarker) {
            this.deleteMarker = deleteMarker;
        }

        /**
         * Returns the versionId for the delete marker that was created when
         * doing a non-versioned delete in a versioned bucket.
         */
        public String getDeleteMarkerVersionId() {
            return deleteMarkerVersionId;
        }

        public void setDeleteMarkerVersionId(String deleteMarkerVersionId) {
            this.deleteMarkerVersionId = deleteMarkerVersionId;
        }

    }

}
