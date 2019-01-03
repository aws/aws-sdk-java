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
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TraceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceSummaryJsonUnmarshaller implements Unmarshaller<TraceSummary, JsonUnmarshallerContext> {

    public TraceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TraceSummary traceSummary = new TraceSummary();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    traceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    traceSummary.setDuration(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ResponseTime", targetDepth)) {
                    context.nextToken();
                    traceSummary.setResponseTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("HasFault", targetDepth)) {
                    context.nextToken();
                    traceSummary.setHasFault(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasError", targetDepth)) {
                    context.nextToken();
                    traceSummary.setHasError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasThrottle", targetDepth)) {
                    context.nextToken();
                    traceSummary.setHasThrottle(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsPartial", targetDepth)) {
                    context.nextToken();
                    traceSummary.setIsPartial(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Http", targetDepth)) {
                    context.nextToken();
                    traceSummary.setHttp(HttpJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Annotations", targetDepth)) {
                    context.nextToken();
                    traceSummary.setAnnotations(new MapUnmarshaller<String, java.util.List<ValueWithServiceIds>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<ValueWithServiceIds>(ValueWithServiceIdsJsonUnmarshaller.getInstance())).unmarshall(context));
                }
                if (context.testExpression("Users", targetDepth)) {
                    context.nextToken();
                    traceSummary.setUsers(new ListUnmarshaller<TraceUser>(TraceUserJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceIds", targetDepth)) {
                    context.nextToken();
                    traceSummary.setServiceIds(new ListUnmarshaller<ServiceId>(ServiceIdJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourceARNs", targetDepth)) {
                    context.nextToken();
                    traceSummary.setResourceARNs(new ListUnmarshaller<ResourceARNDetail>(ResourceARNDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("InstanceIds", targetDepth)) {
                    context.nextToken();
                    traceSummary.setInstanceIds(new ListUnmarshaller<InstanceIdDetail>(InstanceIdDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    traceSummary.setAvailabilityZones(new ListUnmarshaller<AvailabilityZoneDetail>(AvailabilityZoneDetailJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EntryPoint", targetDepth)) {
                    context.nextToken();
                    traceSummary.setEntryPoint(ServiceIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FaultRootCauses", targetDepth)) {
                    context.nextToken();
                    traceSummary.setFaultRootCauses(new ListUnmarshaller<FaultRootCause>(FaultRootCauseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ErrorRootCauses", targetDepth)) {
                    context.nextToken();
                    traceSummary.setErrorRootCauses(new ListUnmarshaller<ErrorRootCause>(ErrorRootCauseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResponseTimeRootCauses", targetDepth)) {
                    context.nextToken();
                    traceSummary.setResponseTimeRootCauses(new ListUnmarshaller<ResponseTimeRootCause>(ResponseTimeRootCauseJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Revision", targetDepth)) {
                    context.nextToken();
                    traceSummary.setRevision(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return traceSummary;
    }

    private static TraceSummaryJsonUnmarshaller instance;

    public static TraceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TraceSummaryJsonUnmarshaller();
        return instance;
    }
}
