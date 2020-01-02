/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EbsInstanceBlockDeviceSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsInstanceBlockDeviceSpecificationJsonUnmarshaller implements Unmarshaller<EbsInstanceBlockDeviceSpecification, JsonUnmarshallerContext> {

    public EbsInstanceBlockDeviceSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        EbsInstanceBlockDeviceSpecification ebsInstanceBlockDeviceSpecification = new EbsInstanceBlockDeviceSpecification();

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
                if (context.testExpression("encrypted", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("deleteOnTermination", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setDeleteOnTermination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("iops", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotId", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeSize", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setVolumeSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("volumeType", targetDepth)) {
                    context.nextToken();
                    ebsInstanceBlockDeviceSpecification.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ebsInstanceBlockDeviceSpecification;
    }

    private static EbsInstanceBlockDeviceSpecificationJsonUnmarshaller instance;

    public static EbsInstanceBlockDeviceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsInstanceBlockDeviceSpecificationJsonUnmarshaller();
        return instance;
    }
}
