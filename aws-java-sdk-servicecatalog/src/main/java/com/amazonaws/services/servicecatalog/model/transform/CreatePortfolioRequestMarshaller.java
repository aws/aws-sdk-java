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
 * CreatePortfolioRequest Marshaller
 */
public class CreatePortfolioRequestMarshaller implements Marshaller<Request<CreatePortfolioRequest>, CreatePortfolioRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreatePortfolioRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreatePortfolioRequest> marshall(CreatePortfolioRequest createPortfolioRequest) {

        if (createPortfolioRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePortfolioRequest> request = new DefaultRequest<CreatePortfolioRequest>(createPortfolioRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.CreatePortfolio");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createPortfolioRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(createPortfolioRequest.getAcceptLanguage());
            }
            if (createPortfolioRequest.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(createPortfolioRequest.getDisplayName());
            }
            if (createPortfolioRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createPortfolioRequest.getDescription());
            }
            if (createPortfolioRequest.getProviderName() != null) {
                jsonGenerator.writeFieldName("ProviderName").writeValue(createPortfolioRequest.getProviderName());
            }

            java.util.List<Tag> tagsList = createPortfolioRequest.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            jsonGenerator.writeFieldName("IdempotencyToken").writeValue(IdempotentUtils.resolveString(createPortfolioRequest.getIdempotencyToken()));

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
