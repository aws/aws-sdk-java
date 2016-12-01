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
package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdateEndpointRequest Marshaller
 */
public class UpdateEndpointRequestMarshaller implements Marshaller<Request<UpdateEndpointRequest>, UpdateEndpointRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateEndpointRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateEndpointRequest> marshall(UpdateEndpointRequest updateEndpointRequest) {

        if (updateEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateEndpointRequest> request = new DefaultRequest<UpdateEndpointRequest>(updateEndpointRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/apps/{application-id}/endpoints/{endpoint-id}";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (updateEndpointRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updateEndpointRequest.getApplicationId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace("{endpoint-id}",
                (updateEndpointRequest.getEndpointId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updateEndpointRequest.getEndpointId()), false)
                        : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            EndpointRequest endpointRequest = updateEndpointRequest.getEndpointRequest();
            if (endpointRequest != null) {
                jsonGenerator.writeStartObject();
                if (endpointRequest.getAddress() != null) {
                    jsonGenerator.writeFieldName("Address").writeValue(endpointRequest.getAddress());
                }

                java.util.Map<String, java.util.List<String>> attributesMap = endpointRequest.getAttributes();
                if (attributesMap != null) {
                    jsonGenerator.writeFieldName("Attributes");
                    jsonGenerator.writeStartObject();

                    for (Map.Entry<String, java.util.List<String>> attributesMapValue : attributesMap.entrySet()) {
                        if (attributesMapValue.getValue() != null) {
                            jsonGenerator.writeFieldName(attributesMapValue.getKey());

                            jsonGenerator.writeStartArray();
                            for (String attributesMapValueList : attributesMapValue.getValue()) {
                                if (attributesMapValueList != null) {
                                    jsonGenerator.writeValue(attributesMapValueList);
                                }
                            }
                            jsonGenerator.writeEndArray();
                        }
                    }
                    jsonGenerator.writeEndObject();
                }
                if (endpointRequest.getChannelType() != null) {
                    jsonGenerator.writeFieldName("ChannelType").writeValue(endpointRequest.getChannelType());
                }
                if (endpointRequest.getDemographic() != null) {
                    jsonGenerator.writeFieldName("Demographic");
                    EndpointDemographicJsonMarshaller.getInstance().marshall(endpointRequest.getDemographic(), jsonGenerator);
                }
                if (endpointRequest.getEffectiveDate() != null) {
                    jsonGenerator.writeFieldName("EffectiveDate").writeValue(endpointRequest.getEffectiveDate());
                }
                if (endpointRequest.getEndpointStatus() != null) {
                    jsonGenerator.writeFieldName("EndpointStatus").writeValue(endpointRequest.getEndpointStatus());
                }
                if (endpointRequest.getLocation() != null) {
                    jsonGenerator.writeFieldName("Location");
                    EndpointLocationJsonMarshaller.getInstance().marshall(endpointRequest.getLocation(), jsonGenerator);
                }

                java.util.Map<String, Double> metricsMap = endpointRequest.getMetrics();
                if (metricsMap != null) {
                    jsonGenerator.writeFieldName("Metrics");
                    jsonGenerator.writeStartObject();

                    for (Map.Entry<String, Double> metricsMapValue : metricsMap.entrySet()) {
                        if (metricsMapValue.getValue() != null) {
                            jsonGenerator.writeFieldName(metricsMapValue.getKey());

                            jsonGenerator.writeValue(metricsMapValue.getValue());
                        }
                    }
                    jsonGenerator.writeEndObject();
                }
                if (endpointRequest.getOptOut() != null) {
                    jsonGenerator.writeFieldName("OptOut").writeValue(endpointRequest.getOptOut());
                }
                if (endpointRequest.getRequestId() != null) {
                    jsonGenerator.writeFieldName("RequestId").writeValue(endpointRequest.getRequestId());
                }
                if (endpointRequest.getUser() != null) {
                    jsonGenerator.writeFieldName("User");
                    EndpointUserJsonMarshaller.getInstance().marshall(endpointRequest.getUser(), jsonGenerator);
                }
                jsonGenerator.writeEndObject();
            }

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
