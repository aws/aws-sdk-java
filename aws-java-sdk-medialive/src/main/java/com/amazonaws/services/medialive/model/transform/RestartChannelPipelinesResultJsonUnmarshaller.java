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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RestartChannelPipelinesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestartChannelPipelinesResultJsonUnmarshaller implements Unmarshaller<RestartChannelPipelinesResult, JsonUnmarshallerContext> {

    public RestartChannelPipelinesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestartChannelPipelinesResult restartChannelPipelinesResult = new RestartChannelPipelinesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return restartChannelPipelinesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cdiInputSpecification", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setCdiInputSpecification(CdiInputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("channelClass", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setChannelClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinations", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setDestinations(new ListUnmarshaller<OutputDestination>(OutputDestinationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("egressEndpoints", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(ChannelEgressEndpointJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("encoderSettings", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setEncoderSettings(EncoderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputAttachments", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setInputAttachments(new ListUnmarshaller<InputAttachment>(InputAttachmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("inputSpecification", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setInputSpecification(InputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logLevel", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setLogLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maintenance", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setMaintenance(MaintenanceStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maintenanceStatus", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setMaintenanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineDetails", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(PipelineDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("pipelinesRunningCount", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setPipelinesRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vpc", targetDepth)) {
                    context.nextToken();
                    restartChannelPipelinesResult.setVpc(VpcOutputSettingsDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restartChannelPipelinesResult;
    }

    private static RestartChannelPipelinesResultJsonUnmarshaller instance;

    public static RestartChannelPipelinesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestartChannelPipelinesResultJsonUnmarshaller();
        return instance;
    }
}
