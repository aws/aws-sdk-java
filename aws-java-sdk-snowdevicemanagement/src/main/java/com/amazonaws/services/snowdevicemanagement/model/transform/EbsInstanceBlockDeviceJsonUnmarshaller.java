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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EbsInstanceBlockDevice JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsInstanceBlockDeviceJsonUnmarshaller implements Unmarshaller<EbsInstanceBlockDevice, JsonUnmarshallerContext> {

    public EbsInstanceBlockDevice unmarshall(JsonUnmarshallerContext context) throws Exception {
        EbsInstanceBlockDevice ebsInstanceBlockDevice = new EbsInstanceBlockDevice();

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
                if (context.testExpression("attachTime", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDevice.setAttachTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deleteOnTermination", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDevice.setDeleteOnTermination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDevice.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeId", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDevice.setVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ebsInstanceBlockDevice;
    }

    private static EbsInstanceBlockDeviceJsonUnmarshaller instance;

    public static EbsInstanceBlockDeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsInstanceBlockDeviceJsonUnmarshaller();
        return instance;
    }
}
