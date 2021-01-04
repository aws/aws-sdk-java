/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeInputDeviceThumbnailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputDeviceThumbnailResultJsonUnmarshaller implements Unmarshaller<DescribeInputDeviceThumbnailResult, JsonUnmarshallerContext> {

    public DescribeInputDeviceThumbnailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInputDeviceThumbnailResult describeInputDeviceThumbnailResult = new DescribeInputDeviceThumbnailResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                describeInputDeviceThumbnailResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Length") != null) {
                context.setCurrentHeader("Content-Length");
                describeInputDeviceThumbnailResult.setContentLength(context.getUnmarshaller(Long.class).unmarshall(context));
            }
            if (context.getHeader("ETag") != null) {
                context.setCurrentHeader("ETag");
                describeInputDeviceThumbnailResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Last-Modified") != null) {
                context.setCurrentHeader("Last-Modified");
                describeInputDeviceThumbnailResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("rfc822").unmarshall(context));
            }
        }

        describeInputDeviceThumbnailResult.setBody(context.getHttpResponse().getContent());

        return describeInputDeviceThumbnailResult;
    }

    private static DescribeInputDeviceThumbnailResultJsonUnmarshaller instance;

    public static DescribeInputDeviceThumbnailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputDeviceThumbnailResultJsonUnmarshaller();
        return instance;
    }
}
