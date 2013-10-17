/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * List Parts Result JSON Unmarshaller
 */
public class ListPartsResultJsonUnmarshaller implements Unmarshaller<ListPartsResult, JsonUnmarshallerContext> {

    

    public ListPartsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListPartsResult listPartsResult = new ListPartsResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MultipartUploadId", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setMultipartUploadId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VaultARN", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setVaultARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArchiveDescription", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setArchiveDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PartSizeInBytes", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setPartSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setCreationDate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Parts", targetDepth)) {
                    listPartsResult.setParts(new ListUnmarshaller<PartListElement>(PartListElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    listPartsResult.setMarker(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return listPartsResult;
    }

    private static ListPartsResultJsonUnmarshaller instance;
    public static ListPartsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ListPartsResultJsonUnmarshaller();
        return instance;
    }
}
    