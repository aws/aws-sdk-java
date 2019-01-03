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
import java.util.Collection;
import java.util.List;

import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject;

/**
 * Exception for partial or total failure of the multi-object delete API,
 * including the errors that occurred. For successfully deleted objects, refer
 * to {@link MultiObjectDeleteException#getDeletedObjects()}.
 */
public class MultiObjectDeleteException extends AmazonS3Exception implements Serializable {

    private static final long serialVersionUID = -2004213552302446866L;

    private final List<DeleteError> errors = new ArrayList<DeleteError>();
    private final List<DeletedObject> deletedObjects = new ArrayList<DeleteObjectsResult.DeletedObject>();

    public MultiObjectDeleteException(Collection<DeleteError> errors, Collection<DeletedObject> deletedObjects) {
        super("One or more objects could not be deleted");
        this.deletedObjects.addAll(deletedObjects);
        this.errors.addAll(errors);
    }

    /**
     * Always returns {@code null} since this exception represents a
     * "successful" response from the service with no top-level error code. Use
     * {@link #getErrors()} to retrieve a list of objects whose deletion failed,
     * along with the error code and message for each individual failure.
     */
    @Override
    public String getErrorCode() {
        return super.getErrorCode();
    }

    /**
     * Returns the list of successfully deleted objects from this request. If
     * {@link DeleteObjectsRequest#getQuiet()} is true, only error responses
     * will be returned from s3.
     */
    public List<DeletedObject> getDeletedObjects() {
        return deletedObjects;
    }

    /**
     * Returns the list of errors from the attempted delete operation.
     */
    public List<DeleteError> getErrors() {
        return errors;
    }

    /**
     * An error that occurred when deleting an object.
     */
    public static class DeleteError implements Serializable {

        private String key;
        private String versionId;
        private String code;
        private String message;

        /**
         * Returns the key of the object that couldn't be deleted.
         */
        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        /**
         * Returns the versionId of the object that couldn't be deleted.
         */
        public String getVersionId() {
            return versionId;
        }

        public void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        /**
         * Returns the status code for the failed delete.
         */
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        /**
         * Returns a description of the failure.
         */
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
