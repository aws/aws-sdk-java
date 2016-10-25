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
package com.amazonaws.services.elasticsearch.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ElasticsearchClusterConfigMarshaller
 */
public class ElasticsearchClusterConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchClusterConfig elasticsearchClusterConfig, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchClusterConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchClusterConfig.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(elasticsearchClusterConfig.getInstanceType());
            }
            if (elasticsearchClusterConfig.getInstanceCount() != null) {
                jsonGenerator.writeFieldName("InstanceCount").writeValue(elasticsearchClusterConfig.getInstanceCount());
            }
            if (elasticsearchClusterConfig.getDedicatedMasterEnabled() != null) {
                jsonGenerator.writeFieldName("DedicatedMasterEnabled").writeValue(elasticsearchClusterConfig.getDedicatedMasterEnabled());
            }
            if (elasticsearchClusterConfig.getZoneAwarenessEnabled() != null) {
                jsonGenerator.writeFieldName("ZoneAwarenessEnabled").writeValue(elasticsearchClusterConfig.getZoneAwarenessEnabled());
            }
            if (elasticsearchClusterConfig.getDedicatedMasterType() != null) {
                jsonGenerator.writeFieldName("DedicatedMasterType").writeValue(elasticsearchClusterConfig.getDedicatedMasterType());
            }
            if (elasticsearchClusterConfig.getDedicatedMasterCount() != null) {
                jsonGenerator.writeFieldName("DedicatedMasterCount").writeValue(elasticsearchClusterConfig.getDedicatedMasterCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchClusterConfigJsonMarshaller instance;

    public static ElasticsearchClusterConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchClusterConfigJsonMarshaller();
        return instance;
    }

}
