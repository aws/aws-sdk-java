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
package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TrustedAdvisorResourceDetailMarshaller
 */
public class TrustedAdvisorResourceDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TrustedAdvisorResourceDetail trustedAdvisorResourceDetail, StructuredJsonGenerator jsonGenerator) {

        if (trustedAdvisorResourceDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trustedAdvisorResourceDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(trustedAdvisorResourceDetail.getStatus());
            }
            if (trustedAdvisorResourceDetail.getRegion() != null) {
                jsonGenerator.writeFieldName("region").writeValue(trustedAdvisorResourceDetail.getRegion());
            }
            if (trustedAdvisorResourceDetail.getResourceId() != null) {
                jsonGenerator.writeFieldName("resourceId").writeValue(trustedAdvisorResourceDetail.getResourceId());
            }
            if (trustedAdvisorResourceDetail.getIsSuppressed() != null) {
                jsonGenerator.writeFieldName("isSuppressed").writeValue(trustedAdvisorResourceDetail.getIsSuppressed());
            }

            com.amazonaws.internal.SdkInternalList<String> metadataList = (com.amazonaws.internal.SdkInternalList<String>) trustedAdvisorResourceDetail
                    .getMetadata();
            if (!metadataList.isEmpty() || !metadataList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("metadata");
                jsonGenerator.writeStartArray();
                for (String metadataListValue : metadataList) {
                    if (metadataListValue != null) {
                        jsonGenerator.writeValue(metadataListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustedAdvisorResourceDetailJsonMarshaller instance;

    public static TrustedAdvisorResourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorResourceDetailJsonMarshaller();
        return instance;
    }

}
