/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.certificatemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.certificatemanager.model.*;

import com.amazonaws.protocol.json.*;

/**
 * RenewalSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewalSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RenewalSummary renewalSummary, StructuredJsonGenerator jsonGenerator) {

        if (renewalSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (renewalSummary.getRenewalStatus() != null) {
                jsonGenerator.writeFieldName("RenewalStatus").writeValue(renewalSummary.getRenewalStatus());
            }

            java.util.List<DomainValidation> domainValidationOptionsList = renewalSummary.getDomainValidationOptions();
            if (domainValidationOptionsList != null) {
                jsonGenerator.writeFieldName("DomainValidationOptions");
                jsonGenerator.writeStartArray();
                for (DomainValidation domainValidationOptionsListValue : domainValidationOptionsList) {
                    if (domainValidationOptionsListValue != null) {

                        DomainValidationJsonMarshaller.getInstance().marshall(domainValidationOptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RenewalSummaryJsonMarshaller instance;

    public static RenewalSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RenewalSummaryJsonMarshaller();
        return instance;
    }

}
