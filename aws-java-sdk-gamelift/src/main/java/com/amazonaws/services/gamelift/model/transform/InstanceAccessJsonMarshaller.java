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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceAccessMarshaller
 */
public class InstanceAccessJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceAccess instanceAccess, StructuredJsonGenerator jsonGenerator) {

        if (instanceAccess == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceAccess.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(instanceAccess.getFleetId());
            }
            if (instanceAccess.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(instanceAccess.getInstanceId());
            }
            if (instanceAccess.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(instanceAccess.getIpAddress());
            }
            if (instanceAccess.getOperatingSystem() != null) {
                jsonGenerator.writeFieldName("OperatingSystem").writeValue(instanceAccess.getOperatingSystem());
            }
            if (instanceAccess.getCredentials() != null) {
                jsonGenerator.writeFieldName("Credentials");
                InstanceCredentialsJsonMarshaller.getInstance().marshall(instanceAccess.getCredentials(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceAccessJsonMarshaller instance;

    public static InstanceAccessJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAccessJsonMarshaller();
        return instance;
    }

}
