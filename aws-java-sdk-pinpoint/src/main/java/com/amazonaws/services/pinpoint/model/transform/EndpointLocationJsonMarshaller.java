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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EndpointLocationMarshaller
 */
public class EndpointLocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EndpointLocation endpointLocation, StructuredJsonGenerator jsonGenerator) {

        if (endpointLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (endpointLocation.getCity() != null) {
                jsonGenerator.writeFieldName("City").writeValue(endpointLocation.getCity());
            }
            if (endpointLocation.getCountry() != null) {
                jsonGenerator.writeFieldName("Country").writeValue(endpointLocation.getCountry());
            }
            if (endpointLocation.getLatitude() != null) {
                jsonGenerator.writeFieldName("Latitude").writeValue(endpointLocation.getLatitude());
            }
            if (endpointLocation.getLongitude() != null) {
                jsonGenerator.writeFieldName("Longitude").writeValue(endpointLocation.getLongitude());
            }
            if (endpointLocation.getPostalCode() != null) {
                jsonGenerator.writeFieldName("PostalCode").writeValue(endpointLocation.getPostalCode());
            }
            if (endpointLocation.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(endpointLocation.getRegion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointLocationJsonMarshaller instance;

    public static EndpointLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointLocationJsonMarshaller();
        return instance;
    }

}
