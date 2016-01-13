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
 * NewPublicVirtualInterfaceAllocationMarshaller
 */
public class NewPublicVirtualInterfaceAllocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation,
            JSONWriter jsonWriter) {
        if (newPublicVirtualInterfaceAllocation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (newPublicVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                jsonWriter.key("virtualInterfaceName").value(
                        newPublicVirtualInterfaceAllocation
                                .getVirtualInterfaceName());
            }

            if (newPublicVirtualInterfaceAllocation.getVlan() != null) {
                jsonWriter.key("vlan").value(
                        newPublicVirtualInterfaceAllocation.getVlan());
            }

            if (newPublicVirtualInterfaceAllocation.getAsn() != null) {
                jsonWriter.key("asn").value(
                        newPublicVirtualInterfaceAllocation.getAsn());
            }

            if (newPublicVirtualInterfaceAllocation.getAuthKey() != null) {
                jsonWriter.key("authKey").value(
                        newPublicVirtualInterfaceAllocation.getAuthKey());
            }

            if (newPublicVirtualInterfaceAllocation.getAmazonAddress() != null) {
                jsonWriter.key("amazonAddress").value(
                        newPublicVirtualInterfaceAllocation.getAmazonAddress());
            }

            if (newPublicVirtualInterfaceAllocation.getCustomerAddress() != null) {
                jsonWriter.key("customerAddress").value(
                        newPublicVirtualInterfaceAllocation
                                .getCustomerAddress());
            }

            com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>) newPublicVirtualInterfaceAllocation
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

    private static NewPublicVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPublicVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }

}
