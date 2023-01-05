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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Volume JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeJsonUnmarshaller implements Unmarshaller<Volume, JsonUnmarshallerContext> {

    public Volume unmarshall(JsonUnmarshallerContext context) throws Exception {
        Volume volume = new Volume();

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
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    volume.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    volume.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    volume.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    volume.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OntapConfiguration", targetDepth)) {
                    context.nextToken();
                    volume.setOntapConfiguration(OntapVolumeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    volume.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    volume.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VolumeId", targetDepth)) {
                    context.nextToken();
                    volume.setVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    context.nextToken();
                    volume.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LifecycleTransitionReason", targetDepth)) {
                    context.nextToken();
                    volume.setLifecycleTransitionReason(LifecycleTransitionReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdministrativeActions", targetDepth)) {
                    context.nextToken();
                    volume.setAdministrativeActions(new ListUnmarshaller<AdministrativeAction>(AdministrativeActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OpenZFSConfiguration", targetDepth)) {
                    context.nextToken();
                    volume.setOpenZFSConfiguration(OpenZFSVolumeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return volume;
    }

    private static VolumeJsonUnmarshaller instance;

    public static VolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonUnmarshaller();
        return instance;
    }
}
