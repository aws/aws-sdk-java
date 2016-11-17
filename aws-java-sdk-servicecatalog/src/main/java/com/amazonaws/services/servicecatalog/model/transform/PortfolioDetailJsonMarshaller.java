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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PortfolioDetailMarshaller
 */
public class PortfolioDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PortfolioDetail portfolioDetail, StructuredJsonGenerator jsonGenerator) {

        if (portfolioDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (portfolioDetail.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(portfolioDetail.getId());
            }
            if (portfolioDetail.getARN() != null) {
                jsonGenerator.writeFieldName("ARN").writeValue(portfolioDetail.getARN());
            }
            if (portfolioDetail.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(portfolioDetail.getDisplayName());
            }
            if (portfolioDetail.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(portfolioDetail.getDescription());
            }
            if (portfolioDetail.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(portfolioDetail.getCreatedTime());
            }
            if (portfolioDetail.getProviderName() != null) {
                jsonGenerator.writeFieldName("ProviderName").writeValue(portfolioDetail.getProviderName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PortfolioDetailJsonMarshaller instance;

    public static PortfolioDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortfolioDetailJsonMarshaller();
        return instance;
    }

}
