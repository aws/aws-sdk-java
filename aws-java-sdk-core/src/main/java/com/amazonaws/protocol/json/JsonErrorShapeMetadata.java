/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.protocol.json;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Wrapper object to provide additional metadata about a client's error shapes to {@link
 * SdkJsonProtocolFactory}
 */
@NotThreadSafe
@SdkProtectedApi
public class JsonErrorShapeMetadata {

    private String errorCode;

    private Integer httpStatusCode;

    private Class<? extends RuntimeException> modeledClass;


    public String getErrorCode() {
        return errorCode;
    }

    public JsonErrorShapeMetadata withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public JsonErrorShapeMetadata withHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    public Class<? extends RuntimeException> getModeledClass() {
        return modeledClass;
    }

    public JsonErrorShapeMetadata withModeledClass(Class<? extends RuntimeException> modeledClass) {
        this.modeledClass = modeledClass;
        return this;
    }
}
