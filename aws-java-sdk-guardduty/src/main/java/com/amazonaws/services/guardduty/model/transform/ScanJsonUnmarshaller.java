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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Scan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanJsonUnmarshaller implements Unmarshaller<Scan, JsonUnmarshallerContext> {

    public Scan unmarshall(JsonUnmarshallerContext context) throws Exception {
        Scan scan = new Scan();

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
                if (context.testExpression("detectorId", targetDepth)) {
                    context.nextToken();
                    scan.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("adminDetectorId", targetDepth)) {
                    context.nextToken();
                    scan.setAdminDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanId", targetDepth)) {
                    context.nextToken();
                    scan.setScanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanStatus", targetDepth)) {
                    context.nextToken();
                    scan.setScanStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    scan.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanStartTime", targetDepth)) {
                    context.nextToken();
                    scan.setScanStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("scanEndTime", targetDepth)) {
                    context.nextToken();
                    scan.setScanEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("triggerDetails", targetDepth)) {
                    context.nextToken();
                    scan.setTriggerDetails(TriggerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceDetails", targetDepth)) {
                    context.nextToken();
                    scan.setResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scanResultDetails", targetDepth)) {
                    context.nextToken();
                    scan.setScanResultDetails(ScanResultDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    scan.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalBytes", targetDepth)) {
                    context.nextToken();
                    scan.setTotalBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("fileCount", targetDepth)) {
                    context.nextToken();
                    scan.setFileCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("attachedVolumes", targetDepth)) {
                    context.nextToken();
                    scan.setAttachedVolumes(new ListUnmarshaller<VolumeDetail>(VolumeDetailJsonUnmarshaller.getInstance())

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

        return scan;
    }

    private static ScanJsonUnmarshaller instance;

    public static ScanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScanJsonUnmarshaller();
        return instance;
    }
}
