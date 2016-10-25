/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RepositoryMetadataMarshaller
 */
public class RepositoryMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RepositoryMetadata repositoryMetadata, StructuredJsonGenerator jsonGenerator) {

        if (repositoryMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (repositoryMetadata.getAccountId() != null) {
                jsonGenerator.writeFieldName("accountId").writeValue(repositoryMetadata.getAccountId());
            }
            if (repositoryMetadata.getRepositoryId() != null) {
                jsonGenerator.writeFieldName("repositoryId").writeValue(repositoryMetadata.getRepositoryId());
            }
            if (repositoryMetadata.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(repositoryMetadata.getRepositoryName());
            }
            if (repositoryMetadata.getRepositoryDescription() != null) {
                jsonGenerator.writeFieldName("repositoryDescription").writeValue(repositoryMetadata.getRepositoryDescription());
            }
            if (repositoryMetadata.getDefaultBranch() != null) {
                jsonGenerator.writeFieldName("defaultBranch").writeValue(repositoryMetadata.getDefaultBranch());
            }
            if (repositoryMetadata.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("lastModifiedDate").writeValue(repositoryMetadata.getLastModifiedDate());
            }
            if (repositoryMetadata.getCreationDate() != null) {
                jsonGenerator.writeFieldName("creationDate").writeValue(repositoryMetadata.getCreationDate());
            }
            if (repositoryMetadata.getCloneUrlHttp() != null) {
                jsonGenerator.writeFieldName("cloneUrlHttp").writeValue(repositoryMetadata.getCloneUrlHttp());
            }
            if (repositoryMetadata.getCloneUrlSsh() != null) {
                jsonGenerator.writeFieldName("cloneUrlSsh").writeValue(repositoryMetadata.getCloneUrlSsh());
            }
            if (repositoryMetadata.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(repositoryMetadata.getArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RepositoryMetadataJsonMarshaller instance;

    public static RepositoryMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryMetadataJsonMarshaller();
        return instance;
    }

}
