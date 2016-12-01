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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TraceSummaryMarshaller
 */
public class TraceSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TraceSummary traceSummary, StructuredJsonGenerator jsonGenerator) {

        if (traceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (traceSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(traceSummary.getId());
            }
            if (traceSummary.getDuration() != null) {
                jsonGenerator.writeFieldName("Duration").writeValue(traceSummary.getDuration());
            }
            if (traceSummary.getResponseTime() != null) {
                jsonGenerator.writeFieldName("ResponseTime").writeValue(traceSummary.getResponseTime());
            }
            if (traceSummary.getHasFault() != null) {
                jsonGenerator.writeFieldName("HasFault").writeValue(traceSummary.getHasFault());
            }
            if (traceSummary.getHasError() != null) {
                jsonGenerator.writeFieldName("HasError").writeValue(traceSummary.getHasError());
            }
            if (traceSummary.getHasThrottle() != null) {
                jsonGenerator.writeFieldName("HasThrottle").writeValue(traceSummary.getHasThrottle());
            }
            if (traceSummary.getIsPartial() != null) {
                jsonGenerator.writeFieldName("IsPartial").writeValue(traceSummary.getIsPartial());
            }
            if (traceSummary.getHttp() != null) {
                jsonGenerator.writeFieldName("Http");
                HttpJsonMarshaller.getInstance().marshall(traceSummary.getHttp(), jsonGenerator);
            }

            java.util.Map<String, java.util.List<ValueWithServiceIds>> annotationsMap = traceSummary.getAnnotations();
            if (annotationsMap != null) {
                jsonGenerator.writeFieldName("Annotations");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<ValueWithServiceIds>> annotationsMapValue : annotationsMap.entrySet()) {
                    if (annotationsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(annotationsMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (ValueWithServiceIds annotationsMapValueList : annotationsMapValue.getValue()) {
                            if (annotationsMapValueList != null) {

                                ValueWithServiceIdsJsonMarshaller.getInstance().marshall(annotationsMapValueList, jsonGenerator);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.List<TraceUser> usersList = traceSummary.getUsers();
            if (usersList != null) {
                jsonGenerator.writeFieldName("Users");
                jsonGenerator.writeStartArray();
                for (TraceUser usersListValue : usersList) {
                    if (usersListValue != null) {

                        TraceUserJsonMarshaller.getInstance().marshall(usersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<ServiceId> serviceIdsList = traceSummary.getServiceIds();
            if (serviceIdsList != null) {
                jsonGenerator.writeFieldName("ServiceIds");
                jsonGenerator.writeStartArray();
                for (ServiceId serviceIdsListValue : serviceIdsList) {
                    if (serviceIdsListValue != null) {

                        ServiceIdJsonMarshaller.getInstance().marshall(serviceIdsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TraceSummaryJsonMarshaller instance;

    public static TraceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TraceSummaryJsonMarshaller();
        return instance;
    }

}
