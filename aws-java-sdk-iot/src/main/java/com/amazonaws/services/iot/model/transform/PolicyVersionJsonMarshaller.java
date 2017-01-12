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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.json.*;

/**
 * PolicyVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyVersionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PolicyVersion policyVersion, StructuredJsonGenerator jsonGenerator) {

        if (policyVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (policyVersion.getVersionId() != null) {
                jsonGenerator.writeFieldName("versionId").writeValue(policyVersion.getVersionId());
            }
            if (policyVersion.getIsDefaultVersion() != null) {
                jsonGenerator.writeFieldName("isDefaultVersion").writeValue(policyVersion.getIsDefaultVersion());
            }
            if (policyVersion.getCreateDate() != null) {
                jsonGenerator.writeFieldName("createDate").writeValue(policyVersion.getCreateDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PolicyVersionJsonMarshaller instance;

    public static PolicyVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyVersionJsonMarshaller();
        return instance;
    }

}
