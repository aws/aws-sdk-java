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
 * ElasticsearchDomainConfigMarshaller
 */
public class ElasticsearchDomainConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ElasticsearchDomainConfig elasticsearchDomainConfig,
            JSONWriter jsonWriter) {
        if (elasticsearchDomainConfig == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (elasticsearchDomainConfig.getElasticsearchClusterConfig() != null) {
                jsonWriter.key("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigStatusJsonMarshaller
                        .getInstance()
                        .marshall(
                                elasticsearchDomainConfig
                                        .getElasticsearchClusterConfig(),
                                jsonWriter);
            }

            if (elasticsearchDomainConfig.getEBSOptions() != null) {
                jsonWriter.key("EBSOptions");
                EBSOptionsStatusJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainConfig.getEBSOptions(), jsonWriter);
            }

            if (elasticsearchDomainConfig.getAccessPolicies() != null) {
                jsonWriter.key("AccessPolicies");
                AccessPoliciesStatusJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainConfig.getAccessPolicies(),
                        jsonWriter);
            }

            if (elasticsearchDomainConfig.getSnapshotOptions() != null) {
                jsonWriter.key("SnapshotOptions");
                SnapshotOptionsStatusJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainConfig.getSnapshotOptions(),
                        jsonWriter);
            }

            if (elasticsearchDomainConfig.getAdvancedOptions() != null) {
                jsonWriter.key("AdvancedOptions");
                AdvancedOptionsStatusJsonMarshaller.getInstance().marshall(
                        elasticsearchDomainConfig.getAdvancedOptions(),
                        jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDomainConfigJsonMarshaller instance;

    public static ElasticsearchDomainConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainConfigJsonMarshaller();
        return instance;
    }

}
