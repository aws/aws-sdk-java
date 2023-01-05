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
 * DataRepositoryAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryAssociationJsonUnmarshaller implements Unmarshaller<DataRepositoryAssociation, JsonUnmarshallerContext> {

    public DataRepositoryAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataRepositoryAssociation dataRepositoryAssociation = new DataRepositoryAssociation();

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
                if (context.testExpression("AssociationId", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setFailureDetails(DataRepositoryFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FileSystemPath", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setFileSystemPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataRepositoryPath", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setDataRepositoryPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BatchImportMetaDataOnCreate", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setBatchImportMetaDataOnCreate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ImportedFileChunkSize", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setImportedFileChunkSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("S3", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setS3(S3DataRepositoryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FileCacheId", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setFileCacheId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileCachePath", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setFileCachePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataRepositorySubdirectories", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setDataRepositorySubdirectories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NFS", targetDepth)) {
                    context.nextToken();
                    dataRepositoryAssociation.setNFS(NFSDataRepositoryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataRepositoryAssociation;
    }

    private static DataRepositoryAssociationJsonUnmarshaller instance;

    public static DataRepositoryAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryAssociationJsonUnmarshaller();
        return instance;
    }
}
