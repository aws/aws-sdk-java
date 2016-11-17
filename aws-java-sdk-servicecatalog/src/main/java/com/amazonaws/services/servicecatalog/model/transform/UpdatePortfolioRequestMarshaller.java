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
 * UpdatePortfolioRequest Marshaller
 */
public class UpdatePortfolioRequestMarshaller implements Marshaller<Request<UpdatePortfolioRequest>, UpdatePortfolioRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdatePortfolioRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdatePortfolioRequest> marshall(UpdatePortfolioRequest updatePortfolioRequest) {

        if (updatePortfolioRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdatePortfolioRequest> request = new DefaultRequest<UpdatePortfolioRequest>(updatePortfolioRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.UpdatePortfolio");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updatePortfolioRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(updatePortfolioRequest.getAcceptLanguage());
            }
            if (updatePortfolioRequest.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(updatePortfolioRequest.getId());
            }
            if (updatePortfolioRequest.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(updatePortfolioRequest.getDisplayName());
            }
            if (updatePortfolioRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(updatePortfolioRequest.getDescription());
            }
            if (updatePortfolioRequest.getProviderName() != null) {
                jsonGenerator.writeFieldName("ProviderName").writeValue(updatePortfolioRequest.getProviderName());
            }

            java.util.List<Tag> addTagsList = updatePortfolioRequest.getAddTags();
            if (addTagsList != null) {
                jsonGenerator.writeFieldName("AddTags");
                jsonGenerator.writeStartArray();
                for (Tag addTagsListValue : addTagsList) {
                    if (addTagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(addTagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> removeTagsList = updatePortfolioRequest.getRemoveTags();
            if (removeTagsList != null) {
                jsonGenerator.writeFieldName("RemoveTags");
                jsonGenerator.writeStartArray();
                for (String removeTagsListValue : removeTagsList) {
                    if (removeTagsListValue != null) {
                        jsonGenerator.writeValue(removeTagsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
