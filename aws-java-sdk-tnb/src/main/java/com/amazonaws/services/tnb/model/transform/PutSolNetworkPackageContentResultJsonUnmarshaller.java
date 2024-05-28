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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutSolNetworkPackageContentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSolNetworkPackageContentResultJsonUnmarshaller implements Unmarshaller<PutSolNetworkPackageContentResult, JsonUnmarshallerContext> {

    public PutSolNetworkPackageContentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutSolNetworkPackageContentResult putSolNetworkPackageContentResult = new PutSolNetworkPackageContentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putSolNetworkPackageContentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setMetadata(PutSolNetworkPackageContentMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nsdId", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setNsdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdName", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setNsdName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdVersion", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setNsdVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfPkgIds", targetDepth)) {
                    context.nextToken();
                    putSolNetworkPackageContentResult.setVnfPkgIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putSolNetworkPackageContentResult;
    }

    private static PutSolNetworkPackageContentResultJsonUnmarshaller instance;

    public static PutSolNetworkPackageContentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutSolNetworkPackageContentResultJsonUnmarshaller();
        return instance;
    }
}
