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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DisassociateFacesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFacesResultJsonUnmarshaller implements Unmarshaller<DisassociateFacesResult, JsonUnmarshallerContext> {

    public DisassociateFacesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisassociateFacesResult disassociateFacesResult = new DisassociateFacesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return disassociateFacesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DisassociatedFaces", targetDepth)) {
                    context.nextToken();
                    disassociateFacesResult.setDisassociatedFaces(new ListUnmarshaller<DisassociatedFace>(DisassociatedFaceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UnsuccessfulFaceDisassociations", targetDepth)) {
                    context.nextToken();
                    disassociateFacesResult.setUnsuccessfulFaceDisassociations(new ListUnmarshaller<UnsuccessfulFaceDisassociation>(
                            UnsuccessfulFaceDisassociationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserStatus", targetDepth)) {
                    context.nextToken();
                    disassociateFacesResult.setUserStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return disassociateFacesResult;
    }

    private static DisassociateFacesResultJsonUnmarshaller instance;

    public static DisassociateFacesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateFacesResultJsonUnmarshaller();
        return instance;
    }
}
