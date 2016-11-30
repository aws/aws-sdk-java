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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DomainMarshaller
 */
public class DomainJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Domain domain, StructuredJsonGenerator jsonGenerator) {

        if (domain == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (domain.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(domain.getName());
            }
            if (domain.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(domain.getArn());
            }
            if (domain.getSupportCode() != null) {
                jsonGenerator.writeFieldName("supportCode").writeValue(domain.getSupportCode());
            }
            if (domain.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(domain.getCreatedAt());
            }
            if (domain.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(domain.getLocation(), jsonGenerator);
            }
            if (domain.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(domain.getResourceType());
            }

            java.util.List<DomainEntry> domainEntriesList = domain.getDomainEntries();
            if (domainEntriesList != null) {
                jsonGenerator.writeFieldName("domainEntries");
                jsonGenerator.writeStartArray();
                for (DomainEntry domainEntriesListValue : domainEntriesList) {
                    if (domainEntriesListValue != null) {

                        DomainEntryJsonMarshaller.getInstance().marshall(domainEntriesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DomainJsonMarshaller instance;

    public static DomainJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainJsonMarshaller();
        return instance;
    }

}
