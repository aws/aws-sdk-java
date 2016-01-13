/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directconnect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * VirtualInterfaceMarshaller
 */
public class VirtualInterfaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(VirtualInterface virtualInterface,
            JSONWriter jsonWriter) {
        if (virtualInterface == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (virtualInterface.getOwnerAccount() != null) {
                jsonWriter.key("ownerAccount").value(
                        virtualInterface.getOwnerAccount());
            }

            if (virtualInterface.getVirtualInterfaceId() != null) {
                jsonWriter.key("virtualInterfaceId").value(
                        virtualInterface.getVirtualInterfaceId());
            }

            if (virtualInterface.getLocation() != null) {
                jsonWriter.key("location")
                        .value(virtualInterface.getLocation());
            }

            if (virtualInterface.getConnectionId() != null) {
                jsonWriter.key("connectionId").value(
                        virtualInterface.getConnectionId());
            }

            if (virtualInterface.getVirtualInterfaceType() != null) {
                jsonWriter.key("virtualInterfaceType").value(
                        virtualInterface.getVirtualInterfaceType());
            }

            if (virtualInterface.getVirtualInterfaceName() != null) {
                jsonWriter.key("virtualInterfaceName").value(
                        virtualInterface.getVirtualInterfaceName());
            }

            if (virtualInterface.getVlan() != null) {
                jsonWriter.key("vlan").value(virtualInterface.getVlan());
            }

            if (virtualInterface.getAsn() != null) {
                jsonWriter.key("asn").value(virtualInterface.getAsn());
            }

            if (virtualInterface.getAuthKey() != null) {
                jsonWriter.key("authKey").value(virtualInterface.getAuthKey());
            }

            if (virtualInterface.getAmazonAddress() != null) {
                jsonWriter.key("amazonAddress").value(
                        virtualInterface.getAmazonAddress());
            }

            if (virtualInterface.getCustomerAddress() != null) {
                jsonWriter.key("customerAddress").value(
                        virtualInterface.getCustomerAddress());
            }

            if (virtualInterface.getVirtualInterfaceState() != null) {
                jsonWriter.key("virtualInterfaceState").value(
                        virtualInterface.getVirtualInterfaceState());
            }

            if (virtualInterface.getCustomerRouterConfig() != null) {
                jsonWriter.key("customerRouterConfig").value(
                        virtualInterface.getCustomerRouterConfig());
            }

            if (virtualInterface.getVirtualGatewayId() != null) {
                jsonWriter.key("virtualGatewayId").value(
                        virtualInterface.getVirtualGatewayId());
            }

            com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>) virtualInterface
                    .getRouteFilterPrefixes();
            if (!routeFilterPrefixesList.isEmpty()
                    || !routeFilterPrefixesList.isAutoConstruct()) {
                jsonWriter.key("routeFilterPrefixes");
                jsonWriter.array();
                for (RouteFilterPrefix routeFilterPrefixesListValue : routeFilterPrefixesList) {
                    if (routeFilterPrefixesListValue != null) {

                        RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                                routeFilterPrefixesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VirtualInterfaceJsonMarshaller instance;

    public static VirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceJsonMarshaller();
        return instance;
    }

}
