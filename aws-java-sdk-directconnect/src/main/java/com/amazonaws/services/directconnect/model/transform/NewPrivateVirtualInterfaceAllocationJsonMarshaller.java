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
 * NewPrivateVirtualInterfaceAllocationMarshaller
 */
public class NewPrivateVirtualInterfaceAllocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NewPrivateVirtualInterfaceAllocation newPrivateVirtualInterfaceAllocation, StructuredJsonGenerator jsonGenerator) {

        if (newPrivateVirtualInterfaceAllocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceName").writeValue(newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName());
            }
            if (newPrivateVirtualInterfaceAllocation.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(newPrivateVirtualInterfaceAllocation.getVlan());
            }
            if (newPrivateVirtualInterfaceAllocation.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(newPrivateVirtualInterfaceAllocation.getAsn());
            }
            if (newPrivateVirtualInterfaceAllocation.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(newPrivateVirtualInterfaceAllocation.getAuthKey());
            }
            if (newPrivateVirtualInterfaceAllocation.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(newPrivateVirtualInterfaceAllocation.getAmazonAddress());
            }
            if (newPrivateVirtualInterfaceAllocation.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(newPrivateVirtualInterfaceAllocation.getCustomerAddress());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NewPrivateVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPrivateVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }

}
