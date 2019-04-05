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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceTypeSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeSpecificationJsonUnmarshaller implements Unmarshaller<InstanceTypeSpecification, JsonUnmarshallerContext> {

    public InstanceTypeSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceTypeSpecification instanceTypeSpecification = new InstanceTypeSpecification();

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
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WeightedCapacity", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setWeightedCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BidPrice", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setBidPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BidPriceAsPercentageOfOnDemandPrice", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setBidPriceAsPercentageOfOnDemandPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Configurations", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EbsBlockDevices", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setEbsBlockDevices(new ListUnmarshaller<EbsBlockDevice>(EbsBlockDeviceJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    context.nextToken();
                    instanceTypeSpecification.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceTypeSpecification;
    }

    private static InstanceTypeSpecificationJsonUnmarshaller instance;

    public static InstanceTypeSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeSpecificationJsonUnmarshaller();
        return instance;
    }
}
