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
 * NewPrivateVirtualInterfaceAllocationMarshaller
 */
public class NewPrivateVirtualInterfaceAllocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            NewPrivateVirtualInterfaceAllocation newPrivateVirtualInterfaceAllocation,
            JSONWriter jsonWriter) {
        if (newPrivateVirtualInterfaceAllocation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                jsonWriter.key("virtualInterfaceName").value(
                        newPrivateVirtualInterfaceAllocation
                                .getVirtualInterfaceName());
            }

            if (newPrivateVirtualInterfaceAllocation.getVlan() != null) {
                jsonWriter.key("vlan").value(
                        newPrivateVirtualInterfaceAllocation.getVlan());
            }

            if (newPrivateVirtualInterfaceAllocation.getAsn() != null) {
                jsonWriter.key("asn").value(
                        newPrivateVirtualInterfaceAllocation.getAsn());
            }

            if (newPrivateVirtualInterfaceAllocation.getAuthKey() != null) {
                jsonWriter.key("authKey").value(
                        newPrivateVirtualInterfaceAllocation.getAuthKey());
            }

            if (newPrivateVirtualInterfaceAllocation.getAmazonAddress() != null) {
                jsonWriter.key("amazonAddress")
                        .value(newPrivateVirtualInterfaceAllocation
                                .getAmazonAddress());
            }

            if (newPrivateVirtualInterfaceAllocation.getCustomerAddress() != null) {
                jsonWriter.key("customerAddress").value(
                        newPrivateVirtualInterfaceAllocation
                                .getCustomerAddress());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NewPrivateVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPrivateVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }

}
