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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EC2ResourceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2ResourceDetailsJsonUnmarshaller implements Unmarshaller<EC2ResourceDetails, JsonUnmarshallerContext> {

    public EC2ResourceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        EC2ResourceDetails eC2ResourceDetails = new EC2ResourceDetails();

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
                if (context.testExpression("HourlyOnDemandRate", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setHourlyOnDemandRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sku", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setSku(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkPerformance", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setNetworkPerformance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Storage", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setStorage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Vcpu", targetDepth)) {
                    context.nextToken();
                    eC2ResourceDetails.setVcpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eC2ResourceDetails;
    }

    private static EC2ResourceDetailsJsonUnmarshaller instance;

    public static EC2ResourceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2ResourceDetailsJsonUnmarshaller();
        return instance;
    }
}
