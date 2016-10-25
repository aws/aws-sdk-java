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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ElasticIpMarshaller
 */
public class ElasticIpJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticIp elasticIp, StructuredJsonGenerator jsonGenerator) {

        if (elasticIp == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticIp.getIp() != null) {
                jsonGenerator.writeFieldName("Ip").writeValue(elasticIp.getIp());
            }
            if (elasticIp.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(elasticIp.getName());
            }
            if (elasticIp.getDomain() != null) {
                jsonGenerator.writeFieldName("Domain").writeValue(elasticIp.getDomain());
            }
            if (elasticIp.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(elasticIp.getRegion());
            }
            if (elasticIp.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(elasticIp.getInstanceId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticIpJsonMarshaller instance;

    public static ElasticIpJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticIpJsonMarshaller();
        return instance;
    }

}
