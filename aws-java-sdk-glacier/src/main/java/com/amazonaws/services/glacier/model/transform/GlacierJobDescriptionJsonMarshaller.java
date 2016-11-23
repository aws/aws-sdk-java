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
package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GlacierJobDescriptionMarshaller
 */
public class GlacierJobDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GlacierJobDescription glacierJobDescription, StructuredJsonGenerator jsonGenerator) {

        if (glacierJobDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (glacierJobDescription.getJobId() != null) {
                jsonGenerator.writeFieldName("JobId").writeValue(glacierJobDescription.getJobId());
            }
            if (glacierJobDescription.getJobDescription() != null) {
                jsonGenerator.writeFieldName("JobDescription").writeValue(glacierJobDescription.getJobDescription());
            }
            if (glacierJobDescription.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(glacierJobDescription.getAction());
            }
            if (glacierJobDescription.getArchiveId() != null) {
                jsonGenerator.writeFieldName("ArchiveId").writeValue(glacierJobDescription.getArchiveId());
            }
            if (glacierJobDescription.getVaultARN() != null) {
                jsonGenerator.writeFieldName("VaultARN").writeValue(glacierJobDescription.getVaultARN());
            }
            if (glacierJobDescription.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(glacierJobDescription.getCreationDate());
            }
            if (glacierJobDescription.getCompleted() != null) {
                jsonGenerator.writeFieldName("Completed").writeValue(glacierJobDescription.getCompleted());
            }
            if (glacierJobDescription.getStatusCode() != null) {
                jsonGenerator.writeFieldName("StatusCode").writeValue(glacierJobDescription.getStatusCode());
            }
            if (glacierJobDescription.getStatusMessage() != null) {
                jsonGenerator.writeFieldName("StatusMessage").writeValue(glacierJobDescription.getStatusMessage());
            }
            if (glacierJobDescription.getArchiveSizeInBytes() != null) {
                jsonGenerator.writeFieldName("ArchiveSizeInBytes").writeValue(glacierJobDescription.getArchiveSizeInBytes());
            }
            if (glacierJobDescription.getInventorySizeInBytes() != null) {
                jsonGenerator.writeFieldName("InventorySizeInBytes").writeValue(glacierJobDescription.getInventorySizeInBytes());
            }
            if (glacierJobDescription.getSNSTopic() != null) {
                jsonGenerator.writeFieldName("SNSTopic").writeValue(glacierJobDescription.getSNSTopic());
            }
            if (glacierJobDescription.getCompletionDate() != null) {
                jsonGenerator.writeFieldName("CompletionDate").writeValue(glacierJobDescription.getCompletionDate());
            }
            if (glacierJobDescription.getSHA256TreeHash() != null) {
                jsonGenerator.writeFieldName("SHA256TreeHash").writeValue(glacierJobDescription.getSHA256TreeHash());
            }
            if (glacierJobDescription.getArchiveSHA256TreeHash() != null) {
                jsonGenerator.writeFieldName("ArchiveSHA256TreeHash").writeValue(glacierJobDescription.getArchiveSHA256TreeHash());
            }
            if (glacierJobDescription.getRetrievalByteRange() != null) {
                jsonGenerator.writeFieldName("RetrievalByteRange").writeValue(glacierJobDescription.getRetrievalByteRange());
            }
            if (glacierJobDescription.getTier() != null) {
                jsonGenerator.writeFieldName("Tier").writeValue(glacierJobDescription.getTier());
            }
            if (glacierJobDescription.getInventoryRetrievalParameters() != null) {
                jsonGenerator.writeFieldName("InventoryRetrievalParameters");
                InventoryRetrievalJobDescriptionJsonMarshaller.getInstance().marshall(glacierJobDescription.getInventoryRetrievalParameters(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GlacierJobDescriptionJsonMarshaller instance;

    public static GlacierJobDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlacierJobDescriptionJsonMarshaller();
        return instance;
    }

}
