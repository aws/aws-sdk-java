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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GetInventoryRequest Marshaller
 */
public class GetInventoryRequestMarshaller implements Marshaller<Request<GetInventoryRequest>, GetInventoryRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetInventoryRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetInventoryRequest> marshall(GetInventoryRequest getInventoryRequest) {

        if (getInventoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetInventoryRequest> request = new DefaultRequest<GetInventoryRequest>(getInventoryRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.GetInventory");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<InventoryFilter> filtersList = (com.amazonaws.internal.SdkInternalList<InventoryFilter>) getInventoryRequest
                    .getFilters();
            if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartArray();
                for (InventoryFilter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        InventoryFilterJsonMarshaller.getInstance().marshall(filtersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<ResultAttribute> resultAttributesList = (com.amazonaws.internal.SdkInternalList<ResultAttribute>) getInventoryRequest
                    .getResultAttributes();
            if (!resultAttributesList.isEmpty() || !resultAttributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ResultAttributes");
                jsonGenerator.writeStartArray();
                for (ResultAttribute resultAttributesListValue : resultAttributesList) {
                    if (resultAttributesListValue != null) {

                        ResultAttributeJsonMarshaller.getInstance().marshall(resultAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (getInventoryRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(getInventoryRequest.getNextToken());
            }
            if (getInventoryRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(getInventoryRequest.getMaxResults());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
