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
 * GetObjectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectResultJsonUnmarshaller implements Unmarshaller<GetObjectResult, JsonUnmarshallerContext> {

    public GetObjectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetObjectResult getObjectResult = new GetObjectResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Cache-Control") != null) {
                context.setCurrentHeader("Cache-Control");
                getObjectResult.setCacheControl(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Range") != null) {
                context.setCurrentHeader("Content-Range");
                getObjectResult.setContentRange(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Length") != null) {
                context.setCurrentHeader("Content-Length");
                getObjectResult.setContentLength(context.getUnmarshaller(Long.class).unmarshall(context));
            }
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getObjectResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("ETag") != null) {
                context.setCurrentHeader("ETag");
                getObjectResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Last-Modified") != null) {
                context.setCurrentHeader("Last-Modified");
                getObjectResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("rfc822").unmarshall(context));
            }
        }

        getObjectResult.setStatusCode(context.getHttpResponse().getStatusCode());

        getObjectResult.setBody(context.getHttpResponse().getContent());

        return getObjectResult;
    }

    private static GetObjectResultJsonUnmarshaller instance;

    public static GetObjectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetObjectResultJsonUnmarshaller();
        return instance;
    }
}
