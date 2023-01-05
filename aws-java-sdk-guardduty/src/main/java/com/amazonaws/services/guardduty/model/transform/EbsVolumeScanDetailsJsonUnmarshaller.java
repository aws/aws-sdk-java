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
 * EbsVolumeScanDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolumeScanDetailsJsonUnmarshaller implements Unmarshaller<EbsVolumeScanDetails, JsonUnmarshallerContext> {

    public EbsVolumeScanDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        EbsVolumeScanDetails ebsVolumeScanDetails = new EbsVolumeScanDetails();

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
                if (context.testExpression("scanId", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setScanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanStartedAt", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setScanStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("scanCompletedAt", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setScanCompletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("triggerFindingId", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setTriggerFindingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setSources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("scanDetections", targetDepth)) {
                    context.nextToken();
                    ebsVolumeScanDetails.setScanDetections(ScanDetectionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ebsVolumeScanDetails;
    }

    private static EbsVolumeScanDetailsJsonUnmarshaller instance;

    public static EbsVolumeScanDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsVolumeScanDetailsJsonUnmarshaller();
        return instance;
    }
}
