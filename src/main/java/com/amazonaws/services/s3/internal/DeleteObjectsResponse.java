/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.internal;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultiObjectDeleteException.DeleteError;

/**
 * Service response for deleteObjects API call. Not exposed to clients directly,
 * but broken up into two classes to differentiate normal and exceptional
 * completion of the API.
 * 
 * @see DeleteObjectsResult
 * @see MultiObjectDeleteException
 * @see AmazonS3Client#deleteObjects(com.amazonaws.services.s3.model.DeleteObjectsRequest)
 */
public class DeleteObjectsResponse {

    public DeleteObjectsResponse(List<DeletedObject> deletedObjects, List<DeleteError> errors) {
        this.deletedObjects = deletedObjects;
        this.errors = errors;
    }

    public List<DeletedObject> getDeletedObjects() {
        return deletedObjects;
    }

    public void setDeletedObjects(List<DeletedObject> deletedObjects) {
        this.deletedObjects = deletedObjects;
    }

    public List<DeleteError> getErrors() {
        return errors;
    }

    public void setErrors(List<DeleteError> errors) {
        this.errors = errors;
    }

    private List<DeletedObject> deletedObjects = new ArrayList<DeletedObject>();
    private List<DeleteError> errors = new ArrayList<DeleteError>();
}
