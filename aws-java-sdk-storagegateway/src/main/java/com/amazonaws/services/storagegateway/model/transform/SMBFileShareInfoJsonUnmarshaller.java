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
 * SMBFileShareInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMBFileShareInfoJsonUnmarshaller implements Unmarshaller<SMBFileShareInfo, JsonUnmarshallerContext> {

    public SMBFileShareInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        SMBFileShareInfo sMBFileShareInfo = new SMBFileShareInfo();

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
                if (context.testExpression("FileShareARN", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setFileShareARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareId", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setFileShareId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareStatus", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setFileShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KMSEncrypted", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setKMSEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationARN", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setLocationARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultStorageClass", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setDefaultStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectACL", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setObjectACL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GuessMIMETypeEnabled", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setGuessMIMETypeEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequesterPays", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setRequesterPays(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SMBACLEnabled", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setSMBACLEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ValidUserList", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setValidUserList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("InvalidUserList", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setInvalidUserList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Authentication", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    sMBFileShareInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sMBFileShareInfo;
    }

    private static SMBFileShareInfoJsonUnmarshaller instance;

    public static SMBFileShareInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SMBFileShareInfoJsonUnmarshaller();
        return instance;
    }
}
