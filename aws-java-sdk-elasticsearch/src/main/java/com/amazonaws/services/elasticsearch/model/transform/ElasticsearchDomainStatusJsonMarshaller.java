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
 * ElasticsearchDomainStatusMarshaller
 */
public class ElasticsearchDomainStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticsearchDomainStatus elasticsearchDomainStatus, StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchDomainStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchDomainStatus.getDomainId() != null) {
                jsonGenerator.writeFieldName("DomainId").writeValue(elasticsearchDomainStatus.getDomainId());
            }
            if (elasticsearchDomainStatus.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(elasticsearchDomainStatus.getDomainName());
            }
            if (elasticsearchDomainStatus.getARN() != null) {
                jsonGenerator.writeFieldName("ARN").writeValue(elasticsearchDomainStatus.getARN());
            }
            if (elasticsearchDomainStatus.getCreated() != null) {
                jsonGenerator.writeFieldName("Created").writeValue(elasticsearchDomainStatus.getCreated());
            }
            if (elasticsearchDomainStatus.getDeleted() != null) {
                jsonGenerator.writeFieldName("Deleted").writeValue(elasticsearchDomainStatus.getDeleted());
            }
            if (elasticsearchDomainStatus.getEndpoint() != null) {
                jsonGenerator.writeFieldName("Endpoint").writeValue(elasticsearchDomainStatus.getEndpoint());
            }
            if (elasticsearchDomainStatus.getProcessing() != null) {
                jsonGenerator.writeFieldName("Processing").writeValue(elasticsearchDomainStatus.getProcessing());
            }
            if (elasticsearchDomainStatus.getElasticsearchVersion() != null) {
                jsonGenerator.writeFieldName("ElasticsearchVersion").writeValue(elasticsearchDomainStatus.getElasticsearchVersion());
            }
            if (elasticsearchDomainStatus.getElasticsearchClusterConfig() != null) {
                jsonGenerator.writeFieldName("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigJsonMarshaller.getInstance().marshall(elasticsearchDomainStatus.getElasticsearchClusterConfig(), jsonGenerator);
            }
            if (elasticsearchDomainStatus.getEBSOptions() != null) {
                jsonGenerator.writeFieldName("EBSOptions");
                EBSOptionsJsonMarshaller.getInstance().marshall(elasticsearchDomainStatus.getEBSOptions(), jsonGenerator);
            }
            if (elasticsearchDomainStatus.getAccessPolicies() != null) {
                jsonGenerator.writeFieldName("AccessPolicies").writeValue(elasticsearchDomainStatus.getAccessPolicies());
            }
            if (elasticsearchDomainStatus.getSnapshotOptions() != null) {
                jsonGenerator.writeFieldName("SnapshotOptions");
                SnapshotOptionsJsonMarshaller.getInstance().marshall(elasticsearchDomainStatus.getSnapshotOptions(), jsonGenerator);
            }

            java.util.Map<String, String> advancedOptionsMap = elasticsearchDomainStatus.getAdvancedOptions();
            if (advancedOptionsMap != null) {
                jsonGenerator.writeFieldName("AdvancedOptions");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> advancedOptionsMapValue : advancedOptionsMap.entrySet()) {
                    if (advancedOptionsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(advancedOptionsMapValue.getKey());

                        jsonGenerator.writeValue(advancedOptionsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDomainStatusJsonMarshaller instance;

    public static ElasticsearchDomainStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonMarshaller();
        return instance;
    }

}
