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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SearchProductsAsAdminRequest Marshaller
 */
public class SearchProductsAsAdminRequestMarshaller implements Marshaller<Request<SearchProductsAsAdminRequest>, SearchProductsAsAdminRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SearchProductsAsAdminRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SearchProductsAsAdminRequest> marshall(SearchProductsAsAdminRequest searchProductsAsAdminRequest) {

        if (searchProductsAsAdminRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchProductsAsAdminRequest> request = new DefaultRequest<SearchProductsAsAdminRequest>(searchProductsAsAdminRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.SearchProductsAsAdmin");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (searchProductsAsAdminRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(searchProductsAsAdminRequest.getAcceptLanguage());
            }
            if (searchProductsAsAdminRequest.getPortfolioId() != null) {
                jsonGenerator.writeFieldName("PortfolioId").writeValue(searchProductsAsAdminRequest.getPortfolioId());
            }

            java.util.Map<String, java.util.List<String>> filtersMap = searchProductsAsAdminRequest.getFilters();
            if (filtersMap != null) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> filtersMapValue : filtersMap.entrySet()) {
                    if (filtersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(filtersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String filtersMapValueList : filtersMapValue.getValue()) {
                            if (filtersMapValueList != null) {
                                jsonGenerator.writeValue(filtersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (searchProductsAsAdminRequest.getSortBy() != null) {
                jsonGenerator.writeFieldName("SortBy").writeValue(searchProductsAsAdminRequest.getSortBy());
            }
            if (searchProductsAsAdminRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(searchProductsAsAdminRequest.getSortOrder());
            }
            if (searchProductsAsAdminRequest.getPageToken() != null) {
                jsonGenerator.writeFieldName("PageToken").writeValue(searchProductsAsAdminRequest.getPageToken());
            }
            if (searchProductsAsAdminRequest.getPageSize() != null) {
                jsonGenerator.writeFieldName("PageSize").writeValue(searchProductsAsAdminRequest.getPageSize());
            }
            if (searchProductsAsAdminRequest.getProductSource() != null) {
                jsonGenerator.writeFieldName("ProductSource").writeValue(searchProductsAsAdminRequest.getProductSource());
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
