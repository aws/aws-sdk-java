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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StaticIpMarshaller
 */
public class StaticIpJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StaticIp staticIp, StructuredJsonGenerator jsonGenerator) {

        if (staticIp == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (staticIp.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(staticIp.getName());
            }
            if (staticIp.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(staticIp.getArn());
            }
            if (staticIp.getSupportCode() != null) {
                jsonGenerator.writeFieldName("supportCode").writeValue(staticIp.getSupportCode());
            }
            if (staticIp.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(staticIp.getCreatedAt());
            }
            if (staticIp.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(staticIp.getLocation(), jsonGenerator);
            }
            if (staticIp.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(staticIp.getResourceType());
            }
            if (staticIp.getIpAddress() != null) {
                jsonGenerator.writeFieldName("ipAddress").writeValue(staticIp.getIpAddress());
            }
            if (staticIp.getAttachedTo() != null) {
                jsonGenerator.writeFieldName("attachedTo").writeValue(staticIp.getAttachedTo());
            }
            if (staticIp.getIsAttached() != null) {
                jsonGenerator.writeFieldName("isAttached").writeValue(staticIp.getIsAttached());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StaticIpJsonMarshaller instance;

    public static StaticIpJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaticIpJsonMarshaller();
        return instance;
    }

}
