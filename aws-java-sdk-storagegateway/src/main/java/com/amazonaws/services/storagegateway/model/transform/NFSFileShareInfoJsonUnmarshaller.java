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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NFSFileShareInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NFSFileShareInfoJsonUnmarshaller implements Unmarshaller<NFSFileShareInfo, JsonUnmarshallerContext> {

    public NFSFileShareInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        NFSFileShareInfo nFSFileShareInfo = new NFSFileShareInfo();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NFSFileShareDefaults", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setNFSFileShareDefaults(NFSFileShareDefaultsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FileShareARN", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setFileShareARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareId", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setFileShareId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareStatus", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setFileShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KMSEncrypted", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setKMSEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationARN", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setLocationARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultStorageClass", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setDefaultStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectACL", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setObjectACL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientList", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setClientList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Squash", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setSquash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GuessMIMETypeEnabled", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setGuessMIMETypeEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequesterPays", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setRequesterPays(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    nFSFileShareInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return nFSFileShareInfo;
    }

    private static NFSFileShareInfoJsonUnmarshaller instance;

    public static NFSFileShareInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareInfoJsonUnmarshaller();
        return instance;
    }
}
