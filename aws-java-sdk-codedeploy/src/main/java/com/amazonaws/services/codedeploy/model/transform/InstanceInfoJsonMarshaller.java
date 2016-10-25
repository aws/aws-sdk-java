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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceInfoMarshaller
 */
public class InstanceInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceInfo instanceInfo, StructuredJsonGenerator jsonGenerator) {

        if (instanceInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceInfo.getInstanceName() != null) {
                jsonGenerator.writeFieldName("instanceName").writeValue(instanceInfo.getInstanceName());
            }
            if (instanceInfo.getIamUserArn() != null) {
                jsonGenerator.writeFieldName("iamUserArn").writeValue(instanceInfo.getIamUserArn());
            }
            if (instanceInfo.getInstanceArn() != null) {
                jsonGenerator.writeFieldName("instanceArn").writeValue(instanceInfo.getInstanceArn());
            }
            if (instanceInfo.getRegisterTime() != null) {
                jsonGenerator.writeFieldName("registerTime").writeValue(instanceInfo.getRegisterTime());
            }
            if (instanceInfo.getDeregisterTime() != null) {
                jsonGenerator.writeFieldName("deregisterTime").writeValue(instanceInfo.getDeregisterTime());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) instanceInfo.getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceInfoJsonMarshaller instance;

    public static InstanceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInfoJsonMarshaller();
        return instance;
    }

}
