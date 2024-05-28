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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDomainHealthResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainHealthResultJsonUnmarshaller implements Unmarshaller<DescribeDomainHealthResult, JsonUnmarshallerContext> {

    public DescribeDomainHealthResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDomainHealthResult describeDomainHealthResult = new DescribeDomainHealthResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDomainHealthResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainState", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setDomainState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZoneCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setAvailabilityZoneCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActiveAvailabilityZoneCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setActiveAvailabilityZoneCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandByAvailabilityZoneCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setStandByAvailabilityZoneCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataNodeCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setDataNodeCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DedicatedMaster", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setDedicatedMaster(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MasterEligibleNodeCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setMasterEligibleNodeCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WarmNodeCount", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setWarmNodeCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterNode", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setMasterNode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterHealth", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setClusterHealth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalShards", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setTotalShards(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalUnAssignedShards", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setTotalUnAssignedShards(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentInformation", targetDepth)) {
                    context.nextToken();
                    describeDomainHealthResult.setEnvironmentInformation(new ListUnmarshaller<EnvironmentInfo>(EnvironmentInfoJsonUnmarshaller.getInstance())

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

        return describeDomainHealthResult;
    }

    private static DescribeDomainHealthResultJsonUnmarshaller instance;

    public static DescribeDomainHealthResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDomainHealthResultJsonUnmarshaller();
        return instance;
    }
}
