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

import java.util.HashMap;
import java.util.Map;

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
	private static final String S3_PREFIX = "S3:";

    private S3Event(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return this.event;
    }
    
	private static final Map<String, S3Event> stringToEnum = new HashMap<>();

	static {
		for(S3Event s3Event : S3Event.values()) {
			stringToEnum.put(s3Event.toString().toUpperCase(), s3Event);
		}
	}

	public static S3Event fromString(String key) {
		S3Event s3Event = stringToEnum.get(key.toUpperCase());
		if (s3Event == null) {
			// the S3 record returned for an event differs slightly from the value in the enum
			// so here we try to match the value adding the s3: prefix
			s3Event = stringToEnum.get(S3_PREFIX.concat(key.toUpperCase()));
		}
		return s3Event;
	}
}
