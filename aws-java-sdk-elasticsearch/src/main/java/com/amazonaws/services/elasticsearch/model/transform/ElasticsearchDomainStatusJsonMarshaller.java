/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticsearch.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ElasticsearchDomainStatusMarshaller
 */
public class ElasticsearchDomainStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ElasticsearchDomainStatus elasticsearchDomainStatus,
            JSONWriter jsonWriter) {
        if (elasticsearchDomainStatus == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (elasticsearchDomainStatus.getDomainId() != null) {
                jsonWriter.key("DomainId").value(
                        elasticsearchDomainStatus.getDomainId());
            }

            if (elasticsearchDomainStatus.getDomainName() != null) {
                jsonWriter.key("DomainName").value(
                        elasticsearchDomainStatus.getDomainName());
            }

            if (elasticsearchDomainStatus.getARN() != null) {
                jsonWriter.key("ARN").value(elasticsearchDomainStatus.getARN());
            }

            if (elasticsearchDomainStatus.getCreated() != null) {
                jsonWriter.key("Created").value(
                        elasticsearchDomainStatus.getCreated());
            }

            if (elasticsearchDomainStatus.getDeleted() != null) {
                jsonWriter.key("Deleted").value(
                        elasticsearchDomainStatus.getDeleted());
            }

            if (elasticsearchDomainStatus.getEndpoint() != null) {
                jsonWriter.key("Endpoint").value(
                        elasticsearchDomainStatus.getEndpoint());
            }

            if (elasticsearchDomainStatus.getProcessing() != null) {
                jsonWriter.key("Processing").value(
                        elasticsearchDomainStatus.getProcessing());
            }

            if (elasticsearchDomainStatus.getElasticsearchClusterConfig() != null) {
                jsonWriter.key("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigJsonMarshaller
                        .getInstance()
                        .marshall(
                                elasticsearchDomainStatus
                                        .getElasticsearchClusterConfig(),
                                jsonWriter);
            }

            if (elasticsearchDomainStatus.getEBSOptions() != null) {
                jsonWriter.key("EBSOptions");
                EBSOptionsJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainStatus.getEBSOptions(), jsonWriter);
            }

            if (elasticsearchDomainStatus.getAccessPolicies() != null) {
                jsonWriter.key("AccessPolicies").value(
                        elasticsearchDomainStatus.getAccessPolicies());
            }

            if (elasticsearchDomainStatus.getSnapshotOptions() != null) {
                jsonWriter.key("SnapshotOptions");
                SnapshotOptionsJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainStatus.getSnapshotOptions(),
                        jsonWriter);
            }

            java.util.Map<String, String> advancedOptionsMap = elasticsearchDomainStatus
                    .getAdvancedOptions();
            if (advancedOptionsMap != null) {
                jsonWriter.key("AdvancedOptions");
                jsonWriter.object();

                for (Map.Entry<String, String> advancedOptionsMapValue : advancedOptionsMap
                        .entrySet()) {
                    if (advancedOptionsMapValue.getValue() != null) {
                        jsonWriter.key(advancedOptionsMapValue.getKey());

                        jsonWriter.value(advancedOptionsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDomainStatusJsonMarshaller instance;

    public static ElasticsearchDomainStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonMarshaller();
        return instance;
    }

}
