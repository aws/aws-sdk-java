/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backupstorage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetObjectMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectMetadataResultJsonUnmarshaller implements Unmarshaller<GetObjectMetadataResult, JsonUnmarshallerContext> {

    public GetObjectMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetObjectMetadataResult getObjectMetadataResult = new GetObjectMetadataResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amz-metadata-string") != null) {
                context.setCurrentHeader("x-amz-metadata-string");
                getObjectMetadataResult.setMetadataString(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-data-length") != null) {
                context.setCurrentHeader("x-amz-data-length");
                getObjectMetadataResult.setMetadataBlobLength(context.getUnmarshaller(Long.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-checksum") != null) {
                context.setCurrentHeader("x-amz-checksum");
                getObjectMetadataResult.setMetadataBlobChecksum(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-checksum-algorithm") != null) {
                context.setCurrentHeader("x-amz-checksum-algorithm");
                getObjectMetadataResult.setMetadataBlobChecksumAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getObjectMetadataResult.setMetadataBlob(context.getHttpResponse().getContent());

        return getObjectMetadataResult;
    }

    private static GetObjectMetadataResultJsonUnmarshaller instance;

    public static GetObjectMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetObjectMetadataResultJsonUnmarshaller();
        return instance;
    }
}
