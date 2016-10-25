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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * NetworkBindingMarshaller
 */
public class NetworkBindingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NetworkBinding networkBinding, StructuredJsonGenerator jsonGenerator) {

        if (networkBinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (networkBinding.getBindIP() != null) {
                jsonGenerator.writeFieldName("bindIP").writeValue(networkBinding.getBindIP());
            }
            if (networkBinding.getContainerPort() != null) {
                jsonGenerator.writeFieldName("containerPort").writeValue(networkBinding.getContainerPort());
            }
            if (networkBinding.getHostPort() != null) {
                jsonGenerator.writeFieldName("hostPort").writeValue(networkBinding.getHostPort());
            }
            if (networkBinding.getProtocol() != null) {
                jsonGenerator.writeFieldName("protocol").writeValue(networkBinding.getProtocol());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NetworkBindingJsonMarshaller instance;

    public static NetworkBindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkBindingJsonMarshaller();
        return instance;
    }

}
