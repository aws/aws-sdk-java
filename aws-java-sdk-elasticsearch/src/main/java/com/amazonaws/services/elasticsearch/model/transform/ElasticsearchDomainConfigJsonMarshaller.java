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
 * ElasticsearchDomainConfigMarshaller
 */
public class ElasticsearchDomainConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchDomainConfig elasticsearchDomainConfig, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchDomainConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchDomainConfig.getElasticsearchVersion() != null) {
                jsonGenerator.writeFieldName("ElasticsearchVersion");
                ElasticsearchVersionStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getElasticsearchVersion(), jsonGenerator);
            }
            if (elasticsearchDomainConfig.getElasticsearchClusterConfig() != null) {
                jsonGenerator.writeFieldName("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getElasticsearchClusterConfig(), jsonGenerator);
            }
            if (elasticsearchDomainConfig.getEBSOptions() != null) {
                jsonGenerator.writeFieldName("EBSOptions");
                EBSOptionsStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getEBSOptions(), jsonGenerator);
            }
            if (elasticsearchDomainConfig.getAccessPolicies() != null) {
                jsonGenerator.writeFieldName("AccessPolicies");
                AccessPoliciesStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getAccessPolicies(), jsonGenerator);
            }
            if (elasticsearchDomainConfig.getSnapshotOptions() != null) {
                jsonGenerator.writeFieldName("SnapshotOptions");
                SnapshotOptionsStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getSnapshotOptions(), jsonGenerator);
            }
            if (elasticsearchDomainConfig.getAdvancedOptions() != null) {
                jsonGenerator.writeFieldName("AdvancedOptions");
                AdvancedOptionsStatusJsonMarshaller.getInstance().marshall(elasticsearchDomainConfig.getAdvancedOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDomainConfigJsonMarshaller instance;

    public static ElasticsearchDomainConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainConfigJsonMarshaller();
        return instance;
    }

}
