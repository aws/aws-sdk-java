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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.json.*;

/**
 * PatchComplianceDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchComplianceDataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PatchComplianceData patchComplianceData, StructuredJsonGenerator jsonGenerator) {

        if (patchComplianceData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (patchComplianceData.getTitle() != null) {
                jsonGenerator.writeFieldName("Title").writeValue(patchComplianceData.getTitle());
            }
            if (patchComplianceData.getKBId() != null) {
                jsonGenerator.writeFieldName("KBId").writeValue(patchComplianceData.getKBId());
            }
            if (patchComplianceData.getClassification() != null) {
                jsonGenerator.writeFieldName("Classification").writeValue(patchComplianceData.getClassification());
            }
            if (patchComplianceData.getSeverity() != null) {
                jsonGenerator.writeFieldName("Severity").writeValue(patchComplianceData.getSeverity());
            }
            if (patchComplianceData.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(patchComplianceData.getState());
            }
            if (patchComplianceData.getInstalledTime() != null) {
                jsonGenerator.writeFieldName("InstalledTime").writeValue(patchComplianceData.getInstalledTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PatchComplianceDataJsonMarshaller instance;

    public static PatchComplianceDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchComplianceDataJsonMarshaller();
        return instance;
    }

}
