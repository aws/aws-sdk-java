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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ExportTaskS3LocationRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTaskS3LocationRequestStaxUnmarshaller implements Unmarshaller<ExportTaskS3LocationRequest, StaxUnmarshallerContext> {

    public ExportTaskS3LocationRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        ExportTaskS3LocationRequest exportTaskS3LocationRequest = new ExportTaskS3LocationRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return exportTaskS3LocationRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("S3Bucket", targetDepth)) {
                    exportTaskS3LocationRequest.setS3Bucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3Prefix", targetDepth)) {
                    exportTaskS3LocationRequest.setS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return exportTaskS3LocationRequest;
                }
            }
        }
    }

    private static ExportTaskS3LocationRequestStaxUnmarshaller instance;

    public static ExportTaskS3LocationRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskS3LocationRequestStaxUnmarshaller();
        return instance;
    }
}
