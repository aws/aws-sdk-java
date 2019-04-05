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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetJobOutputResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobOutputResultJsonUnmarshaller implements Unmarshaller<GetJobOutputResult, JsonUnmarshallerContext> {

    public GetJobOutputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetJobOutputResult getJobOutputResult = new GetJobOutputResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amz-sha256-tree-hash") != null) {
                context.setCurrentHeader("x-amz-sha256-tree-hash");
                getJobOutputResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Range") != null) {
                context.setCurrentHeader("Content-Range");
                getJobOutputResult.setContentRange(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Accept-Ranges") != null) {
                context.setCurrentHeader("Accept-Ranges");
                getJobOutputResult.setAcceptRanges(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getJobOutputResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-archive-description") != null) {
                context.setCurrentHeader("x-amz-archive-description");
                getJobOutputResult.setArchiveDescription(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getJobOutputResult.setStatus(context.getHttpResponse().getStatusCode());

        getJobOutputResult.setBody(context.getHttpResponse().getContent());

        return getJobOutputResult;
    }

    private static GetJobOutputResultJsonUnmarshaller instance;

    public static GetJobOutputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetJobOutputResultJsonUnmarshaller();
        return instance;
    }
}
