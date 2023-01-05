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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportResourcesToDraftAppVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportResourcesToDraftAppVersionResultJsonUnmarshaller implements Unmarshaller<ImportResourcesToDraftAppVersionResult, JsonUnmarshallerContext> {

    public ImportResourcesToDraftAppVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportResourcesToDraftAppVersionResult importResourcesToDraftAppVersionResult = new ImportResourcesToDraftAppVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return importResourcesToDraftAppVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    importResourcesToDraftAppVersionResult.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    context.nextToken();
                    importResourcesToDraftAppVersionResult.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceArns", targetDepth)) {
                    context.nextToken();
                    importResourcesToDraftAppVersionResult.setSourceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    importResourcesToDraftAppVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("terraformSources", targetDepth)) {
                    context.nextToken();
                    importResourcesToDraftAppVersionResult.setTerraformSources(new ListUnmarshaller<TerraformSource>(TerraformSourceJsonUnmarshaller
                            .getInstance())

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

        return importResourcesToDraftAppVersionResult;
    }

    private static ImportResourcesToDraftAppVersionResultJsonUnmarshaller instance;

    public static ImportResourcesToDraftAppVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportResourcesToDraftAppVersionResultJsonUnmarshaller();
        return instance;
    }
}
