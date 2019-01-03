/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.timers.client;

import com.amazonaws.SdkClientException;

public class ClientExecutionTimeoutException extends SdkClientException {

    public ClientExecutionTimeoutException() {
        this("Client execution did not complete before the specified timeout configuration.");
    }

    public ClientExecutionTimeoutException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 4861767589924758934L;

}