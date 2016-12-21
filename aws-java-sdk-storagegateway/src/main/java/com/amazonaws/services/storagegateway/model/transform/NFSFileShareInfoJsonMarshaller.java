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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * NFSFileShareInfoMarshaller
 */
public class NFSFileShareInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NFSFileShareInfo nFSFileShareInfo, StructuredJsonGenerator jsonGenerator) {

        if (nFSFileShareInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (nFSFileShareInfo.getNFSFileShareDefaults() != null) {
                jsonGenerator.writeFieldName("NFSFileShareDefaults");
                NFSFileShareDefaultsJsonMarshaller.getInstance().marshall(nFSFileShareInfo.getNFSFileShareDefaults(), jsonGenerator);
            }
            if (nFSFileShareInfo.getFileShareARN() != null) {
                jsonGenerator.writeFieldName("FileShareARN").writeValue(nFSFileShareInfo.getFileShareARN());
            }
            if (nFSFileShareInfo.getFileShareId() != null) {
                jsonGenerator.writeFieldName("FileShareId").writeValue(nFSFileShareInfo.getFileShareId());
            }
            if (nFSFileShareInfo.getFileShareStatus() != null) {
                jsonGenerator.writeFieldName("FileShareStatus").writeValue(nFSFileShareInfo.getFileShareStatus());
            }
            if (nFSFileShareInfo.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(nFSFileShareInfo.getGatewayARN());
            }
            if (nFSFileShareInfo.getKMSEncrypted() != null) {
                jsonGenerator.writeFieldName("KMSEncrypted").writeValue(nFSFileShareInfo.getKMSEncrypted());
            }
            if (nFSFileShareInfo.getKMSKey() != null) {
                jsonGenerator.writeFieldName("KMSKey").writeValue(nFSFileShareInfo.getKMSKey());
            }
            if (nFSFileShareInfo.getPath() != null) {
                jsonGenerator.writeFieldName("Path").writeValue(nFSFileShareInfo.getPath());
            }
            if (nFSFileShareInfo.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(nFSFileShareInfo.getRole());
            }
            if (nFSFileShareInfo.getLocationARN() != null) {
                jsonGenerator.writeFieldName("LocationARN").writeValue(nFSFileShareInfo.getLocationARN());
            }
            if (nFSFileShareInfo.getDefaultStorageClass() != null) {
                jsonGenerator.writeFieldName("DefaultStorageClass").writeValue(nFSFileShareInfo.getDefaultStorageClass());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NFSFileShareInfoJsonMarshaller instance;

    public static NFSFileShareInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareInfoJsonMarshaller();
        return instance;
    }

}
