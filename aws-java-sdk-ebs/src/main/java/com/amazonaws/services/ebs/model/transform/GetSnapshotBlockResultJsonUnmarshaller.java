/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSnapshotBlockResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotBlockResultJsonUnmarshaller implements Unmarshaller<GetSnapshotBlockResult, JsonUnmarshallerContext> {

    public GetSnapshotBlockResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSnapshotBlockResult getSnapshotBlockResult = new GetSnapshotBlockResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amz-Data-Length") != null) {
                context.setCurrentHeader("x-amz-Data-Length");
                getSnapshotBlockResult.setDataLength(context.getUnmarshaller(Integer.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-Checksum") != null) {
                context.setCurrentHeader("x-amz-Checksum");
                getSnapshotBlockResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-Checksum-Algorithm") != null) {
                context.setCurrentHeader("x-amz-Checksum-Algorithm");
                getSnapshotBlockResult.setChecksumAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getSnapshotBlockResult.setBlockData(context.getHttpResponse().getContent());

        return getSnapshotBlockResult;
    }

    private static GetSnapshotBlockResultJsonUnmarshaller instance;

    public static GetSnapshotBlockResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSnapshotBlockResultJsonUnmarshaller();
        return instance;
    }
}
