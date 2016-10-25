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
 * VirtualInterfaceMarshaller
 */
public class VirtualInterfaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VirtualInterface virtualInterface, StructuredJsonGenerator jsonGenerator) {

        if (virtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (virtualInterface.getOwnerAccount() != null) {
                jsonGenerator.writeFieldName("ownerAccount").writeValue(virtualInterface.getOwnerAccount());
            }
            if (virtualInterface.getVirtualInterfaceId() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceId").writeValue(virtualInterface.getVirtualInterfaceId());
            }
            if (virtualInterface.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(virtualInterface.getLocation());
            }
            if (virtualInterface.getConnectionId() != null) {
                jsonGenerator.writeFieldName("connectionId").writeValue(virtualInterface.getConnectionId());
            }
            if (virtualInterface.getVirtualInterfaceType() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceType").writeValue(virtualInterface.getVirtualInterfaceType());
            }
            if (virtualInterface.getVirtualInterfaceName() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceName").writeValue(virtualInterface.getVirtualInterfaceName());
            }
            if (virtualInterface.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(virtualInterface.getVlan());
            }
            if (virtualInterface.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(virtualInterface.getAsn());
            }
            if (virtualInterface.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(virtualInterface.getAuthKey());
            }
            if (virtualInterface.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(virtualInterface.getAmazonAddress());
            }
            if (virtualInterface.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(virtualInterface.getCustomerAddress());
            }
            if (virtualInterface.getVirtualInterfaceState() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceState").writeValue(virtualInterface.getVirtualInterfaceState());
            }
            if (virtualInterface.getCustomerRouterConfig() != null) {
                jsonGenerator.writeFieldName("customerRouterConfig").writeValue(virtualInterface.getCustomerRouterConfig());
            }
            if (virtualInterface.getVirtualGatewayId() != null) {
                jsonGenerator.writeFieldName("virtualGatewayId").writeValue(virtualInterface.getVirtualGatewayId());
            }

            com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>) virtualInterface
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

    private static VirtualInterfaceJsonMarshaller instance;

    public static VirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceJsonMarshaller();
        return instance;
    }

}
