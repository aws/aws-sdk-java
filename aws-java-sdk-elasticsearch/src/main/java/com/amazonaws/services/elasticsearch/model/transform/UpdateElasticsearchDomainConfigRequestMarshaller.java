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
 * UpdateElasticsearchDomainConfigRequest Marshaller
 */
public class UpdateElasticsearchDomainConfigRequestMarshaller implements
        Marshaller<Request<UpdateElasticsearchDomainConfigRequest>, UpdateElasticsearchDomainConfigRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateElasticsearchDomainConfigRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateElasticsearchDomainConfigRequest> marshall(UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest) {

        if (updateElasticsearchDomainConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateElasticsearchDomainConfigRequest> request = new DefaultRequest<UpdateElasticsearchDomainConfigRequest>(
                updateElasticsearchDomainConfigRequest, "AWSElasticsearch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-01-01/es/domain/{DomainName}/config";

        uriResourcePath = uriResourcePath.replace(
                "{DomainName}",
                (updateElasticsearchDomainConfigRequest.getDomainName() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(updateElasticsearchDomainConfigRequest.getDomainName()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateElasticsearchDomainConfigRequest.getElasticsearchClusterConfig() != null) {
                jsonGenerator.writeFieldName("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigJsonMarshaller.getInstance().marshall(updateElasticsearchDomainConfigRequest.getElasticsearchClusterConfig(),
                        jsonGenerator);
            }
            if (updateElasticsearchDomainConfigRequest.getEBSOptions() != null) {
                jsonGenerator.writeFieldName("EBSOptions");
                EBSOptionsJsonMarshaller.getInstance().marshall(updateElasticsearchDomainConfigRequest.getEBSOptions(), jsonGenerator);
            }
            if (updateElasticsearchDomainConfigRequest.getSnapshotOptions() != null) {
                jsonGenerator.writeFieldName("SnapshotOptions");
                SnapshotOptionsJsonMarshaller.getInstance().marshall(updateElasticsearchDomainConfigRequest.getSnapshotOptions(), jsonGenerator);
            }

            java.util.Map<String, String> advancedOptionsMap = updateElasticsearchDomainConfigRequest.getAdvancedOptions();
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
            if (updateElasticsearchDomainConfigRequest.getAccessPolicies() != null) {
                jsonGenerator.writeFieldName("AccessPolicies").writeValue(updateElasticsearchDomainConfigRequest.getAccessPolicies());
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
