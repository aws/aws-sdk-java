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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportSnapshotRecordSourceInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSnapshotRecordSourceInfoJsonUnmarshaller implements Unmarshaller<ExportSnapshotRecordSourceInfo, JsonUnmarshallerContext> {

    public ExportSnapshotRecordSourceInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportSnapshotRecordSourceInfo exportSnapshotRecordSourceInfo = new ExportSnapshotRecordSourceInfo();

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
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromResourceName", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setFromResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromResourceArn", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setFromResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceSnapshotInfo", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setInstanceSnapshotInfo(InstanceSnapshotInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("diskSnapshotInfo", targetDepth)) {
                    context.nextToken();
                    exportSnapshotRecordSourceInfo.setDiskSnapshotInfo(DiskSnapshotInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportSnapshotRecordSourceInfo;
    }

    private static ExportSnapshotRecordSourceInfoJsonUnmarshaller instance;

    public static ExportSnapshotRecordSourceInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportSnapshotRecordSourceInfoJsonUnmarshaller();
        return instance;
    }
}
