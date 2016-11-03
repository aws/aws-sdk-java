/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.http.response;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;

public class ErrorDuringUnmarshallingResponseHandler extends NullResponseHandler {
    @Override
    public AmazonWebServiceResponse<Object> handle(HttpResponse response) throws Exception {
        throw new RuntimeException("Unable to unmarshall response");
    }
}
