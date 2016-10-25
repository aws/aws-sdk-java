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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * HlsContentProtectionMarshaller
 */
public class HlsContentProtectionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(HlsContentProtection hlsContentProtection, StructuredJsonGenerator jsonGenerator) {

        if (hlsContentProtection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (hlsContentProtection.getMethod() != null) {
                jsonGenerator.writeFieldName("Method").writeValue(hlsContentProtection.getMethod());
            }
            if (hlsContentProtection.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(hlsContentProtection.getKey());
            }
            if (hlsContentProtection.getKeyMd5() != null) {
                jsonGenerator.writeFieldName("KeyMd5").writeValue(hlsContentProtection.getKeyMd5());
            }
            if (hlsContentProtection.getInitializationVector() != null) {
                jsonGenerator.writeFieldName("InitializationVector").writeValue(hlsContentProtection.getInitializationVector());
            }
            if (hlsContentProtection.getLicenseAcquisitionUrl() != null) {
                jsonGenerator.writeFieldName("LicenseAcquisitionUrl").writeValue(hlsContentProtection.getLicenseAcquisitionUrl());
            }
            if (hlsContentProtection.getKeyStoragePolicy() != null) {
                jsonGenerator.writeFieldName("KeyStoragePolicy").writeValue(hlsContentProtection.getKeyStoragePolicy());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HlsContentProtectionJsonMarshaller instance;

    public static HlsContentProtectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsContentProtectionJsonMarshaller();
        return instance;
    }

}
