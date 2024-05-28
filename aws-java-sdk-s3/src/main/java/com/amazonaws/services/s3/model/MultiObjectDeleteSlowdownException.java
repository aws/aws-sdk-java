/*
 * Copyright 2011-2024 Amazon Technologies, Inc.
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

/**
 * Exception for partial or total failure of the multi-object delete API, due to a SlowDown error. This is an
 * exceptional case in which the returned response from S3 will not indicate which objects were successfully deleted
 * and which objects failed to delete. You will need to make an {@code ListObjects} call to determine which objects
 * still need to be deleted.
 */
public class MultiObjectDeleteSlowdownException extends AmazonS3Exception implements Serializable {
    public MultiObjectDeleteSlowdownException() {
        super("A SlowDown error occurred. This could be due to index-level throttling. Progress of deleted objects " +
                "is not available. Please use the ListObjects API to determine which items were successfully deleted.");
        setStatusCode(200);
        setErrorCode("SlowDown");
        setServiceName("Amazon S3");
    }
}
