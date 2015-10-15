/*
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.exception;

import java.io.IOException;

/**
 * Signals that the http request could not complete within the specified timeout.
 *
 */
public class HttpRequestTimeoutException extends IOException {

    public HttpRequestTimeoutException(String message) {
        super(message);
    }
    
    public HttpRequestTimeoutException(Throwable throwable) {
        super(throwable);
    }
    
    public HttpRequestTimeoutException(String message, Throwable throwable) {
        super(message, throwable);
    }
}