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
 * GetChunkResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChunkResultJsonUnmarshaller implements Unmarshaller<GetChunkResult, JsonUnmarshallerContext> {

    public GetChunkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetChunkResult getChunkResult = new GetChunkResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amz-data-length") != null) {
                context.setCurrentHeader("x-amz-data-length");
                getChunkResult.setLength(context.getUnmarshaller(Long.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-checksum") != null) {
                context.setCurrentHeader("x-amz-checksum");
                getChunkResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-checksum-algorithm") != null) {
                context.setCurrentHeader("x-amz-checksum-algorithm");
                getChunkResult.setChecksumAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getChunkResult.setData(context.getHttpResponse().getContent());

        return getChunkResult;
    }

    private static GetChunkResultJsonUnmarshaller instance;

    public static GetChunkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetChunkResultJsonUnmarshaller();
        return instance;
    }
}
