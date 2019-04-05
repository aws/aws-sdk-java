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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ImportImageTask StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportImageTaskStaxUnmarshaller implements Unmarshaller<ImportImageTask, StaxUnmarshallerContext> {

    public ImportImageTask unmarshall(StaxUnmarshallerContext context) throws Exception {
        ImportImageTask importImageTask = new ImportImageTask();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return importImageTask;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("architecture", targetDepth)) {
                    importImageTask.setArchitecture(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    importImageTask.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("encrypted", targetDepth)) {
                    importImageTask.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hypervisor", targetDepth)) {
                    importImageTask.setHypervisor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    importImageTask.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("importTaskId", targetDepth)) {
                    importImageTask.setImportTaskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kmsKeyId", targetDepth)) {
                    importImageTask.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("licenseType", targetDepth)) {
                    importImageTask.setLicenseType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("platform", targetDepth)) {
                    importImageTask.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("progress", targetDepth)) {
                    importImageTask.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("snapshotDetailSet", targetDepth)) {
                    importImageTask.withSnapshotDetails(new ArrayList<SnapshotDetail>());
                    continue;
                }

                if (context.testExpression("snapshotDetailSet/item", targetDepth)) {
                    importImageTask.withSnapshotDetails(SnapshotDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    importImageTask.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    importImageTask.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return importImageTask;
                }
            }
        }
    }

    private static ImportImageTaskStaxUnmarshaller instance;

    public static ImportImageTaskStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportImageTaskStaxUnmarshaller();
        return instance;
    }
}
