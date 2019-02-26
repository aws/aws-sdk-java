/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A enum class for all Amazon S3 events.
 */
public enum S3Event {
    ReducedRedundancyLostObject("s3:ReducedRedundancyLostObject"),

    ObjectCreated("s3:ObjectCreated:*"),

    ObjectCreatedByPut("s3:ObjectCreated:Put"),

    ObjectCreatedByPost("s3:ObjectCreated:Post"),

    ObjectCreatedByCopy("s3:ObjectCreated:Copy"),

    ObjectCreatedByCompleteMultipartUpload("s3:ObjectCreated:CompleteMultipartUpload"),

    ObjectRemoved("s3:ObjectRemoved:*"),

    ObjectRemovedDelete("s3:ObjectRemoved:Delete"),

    ObjectRemovedDeleteMarkerCreated("s3:ObjectRemoved:DeleteMarkerCreated"),

    ObjectRestorePost("s3:ObjectRestore:Post"),

    ObjectRestoreCompleted("s3:ObjectRestore:Completed")

    ;

    private final String event;

    private S3Event(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return this.event;
    }
}
