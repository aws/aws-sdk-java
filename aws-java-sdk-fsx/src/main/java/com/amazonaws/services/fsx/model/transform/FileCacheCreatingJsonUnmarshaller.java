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
 * FileCacheCreating JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheCreatingJsonUnmarshaller implements Unmarshaller<FileCacheCreating, JsonUnmarshallerContext> {

    public FileCacheCreating unmarshall(JsonUnmarshallerContext context) throws Exception {
        FileCacheCreating fileCacheCreating = new FileCacheCreating();

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
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FileCacheId", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setFileCacheId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileCacheType", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setFileCacheType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileCacheTypeVersion", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setFileCacheTypeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setFailureDetails(FileCacheFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StorageCapacity", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setStorageCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceIds", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setNetworkInterfaceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DNSName", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setDNSName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CopyTagsToDataRepositoryAssociations", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setCopyTagsToDataRepositoryAssociations(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LustreConfiguration", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setLustreConfiguration(FileCacheLustreConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataRepositoryAssociationIds", targetDepth)) {
                    context.nextToken();
                    fileCacheCreating.setDataRepositoryAssociationIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return fileCacheCreating;
    }

    private static FileCacheCreatingJsonUnmarshaller instance;

    public static FileCacheCreatingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileCacheCreatingJsonUnmarshaller();
        return instance;
    }
}
