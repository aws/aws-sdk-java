/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediastoredata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediastoredata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeObjectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeObjectResultJsonUnmarshaller implements Unmarshaller<DescribeObjectResult, JsonUnmarshallerContext> {

    public DescribeObjectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeObjectResult describeObjectResult = new DescribeObjectResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("ETag") != null) {
                context.setCurrentHeader("ETag");
                describeObjectResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                describeObjectResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Length") != null) {
                context.setCurrentHeader("Content-Length");
                describeObjectResult.setContentLength(context.getUnmarshaller(Long.class).unmarshall(context));
            }
            if (context.getHeader("Cache-Control") != null) {
                context.setCurrentHeader("Cache-Control");
                describeObjectResult.setCacheControl(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Last-Modified") != null) {
                context.setCurrentHeader("Last-Modified");
                describeObjectResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("rfc822").unmarshall(context));
            }
        }

        return describeObjectResult;
    }

    private static DescribeObjectResultJsonUnmarshaller instance;

    public static DescribeObjectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeObjectResultJsonUnmarshaller();
        return instance;
    }
}
