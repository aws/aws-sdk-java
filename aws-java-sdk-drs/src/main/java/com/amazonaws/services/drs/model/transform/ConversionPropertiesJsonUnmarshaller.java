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
package com.amazonaws.services.drs.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConversionProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversionPropertiesJsonUnmarshaller implements Unmarshaller<ConversionProperties, JsonUnmarshallerContext> {

    public ConversionProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConversionProperties conversionProperties = new ConversionProperties();

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
                if (context.testExpression("dataTimestamp", targetDepth)) {
                    context.nextToken();
                    conversionProperties.setDataTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("forceUefi", targetDepth)) {
                    context.nextToken();
                    conversionProperties.setForceUefi(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rootVolumeName", targetDepth)) {
                    context.nextToken();
                    conversionProperties.setRootVolumeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeToConversionMap", targetDepth)) {
                    context.nextToken();
                    conversionProperties.setVolumeToConversionMap(new MapUnmarshaller<String, java.util.Map<String, String>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("volumeToVolumeSize", targetDepth)) {
                    context.nextToken();
                    conversionProperties.setVolumeToVolumeSize(new MapUnmarshaller<String, Long>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Long.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conversionProperties;
    }

    private static ConversionPropertiesJsonUnmarshaller instance;

    public static ConversionPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConversionPropertiesJsonUnmarshaller();
        return instance;
    }
}
