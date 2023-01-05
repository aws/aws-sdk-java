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
 * CreateOpenZFSVolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpenZFSVolumeConfigurationJsonUnmarshaller implements Unmarshaller<CreateOpenZFSVolumeConfiguration, JsonUnmarshallerContext> {

    public CreateOpenZFSVolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateOpenZFSVolumeConfiguration createOpenZFSVolumeConfiguration = new CreateOpenZFSVolumeConfiguration();

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
                if (context.testExpression("ParentVolumeId", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setParentVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageCapacityReservationGiB", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setStorageCapacityReservationGiB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageCapacityQuotaGiB", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setStorageCapacityQuotaGiB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RecordSizeKiB", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setRecordSizeKiB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DataCompressionType", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setDataCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToSnapshots", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setCopyTagsToSnapshots(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OriginSnapshot", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setOriginSnapshot(CreateOpenZFSOriginSnapshotConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NfsExports", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setNfsExports(new ListUnmarshaller<OpenZFSNfsExport>(OpenZFSNfsExportJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserAndGroupQuotas", targetDepth)) {
                    context.nextToken();
                    createOpenZFSVolumeConfiguration.setUserAndGroupQuotas(new ListUnmarshaller<OpenZFSUserOrGroupQuota>(
                            OpenZFSUserOrGroupQuotaJsonUnmarshaller.getInstance())

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

        return createOpenZFSVolumeConfiguration;
    }

    private static CreateOpenZFSVolumeConfigurationJsonUnmarshaller instance;

    public static CreateOpenZFSVolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateOpenZFSVolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
