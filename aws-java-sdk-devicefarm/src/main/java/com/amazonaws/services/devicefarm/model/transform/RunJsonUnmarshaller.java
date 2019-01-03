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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Run JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunJsonUnmarshaller implements Unmarshaller<Run, JsonUnmarshallerContext> {

    public Run unmarshall(JsonUnmarshallerContext context) throws Exception {
        Run run = new Run();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    run.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    run.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    run.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    run.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    run.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    run.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    run.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    context.nextToken();
                    run.setStarted(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    context.nextToken();
                    run.setStopped(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("counters", targetDepth)) {
                    context.nextToken();
                    run.setCounters(CountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    run.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalJobs", targetDepth)) {
                    context.nextToken();
                    run.setTotalJobs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("completedJobs", targetDepth)) {
                    context.nextToken();
                    run.setCompletedJobs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("billingMethod", targetDepth)) {
                    context.nextToken();
                    run.setBillingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    context.nextToken();
                    run.setDeviceMinutes(DeviceMinutesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkProfile", targetDepth)) {
                    context.nextToken();
                    run.setNetworkProfile(NetworkProfileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parsingResultUrl", targetDepth)) {
                    context.nextToken();
                    run.setParsingResultUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resultCode", targetDepth)) {
                    context.nextToken();
                    run.setResultCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("seed", targetDepth)) {
                    context.nextToken();
                    run.setSeed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("appUpload", targetDepth)) {
                    context.nextToken();
                    run.setAppUpload(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventCount", targetDepth)) {
                    context.nextToken();
                    run.setEventCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jobTimeoutMinutes", targetDepth)) {
                    context.nextToken();
                    run.setJobTimeoutMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("devicePoolArn", targetDepth)) {
                    context.nextToken();
                    run.setDevicePoolArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("locale", targetDepth)) {
                    context.nextToken();
                    run.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("radios", targetDepth)) {
                    context.nextToken();
                    run.setRadios(RadiosJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    run.setLocation(LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerArtifactPaths", targetDepth)) {
                    context.nextToken();
                    run.setCustomerArtifactPaths(CustomerArtifactPathsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("webUrl", targetDepth)) {
                    context.nextToken();
                    run.setWebUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("skipAppResign", targetDepth)) {
                    context.nextToken();
                    run.setSkipAppResign(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("testSpecArn", targetDepth)) {
                    context.nextToken();
                    run.setTestSpecArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceSelectionResult", targetDepth)) {
                    context.nextToken();
                    run.setDeviceSelectionResult(DeviceSelectionResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return run;
    }

    private static RunJsonUnmarshaller instance;

    public static RunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonUnmarshaller();
        return instance;
    }
}
