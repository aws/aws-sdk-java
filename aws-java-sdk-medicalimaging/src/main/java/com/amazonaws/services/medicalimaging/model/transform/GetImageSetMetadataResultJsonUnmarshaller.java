/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetImageSetMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageSetMetadataResultJsonUnmarshaller implements Unmarshaller<GetImageSetMetadataResult, JsonUnmarshallerContext> {

    public GetImageSetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImageSetMetadataResult getImageSetMetadataResult = new GetImageSetMetadataResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getImageSetMetadataResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Encoding") != null) {
                context.setCurrentHeader("Content-Encoding");
                getImageSetMetadataResult.setContentEncoding(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getImageSetMetadataResult.setImageSetMetadataBlob(context.getHttpResponse().getContent());

        return getImageSetMetadataResult;
    }

    private static GetImageSetMetadataResultJsonUnmarshaller instance;

    public static GetImageSetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImageSetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
