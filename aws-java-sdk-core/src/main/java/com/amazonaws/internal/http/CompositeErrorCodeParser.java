/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.internal.http;

import java.util.Arrays;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.protocol.json.JsonContent;

@SdkInternalApi
public class CompositeErrorCodeParser implements ErrorCodeParser {
    private final Iterable<ErrorCodeParser> parsers;

    public CompositeErrorCodeParser(Iterable<ErrorCodeParser> parsers) {
        this.parsers = parsers;
    }

    public CompositeErrorCodeParser(ErrorCodeParser... parsers) {
        this.parsers = Arrays.asList(parsers);
    }

    @Override
    public String parseErrorCode(HttpResponse response, JsonContent jsonContent) {
        for (ErrorCodeParser parser : parsers) {
            String errorCode = parser.parseErrorCode(response, jsonContent);
            if (errorCode != null) {
                return errorCode;
            }
        }

        return null;
    }
}
