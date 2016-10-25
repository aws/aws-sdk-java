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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ApplicationMarshaller
 */
public class ApplicationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Application application, StructuredJsonGenerator jsonGenerator) {

        if (application == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (application.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(application.getName());
            }
            if (application.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(application.getVersion());
            }

            com.amazonaws.internal.SdkInternalList<String> argsList = (com.amazonaws.internal.SdkInternalList<String>) application.getArgs();
            if (!argsList.isEmpty() || !argsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Args");
                jsonGenerator.writeStartArray();
                for (String argsListValue : argsList) {
                    if (argsListValue != null) {
                        jsonGenerator.writeValue(argsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> additionalInfoMap = (com.amazonaws.internal.SdkInternalMap<String, String>) application
                    .getAdditionalInfo();
            if (!additionalInfoMap.isEmpty() || !additionalInfoMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AdditionalInfo");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> additionalInfoMapValue : additionalInfoMap.entrySet()) {
                    if (additionalInfoMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(additionalInfoMapValue.getKey());

                        jsonGenerator.writeValue(additionalInfoMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ApplicationJsonMarshaller instance;

    public static ApplicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonMarshaller();
        return instance;
    }

}
