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
package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * NewPublicVirtualInterfaceAllocationMarshaller
 */
public class NewPublicVirtualInterfaceAllocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation, StructuredJsonGenerator jsonGenerator) {

        if (newPublicVirtualInterfaceAllocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (newPublicVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceName").writeValue(newPublicVirtualInterfaceAllocation.getVirtualInterfaceName());
            }
            if (newPublicVirtualInterfaceAllocation.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(newPublicVirtualInterfaceAllocation.getVlan());
            }
            if (newPublicVirtualInterfaceAllocation.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(newPublicVirtualInterfaceAllocation.getAsn());
            }
            if (newPublicVirtualInterfaceAllocation.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(newPublicVirtualInterfaceAllocation.getAuthKey());
            }
            if (newPublicVirtualInterfaceAllocation.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(newPublicVirtualInterfaceAllocation.getAmazonAddress());
            }
            if (newPublicVirtualInterfaceAllocation.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(newPublicVirtualInterfaceAllocation.getCustomerAddress());
            }

            com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>) newPublicVirtualInterfaceAllocation
                    .getRouteFilterPrefixes();
            if (!routeFilterPrefixesList.isEmpty() || !routeFilterPrefixesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("routeFilterPrefixes");
                jsonGenerator.writeStartArray();
                for (RouteFilterPrefix routeFilterPrefixesListValue : routeFilterPrefixesList) {
                    if (routeFilterPrefixesListValue != null) {

                        RouteFilterPrefixJsonMarshaller.getInstance().marshall(routeFilterPrefixesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NewPublicVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPublicVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }

}
