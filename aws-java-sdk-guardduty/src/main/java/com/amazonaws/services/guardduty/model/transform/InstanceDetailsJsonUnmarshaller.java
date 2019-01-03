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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceDetailsJsonUnmarshaller implements Unmarshaller<InstanceDetails, JsonUnmarshallerContext> {

    public InstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceDetails instanceDetails = new InstanceDetails();

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
                if (context.testExpression("availabilityZone", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setIamInstanceProfile(IamInstanceProfileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageDescription", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setImageDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageId", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceState", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setInstanceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchTime", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setLaunchTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("productCodes", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setProductCodes(new ListUnmarshaller<ProductCode>(ProductCodeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    instanceDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceDetails;
    }

    private static InstanceDetailsJsonUnmarshaller instance;

    public static InstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
