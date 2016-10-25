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

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateElasticsearchDomainRequest Marshaller
 */
public class CreateElasticsearchDomainRequestMarshaller implements Marshaller<Request<CreateElasticsearchDomainRequest>, CreateElasticsearchDomainRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateElasticsearchDomainRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateElasticsearchDomainRequest> marshall(CreateElasticsearchDomainRequest createElasticsearchDomainRequest) {

        if (createElasticsearchDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateElasticsearchDomainRequest> request = new DefaultRequest<CreateElasticsearchDomainRequest>(createElasticsearchDomainRequest,
                "AWSElasticsearch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-01-01/es/domain";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createElasticsearchDomainRequest.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(createElasticsearchDomainRequest.getDomainName());
            }
            if (createElasticsearchDomainRequest.getElasticsearchVersion() != null) {
                jsonGenerator.writeFieldName("ElasticsearchVersion").writeValue(createElasticsearchDomainRequest.getElasticsearchVersion());
            }
            if (createElasticsearchDomainRequest.getElasticsearchClusterConfig() != null) {
                jsonGenerator.writeFieldName("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigJsonMarshaller.getInstance()
                        .marshall(createElasticsearchDomainRequest.getElasticsearchClusterConfig(), jsonGenerator);
            }
            if (createElasticsearchDomainRequest.getEBSOptions() != null) {
                jsonGenerator.writeFieldName("EBSOptions");
                EBSOptionsJsonMarshaller.getInstance().marshall(createElasticsearchDomainRequest.getEBSOptions(), jsonGenerator);
            }
            if (createElasticsearchDomainRequest.getAccessPolicies() != null) {
                jsonGenerator.writeFieldName("AccessPolicies").writeValue(createElasticsearchDomainRequest.getAccessPolicies());
            }
            if (createElasticsearchDomainRequest.getSnapshotOptions() != null) {
                jsonGenerator.writeFieldName("SnapshotOptions");
                SnapshotOptionsJsonMarshaller.getInstance().marshall(createElasticsearchDomainRequest.getSnapshotOptions(), jsonGenerator);
            }

            java.util.Map<String, String> advancedOptionsMap = createElasticsearchDomainRequest.getAdvancedOptions();
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

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
