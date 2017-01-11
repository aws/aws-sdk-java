/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.protocol.json.*;

/**
 * NFSFileShareDefaultsMarshaller
 */
public class NFSFileShareDefaultsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NFSFileShareDefaults nFSFileShareDefaults, StructuredJsonGenerator jsonGenerator) {

        if (nFSFileShareDefaults == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (nFSFileShareDefaults.getFileMode() != null) {
                jsonGenerator.writeFieldName("FileMode").writeValue(nFSFileShareDefaults.getFileMode());
            }
            if (nFSFileShareDefaults.getDirectoryMode() != null) {
                jsonGenerator.writeFieldName("DirectoryMode").writeValue(nFSFileShareDefaults.getDirectoryMode());
            }
            if (nFSFileShareDefaults.getGroupId() != null) {
                jsonGenerator.writeFieldName("GroupId").writeValue(nFSFileShareDefaults.getGroupId());
            }
            if (nFSFileShareDefaults.getOwnerId() != null) {
                jsonGenerator.writeFieldName("OwnerId").writeValue(nFSFileShareDefaults.getOwnerId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NFSFileShareDefaultsJsonMarshaller instance;

    public static NFSFileShareDefaultsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareDefaultsJsonMarshaller();
        return instance;
    }

}
