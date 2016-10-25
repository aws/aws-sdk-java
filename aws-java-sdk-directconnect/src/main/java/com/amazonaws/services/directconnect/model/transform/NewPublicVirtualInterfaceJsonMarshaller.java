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
 * NewPublicVirtualInterfaceMarshaller
 */
public class NewPublicVirtualInterfaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NewPublicVirtualInterface newPublicVirtualInterface, StructuredJsonGenerator jsonGenerator) {

        if (newPublicVirtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (newPublicVirtualInterface.getVirtualInterfaceName() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceName").writeValue(newPublicVirtualInterface.getVirtualInterfaceName());
            }
            if (newPublicVirtualInterface.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(newPublicVirtualInterface.getVlan());
            }
            if (newPublicVirtualInterface.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(newPublicVirtualInterface.getAsn());
            }
            if (newPublicVirtualInterface.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(newPublicVirtualInterface.getAuthKey());
            }
            if (newPublicVirtualInterface.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(newPublicVirtualInterface.getAmazonAddress());
            }
            if (newPublicVirtualInterface.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(newPublicVirtualInterface.getCustomerAddress());
            }

            com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>) newPublicVirtualInterface
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

    private static NewPublicVirtualInterfaceJsonMarshaller instance;

    public static NewPublicVirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceJsonMarshaller();
        return instance;
    }

}
