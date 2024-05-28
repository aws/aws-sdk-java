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
package com.amazonaws.services.osis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.osis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Pipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineJsonUnmarshaller implements Unmarshaller<Pipeline, JsonUnmarshallerContext> {

    public Pipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        Pipeline pipeline = new Pipeline();

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
                if (context.testExpression("PipelineName", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineArn", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinUnits", targetDepth)) {
                    context.nextToken();
                    pipeline.setMinUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxUnits", targetDepth)) {
                    context.nextToken();
                    pipeline.setMaxUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    pipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    pipeline.setStatusReason(PipelineStatusReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PipelineConfigurationBody", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineConfigurationBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    pipeline.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    pipeline.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IngestEndpointUrls", targetDepth)) {
                    context.nextToken();
                    pipeline.setIngestEndpointUrls(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    context.nextToken();
                    pipeline.setLogPublishingOptions(LogPublishingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcEndpoints", targetDepth)) {
                    context.nextToken();
                    pipeline.setVpcEndpoints(new ListUnmarshaller<VpcEndpoint>(VpcEndpointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BufferOptions", targetDepth)) {
                    context.nextToken();
                    pipeline.setBufferOptions(BufferOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    context.nextToken();
                    pipeline.setEncryptionAtRestOptions(EncryptionAtRestOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceVpcEndpoints", targetDepth)) {
                    context.nextToken();
                    pipeline.setServiceVpcEndpoints(new ListUnmarshaller<ServiceVpcEndpoint>(ServiceVpcEndpointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Destinations", targetDepth)) {
                    context.nextToken();
                    pipeline.setDestinations(new ListUnmarshaller<PipelineDestination>(PipelineDestinationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    pipeline.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return pipeline;
    }

    private static PipelineJsonUnmarshaller instance;

    public static PipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonUnmarshaller();
        return instance;
    }
}
